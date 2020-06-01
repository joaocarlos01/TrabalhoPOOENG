import java.util.List;

public class main {

	public static void main(String[] args) {
		
		try {
		
			Equipa equipa = new Equipa();
			Equipa equipa2 = new Equipa();
			Jogo jogo = new Jogo();
			Treinador treinador = new Treinador();
			Jogador jogador = new Jogador();
			Competicao competicao = new Competicao();
			Jogo jogo2 = new Jogo();
			equipa.setCodigo(20);
			equipa.addJogador(jogador);
			equipa.addTreinador(treinador);
			
			equipa2.setCodigo(21);
			equipa2.setNome("Teste");
			equipa2.addJogador(jogador);
			equipa2.addTreinador(treinador);
			
			competicao.addEquipa(equipa2);
			competicao.addEquipa(equipa);
			
			jogo.setEquipaVisitada(equipa);
			jogo.setEquipaVisitante(equipa2);
			jogo.setJornada(20);
			jogo2.setEquipaVisitada(equipa2);
			jogo2.setEquipaVisitante(equipa);
			
			
			competicao.addJogo(jogo);
			
			
			
		
			
			
			


			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}
