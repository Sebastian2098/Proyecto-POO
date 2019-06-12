
package Interfaces;

public class Pokimon {
    String nombre;
    int vida;
    int nivel;

    public Pokimon(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = 40 + nivel*5;
        this.nivel = 5;
    }
    
    String MostrarEstado(){
        String estado = this.nombre + " / " + this.vida 
                + " HP" + this.nivel + "NIVEL";
        return estado;
    }
    
    String UsarPocion(){
        int cura = 15;
        
        for (int i = 1; i < 4; i++) {
            
            this.vida = this.vida + cura;
            
        }
        return null;
    }
    String Atacar(Pokimon contrincante) {
        String resultado = "";
        
        int ataque = (int) (Math.random() * 5 + 5);        
        int critico = (int) (Math.random() * 100);
        
        if (critico <= 20) {
            ataque = (int) (ataque * 2);
        }
        
        contrincante.vida = contrincante.vida - ataque;
        
        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        
        if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        
        return resultado;
    }
    
}
