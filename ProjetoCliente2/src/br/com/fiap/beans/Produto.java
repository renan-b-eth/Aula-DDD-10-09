package br.com.fiap.beans;

public class Produto {
	
	private int idProduto;
	private String tipo, marca;
	private double valor;
	
	
	public Produto() {
		super();
	}


	public Produto(int idProduto, String tipo, String marca, double valor) {
		super();
		this.idProduto = idProduto;
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}
	
	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
}
