
package Interfaces;

public class Pokimon {
    String nombre;
    int vida;
    int nivel;

    public Pokimon(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = 40*nivel;
        this.nivel = nivel;
    }
    
    
    
}
