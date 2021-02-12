package br.com.alura.jpa.modelo;

public class MediaComData {
	Double valor;
	int day;
	int month;

	public MediaComData(Double valor, int day, int month) {
		this.valor = valor;
		this.day = day;
		this.month = month;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
