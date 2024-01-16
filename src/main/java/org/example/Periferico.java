package org.example;

public class Periferico {
    private Teclado teclado;
    private Raton raton;

    public Periferico() {
    }

    public Periferico(Teclado teclado, Raton raton) {
        this.teclado = teclado;
        this.raton = raton;
    }

    // Getters y setters

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }


    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Periferico{" +
                "teclado=" + teclado +
                ", raton=" + raton +
                '}';
    }
}
