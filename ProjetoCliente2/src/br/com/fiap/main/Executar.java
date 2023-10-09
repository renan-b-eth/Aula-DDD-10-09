package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class Executar {
	public static void main(String[] args) {
		
		//String razaSocial, String email, String segmento, int unidade
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite a razão social: "),
				JOptionPane.showInputDialog("Digite seu email:"),
				JOptionPane.showInputDialog("Digite seu segmento:"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a unidade:"))
				);
		
		
		Endereco objEndereco = new Endereco();
		Produto objProduto = new Produto();
		
		
	}
}
