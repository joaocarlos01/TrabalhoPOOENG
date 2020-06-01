
public class Jogador extends Pessoa {
	
	/**
	* A class </strong> Jogador </strong> herda da class </strong>Pessoa</strong>.
	 * @author João Carlos
	 * @author Francisco Esteves
	 */
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 * 
	 * </strong>posicao </strong> recebe a posição preferida do jogador
	 * </strong>pePreferido</strong> recebe o pé preferido do jogador
	 */
	private String posicao;
	private String pePreferido;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	
	/**
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obtê-lo em qualquer lugar
	 */
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getPePreferido() {
		return pePreferido;
	}
	public void setPePreferido(String pePreferido) {
		this.pePreferido = pePreferido;
	}
	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    /**
     *  CONSTRUTOR DEFAULT
     */
	public Jogador() {
		
	}
   

    /**
     *  CONSTRUTOR COM PARÂMETROS
     * @param posicao (String) posição do jogador
     * @param pePreferido (String) pé preferido do jogador
     */

	public Jogador(String posicao, String pePreferido) {
		super();
		this.posicao = posicao;
		this.pePreferido = pePreferido;
	}

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	/**
	 * Metodo toString permite que sejam visualizados os valores dos atributos
	 */
	
	@Override
	public String toString() {
		return "Jogador" +"\r\n" +"Posição: " + posicao + "Pé Preferido: " + pePreferido + "\r\n" + "Cartão de Cidadão: " + getnCartaoCidadao() + "\r\n" + "Nome: " + getNome()
		+"\r\n"+ "Data de Nascimento: " + getDataNascimento() + "\r\n" + "Contacto: " + getContacto() + "\r\n" +"Email: "
		+ getEmail() ;
	}

    // ----> equals()

}
