package br.com.alura.jpa.modelo.Conta;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long agencia;
	private Long numero;
	private String titular;
	private Double saldo;
	
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

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Conta() {

	}
	
	public Conta(Long agencia, Long numero, String titular) {
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

	public String getTitular() {
		return titular;
	}

}
