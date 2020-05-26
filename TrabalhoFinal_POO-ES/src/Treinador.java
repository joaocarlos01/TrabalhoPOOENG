
public class Treinador extends Pessoa {

	
/**
 * A class </strong> Treinador </strong> herda da class </strong>Pessoa</strong>.
 * @author João Carlos
 * @author Francisco Esteves
 */
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================



    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================



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

	/**
	 * Este método permite vizualizar os valores dos atributos na class </strong>main</strong>
	 */
	@Override
	public String toString() {
		return "Treinador" + "\r\n" + "Cartão de Cidadão: " + getnCartaoCidadao() + "\r\n" + "Nome: " + getNome()
				+"\r\n"+ "Data de Nascimento: " + getDataNascimento() + "\r\n" + "Contacto: " + getContacto() + "\r\n" +"Email: "
				+ getEmail() ;
	}

    // ----> equals()

}
