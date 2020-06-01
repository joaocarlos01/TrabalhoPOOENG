import java.util.Date;


public class main {

	public static void main(String[] args) {
		
		try {
			//------------------------------------------------//
			//Criar �rbitro
			Arbitro arbitro = new Arbitro();
			arbitro.setNome("Jos�");
			arbitro.setEmail("jose@gmail.com");
			arbitro.setDataNascimento(new Date("12/25/1991"));
			arbitro.setnCartaoCidadao(199257258);
			arbitro.setContacto(919191919);
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Criar Jogador
			Jogador jogador  = new Jogador ();
			jogador.setNome("Rui");
			jogador.setEmail("rui@gmail.com");
			jogador.setDataNascimento(new Date("10/01/2004"));
			jogador.setnCartaoCidadao(199235740);
			jogador.setContacto(919191919);
			
			//------------------------------------------------//
			//Criar Treinador
			Treinador treinador  = new Treinador ();
			treinador.setNome("Manuel");
			treinador.setEmail("manuel@gmail.com");
			treinador.setDataNascimento(new Date("3/30/1975"));
			treinador.setnCartaoCidadao(90564698);
			treinador.setContacto(919191919);
			
			//------------------------------------------------//
			//Criar Equipas, Clube, Jogo e Competi��o
			
			Equipa equipa = new Equipa(321, "Juniores A", "J�nior");
			Equipa equipaA = new Equipa(323, "Juniores B", "J�nior");
			Clube clube = new Clube(25, "Grupo Desportivo de Pont�vel", new Date("3/30/1901"), "Vermelho", 243779236, "gdp@hotmail.com", "Rua do Campo");
			Jogo jogo = new Jogo(equipa, equipaA, 2, 2, new Date("01/06/2020"), 1, 20201);
			Jogo jogoB = new Jogo(equipa, equipaA, 2, 2, new Date("01/06/2020"), 2, 20205);
			
			Competicao competicao = new Competicao(2020, "Campeonato Juniores",new Date("01/11/2019") , new Date("25/06/2020"), "J�nior");
			
			//------------------------------------------------//
			//Testar m�todos da Competi��o
			competicao.addEquipa(equipa);
			//competicao.removerEquipa(321);  //Usar para testar m�todo de remover Equipa
			//competicao.alterarEquipa(321, equipaA); //Usar para testar o m�todo alterar Equipa
			competicao.addEquipa(equipaA);
			jogo.setEquipaVisitada(equipa); //Temos que adicionar sempre as equipas � competi��o para poderem particpar nos jogos da mesma
			jogo.setEquipaVisitante(equipaA);
			competicao.addJogo(jogo);
			//competicao.removerJogo(20201); //Usar para remover jogo da competi��o
			//competicao.alterarJogo(20201, jogoB); //Usar para alterar jogo
			//System.out.println(competicao.mostrarEquipas()); //Mostra todas as equipas da competi��o
			//System.out.println(competicao.mostrarJornada(1)); //Mostra todos os jogos de uma determinada jornada
			
			// Valida��es
			
			Equipa equipaB = new Equipa(325, "Juniores B", "Veterano");
			//competicao.addEquipa(equipaB); //Usar para ver as valida��es dos escal�es diferentes
			Jogo jogoC = new Jogo(equipa, equipaB, 2, 2, new Date("01/06/2020"), 2, 20206);
			//competicao.addJogo(jogoC); //Usar para ver as valida��es das equipas participantes
			Equipa equipaC = new Equipa(321, "Juniores B", "Junior");
			//competicao.addEquipa(equipaC); //Usar para ver a valida��o do mesmo codigo
			//System.out.println(competicao);
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar m�todos do Clube
			equipa.addJogador(jogador); // Colocar em coment�rio para ver a valida��o
			equipa.addTreinador(treinador);  // Colocar em coment�rio para ver a valida��o
			clube.addEquipa(equipa); //N�o ser� possivel adicionar uma equipa sem um treinador e um jogador
			//clube.removerEquipa(321); // Usar para remover a equipa
			//equipaA.addJogador(jogador);
			//equipaA.addTreinador(treinador);
			//clube.alterarEquipa(equipaA, 321); // Usar para alterar a equipa
			//System.out.println(clube.nTotalJogador());//Usar para saber o n�mero total de jogadores
			//System.out.println(clube.nTotalTreinador()); //Usar para saber o n�mero total de treinadores
			
			// Valida��es
			
			//clube.addEquipa(equipaC);//Usar para verificar a valida��o do c�digo
			//System.out.println(clube); 
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar m�todos da Equipa
			
			//Os m�todos de adicionar jogadores e treinadores j� foram utilizados nos testes do clube na linha 75 e 76
			//equipa.removerJogador(199235740); // M�todo para remover o jogador
			//equipa.removerTreinador(90564698); //M�todo para remover o treinador
			Jogador jogadorA = new Jogador ();
			jogadorA.setNome("Z�");
			//equipa.alterarJogador(199235740, jogadorA); M�todo para alterar o jogador
			Treinador treinadorA = new Treinador();
			//equipa.alterarTreinador(90564698, treinadorA); M�todo para alterar o treinador
			//equipa.addJogador(jogadorA); //� necess�rio para verificar o m�todo em baixo
			//equipa.ordenarJogadores(); // M�todo para ordenar os jogadores
			
			//Valida��es
			
			Jogador jogadorB = new Jogador();
			jogadorB.setnCartaoCidadao(199235740); 
			//equipa.addJogador(jogadorB); // N�o podem ser adicionados os jogadores com o mesmo n�mero de CC(Cart�o Cidad�o)
			Treinador treinadorB = new Treinador();
			treinadorB.setnCartaoCidadao(90564698);
			//equipa.addTreinador(treinadorB);// N�o podem ser adicionados os treinadores com o mesmo n�mero de CC(Cart�o Cidad�o)
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar m�todos do Jogo 199257258
			jogo.addArbitro(arbitro); // M�todo para adicionar o �rbitro
			//jogo.removerArbitro(199257258); //M�todo para remover o �rbitro
			Arbitro arbitroA = new Arbitro();
			//jogo.alterarArbitro(199257258, arbitroA); M�todo para alterar o �rbitro
			//jogo.removerGolosEquipaVisitada(1, 321); //M�todo para remover os golos � equipa visitada
			//jogo.adicionarGolosEquipaVisitada(5, 321); //M�todo para adicionar os golos � equipa visitada
			//System.out.println(jogo.getGolosEquipaVisitada()); //Mostrar os golos da equipa visitada
			//jogo.removerGolosEquipaVisitante(2, 323); // M�todo para remover os golos � equipa visitante
			//jogo.adicionarGolosEquipaVisitante(7, 323); // M�todo para adicionar os golos � equipa visitante
			//System.out.println(jogo.getGolosEquipaVisitante()); //Mostrar os golos da equipa visitante
			
			//Valida��es
			
			//jogo.setEquipaVisitada(equipaA); //
			//jogoB.setEquipaVisitante(equipaA); // N�o dever� ser possivel adicionar a equipa visitada igual � equipa visitante
			
			//jogo.addArbitro(arbitroA); //
			//jogo.addArbitro(arbitroA); //N�o dever� ser possivel adicionar dois �rbitros com o mesmo numero de CC(Cart�o Cidad�o)
		
			
		
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}