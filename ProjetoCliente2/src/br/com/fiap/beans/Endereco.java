package br.com.fiap.beans;

public class Endereco {
	
	private String logradouro, cep, bairro;
	private int numero;
	
	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String cep, String bairro, int numero) {
		super();
		this.setLogradouro(logradouro);
		this.setCep(cep);
		this.setBairro(bairro);
		this.setNumero(numero);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	
}
