
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
			jogador2.setNome("Zé");
			Clube clube = new Clube();
			Equipa equipa1 = new Equipa();
			Equipa equipa2 = new Equipa();
			Equipa equipa3 = new Equipa();
			jogador1.setnCartaoCidadao(20);
			jogador1.setNome("Alex");
			
			equipa1.setCodigo(20);
			equipa1.setNome("AtaWaweawa");
			equipa1.setEscalao("Séniores");
			equipa1.addTreinador(treinador);
			equipa1.addTreinador(treinador1);
			equipa1.addJogador(jogador1);
			equipa2.setCodigo(21);
			equipa2.setNome("rasatsa d");
			equipa2.addTreinador(treinador1);
			equipa1.addJogador(jogador2);
			equipa2.addJogador(jogador2);
			clube.addEquipa(equipa2);
			clube.addEquipa(equipa1);
			Jogo jogo = new Jogo();
			Jogo jogo2 = new Jogo();
			equipa3.setEscalao("tytruryry");
			equipa3.setCodigo(252);
			Competicao competicao = new Competicao();
			competicao.setEscalao("Séniores");
			competicao.addEquipa(equipa1);
			competicao.addEquipa(equipa3);
			clube.alterarEquipa(equipa3, 21);
			equipa1.ordenarJogadores();
		
		
		
			
		
			
			
			
			
			//System.out.println(clube.nTotalTreinador());
			//System.out.println(clube.nTotalJogador());
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}
