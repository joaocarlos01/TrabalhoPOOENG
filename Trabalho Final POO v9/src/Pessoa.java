import java.util.Date;

public abstract class Pessoa {
	
	/**
	 * A class </strong>Pessoa</strong> disponibliza o conjunto de atributos associados �s pessoas necess�rias para a cria��o do projeto.
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
	 */
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	/**
	 * Os atributos recebem v�rios valores que permitem o funcionamento dos m�todos
	 * </strong>nCartaoCidadao</strong> recebe o numero de cart�o de cidad�o de uma pessoa
	 * </strong>nome</strong> recebe o Nome de uma Pessoa
	 * </strong>dataNascimento</strong> recebe a data de nascimento de uma pessoa
	 * </strong>contacto</strong> recebe o contacto da pessoa
	 * </strong>email</strong> recebe o email da pessoa
	 */
	private int nCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;

	


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	/**
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obt�-lo em qualquer lugar
	 */
	public int getnCartaoCidadao() {
		return nCartaoCidadao;
	}
	public void setnCartaoCidadao(int nCartaoCidadao) {
		this.nCartaoCidadao = nCartaoCidadao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    /**
     *  CONSTRUTOR DEFAULT
     */
	public Pessoa() {
		
		}
	

    /**
     *  CONSTRUTOR COM PAR�METROS
     * @param nCartaoCidadao (int) n�mero de cart�o de cidad�o 
     * @param nome (String) nome da pessoa
     * @param dataNascimento (Date) data de nascimento da pessoa
     * @param contacto (int) contacto da pessoa
     * @param email (String) email da pessoa
     */
	public Pessoa(int nCartaoCidadao, String nome, Date dataNascimento, int contacto, String email) {
		super();
		this.nCartaoCidadao = nCartaoCidadao;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.contacto = contacto;
		this.email = email;
	}
   


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	


    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()

}
