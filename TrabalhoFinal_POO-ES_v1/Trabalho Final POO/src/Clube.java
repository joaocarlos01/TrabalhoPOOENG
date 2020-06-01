import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Clube {
	// =======================================================
    // ===================== ATRIBUTOS =======================
    // =======================================================

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

	// acho que funfa
	protected List<Equipa> removerEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo() == codigo ) {
				this.equipa.remove(equipa);
				return this.equipa;
			}
		
		}
		
		
		return equipa;
		}
	
	
	
	public void alterarEquipa () {
		
	}
	

	public int nTotalTreinador () {
		int numeroTotalTreinador = 0;
		
		
		for (Equipa equipa : this.equipa) {
			numeroTotalTreinador += equipa.getTreinador().size();
			
		}
		
		return numeroTotalTreinador;
	}
		
	public int nTotalJogador () {
		int numeroTotalJogadores = 0;
		
		
		for (Equipa equipa : this.equipa) {
			numeroTotalJogadores += equipa.getJogador().size();
			
		}
		
		return numeroTotalJogadores;
	}
			
	protected Equipa getCodigoEquipa (int codigo) {
		for (Equipa equipa : this.equipa) {
			if (equipa.getCodigo()== codigo ) {
				return equipa;
			}
		
		}
		return null;
		}
	
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

	@Override
	public String toString() {
		return "Clube" + "\r\n"+ "Codigo: " + codigo + "\r\n"+ "Nome: " + nome + "\r\n" + "Formacao: " + dataFormacao + "\r\n"+ "Cor do Equipamento: "
				+ corEquipamento + "\r\n" + "Contacto. " + contacto +"\r\n"+ "email: " + email + "\r\n"+"Morada: " + morada + "\r\n"+ "Equipas: "
				+ equipa;
	}




    // ----> equals()

}
