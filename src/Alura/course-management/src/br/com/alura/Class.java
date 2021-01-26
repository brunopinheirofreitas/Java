package br.com.alura;

public class Class implements Comparable<Class>{ //Comparable is an interface that allows you to create your own comparable methods.

	private String titulo;
	private int tempo;

	public Class(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aula: " + this.titulo + ", " + this.tempo + " minutos" + "]";
	}

	@Override
	public int compareTo(Class otherClass) {
		return this.titulo.compareTo(otherClass.titulo);
	}
	

}
