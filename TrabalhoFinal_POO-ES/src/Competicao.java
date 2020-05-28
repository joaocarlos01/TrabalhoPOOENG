import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 * A class </strong> Treinador </strong> herda da class </strong>Pessoa</strong>.
	 * @author João Carlos
	 * @author Francisco Esteves
	 */
	
	
	/**
	 * </strong> codigo </strong> recebe o código da competição
	 * </strong> nome </strong>  recebe o nome da competição
	 * </strong> dataInicio </strong> recebe a data de início da competição
	 * </strong> dataFim</strong> recebe a data do fim da competição
	 * </strong> escalao </strong> recebe o escalão da competição
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
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obtê-lo em qualquer lugar
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

   

    // CONSTRUTOR COM PARÂMETROS



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	/**
	 * Este método permite remover uma equipa através do fornecimento do seu código.
	 * @param codigo (int) código identificador da equipa que pretendemos remover.
	 * @return  equipa (Equipa) irá retornar a lista de equipas já alterada.
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
	 * 	Método complementar para a obtenção do código dos códigos das equipas
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
	 * Este método permite alterar uma equipa, através do fornecimento do seu código.
	 * @param equipaAposAlteracao (Equipa) equipa que irá substituir a equipa anterior
	 * @param codigo (int) código identificador da equipa que pretendemos remover.
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
	 * Este método permite remover um jogo através do fornecimento do seu código.
	 * @param codigo (int) código identificador do jogo que pretendemos remover.
	 * @return  jogo (Jogo) irá retornar a lista de jogos já alterada.
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
	 * Este método permite alterar um jogo, através do fornecimento do seu código.
	 * @param equipaAposAlteracao (Jogo) jogo que irá substituir o jogo anterior
	 * @param codigo (int) código identificador do jogo que pretendemos remover.
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
	public int mostrarJornada (int jornada){
		int index = 0;
		for (Jogo jogo : this.jogo) {
			if (jornada == jogo.getJornada()) {
				index = this.jogo.indexOf(jogo);
				
			}
		}
		return index;
	}
	
	//----------------------//
	
	
	/**
	 * Este método permite adicionar uma equipa mediante certas exceções, através do fornecimento do seu código.
	 * @param equipa(Equipa) Equipa que se pretende adicionar à competição.
	 */
	
	public void addEquipa(Equipa equipa) {
		
		
		Equipa codEquipa = this.getCodigoEquipa(equipa.getCodigo());
		
		
		if ( codEquipa != null) {
			throw new IllegalArgumentException("Equipa com o mesmo código na competição");
		}
		
		//funfa
		for (Equipa escalaoEquipa : this.equipa) {
		
		if (escalaoEquipa.getEscalao() != this.getEscalao()) {
			throw new IllegalArgumentException("Escalões Diferentes");
		}
		}
		
		this.equipa.add(equipa);
		}
		


	// por Testar 
	public void addJogo (Jogo jogo) {
	
		 this.jogo.add(jogo);
	}

	
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

	/**
	 * Este método permite vizualizar os valores dos atributos na class </strong>main</strong>
	 */
	
    // ----> toString()
	@Override
	public String toString() {
		return "Competicao [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", escalao=" + escalao + ", equipa=" + equipa + ", jogo=" + jogo + "]";
	}
	


    // ----> equals()

}
