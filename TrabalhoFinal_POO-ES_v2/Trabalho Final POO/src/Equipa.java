import java.util.ArrayList;
import java.util.List;

public class Equipa {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	private int codigo;
	private String nome;
	private String escalao;
	
	private List <Jogador> jogador = new ArrayList<Jogador>();
	private List <Treinador> treinador = new ArrayList<Treinador>();
	
//Adicionar o add codigo para dps poder validar nesta e nas outras classes que peçam codigo
	
	
    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================



    // ======
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

	public String getEscalao() {
		return escalao;
	}

	public void setEscalao(String escalao) {
		this.escalao = escalao;
	}

	public List<Jogador> getJogador() {
		return jogador;
	}

	public void setJogador(List<Jogador> jogador) {
		this.jogador = jogador;
	}

	public List<Treinador> getTreinador() {
		return treinador;
	}

	public void setTreinador(List<Treinador> treinador) {
		this.treinador = treinador;
	}
	
	
	
    // =================== CONSTRUTORES =====================
    // =======================================================

  
   
    // CONSTRUTOR DEFAULT

   

    // CONSTRUTOR COM PARÂMETROS

	



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	protected List<Jogador> removerJogador (int cartaoCidadao) {
		
		for (Jogador jogador : this.jogador) {
			if (jogador.getnCartaoCidadao() == cartaoCidadao ) {
				this.jogador.remove(jogador);
				return this.jogador;
			}
		
		}
		
		
		return jogador;
		}
	
	protected List<Treinador> removerTreinador (int cartaoCidadao) {
		
		for (Treinador treinador : this.treinador) {
			if (treinador.getnCartaoCidadao() == cartaoCidadao ) {
				this.treinador.remove(treinador);
				return this.treinador;
			}
		
		}
		
		
		return treinador;
		}

	// por testar
	public void alterarJogador(int nCartaoCidadao, Jogador jogadorAposAlteracao) {
	    Jogador jogadorAlterado = new Jogador();

        for (Jogador jogador : this.jogador) {
            if (nCartaoCidadao == jogador.getnCartaoCidadao()) {
                jogadorAlterado = jogador;
            }
        }
        int index = this.jogador.indexOf(jogadorAlterado);
        this.jogador.set(index, jogadorAposAlteracao);
	}
	
	public void alterarTreinador(int nCartaoCidadao, Treinador treinadorAposAlteracao) {
		 Treinador treinadorAlterado = new Treinador();

	        for (Treinador treinador : this.treinador) {
	            if (nCartaoCidadao == treinador.getnCartaoCidadao()) {
	                treinadorAlterado = treinador;
	            }
	        }
	        int index = this.treinador.indexOf(treinadorAlterado);
	        this.treinador.set(index, treinadorAposAlteracao);
		}
	
	//-----------------//
	//por fazer
	public void ordenarJogadores() {
		
	}
	//-----------------//
	protected Jogador getCartaoCidadaoJogador (int nCartaoCidadao) {
		for (Jogador jogador : this.jogador) {
			if (jogador.getnCartaoCidadao()== nCartaoCidadao ) {
				return jogador;
			}
		
		}
		return null;
		}
	
	protected Treinador getCartaoCidadaoTreinador (int nCartaoCidadao) {
		for (Treinador treinador : this.treinador) {
			if (treinador.getnCartaoCidadao()== nCartaoCidadao ) {
				return treinador;
			}
		
		}
		return null;
		}
	
	public void addJogador (Jogador jogador) {
		
		
		
		Jogador cartaoJogador = this.getCartaoCidadaoJogador(jogador.getnCartaoCidadao());
		
		if ( cartaoJogador != null) {
			throw new IllegalArgumentException("Código já existente");
		}
		
	
		
		this.jogador.add(jogador);
		
	}
	
	public void addTreinador (Treinador treinador) {
		
		
		
		Treinador cartaoTreinador = this.getCartaoCidadaoTreinador(treinador.getnCartaoCidadao());
		
		if ( cartaoTreinador != null) {
			throw new IllegalArgumentException("Cartão já existente");
		}
		
	
		
		this.treinador.add(treinador);
		
	}
	
	
	
    // =======================================================
    // ============== MÉTODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()



	@Override
	public String toString() {
		return "Equipa"+ "\r\n"+  "Codigo: " + codigo + "\r\n"+"Nome: " + nome + "\r\n"+"Escalao: " + escalao + "\r\n"+ "Jogador: " + jogador
				+ "\r\n"+ "Treinador: " + treinador;
	}


    // ----> equals()

}
