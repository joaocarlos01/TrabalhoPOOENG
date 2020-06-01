import java.util.Date;

public abstract class Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	private int nCartaoCidadao;
	private String nome;
	private Date dataNascimento;
	private int contacto;
	private String email;

	


    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

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

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	


    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()

}
