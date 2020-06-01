import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.joaocarlos.exception.NumeroCartaoDuplicado;
import com.joaocarlos.exception.*;
public class Competicao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 * A class </strong> Competi��o </strong> disponibliza os atributos, metodos e fun��es necess�rios � cria��o de uma competi��o.
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
	 * @version 1.0
	 * @since 07/05/2020
	 */
	
	
	/**
	 * </strong> codigo </strong> recebe o c�digo da competi��o
	 * </strong> nome </strong>  recebe o nome da competi��o
	 * </strong> dataInicio </strong> recebe a data de in�cio da competi��o
	 * </strong> dataFim</strong> recebe a data do fim da competi��o
	 * </strong> escalao </strong> recebe o escal�o da competi��o
	 ** </strong> List <Equipa> </strong> recebe a lista das equipas
	 * </strong> List <Jogo> </strong> recebe a lista dos jogos
	 */
	private int codigo;
	private String nome;
	private Date dataInicio;
	private Date dataFim;
	private String escalao;
	
	
	private List <Equipa> equipa = new ArrayList <Equipa> ();
	private List <Jogo> jogo = new ArrayList <Jogo>();
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public List<Equipa> getEquipa() {
		return equipa;
	}

	public void setEquipa(List<Equipa> equipa) {
		this.equipa = equipa;
	}

	public List<Jogo> getJogo() {
		return jogo;
	}

	public void setJogo(List<Jogo> jogo) {
		this.jogo = jogo;
	}
	

    // =======================================================
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    /**
     *  CONSTRUTOR DEFAULT
     */

	public Competicao() {
		
	}

    /**
     *  CONSTRUTOR COM PAR�METROS
     * @param codigo (int) c�digo da competi��o
     * @param nome (String) nome da competi��o
     * @param dataInicio (Date) data do inicio da competi��o
     * @param dataFim (Date) data do fim da competi��o
     * @param escalao (String) escal�o da competi��o
     * @param equipa (List<Equipa>) equipas da competi��o
     * @param jogo (List <Jogo>) jogos da competi��o
     */

	public Competicao(int codigo, String nome, Date dataInicio, Date dataFim, String escalao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.escalao = escalao;
		
	}


    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	
	/**
	 * Este m�todo permite remover uma equipa atrav�s do fornecimento do seu c�digo.
	 * @param codigo (int) c�digo identificador da equipa que pretendemos remover.
	 * @return  equipa (Equipa) ir� retornar a lista de equipas j� alterada.
	 */

	protected List<Equipa> removerEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo() == codigo ) {
				this.equipa.remove(equipa);
				return this.equipa;
			}
		}
		return equipa;
		}
	/**
	 * 	M�todo complementar para a obten��o do c�digo dos c�digos das equipas
	 * @param codigo (int)
	 * @return equipa (Equipa)
	 */
	protected Equipa getCodigoEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo()== codigo ) {
				return equipa;
			}
		
		}
		return null;
		}
	/**
	 * Este m�todo permite alterar uma equipa, atrav�s do fornecimento do seu c�digo.
	 * @param equipaAposAlteracao (Equipa) equipa que ir� substituir a equipa anterior
	 * @param codigo (int) c�digo identificador da equipa que pretendemos remover.
	 */
	
	public void alterarEquipa(int codigo, Equipa equipaAposAlteracao) {
        Equipa equipaAlterada = new Equipa();

        for (Equipa equipa : this.equipa) {
            if (codigo == equipa.getCodigo()) {
                equipaAlterada = equipa;
            }
        }
        int index = this.equipa.indexOf(equipaAlterada);
        this.equipa.set(index, equipaAposAlteracao);

    }
	/**
	 * Este m�todo permite remover um jogo atrav�s do fornecimento do seu c�digo.
	 * @param codigo (int) c�digo identificador do jogo que pretendemos remover.
	 * @return  jogo (Jogo) ir� retornar a lista de jogos j� alterada.
	 */
	
	protected List<Jogo> removerJogo (int codigo) {
		for (Jogo jogo : this.jogo) {
			if (jogo.getCodigo() == codigo ) {
				this.jogo.remove(jogo);
				return this.jogo;
			}
		}
		return jogo;
		}
	/**
	 * Este m�todo permite alterar um jogo, atrav�s do fornecimento do seu c�digo.
	 * @param equipaAposAlteracao (Jogo) jogo que ir� substituir o jogo anterior
	 * @param codigo (int) c�digo identificador do jogo que pretendemos remover.
	 */

	public void alterarJogo (int codigo, Jogo jogoAposAlteracao) {
		   Jogo jogoAlterado = new Jogo();

	        for (Jogo jogo : this.jogo) {
	            if (codigo == jogo.getCodigo()) {
	                jogoAlterado = jogo;
	            }
	        }
	        int index = this.jogo.indexOf(jogoAlterado);
	        this.jogo.set(index, jogoAposAlteracao);

	}

	
	/**
	 * Este m�todo permite mostrar todos os jogos de uma determinada jornada
	 * @param jornada (int) jornada da competi��o
	 * @return jogo, se a jornada do parametro for igual � jornada de um dos jogos da competi��o.
	 * @return null, se n�o existirem jogos na jornada inserida.
	 */
	public Jogo mostrarJornada (int jornada){
		
		for (Jogo jogo : this.jogo) {
			if (jornada == jogo.getJornada()) {
				return jogo;
			}
		}
		return null;
	}
		
	
	

	/**
	 * Este m�todo permite adicionar uma equipa mediante certas exce��es, atrav�s do fornecimento do seu c�digo.
	 *N�o � possivel adicionar Equipas com o mesmo c�digo
	 *N�o � possivel adicionar equipas com escal�o diferente da Competi��o
	 * @param equipa(Equipa) Equipa que se pretende adicionar � competi��o.
	 */
	public void addEquipa(Equipa equipa) {
		
		
		Equipa codEquipa = this.getCodigoEquipa(equipa.getCodigo());
		
		
		if ( codEquipa != null) {
			throw new NumeroDuplicadoexception(equipa.getCodigo(), equipa.getNome());
		}
		
		
		if (equipa.getEscalao() != this.getEscalao()) {
			throw new IllegalArgumentException("Escal�es Diferentes");
		}
		
		
		this.equipa.add(equipa);
		}
		


	/**
	 * 
	 * @param jogo (Jogo) jogo que pretendemos adicionar
	 * @return true, se ambas as equipa pertencerem � competi��o
	 * @return false, se alguma das equipas n�o pertencer � competi��o
	 */

	public boolean validarSeEquipaPertence (Jogo jogo) {
		boolean validacaoVisitada = false;
		boolean validacaoVisitante = false;
		
		
		for (Equipa equipa : this.equipa) {
			if(jogo.getEquipaVisitada().equals(equipa)) {
				validacaoVisitada = true;
			}
			
			if (jogo.getEquipaVisitante().equals(equipa)) {
				validacaoVisitante = true;
			}
		
		}
		if (validacaoVisitada && validacaoVisitante) {
			
			return true;
			
		}
	
		else {
			throw new IllegalArgumentException("As Equipas n�o pertencem � comepti��o");
			
		}
		
		}
	
	
	/**
	 * 	Este m�todo serve de complemnto ao m�todo adicionar jogo.
	 * @param jogo (Jogo) jogo que pretendemos adicionar
	 * @return valida��o = true, se as equipas n�o jogarem duas vezes na mesma jornada
	 */
	private boolean validarSeEquipaJogouJornada(Jogo jogo) { 
        boolean jornada = true; 
        for (Jogo jogoAlterado : this.jogo) { 
            if (jogoAlterado.getJornada() == jogo.getJornada()) { 
                if (jogoAlterado.getEquipaVisitada().equals(jogo.getEquipaVisitada()) || jogoAlterado.getEquipaVisitante().equals(jogo.getEquipaVisitada())) { 
                        
                    jornada = false; 
                    throw new IllegalArgumentException("A equipa ja jogou "); 
                            
                } 
                if (jogoAlterado.getEquipaVisitada().equals(jogo.getEquipaVisitante()) ||  jogoAlterado.getEquipaVisitante().equals(jogo.getEquipaVisitante())) { 
                        
                    jornada = false; 
                    throw new IllegalArgumentException("A equipa ja jogou "); 
                } 
            } 
        } 
        return jornada; 
    } 
	
	/**
	 * Este metodo permite adicionar um jogo � competi��o mediante algumas condi��es
	 * As equipas t�m de pertencer � competi��o
	 * As equipas n�o podem ter dois jogos na mesma jornada
	 * @param jogo (Jogo) jogo que pretendemos adicionar
	 */
	public void addJogo (Jogo jogo) {
		
		if (validarSeEquipaJogouJornada(jogo) && validarSeEquipaPertence(jogo)) {
			this.jogo.add(jogo);
		}
		}

	/**
	 * Este metodo permite mostrar todas as equipas presentes na competi��o
	 * @return nEquipas (List<Equipas>)
	 */
	public List<Equipa> mostrarEquipas() {
		return equipa;
	}
	
	
	
	
    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    /**
     * Metodo toString permite que sejam visualizados os valores dos atributos
     */
	@Override
	public String toString() {
		return "Competicao [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", escalao=" + escalao + ", equipa=" + equipa + ", jogo=" + jogo + "]";
	}
	


    // ----> equals()

}
