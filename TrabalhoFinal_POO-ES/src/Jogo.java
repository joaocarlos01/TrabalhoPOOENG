import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Jogo {
	/**
	 * A class </strong> Jogo </strong> disponibliza os atributos, metodos e funções necessários à criação de um jogo
	 * @author João Carlos
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
	 * </strong> golosEquipaVisitada</strong> recebe o número de golos da equipa visitada
	 * </strong> golosEquipaVisitante</strong> recebe o número de golos da equipa visitante
	 * </strong> data </strong> recebe a data do jogo
	 * </strong> jornada </strong> recebe a jornada do campeonato
	 * </strong> codigo </strong> recebe o código identificador do jogo
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
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obtê-lo em qualquer lugar
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

   

    // CONSTRUTOR COM PARÂMETROS

	

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	
/**
 * Função que permite remover um árbitro do jogo, através do seu número de cartão de cidadão
 * @param cartaoCidadao (int) parâmetro inteiro que vai ser um elemento de validação
 * @return arbitro (Arbitro Árbitros que fazem parte do jogo
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
	 * Função que permite adicionar um árbitro ao jogo.
	 * Se o por erro tentarmos adicionar um arbitro com um número de cartão já existente, a função não permite que isso aconteça
	 * @param arbitro (Arbitro) Árbito que pretendemos adicionar ao jogo.
	 */
	public void addArbitro(Arbitro arbitro) {
		Arbitro cartaoArbitro = this.getnCartaoArbitro(arbitro.getnCartaoCidadao());
		
		if ( cartaoArbitro != null) {
			throw new IllegalArgumentException("Código já existente");
		}
		
		this.arbitro.add(arbitro);
	}
	/**
	 * Função que permite alterar um árbitro do jogo
	 * Esta alteração está dependente da validação do número do cartão de cidadão
	 * @param nCartaoCidadao (int) parâmetro inteiro que vai ser um elemento de validação
	 * @param arbitroAposAlteracao (Arbitro) Alterações a serem efetuadas ao árbitro após a validação
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
	 * Esta função serve de complento às funções </strong>alterarArbitro</strong> e </strong>addArbitro</strong>
	 * @param nCartao (int) parâmetro inteiro que vai ser um elemento de validação
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
	 * Função que permite remover golos os da equipa visitada
	 * Esta função está dependente da validação do código da equipa que vai ter os golos removidos
	 * @param golosARemover (int) parâmetro inteiro que fornece o número de golos a remover
	 * @param codigo (int) parâmetro inteiro que fornece o código da equipa
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
	 * Função que permite remover os golos da equipa visitante
	 * Esta função está dependente da validação do código da equipa que vai ter os golos removidos
	 * @param golosARemover (int) parâmetro inteiro que fornece o número de golos a remover
	 * @param codigo (int) parâmetro inteiro que fornece o código da equipa
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
			throw new IllegalArgumentException("Não se pode adicionar Equipas Iguais");
		}
		return jogo;
		
	}
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	/**
	 * Este método permite vizualizar os valores dos atributos na class </strong>main</strong>
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
