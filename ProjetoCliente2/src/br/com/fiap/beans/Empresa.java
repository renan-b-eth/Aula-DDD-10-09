package br.com.fiap.beans;

public class Empresa {
	
	private String razaSocial, email, segmento;
	private int unidade;
	private Endereco endereco;
	private Produto produto;
	
	public Empresa() {
		super();
	}
	
	public Empresa(String razaSocial, String email, String segmento, int unidade) {
		super();
		this.razaSocial = razaSocial;
		this.email = email;
		this.segmento = segmento;
		this.unidade = unidade;
	}
	
	public String getRazaSocial() {
		return razaSocial;
	}
	public void setRazaSocial(String razaSocial) {
		this.razaSocial = razaSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
	
}
