package org.example;

public class Periferico {
    private String nombre;
    private String marca;

    public Periferico() {
    }

    public Periferico(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }


}