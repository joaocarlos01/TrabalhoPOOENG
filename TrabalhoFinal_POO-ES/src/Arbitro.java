
public class Arbitro extends Pessoa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
/**
 * A class </strong> Arbitro </strong> herda da class </strong>Pessoa</strong>.
 * @author Jo�o Carlos
 * @author Francisco Esteves
 */

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================



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
	
	/**
	 * Este m�todo permite vizualizar os valores dos atributos na class </strong>main</strong>
	 */
	
	@Override
	public String toString() {
		return "�rbitro" + "\r\n" + "Cart�o de Cidad�o: " + getnCartaoCidadao() + "\r\n" + "Nome: " + getNome()
				+"\r\n"+ "Data de Nascimento: " + getDataNascimento() + "\r\n" + "Contacto: " + getContacto() + "\r\n" +"Email: "
				+ getEmail() ;
	}

    // ----> equals()

}
