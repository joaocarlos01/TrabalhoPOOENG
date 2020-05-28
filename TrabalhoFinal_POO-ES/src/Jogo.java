import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {
	/**
	 * A class </strong> Jogo </strong> disponibliza os atributos, metodos e fun��es necess�rios � cria��o de um jogo
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
	 * @version 1.0
	 * @since 07/05/2020
	 * 
	 */
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 * </strong> equipaVisitada </strong> recebe a equipa visitada
	 * </strong> equipaVisitante </strong>  recebe a equipa visitante
	 * </strong> golosEquipaVisitada</strong> recebe o n�mero de golos da equipa visitada
	 * </strong> golosEquipaVisitante</strong> recebe o n�mero de golos da equipa visitante
	 * </strong> data </strong> recebe a data do jogo
	 * </strong> jornada </strong> recebe a jornada do campeonato
	 * </strong> codigo </strong> recebe o c�digo identificador do jogo
	 * </strong> List <Arbitro> </strong> recebe a lista de arbitros
	 * </strong> List <Equipa> </strong> recebe a lista de equipas
	 */
	private Equipa equipaVisitada;
	private Equipa equipaVisitante;
	private int golosEquipaVisitada;
	private int golosEquipaVisitante;
	private Date data;
	private int jornada;
	private int codigo;
	
	private List <Arbitro> arbitro = new ArrayList <Arbitro>();
	private List <Equipa> equipa = new ArrayList <Equipa>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	/**
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obt�-lo em qualquer lugar
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	}

	public void setEquipaVisitada(Equipa equipaVisitada) {
		this.equipaVisitada = equipaVisitada;
	}

	public Equipa getEquipaVisitante() {
		return equipaVisitante;
	}

	public void setEquipaVisitante(Equipa equipaVisitante) {
		this.equipaVisitante = equipaVisitante;
	}

	public int getGolosEquipaVisitada() {
		return golosEquipaVisitada;
	}

	public void setGolosEquipaVisitada(int golosEquipaVisitada) {
		this.golosEquipaVisitada = golosEquipaVisitada;
	}

	public int getGolosEquipaVisitante() {
		return golosEquipaVisitante;
	}

	public void setGolosEquipaVisitante(int golosEquipaVisitante) {
		this.golosEquipaVisitante = golosEquipaVisitante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getJornada() {
		return jornada;
	}

	public void setJornada(int jornada) {
		this.jornada = jornada;
	}

	public List<Arbitro> getArbitro() {
		return arbitro;
	}

	public void setArbitro(List<Arbitro> arbitro) {
		this.arbitro = arbitro;
	}

	public List<Equipa> getEquipa() {
		return equipa;
	}

	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}


    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PAR�METROS

	

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	
/**
 * Fun��o que permite remover um �rbitro do jogo, atrav�s do seu n�mero de cart�o de cidad�o
 * @param cartaoCidadao (int) par�metro inteiro que vai ser um elemento de valida��o
 * @return arbitro (Arbitro �rbitros que fazem parte do jogo
 */
	protected List<Arbitro> removerArbitro (int cartaoCidadao) {
		
		for (Arbitro arbitro : this.arbitro) {
			if (arbitro.getnCartaoCidadao() == cartaoCidadao ) {
				this.arbitro.remove(arbitro);
				return this.arbitro;
			}
		
		}
		
		
		return arbitro;
		}
	
	/**
	 * Fun��o que permite adicionar um �rbitro ao jogo.
	 * Se o por erro tentarmos adicionar um arbitro com um n�mero de cart�o j� existente, a fun��o n�o permite que isso aconte�a
	 * @param arbitro (Arbitro) �rbito que pretendemos adicionar ao jogo.
	 */
	public void addArbitro(Arbitro arbitro) {
		Arbitro cartaoArbitro = this.getnCartaoArbitro(arbitro.getnCartaoCidadao());
		
		if ( cartaoArbitro != null) {
			throw new IllegalArgumentException("C�digo j� existente");
		}
		
		this.arbitro.add(arbitro);
	}
	/**
	 * Fun��o que permite alterar um �rbitro do jogo
	 * Esta altera��o est� dependente da valida��o do n�mero do cart�o de cidad�o
	 * @param nCartaoCidadao (int) par�metro inteiro que vai ser um elemento de valida��o
	 * @param arbitroAposAlteracao (Arbitro) Altera��es a serem efetuadas ao �rbitro ap�s a valida��o
	 */
	//por testar
	public void alterarArbitro(int nCartaoCidadao, Arbitro arbitroAposAlteracao) {
		 Arbitro arbitroAlterado = new Arbitro();

	        for (Arbitro arbitro : this.arbitro) {
	            if (nCartaoCidadao == arbitro.getnCartaoCidadao()) {
	                arbitroAlterado = arbitro;
	            }
	        }
	        int index = this.arbitro.indexOf(arbitroAlterado);
	        this.arbitro.set(index, arbitroAposAlteracao);
		}
	
	
	//------------------------------------//
	
	/**
	 * Esta fun��o serve de complento �s fun��es </strong>alterarArbitro</strong> e </strong>addArbitro</strong>
	 * @param nCartao (int) par�metro inteiro que vai ser um elemento de valida��o
	 * @return
	 */
			
	protected Arbitro getnCartaoArbitro (int nCartao) {
		
		for (Arbitro arbitro : this.arbitro) {
			if (arbitro.getnCartaoCidadao()== nCartao) {
				return arbitro;
			}
		
		}
		return null;
		}
	
	
	
	public void addEquipaVisitada(Equipa equipaVisitada) {
	
		this.equipa.add(equipaVisitada);
	}
	
	public void addEquipaVisitante(Equipa equipaVisitante) {
		this.equipa.add(equipaVisitante);
	}
	
	
	
	/**
	 * Fun��o que permite remover golos os da equipa visitada
	 * Esta fun��o est� dependente da valida��o do c�digo da equipa que vai ter os golos removidos
	 * @param golosARemover (int) par�metro inteiro que fornece o n�mero de golos a remover
	 * @param codigo (int) par�metro inteiro que fornece o c�digo da equipa
	 * @return
	 */
	//por testar
	public int removerGolosEquipaVisitada (int golosARemover, int codigo)  {
		
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo() == codigo ) {
				golosEquipaVisitada -= golosARemover;
				return golosEquipaVisitada;
			}
		
		}
		return golosEquipaVisitada;
	}
	
	/**
	 * Fun��o que permite remover os golos da equipa visitante
	 * Esta fun��o est� dependente da valida��o do c�digo da equipa que vai ter os golos removidos
	 * @param golosARemover (int) par�metro inteiro que fornece o n�mero de golos a remover
	 * @param codigo (int) par�metro inteiro que fornece o c�digo da equipa
	 * @return
	 */
	//por testar
	public int removerGolosEquipaVisitante (int golosARemover, int codigo)  {
		
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo() == codigo ) {
				golosEquipaVisitante -= golosARemover;
				return golosEquipaVisitada;
			}
		
		}
		return golosEquipaVisitada;
	}

	public Jogo addJogo (Equipa equipaVisitada, Equipa equipaVisitante) {
		Jogo jogo = new Jogo();
		if (equipaVisitada == equipaVisitante){
			throw new IllegalArgumentException("N�o se pode adicionar Equipas Iguais");
		}
		return jogo;
		
	}
	

    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	/**
	 * Este m�todo permite vizualizar os valores dos atributos na class </strong>main</strong>
	 */
	
	@Override
	public String toString() {
		return "Jogo [equipaVisitada=" + equipaVisitada + ", equipaVisitante=" + equipaVisitante
				+ ", golosEquipaVisitada=" + golosEquipaVisitada + ", golosEquipaVisitante=" + golosEquipaVisitante
				+ ", data=" + data + ", jornada=" + jornada + ", codigo=" + codigo + ", arbitro=" + arbitro
				+ ", equipa=" + equipa + "]";
	}

	

    // ----> equals()

}
