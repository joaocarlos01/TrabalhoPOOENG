import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;



import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.joaocarlos.exception.NumeroDuplicadoexception;

import static org.hamcrest.CoreMatchers.is;

class ClubeTest {
	
	
	
	
	Clube clube = new Clube();
	Treinador treinador = new Treinador();
	Equipa equipa = new Equipa();
	Equipa equipa2 = new Equipa();
	Jogador jogador = new Jogador();

	@Test
	void testEquipasMesmoCodigo() {
		Assertions.assertThrows(NumeroDuplicadoexception.class, () ->{
			Clube clube = new Clube();
			
			
			equipa.setEscalao("Junior");
			equipa.setCodigo(20);
			equipa.addTreinador(treinador);
			equipa.addJogador(jogador);
		
			clube.addEquipa(equipa);
			clube.addEquipa(equipa);
			
			
		});
	}
				
	@Test
	void testEquipasSemMembros() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			Clube clube = new Clube();
		
			Equipa equipa = new Equipa();
			equipa.setEscalao("Junior");
			equipa.setCodigo(20);
			
			clube.addEquipa(equipa);
			clube.addEquipa(equipa);
			
			
		});
	}

	@Test
	void testTreinadores () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		clube.addEquipa(equipa);
		
		int nTotalTreinador = clube.nTotalTreinador();
			assertEquals(1, nTotalTreinador);
			
	}
		
	
	void testJogadores () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		clube.addEquipa(equipa);
		
		int nTotalJogador = clube.nTotalJogador();
			assertEquals(1, nTotalJogador);
			
	}

		
	@Test
	void testAdicionarEquipa () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		equipa.setCodigo(20);
		clube.addEquipa(equipa);
	
		
		
		assertFalse(clube.getEquipa().isEmpty());
	}
		
	@Test
	void testRemoverEquipa () {
		equipa.addTreinador(treinador);
		equipa.addJogador(jogador);
		equipa.setCodigo(20);
		clube.addEquipa(equipa);
		clube.removerEquipa(20);
	
			
		assertTrue(clube.getEquipa().isEmpty());
	}
	
		@Test
		void testAlterarEquipa() {
			equipa.addTreinador(treinador);
			equipa.addJogador(jogador);
			equipa.setCodigo(20);
			Equipa equipa1 = new Equipa();
			Jogador jogador1 = new Jogador();
			Treinador treinador1 = new Treinador();
			jogador1.setnCartaoCidadao(20);
			treinador1.setnCartaoCidadao(22);
			equipa1.addTreinador(treinador1);
			equipa1.addJogador(jogador1);
			equipa1.setCodigo(25);
			
			clube.addEquipa(equipa);
			
			clube.alterarEquipa(equipa1, 20);
			assertTrue(clube.getEquipa().contains(equipa1));
			
}
		@Test
		void testGetCodigoEquipa () {
			equipa.addTreinador(treinador);
			equipa.addJogador(jogador);
			equipa.setCodigo(20);
			clube.addEquipa(equipa);
			
			Equipa teste = clube.getCodigoEquipa(20);
				
			assertEquals(equipa, teste);
		}	
		
}
