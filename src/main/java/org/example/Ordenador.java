package org.example;

public class Ordenador {
	    private String nombre;
	    private int precio;
	    private Periferico perifericos;


	    public Ordenador() {
	    	super();
	    }

	    public Ordenador(String nombre, int precio, Periferico perifericos ) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.perifericos = perifericos;


	    }

	    // Getters y setters

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getPrecio() {
	        return precio;
	    }

	    public void setPrecio(int precio) {
	        this.precio = precio;
	    }

	    public Periferico getPerifericos() {
	        return perifericos;
	    }

	    public void setPerifericos(Periferico perifericos) {
	        this.perifericos = perifericos;
	    }

		@Override
		public String toString() {
			return "Ordenador{" +
					"nombre='" + nombre + '\'' +
					", precio=" + precio +
					", perifericos=" + perifericos +
					'}';
		}
	}

	

	
	




