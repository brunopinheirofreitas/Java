
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario; //protected é public para a classe filho e private para as demais classes
	private int tipo=0; //0 - Funcionario comum, 1 - Gerente, 2 - Diretor.
	
	
	  public abstract double getBonificacao (); //Um método abstrato a só pode existir em uma classe abstrata
	 
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
