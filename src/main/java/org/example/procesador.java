package org.example;

public class procesador extends Componente{

    private String modelo;
    private String velocidad;

    public procesador(String marca, String modelo, String velocidad) {
        super(marca);
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public procesador(String marca) {
        super(marca);
    }

    @Override
    public String toString() {
        return "procesador{" +
                "modelo='" + modelo + '\'' +
                ", velocidad='" + velocidad + '\'' +
                '}';
    }
}
