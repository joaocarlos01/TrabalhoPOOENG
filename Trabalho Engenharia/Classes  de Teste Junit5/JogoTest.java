import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.joaocarlos.exception.NumeroCartaoDuplicado;

class JogoTest {
	Jogo jogo = new Jogo();
	Equipa equipa = new Equipa();
	Arbitro arbitro = new Arbitro();
	
	
	@Test
		void testEquipasIguais() {
			Assertions.assertThrows(IllegalArgumentException.class, () ->{
				
				jogo.setEquipaVisitada(equipa);
				jogo.setEquipaVisitante(equipa);
			});
		}
	

	@Test
		void testArbitrosComMesmoCodigo () {
		Assertions.assertThrows(NumeroCartaoDuplicado.class, () ->{
			
			arbitro.setnCartaoCidadao(20);
			
			jogo.addArbitro(arbitro);
			jogo.addArbitro(arbitro);
		});
		
	}
	@Test
	void testAdicionarArbitro () {
		jogo.addArbitro(arbitro);
	
		assertFalse(jogo.getArbitro().isEmpty());
	}
	
	@Test
	void testRemoverArbitro () {
		arbitro.setnCartaoCidadao(22);
		jogo.addArbitro(arbitro);
		jogo.removerArbitro(22);
		
		assertTrue(jogo.getArbitro().isEmpty());
	}
	
	@Test
	void testAlterarArbitro () {
		jogo.addArbitro(arbitro);
		arbitro.setnCartaoCidadao(22);
		Arbitro arbitro1 = new Arbitro();
		arbitro1.setnCartaoCidadao(55);
		jogo.alterarArbitro(22, arbitro1);
	
		assertTrue(jogo.getArbitro().contains(arbitro1));
	}
	
	
	@Test
	void testRemoverGolos () {
		Equipa equipa1 = new Equipa();
		equipa.setCodigo(20);
		equipa1.setCodigo(23);
		jogo.setEquipaVisitada(equipa);
		jogo.setEquipaVisitante(equipa1);
		jogo.setGolosEquipaVisitada(2);
		jogo.setGolosEquipaVisitante(2);
		
		
		int golosAlteracaoVisitada= jogo.removerGolosEquipaVisitada(1, 20);
		int golosAlteracaoVisitante= jogo.removerGolosEquipaVisitante(1, 23);
		
		assertEquals(1, golosAlteracaoVisitada);
		assertEquals(1, golosAlteracaoVisitante);
	}
	
	@Test
	void testAdicionarGolos () {
		Equipa equipa1 = new Equipa();
		equipa.setCodigo(20);
		equipa1.setCodigo(23);
		jogo.setEquipaVisitada(equipa);
		jogo.setEquipaVisitante(equipa1);
		jogo.setGolosEquipaVisitada(2);
		jogo.setGolosEquipaVisitante(2);
		
		
		int golosAlteracaoVisitada= jogo.adicionarGolosEquipaVisitada(1, 20);
		int golosAlteracaoVisitante= jogo.adicionarGolosEquipaVisitante(1, 23);
		
		assertEquals(3, golosAlteracaoVisitada);
		assertEquals(3, golosAlteracaoVisitante);
	}	
	
	
	@Test
	void testGetCartaoArbitro () {
		arbitro.setnCartaoCidadao(20);
		jogo.addArbitro(arbitro);
		
		Arbitro teste = jogo.getnCartaoArbitro(20);
		assertEquals(arbitro, teste);
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}