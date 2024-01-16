package org.example;

public class Raton {
    private String nombre;
    private String marca;

    public Raton() {
    }

    public Raton(String nombre, String marca) {
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
}
