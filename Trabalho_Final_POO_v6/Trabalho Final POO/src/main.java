
public class main {

	public static void main(String[] args) {
		
		try {
			Treinador treinador = new Treinador();
			Treinador treinador1 = new Treinador();
			Treinador treinador2 = new Treinador();
			treinador.setContacto(91233232);
			treinador.setEmail("ajhwsjhabw");
			treinador.setnCartaoCidadao(1231132323);
			treinador.setNome("Ramiro");
			
			//System.out.println(treinador);
		
			
		
			Jogador jogador1 = new Jogador();
			Jogador jogador2 = new Jogador();
			Jogador jogador3 = new Jogador();
			//Clube clube = new Clube();
			Equipa equipa1 = new Equipa();
			Equipa equipa2 = new Equipa();
			Equipa equipa3 = new Equipa();
			Equipa equipa4 = new Equipa();
			jogador1.setNome("Alex");
			jogador1.setnCartaoCidadao(20);
			jogador2.setnCartaoCidadao(21);
			jogador3.setnCartaoCidadao(22);
			jogador2.setNome("Zé");
			jogador3.setNome("Carlos");
			
			//equipa1.setCodigo(20);
			equipa1.setNome("AtaWaweawa");
			equipa1.setEscalao("Séniores");
			equipa1.addTreinador(treinador);
			//equipa1.addTreinador(treinador1);
			equipa1.addJogador(jogador1);
			equipa1.setCodigo(25);
			equipa2.setCodigo(477);
			equipa3.setCodigo(36);
			//equipa2.setCodigo(22);
			//equipa2.setNome("rasatsa d");
			//equipa2.addTreinador(treinador1);
			equipa1.addJogador(jogador2);
			equipa1.addJogador(jogador3);
			//equipa2.addJogador(jogador2);
			//equipa3.setCodigo(23);
			//equipa3.setNome("teste");
			//clube.addEquipa(equipa2);
			//clube.addEquipa(equipa1);
			//clube.addEquipa(equipa3);
			
			//Jogo jogo2 = new Jogo();
			
			//equipa3.setEscalao("tytruryry");
			//equipa3.setCodigo(252);
			//Competicao competicao = new Competicao();
			//competicao.setEscalao("Séniores");
			//competicao.addEquipa(equipa1);
			//competicao.addEquipa(equipa2);
			Jogo jogo = new Jogo();
			Jogo jogo1 = new Jogo();
			jogo.setJornada(1);
			jogo1.setJornada(1);
			jogo.setEquipaVisitada(equipa1);
			jogo.setEquipaVisitante(equipa2);
			jogo1.setEquipaVisitada(equipa3);
			jogo1.addEquipaVisitante(equipa4);
			//equipa1.ordenarJogadores();
			
			
		
		
		
		
			//System.out.println(clube.nTotalTreinador());
			//System.out.println(clube.nTotalJogador());
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}
