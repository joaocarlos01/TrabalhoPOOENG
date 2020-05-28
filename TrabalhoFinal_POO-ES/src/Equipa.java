import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Equipa {
	/**
	 * A class </strong> Equipa </strong> disponibliza os atributos, m�todos e fun��es necess�rios � cria��o de um Equipa
	 * @author Jo�o Carlos
	 * @author Francisco Esteves
	 * @version 1.0
	 * @since 07/05/2020
	 */
	
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

	/**
	 *</strong>codigo</strong> recebe o c�digo da equipa
	 *</strong>nome</strong> recebe o nome da equipa
	 *</strong>escalao</strong> recebe o escal�o da equipa
	 *</strong> List<Jogador> recebe a lista de jogadores
	 *</strong> List<Treinadores> recebe a lista de treinadores
	 */
	private int codigo;
	private String nome;
	private String escalao;
	
	private List <Jogador> jogador = new ArrayList<Jogador>();
	private List <Treinador> treinador = new ArrayList<Treinador>();
	
//Adicionar o add c�digo para depois poder validar nesta e nas outras classes que pe�am c�digo
	
	
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

   

    // CONSTRUTOR COM PAR�METROS

	



    // =======================================================
    // =================== .COMPORTAMENTOS ==================
    // =======================================================

	/**
	 * Fun��o que permite remover um jogador
	 * Esta fun��o esta dependete da valida��o do n�mero de cart�o de cidad�o do jogador
	 * @param cartaoCidadao (int) parametro inteiro que recebe o n�mero de cart�o de cidad�o fornecido pelo utilizador
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
	 *  Fun��o que permite remover um treinador
	 * Esta fun��o esta dependete da valida��o do n�mero de cart�o de cidad�o do treinador
	 * @param cartaoCidadao (int) par�metro inteiro que recebe o n�mero de cart�o de cidad�o fornecido pelo utilizador
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
 * Este m�todo permite alterar um jogador, atrav�s do fornecimento do n�mero do cart�o de cidad�o
 * @param nCartaoCidadao (int) n�mero do cart�o de cidad�o do jogador que pretendemos alterar
 * @param jogadorAposAlteracao (Jogador) jogador que pretendemos implementar no clube ap�s a altera��o.
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
	 * Este m�todo permite alterar uma Treinador, atrav�s do fornecimento do n�mero do cart�o de cidad�o
	 * @param nCartaoCidadao (int) n�mero do cart�o de cidad�o do treinador que pretendemos alterar
	 * @param treinadorAposAlteracao (Treinador) treinador que pretendemos implementar no clube ap�s a altera��o.
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
	 * Esta fun��o serve de complento �s fun��es </strong>alterarJogador</strong> e </strong>addjogador</strong>  
	 * @param nCartaoCidadao (int) par�metro inteiro que vai ser um elemento de valida��o
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
	 * Esta fun��o serve de complento �s fun��es </strong>alterarTreinador</strong> e </strong>addTreinador</strong>  
	 * @param nCartaoCidadao (int) par�metro inteiro que vai ser um elemento de valida��o
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
	 * Fun��o que permite adicionar um jogador � equipa.
	 * Se por erro tentarmos adicionar um jogador com um n�mero de cart�o j� existente, a fun��o n�o permite que isso aconte�a
	 * @param jogador (Jogador) 
	 */
	public void addJogador (Jogador jogador) {
		
		
		
		Jogador cartaoJogador = this.getCartaoCidadaoJogador(jogador.getnCartaoCidadao());
		
		if ( cartaoJogador != null) {
			throw new IllegalArgumentException("C�digo j� existente");
		}
		
	
		
		this.jogador.add(jogador);
		
	}
	
	/**
	 * Fun��o que permite adicionar um treinador � equipa.
	 * Se por erro tentarmos adicionar um treinador com um n�mero de cart�o j� existente, a fun��o n�o permite que isso aconte�a
	 * @param treinador (Treinador) 
	 */
	public void addTreinador (Treinador treinador) {
		
		
		
		Treinador cartaoTreinador = this.getCartaoCidadaoTreinador(treinador.getnCartaoCidadao());
		
		if ( cartaoTreinador != null) {
			throw new IllegalArgumentException("Cart�o j� existente");
		}
		
	
		
		this.treinador.add(treinador);
		
	}
	
	//por fazer
	public void ordenarJogadores() {
		
}
	//-----------------//
	
    // =======================================================
    // ============== M�TODOS COMPLEMENTARES ==============
    // =======================================================

    // ----> toString()

	/**
	 * Este m�todo permite vizualizar os valores dos atributos na class </strong>main</strong>
	 */

	@Override
	public String toString() {
		return "Equipa"+ "\r\n"+  "Codigo: " + codigo + "\r\n"+"Nome: " + nome + "\r\n"+"Escalao: " + escalao + "\r\n"+ "Jogador: " + jogador
				+ "\r\n"+ "Treinador: " + treinador;
	}


    // ----> equals()

}
