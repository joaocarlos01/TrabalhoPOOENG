import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CompeticaoTest {
	Equipa equipa = new Equipa();
	Equipa equipa1 = new Equipa();
	Competicao competicao = new Competicao();
	Jogo jogo = new Jogo();
	Jogo jogo1 = new Jogo();
	Treinador treinador = new Treinador();
	Jogador jogador = new Jogador();
	/**
	 * Este teste irá validar a funcionalidade do método EquipasComMesmoCartao
	 */
	@Test
	void EquipasComMesmoCodigo() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Competicao competicao = new Competicao();

			competicao.setEscalao("Veterano");
			Equipa equipa = new Equipa();
			equipa.setEscalao("Junior");
			equipa.setCodigo(20);

			competicao.addEquipa(equipa);
			competicao.addEquipa(equipa);
		});

	}
	@Test
	void EquipasEscalaoDiferente() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
	
			competicao.setEscalao("Veterano");
			equipa.setEscalao("Junior");
			
			competicao.addEquipa(equipa);
			
			
		});

	}
	@Test
	void EquipasNaoPertencentes() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			equipa.setCodigo(20);
			equipa1.setCodigo(25);
			jogo.setEquipaVisitada(equipa);
			jogo.setEquipaVisitante(equipa1);
			competicao.addEquipa(equipa);
			competicao.addJogo(jogo);
			
			
		});

	}
	

	/**
	 * Este teste irá validar a funcionalidade do método RemoverEquipa
	 */
	
	@Test
	void RemoverEquipa() {
		
		competicao.addEquipa(equipa);
		equipa.setCodigo(20);
		competicao.removerEquipa(20);
		
		assertTrue(competicao.getEquipa().isEmpty());
	
	}
	
	/**
	 * Este teste irá validar a funcionalidade do método RemoverJogo
	 */
	@Test
	void RemoverJogo() {
		equipa.setCodigo(20);
		competicao.addEquipa(equipa);
		
		equipa1.setCodigo(21);
		competicao.addEquipa(equipa1);
		jogo.setEquipaVisitada(equipa);
		jogo.setEquipaVisitante(equipa1);
		jogo.setCodigo(19);
		competicao.addJogo(jogo);
		competicao.removerJogo(19);
		
		assertTrue(competicao.getJogo().isEmpty());
	
	}
	
	@Test
    void AlterarEquipa() {
		equipa.setCodigo(21);
		competicao.addEquipa(equipa);
		equipa1.setCodigo(22);
		competicao.addEquipa(equipa1);
		
		competicao.alterarEquipa(21, equipa1);
		 assertTrue(competicao.getEquipa().contains(equipa1));
	}
	
	@Test
	void AlterarJogo() {
		equipa.setCodigo(20);
		competicao.addEquipa(equipa);
		equipa1.setCodigo(21);
		competicao.addEquipa(equipa1);
		
		jogo.setEquipaVisitada(equipa);
		jogo.setEquipaVisitante(equipa1);
		
		jogo1.setEquipaVisitada(equipa);
		jogo1.setEquipaVisitante(equipa1);
		
		jogo.setCodigo(19);
		competicao.addJogo(jogo);
		jogo1.setCodigo(18);
		competicao.addJogo(jogo1);
		
		competicao.alterarJogo(19, jogo1);
		assertTrue(competicao.getJogo().contains(jogo1));
	
	}
	@Test
	void AdicionarEquipa() {
		
		competicao.addEquipa(equipa);
		
		
		assertFalse(competicao.getEquipa().isEmpty());
	
	}
	@Test
	void AdicionarJogo() {
		equipa.setCodigo(20);
		competicao.addEquipa(equipa);
		
		equipa1.setCodigo(21);
		competicao.addEquipa(equipa1);
		jogo.setEquipaVisitada(equipa);
		jogo.setEquipaVisitante(equipa1);
		jogo.setCodigo(19);
		competicao.addJogo(jogo);
		
		
		assertFalse(competicao.getJogo().isEmpty());
	
	}
	@Test
	void testGetCodigoEquipa () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		equipa.setCodigo(20);
		competicao.addEquipa(equipa);
		
		Equipa teste = competicao.getCodigoEquipa(20);
			
		assertEquals(equipa, teste);
	}	
	@Test
	void testMostrarJogo () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		equipa.setCodigo(20);
		jogo.setEquipaVisitada(equipa);
		competicao.addEquipa(equipa);
		
		equipa1.addTreinador(treinador);
		equipa1.addJogador(jogador);
		equipa1.setCodigo(21);
		competicao.addEquipa(equipa1);
		jogo.setEquipaVisitante(equipa1);
		jogo.setJornada(5);
		competicao.addJogo(jogo);
		
		Jogo teste = competicao.mostrarJornada(5);
			
		assertEquals(jogo, teste);
	}	
}
