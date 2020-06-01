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
	
			equipa.setCodigo(20);
			equipa.addJogador(jogador);
			equipa.addTreinador(treinador);
			
			equipa2.setCodigo(21);
			equipa2.addJogador(jogador);
			equipa2.addTreinador(treinador);
			
			jogo.setJornada(5);
			jogo.setEquipaVisitada(equipa);
			jogo.setEquipaVisitante(equipa2);
			competicao.addEquipa(equipa);
			competicao.addEquipa(equipa2);
			competicao.addJogo(jogo);
			System.out.println(competicao.mostrarEquipas());
			


			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}
