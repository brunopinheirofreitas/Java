package br.com.caelum.livraria.bean;

import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;

//@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println("Estou persistindo o livro " + livro.toString());
	}

}
