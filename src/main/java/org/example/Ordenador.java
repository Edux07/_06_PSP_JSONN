package org.example;

import java.util.List;

public class Ordenador {
	    private String nombre;
	    private int precio;
	    private Periferico perifericos;
		private List<Periferico>listaPerifericos;
		private List<Componente>listaComponentes;




	public Ordenador() {
	    	super();
	    }

	    public Ordenador(String nombre, int precio, Periferico perifericos, List<Periferico> listaPerifericos, List<Componente> listaComponentes ) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.perifericos = perifericos;
			this.listaPerifericos = listaPerifericos;
			this.listaComponentes = listaComponentes;

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
		public List<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}

		public void setListaPerifericos(List<Periferico> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

		public List<Componente> getListaComponentes() {
		return listaComponentes;
	}

		public void setListaComponentes(List<Componente> listaComponentes) {
		this.listaComponentes = listaComponentes;
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

	

	
	




