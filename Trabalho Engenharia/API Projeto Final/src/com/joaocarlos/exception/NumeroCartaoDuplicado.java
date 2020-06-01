package com.joaocarlos.exception;

public class NumeroCartaoDuplicado extends RuntimeException {

	/**
	* @author João Carlos
	* @author Francisco Esteves
	* @version 1.0
	* @since 25/05/2020
	 */
		
	/**
	 * Este metodo devolve uma exception em caso de número de cartão de cidadão duplicado
	 * @param numeroCArtao (int) número cartão de cidadão
	 * @param nome (String) nome da Pessoa
	 */
	public NumeroCartaoDuplicado (int numeroCartao, String nomePessoa) {
		super ("O número do Cartão de Cidadão " + numeroCartao + "já existe " + "\r\n" + nomePessoa + ": " +numeroCartao);
	}
}
