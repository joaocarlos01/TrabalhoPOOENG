import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EquipaTest {
	Equipa equipa = new Equipa();
	Treinador treinador = new Treinador();
	Treinador treinador1 = new Treinador();
	Jogador jogador = new Jogador();
	Jogador jogador1 = new Jogador();

	
/**
 * Este teste irá validar a funcionalidade do método RemoverTreinador
 */
	

	@Test
	void RemoverTreinador() {
		treinador.setnCartaoCidadao(21);
		equipa.addTreinador(treinador);
		equipa.removerTreinador(21);
		
		assertTrue(equipa.getTreinador().isEmpty());
	
	}
	
	/**
	 * Este teste irá validar a funcionalidade do método RemoverJogador
	 */
	
	@Test
	void RemoverJogador() {
		jogador.setnCartaoCidadao(20);
		equipa.addJogador(jogador);
		equipa.removerJogador(20);
		
		assertTrue(equipa.getJogador().isEmpty());
	
	}
	
	/**
	 * Este teste irá validar a funcionalidade do método JogadorComMesmoCartao
	 */
	
	@Test
    void JogadorMesmoCartao() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            
            Equipa equipa = new Equipa();
            jogador.setnCartaoCidadao(20);

            equipa.addJogador(jogador);
            equipa.addJogador(jogador);
        

        });
    }

	/**
	 * Este teste irá validar a funcionalidade do método TreinadorComMesmoCartao
	 */
	
	@Test
    void TreinadorComMesmoCartao() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            
            Equipa equipa = new Equipa();
            treinador.setnCartaoCidadao(20);

            equipa.addTreinador(treinador);
            equipa.addTreinador(treinador);
        

        });
    }

	/**
	 * Este teste irá validar a funcionalidade do método AlterarTreinador
	 */
	@Test
    void AlterarTreinador() {
		treinador.setnCartaoCidadao(21);
		equipa.addTreinador(treinador);
		treinador1.setnCartaoCidadao(22);
		equipa.addTreinador(treinador1);
		
		equipa.alterarTreinador(21, treinador1);
		 assertTrue(equipa.getTreinador().contains(treinador1));
	}
	
	/**
	 * Este teste irá validar a funcionalidade do método AlterarJogador
	 */
	@Test
    void AlterarJogador() {
		jogador.setnCartaoCidadao(21);
		equipa.addJogador(jogador);
		jogador1.setnCartaoCidadao(22);
		equipa.addJogador(jogador1);
		
		equipa.alterarJogador(21, jogador1);
		 assertTrue(equipa.getJogador().contains(jogador1));
	}
	
	
	@Test
	void testAdicionarJogadores () {

		equipa.addJogador(jogador);
		
	
		assertFalse(equipa.getJogador().isEmpty());
	}
	
	
	@Test
	void testAdicionartreinadores () {

		equipa.addTreinador(treinador);
		
	
		assertFalse(equipa.getTreinador().isEmpty());
	}


}

