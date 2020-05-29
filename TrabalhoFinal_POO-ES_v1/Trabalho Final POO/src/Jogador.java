
public class Jogador extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String posicao;
	private String pePreferido;
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

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

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PAR�METROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================




    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	@Override
	public String toString() {
		return "Jogador" +"\r\n" +"Posi��o: " + posicao + "P� Preferido: " + pePreferido + "\r\n" + "Cart�o de Cidad�o: " + getnCartaoCidadao() + "\r\n" + "Nome: " + getNome()
		+"\r\n"+ "Data de Nascimento: " + getDataNascimento() + "\r\n" + "Contacto: " + getContacto() + "\r\n" +"Email: "
		+ getEmail() ;
	}

    // ----> equals()

}
