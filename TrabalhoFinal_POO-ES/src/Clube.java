import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Clube {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================
	
	/**
	 * A class </strong> Clube </strong> disponibliza os atributos, metodos e funções necessários à criação de um clube.
	 * @author João Carlos
	 * @author Francisco Esteves
	 * @version 1.0
	 * @since 07/05/2020
	 */
	
	/**
	 * </strong> codigo </strong> recebe o código do clube
	 * </strong> nome </strong>  recebe o nome do clube
	 * </strong> dataFormacao </strong> recebe a data da formação do clube
	 * </strong> corEquipamento</strong> recebe a cor do equipamento do clube
	 * </strong> contacto </strong> recebe o contacto do clube
	 * </strong> email </strong> recebe o email do clube
	 * </strong> morada </strong> recebe a morada do clube
	 * </strong> List <Equipa> </strong> recebe a lista das equipas
	 */
	private int codigo;
	private String nome;
	private Date dataFormacao;
	private String corEquipamento;
	private int contacto;
	private String email;
	private String morada;
	private List <Equipa> equipa = new ArrayList<Equipa>();
	

    // =======================================================
    // ============ ACESSORES e MODIFICADORES ===============
    // =======================================================

	/**
	 * Conjunto de Acessores e Modificadores que permitem atribuir um valor ao atributo, conseguindo obtê-lo em qualquer lugar
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataFormacao() {
		return dataFormacao;
	}
	public void setDataFormacao(Date dataFormacao) {
		this.dataFormacao = dataFormacao;
	}
	public String getCorEquipamento() {
		return corEquipamento;
	}
	public void setCorEquipamento(String corEquipamento) {
		this.corEquipamento = corEquipamento;
	}
	public int getContacto() {
		return contacto;
	}
	public void setContacto(int contacto) {
		this.contacto = contacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
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
	 * Este método permite alterar uma equipa, através do fornecimento do seu código.
	 * @param equipaAposAlteracao (Equipa) equipa que irá substituir a equipa anterior
	 * @param codigo (int) código identificador da equipa que pretendemos remover.
	 */
	public void alterarEquipa (Equipa equipaAposAlteracao, int codigo) {
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
		 * Este método irá fornecer o número total de treinadores inscritos no clube.
		 * @return numeroTotalTreinador (int) retorna o número total de treinadores do clube.
		 */
	public int nTotalTreinador () {
		int numeroTotalTreinador = 0;
		
		
		for (Equipa equipa : this.equipa) {
			numeroTotalTreinador += equipa.getTreinador().size();
			
		}
		
		return numeroTotalTreinador;
	}
		/**
		 * Este método irá fornecer o número total de jogadores inscritos no clube.
		 * @return numeroTotalJogadores (int) retorna o número total de jogadores do clube.
		 */
	public int nTotalJogador () {
		int numeroTotalJogadores = 0;
		
		
		for (Equipa equipa : this.equipa) {
			numeroTotalJogadores += equipa.getJogador().size();
			
		}
		
		return numeroTotalJogadores;
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
	 * Este método adiciona equipas ao clube, mediante algumas excessões.
	 * Não podem existir equipas com o mesmo código, sendo necessário, pelo menos, um jogador e treinador por equipa.
	 * @param equipa(Equipa) equipa que pretendemos adicionar ao clube
	 */
	public void addEquipa (Equipa equipa) {
		
		
		
		Equipa codEquipa = this.getCodigoEquipa(equipa.getCodigo());
		
		if ( codEquipa != null) {
			throw new IllegalArgumentException("Código já existente");
		}
		
		
			 int treinador = equipa.getTreinador().size();
			if (treinador == 0) {
				throw new IllegalArgumentException("Treinador é necessário");
			}
			
			int jogador = equipa.getJogador().size();
			if (jogador == 0) {
				throw new IllegalArgumentException("Jogadores são necessários");
			}
		
		
		
		
		
		
		this.equipa.add(equipa);
		
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
		return "Clube" + "\r\n"+ "Codigo: " + codigo + "\r\n"+ "Nome: " + nome + "\r\n" + "Formacao: " + dataFormacao + "\r\n"+ "Cor do Equipamento: "
				+ corEquipamento + "\r\n" + "Contacto. " + contacto +"\r\n"+ "email: " + email + "\r\n"+"Morada: " + morada + "\r\n"+ "Equipas: "
				+ equipa;
	}




    // ----> equals()

}
