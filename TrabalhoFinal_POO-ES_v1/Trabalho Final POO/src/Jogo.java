import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private String equipaVisitada;
	private String equipaVisitante;
	private int golosEquipaVisitada;
	private int golosEquipaVisitante;
	private Date data;
	private int jornada;
	
	private List <Arbitro> arbitro = new ArrayList <Arbitro>();
	private List <Equipa> equipa = new ArrayList <Equipa>();
	

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

	protected List<Arbitro> removerArbitro (int cartaoCidadao) {
		
		for (Arbitro arbitro : this.arbitro) {
			if (arbitro.getnCartaoCidadao() == cartaoCidadao ) {
				this.arbitro.remove(arbitro);
				return this.arbitro;
			}
		
		}
		
		
		return arbitro;
		}
	
	public void alterarArbitro() {
		
	}
	
	public void alterarGolos () {
		
	}
	
	protected Arbitro getCartaoCidadaoArbitro (int nCartaoCidadao) {
		for (Arbitro arbitro : this.arbitro) {
			if (arbitro.getnCartaoCidadao()== nCartaoCidadao ) {
				return arbitro;
			}
		
		}
		return null;
		}
	
	public void addTreinador (Arbitro arbitro) {
		
		
		
		Arbitro cartaoArbitro = this.getCartaoCidadaoArbitro(arbitro.getnCartaoCidadao());
		
		if ( cartaoArbitro != null) {
			throw new IllegalArgumentException("Cart�o j� existente");
		}
		
	
		
		this.arbitro.add(arbitro);
		
	}
		
    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



    // ----> equals()

}
