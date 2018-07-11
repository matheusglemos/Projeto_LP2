package com.projeto.entidades;

import com.projeto.validadores.*;

/**
 * Classe que representa um item com Produto por unidade que é filha da classe Item.
 * E possui a quantidade que o item possui(unidade).
 * 
 * @authors Jose Davi
 * 			Matheus Gusmao
 * 			Rich Ramalho
 *
 */
public class ProdutoPorUnidade extends Item {

	/**
	 * Atributo que representa o total de unidades que este item possui.
	 */
	private int unidade;
	
	/**
	 * Construtor.
	 * 
	 * @param numero
	 *            Inteiro que representa o id do item.
	 * @param nome
	 *            String que representa o nome do item.
	 * @param categoria
	 *            String que representa a categoria do item.
	 * @param unidade 
	 * 			  Inteiro que representa a unidade do item.
	 * @param supermercado
	 *            String que representa o nome do supermercado que o item foi
	 *            comprado.
	 * @param preco
	 *            Double que representa o preco do item nesse supermercado.
	 */
	public ProdutoPorUnidade(int numero, String nome, String categoria, int unidade, String supermercado, double preco) {
		
		super(numero, nome, categoria, supermercado, preco);
		if (ValidadorItem.validaUnidade(unidade)) {
			this.unidade = unidade;
		}	
	}
	
	/**
	 * Metodo sobrescrito da classe pai(Item) que ira alterar a unidade do item.
	 */
	@Override
	public void setUnidade(int novaUnidade) {
		if (ValidadorItem.validaSetUnidade(novaUnidade)) {
			this.unidade = novaUnidade;
		}
	}
	
	/**
	 * Metodo sobrescrito da classe pai(Item) que retorna a representacao textual do item.
	 * 
	 * @return String representacao textual com mais detalhes sobre a especificacao do item.
	 */
	@Override
	public String toString() {
		return super.toString() + " Preco: " + super.toStringPrecos();
	}
	
	@Override
	public void setQuantidade(int novaquant) {
	}

	@Override
	public void setMedida(String novaMedida) {
	}

	@Override
	public void setQuilos(double novoQuilos) {
	}
}
