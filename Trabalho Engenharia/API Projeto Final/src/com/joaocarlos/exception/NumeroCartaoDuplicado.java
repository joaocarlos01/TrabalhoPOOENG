package com.joaocarlos.exception;

public class NumeroCartaoDuplicado extends RuntimeException {

	/**
	* @author Jo�o Carlos
	* @author Francisco Esteves
	* @version 1.0
	* @since 25/05/2020
	 */
		
	/**
	 * Este metodo devolve uma exception em caso de n�mero de cart�o de cidad�o duplicado
	 * @param numeroCArtao (int) n�mero cart�o de cidad�o
	 * @param nome (String) nome da Pessoa
	 */
	public NumeroCartaoDuplicado (int numeroCartao, String nomePessoa) {
		super ("O n�mero do Cart�o de Cidad�o " + numeroCartao + "j� existe " + "\r\n" + nomePessoa + ": " +numeroCartao);
	}
}
