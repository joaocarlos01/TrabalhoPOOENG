
public class Jogador extends Pessoa {
	
	/**
	* A class </strong> Jogador </strong> herda da class </strong>Pessoa</strong>.
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
	 */
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 * 
	 * </strong>posicao </strong> recebe a posi��o preferida do jogador
	 * </strong>pePreferido</strong> recebe o p� preferido do jogador
	 */
	private String posicao;
	private String pePreferido;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================
	
	/**
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obt�-lo em qualquer lugar
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
     *  CONSTRUTOR COM PAR�METROS
     * @param posicao (String) posi��o do jogador
     * @param pePreferido (String) p� preferido do jogador
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
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	/**
	 * Metodo toString permite que sejam visualizados os valores dos atributos
	 */
	
	@Override
	public String toString() {
		return "Jogador" +"\r\n" +"Posi��o: " + posicao + "P� Preferido: " + pePreferido + "\r\n" + "Cart�o de Cidad�o: " + getnCartaoCidadao() + "\r\n" + "Nome: " + getNome()
		+"\r\n"+ "Data de Nascimento: " + getDataNascimento() + "\r\n" + "Contacto: " + getContacto() + "\r\n" +"Email: "
		+ getEmail() ;
	}

    // ----> equals()

}
