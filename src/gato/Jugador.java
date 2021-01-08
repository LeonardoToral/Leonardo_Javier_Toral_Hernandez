package gato;

import java.io.Serializable;

public class Jugador implements Serializable{
    private String nombre, contraseña;
    private int edad, puntaje;

    public Jugador() {
    }

    public Jugador(String nombre, String contraseña, int edad, int puntaje) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
