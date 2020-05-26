import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competicao {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

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

	

	protected List<Equipa> removerEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo() == codigo ) {
				this.equipa.remove(equipa);
				return this.equipa;
			}
		}
		return equipa;
		}
	
	protected Equipa getCodigoEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo()== codigo ) {
				return equipa;
			}
		
		}
		return null;
		}

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

	protected List<Jogo> removerJogo (int codigo) {
		for (Jogo jogo : this.jogo) {
			if (jogo.getCodigo() == codigo ) {
				this.jogo.remove(jogo);
				return this.jogo;
			}
		}
		return jogo;
		}

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
	public void addEquipa(Equipa equipa) {
		
		
		Equipa codEquipa = this.getCodigoEquipa(equipa.getCodigo());
		
		
		if ( codEquipa != null) {
			throw new IllegalArgumentException("Equipa com o mesmo código na competição");
		}
		
		// nao funfa
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

    // ----> toString()
	@Override
	public String toString() {
		return "Competicao [codigo=" + codigo + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
				+ ", escalao=" + escalao + ", equipa=" + equipa + ", jogo=" + jogo + "]";
	}
	


    // ----> equals()

}
