import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Equipa {
	/**
	 * A class </strong> Equipa </strong> disponibliza os atributos, metodos e funções necessários à criação de um Equipa
	 * @author João Carlos
	 * @author Francisco Esteves
	 * @version 1.0
	 * @since 07/05/2020
	 */
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 *</strong>codigo</strong> recebe o codigo da equipa
	 *</strong>nome</strong> recebe o nome da equipa
	 *</strong>escalao</strong> recebe o escalão da equipa
	 *</strong> List<Jogador> recebe a lista de jogadores
	 *</strong> List<Treinadores> recebe a lista de treinadores
	 */
	private int codigo;
	private String nome;
	private String escalao;
	
	private List <Jogador> jogador = new ArrayList<Jogador>();
	private List <Treinador> treinador = new ArrayList<Treinador>();
	
//Adicionar o add codigo para dps poder validar nesta e nas outras classes que peçam codigo
	
	
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

	/**
	 * Função que permite remover um jogador
	 * Esta função esta dependete da validação do numero de cartao de cidadão do jogador
	 * @param cartaoCidadao (int) parametro inteiro que recebe o numero de cartao de cidadão fornecido pelo utilizador
	 * @return jogador (Jogador) retorna a lista de jogadores
	 */
	protected List<Jogador> removerJogador (int cartaoCidadao) {
		
		for (Jogador jogador : this.jogador) {
			if (jogador.getnCartaoCidadao() == cartaoCidadao ) {
				this.jogador.remove(jogador);
				return this.jogador;
			}
		
		}
		
		
		return jogador;
		}
	
	/**
	 *  Função que permite remover um treinador
	 * Esta função esta dependete da validação do numero de cartao de cidadão do treinador
	 * @param cartaoCidadao (int) parametro inteiro que recebe o numero de cartao de cidadão fornecido pelo utilizador
	 * @return jogador (Jogador) retorna a lista de treinadores
	 */
	
	protected List<Treinador> removerTreinador (int cartaoCidadao) {
		
		for (Treinador treinador : this.treinador) {
			if (treinador.getnCartaoCidadao() == cartaoCidadao ) {
				this.treinador.remove(treinador);
				return this.treinador;
			}
		
		}
		
		
		return treinador;
		}

/**
 * Este metodo permite alterar uma jogador, através do fornecimento do numero do cartão de cidadão
 * @param nCartaoCidadao (int) numero do cartão de cidadão do jogador que pretendemos alterar
 * @param jogadorAposAlteracao (Jogador) jogador que pretendemos implementar no clube após a alteração.
 */
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
	/**
	 * Este metodo permite alterar uma Treinador, através do fornecimento do numero do cartão de cidadão
	 * @param nCartaoCidadao (int) numero do cartão de cidadão do treinador que pretendemos alterar
	 * @param treinadorAposAlteracao (Treinador) treinador que pretendemos implementar no clube após a alteração.
	 */
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
	


	
	/**
	 * Esta função serve de complento às funções </strong>alterarJogador</strong> e </strong>addjogador</strong>  
	 * @param nCartaoCidadao (int) parametro inteiro que vai ser um elemento de validação
	 * @return jogador (Jogador) 
	 */
			
	protected Jogador getCartaoCidadaoJogador (int nCartaoCidadao) {
		for (Jogador jogador : this.jogador) {
			if (jogador.getnCartaoCidadao()== nCartaoCidadao ) {
				return jogador;
			}
		
		}
		return null;
		}
	/**
	 * Esta função serve de complento às funções </strong>alterarTreinador</strong> e </strong>addTreinador</strong>  
	 * @param nCartaoCidadao (int) parametro inteiro que vai ser um elemento de validação
	 * @return treinador (Treinador) 
	 */
	protected Treinador getCartaoCidadaoTreinador (int nCartaoCidadao) {
		for (Treinador treinador : this.treinador) {
			if (treinador.getnCartaoCidadao()== nCartaoCidadao ) {
				return treinador;
			}
		
		}
		return null;
		}

	/**
	 * Função que permite adicionar um jogador à equipa.
	 * Se o por erro tentarmos adicionar um jogador com um numero de cartão já existente, a função não permite que isso aconteça
	 * @param jogador (Jogador) 
	 */
	public void addJogador (Jogador jogador) {
		
		
		
		Jogador cartaoJogador = this.getCartaoCidadaoJogador(jogador.getnCartaoCidadao());
		
		if ( cartaoJogador != null) {
			throw new IllegalArgumentException("Código já existente");
		}
		
	
		
		this.jogador.add(jogador);
		
	}
	
	/**
	 * Função que permite adicionar um treinador à equipa.
	 * Se o por erro tentarmos adicionar um treinador com um numero de cartão já existente, a função não permite que isso aconteça
	 * @param treinador (Treinador) 
	 */
	public void addTreinador (Treinador treinador) {
		
		
		
		Treinador cartaoTreinador = this.getCartaoCidadaoTreinador(treinador.getnCartaoCidadao());
		
		if ( cartaoTreinador != null) {
			throw new IllegalArgumentException("Cartão já existente");
		}
		
	
		
		this.treinador.add(treinador);
		
	}
	
	//por fazer
	public void ordenarJogadores() {
		
	}
	//-----------------//
	
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
