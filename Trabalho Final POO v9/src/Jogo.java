import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.joaocarlos.exception.NumeroCartaoDuplicado;

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
	 * </strong> codigo </strong> recebe o codigo identificador do jogo
	 * </strong> List <Arbitro> </strong> recebe a lista de arbitros
	 * </strong> List <Equipa> </strong> recebe a lista de aequipas
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public Equipa getEquipaVisitada() {
		return equipaVisitada;
	}



	public Equipa getEquipaVisitante() {
		return equipaVisitante;
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

  
   
    /**
     *  CONSTRUTOR DEFAULT
     */

	public Jogo() {
		
	}

    

	/**
	 *  CONSTRUTOR COM PARÂMETROS
	 * @param equipaVisitada (Equipa) equipa visitada do jogo
	 * @param equipaVisitante (Equipa) equipa visitante do jogo
	 * @param golosEquipaVisitada (int) golos da equipa visitada
	 * @param golosEquipaVisitante (int) golos da equipa visitante
	 * @param data (Date) data do jogo
	 * @param jornada (int) jornada do jogo
	 * @param codigo (int) codigo do jogo
	 * @param arbitro (List <Arbitro>) arbitros do jogo
	 * @param equipa(List <Equipa>) equipas do jogo
	 */

	public Jogo(Equipa equipaVisitada, Equipa equipaVisitante, int golosEquipaVisitada, int golosEquipaVisitante,
			Date data, int jornada, int codigo, List<Arbitro> arbitro, List<Equipa> equipa) {
		super();
		this.equipaVisitada = equipaVisitada;
		this.equipaVisitante = equipaVisitante;
		this.golosEquipaVisitada = golosEquipaVisitada;
		this.golosEquipaVisitante = golosEquipaVisitante;
		this.data = data;
		this.jornada = jornada;
		this.codigo = codigo;
		this.arbitro = arbitro;
		this.equipa = equipa;
	}
	

    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	
/**
 * Função que permite remover um árbitro do jogo, através do seu numero de cartão de cidadão
 * @param cartaoCidadao (int) parametro inteiro que vai ser um elemento de validação
 * @return arbiro (Arbitro) arbitros que fazem parte do jogo
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
	 * Função que permite adicionar um arbitro ao jogo.
	 * Se o por erro tentarmos adicionar um arbitro com um numero de cartão já existente, a função não permite que isso aconteça
	 * @param arbitro (Arbitro) 
	 */
	public void addArbitro(Arbitro arbitro) {
		Arbitro cartaoArbitro = this.getnCartaoArbitro(arbitro.getnCartaoCidadao());
		
		if ( cartaoArbitro != null) {
			throw new NumeroCartaoDuplicado(arbitro.getnCartaoCidadao(), arbitro.getNome());
		}
		
		this.arbitro.add(arbitro);
	}
	/**
	 * Função que permite alterar um arbitro do jogo
	 * Esta alteração está dependente da validação do numero de cartão de cidadão
	 * @param nCartaoCidadao (int) parametro inteiro que vai ser um elemento de validação
	 * @param arbitroAposAlteracao (Arbitro) Alterações a serem efetuadas ao arbitro após a validação
	 */
	
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
	
	

	
	/**
	 * Esta função serve de complento às funções </strong>alterarArbitro</strong> e </strong>addArbitro</strong>
	 * @param nCartao (int) parametro inteiro que vai ser um elemento de validação
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
	
	
	
	
	/**
	 * Função que permite remover golo da equipa visitada
	 * Esta função está dependente da validação do codigo da equipa que vai ter golos removidos
	 * @param golosARemover (int) parametro inteiro que fornece o numero de golos a remover
	 * @param codigo (int) parametro inteiro que fornece o codigo da equipa
	 * @return
	 */
	
	public int removerGolosEquipaVisitada (int golosARemover, int codigo)  {
		
		 
			if (equipaVisitada.getCodigo() == codigo ) {
				golosEquipaVisitada -= golosARemover;
				return golosEquipaVisitada;
			}
		
		
		return golosEquipaVisitada;
	}
	
	/**
	 * Função que permite remover golo da equipa visitante
	 * Esta função está dependente da validação do codigo da equipa que vai ter golos removidos
	 * @param golosARemover (int) parametro inteiro que fornece o numero de golos a remover
	 * @param codigo (int) parametro inteiro que fornece o codigo da equipa
	 * @return
	 */
	
	public int removerGolosEquipaVisitante (int golosARemover, int codigo)  {
		
			if (equipaVisitante.getCodigo() == codigo ) {
				golosEquipaVisitante -= golosARemover;
				return golosEquipaVisitante;
			}
		
		
		return golosEquipaVisitante;
	}

	public int adicionarGolosEquipaVisitada (int golosAAdicionar, int codigo) {
		
		if (equipaVisitada.getCodigo() == codigo) {
			golosEquipaVisitada += golosAAdicionar;
			return golosEquipaVisitada;
		}
		return golosEquipaVisitada;
	}

	public int adicionarGolosEquipaVisitante (int golosAAdicionar, int codigo) {
		
		if (equipaVisitante.getCodigo() == codigo) {
			golosEquipaVisitante += golosAAdicionar;
			return golosEquipaVisitante;
		}
		return golosEquipaVisitante;
	}
/**
 * Este metodo permite definir a equipa visitante mediante uma exceção
 * As equipas participantes no jogo não podem ser iguais
 * @param equipaVisitante (Equipa)
 */
	public void setEquipaVisitante(Equipa equipaVisitante) {
		if (this.equipaVisitada == equipaVisitante){
			throw new IllegalArgumentException("Não se pode adicionar Equipas Iguais");
		}
		this.equipaVisitante = equipaVisitante;
	}
	/**
	 * Este metodo permite definir a equipa visitada mediante uma exceção
	 * As equipas participantes no jogo não podem ser iguais
	 * @param equipaVisitada (Equipa)
	 */
	public void setEquipaVisitada(Equipa equipaVisitada) {
		
		if (equipaVisitada == this.equipaVisitante){
			throw new IllegalArgumentException("Não se pode adicionar Equipas Iguais");
		}	
		
		this.equipaVisitada = equipaVisitada;
	}
	
	//public void testeJogo (int jornada, Jogo jogo1, Jogo jogo2) {
		
		//if (jornada == this.getJornada()) {
		//if (jogo1.getEquipaVisitada() == jogo2.getEquipaVisitada()) {
		//	throw new IllegalArgumentException("Esta equipa ja possui jogos nesta jornada");
		//}
		//if (jogo1.getEquipaVisitante() == jogo2.getEquipaVisitante()) {
		//	throw new IllegalArgumentException("Esta equipa ja possui jogos nesta jornada");
		//}
		//}
		
	//}
	
	

    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

	/**
	 * Metodo toString permite que sejam visualizados os valores dos atributos
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
