package org.example;

public class ram extends Componente{
private int id;
private String tipo;
private String Capacidad;
    public ram(String marca, int id, String tipo, String capacidad) {
        super(marca);
        this.id = id;
        this.tipo = tipo;
        Capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String capacidad) {
        Capacidad = capacidad;
    }

    public ram(String marca) {
        super(marca);
    }

    @Override
    public String toString() {
        return "ram{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", Capacidad='" + Capacidad + '\'' +
                '}';
    }
}
