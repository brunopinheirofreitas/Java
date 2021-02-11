package br.com.alura.jpa.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Conta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne
	private Cliente titular;
	
	private Long agencia;
	private Long numero;
	private Double saldo;
	
	@OneToMany(mappedBy="conta", fetch = FetchType.EAGER)
	private List<Movimentacao> movimentacoes;
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAgencia(Long agencia) {
		this.agencia = agencia;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Conta() {

	}
	
	public Conta(Long agencia, Long numero, Cliente titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public Long getId() {
		return id;
	}

	public Long getAgencia() {
		return agencia;
	}

	public Long getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public List<Movimentacao> getMovimentacao() {
		return movimentacoes;
	}
	
	@Override
	public String toString() {
		return ("Conta: " + this.numero + " Agencia: " + this.agencia);
	}


}
