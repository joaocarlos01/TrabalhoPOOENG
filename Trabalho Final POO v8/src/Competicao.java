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
	 * A class </strong> Treinador </strong> herda da class </strong>Pessoa</strong>.
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
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

  
   
    // CONSTRUTOR DEFAULT

	public Competicao() {
		
	}

    // CONSTRUTOR COM PAR�METROS



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

	
	// por testar
	public Jogo mostrarJornada (int jornada){
		
		for (Jogo jogo : this.jogo) {
			if (jornada == jogo.getJornada()) {
				return jogo;
			}
		}
		return null;
	}
		
	
	
	//----------------------//

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
 * Este metodo permite adicionar um jogo � competi��o mediante algumas condi��es
 * As equipas t�m de pertencer � competi��o
 * As equipas n�o podem ter dois jogos na mesma jornada
 * @param jogo (Jogo) jogo que pretendemos adicionar
 */
	
	public void addJogo (Jogo jogo) {
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
			this.jogo.add(jogo);
			
		}
		else {
			throw new IllegalArgumentException("Equipa n�o pertencente � competi��o");
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

    // ----> toString()
	@Override
	public String toString() {
		return "Competicao [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", escalao=" + escalao + ", equipa=" + equipa + ", jogo=" + jogo + "]";
	}
	


    // ----> equals()

}
