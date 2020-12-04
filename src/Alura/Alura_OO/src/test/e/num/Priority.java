package test.e.num;

public enum Priority {
	
	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	Priority(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
