package com.joaocarlos.exception;

public class NumeroDuplicadoexception extends RuntimeException {
/**
* @author João Carlos
* @author Francisco Esteves
* @version 1.0
* @since 25/05/2020
 */
	
/**
 * Este metodo devolve uma exception em caso de codigo duplicado
 * @param codigo (int) codigo da entidade
 * @param nome (String) nome da entidade
 */
	public NumeroDuplicadoexception (int codigo, String nome) {
		super ("O Codigo " + codigo+ " ja se encontra registado" + "\r\n" + nome + ": " +codigo);
	}
	
	
	
}
