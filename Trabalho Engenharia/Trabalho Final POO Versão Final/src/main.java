import java.util.Date;


public class main {

	public static void main(String[] args) {
		
		try {
			//------------------------------------------------//
			//Criar Árbitro
			Arbitro arbitro = new Arbitro();
			arbitro.setNome("José");
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
			//Criar Equipas, Clube, Jogo e Competição
			
			Equipa equipa = new Equipa(321, "Juniores A", "Júnior");
			Equipa equipaA = new Equipa(323, "Juniores B", "Júnior");
			Clube clube = new Clube(25, "Grupo Desportivo de Pontével", new Date("3/30/1901"), "Vermelho", 243779236, "gdp@hotmail.com", "Rua do Campo");
			Jogo jogo = new Jogo(equipa, equipaA, 2, 2, new Date("01/06/2020"), 1, 20201);
			Jogo jogoB = new Jogo(equipa, equipaA, 2, 2, new Date("01/06/2020"), 2, 20205);
			
			Competicao competicao = new Competicao(2020, "Campeonato Juniores",new Date("01/11/2019") , new Date("25/06/2020"), "Júnior");
			
			//------------------------------------------------//
			//Testar métodos da Competição
			competicao.addEquipa(equipa);
			//competicao.removerEquipa(321);  //Usar para testar método de remover Equipa
			//competicao.alterarEquipa(321, equipaA); //Usar para testar o método alterar Equipa
			competicao.addEquipa(equipaA);
			jogo.setEquipaVisitada(equipa); //Temos que adicionar sempre as equipas à competição para poderem particpar nos jogos da mesma
			jogo.setEquipaVisitante(equipaA);
			competicao.addJogo(jogo);
			//competicao.removerJogo(20201); //Usar para remover jogo da competição
			//competicao.alterarJogo(20201, jogoB); //Usar para alterar jogo
			//System.out.println(competicao.mostrarEquipas()); //Mostra todas as equipas da competição
			//System.out.println(competicao.mostrarJornada(1)); //Mostra todos os jogos de uma determinada jornada
			
			// Validações
			
			Equipa equipaB = new Equipa(325, "Juniores B", "Veterano");
			//competicao.addEquipa(equipaB); //Usar para ver as validações dos escalões diferentes
			Jogo jogoC = new Jogo(equipa, equipaB, 2, 2, new Date("01/06/2020"), 2, 20206);
			//competicao.addJogo(jogoC); //Usar para ver as validações das equipas participantes
			Equipa equipaC = new Equipa(321, "Juniores B", "Junior");
			//competicao.addEquipa(equipaC); //Usar para ver a validação do mesmo codigo
			//System.out.println(competicao);
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar métodos do Clube
			equipa.addJogador(jogador); // Colocar em comentário para ver a validação
			equipa.addTreinador(treinador);  // Colocar em comentário para ver a validação
			clube.addEquipa(equipa); //Não será possivel adicionar uma equipa sem um treinador e um jogador
			//clube.removerEquipa(321); // Usar para remover a equipa
			//equipaA.addJogador(jogador);
			//equipaA.addTreinador(treinador);
			//clube.alterarEquipa(equipaA, 321); // Usar para alterar a equipa
			//System.out.println(clube.nTotalJogador());//Usar para saber o número total de jogadores
			//System.out.println(clube.nTotalTreinador()); //Usar para saber o número total de treinadores
			
			// Validações
			
			//clube.addEquipa(equipaC);//Usar para verificar a validação do código
			//System.out.println(clube); 
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar métodos da Equipa
			
			//Os métodos de adicionar jogadores e treinadores já foram utilizados nos testes do clube na linha 75 e 76
			//equipa.removerJogador(199235740); // Método para remover o jogador
			//equipa.removerTreinador(90564698); //Método para remover o treinador
			Jogador jogadorA = new Jogador ();
			jogadorA.setNome("Zé");
			//equipa.alterarJogador(199235740, jogadorA); Método para alterar o jogador
			Treinador treinadorA = new Treinador();
			//equipa.alterarTreinador(90564698, treinadorA); Método para alterar o treinador
			//equipa.addJogador(jogadorA); //É necessário para verificar o método em baixo
			//equipa.ordenarJogadores(); // Método para ordenar os jogadores
			
			//Validações
			
			Jogador jogadorB = new Jogador();
			jogadorB.setnCartaoCidadao(199235740); 
			//equipa.addJogador(jogadorB); // Não podem ser adicionados os jogadores com o mesmo número de CC(Cartão Cidadão)
			Treinador treinadorB = new Treinador();
			treinadorB.setnCartaoCidadao(90564698);
			//equipa.addTreinador(treinadorB);// Não podem ser adicionados os treinadores com o mesmo número de CC(Cartão Cidadão)
			//------------------------------------------------//
			
			//------------------------------------------------//
			//Testar métodos do Jogo 199257258
			jogo.addArbitro(arbitro); // Método para adicionar o Árbitro
			//jogo.removerArbitro(199257258); //Método para remover o Árbitro
			Arbitro arbitroA = new Arbitro();
			//jogo.alterarArbitro(199257258, arbitroA); Método para alterar o Árbitro
			//jogo.removerGolosEquipaVisitada(1, 321); //Método para remover os golos à equipa visitada
			//jogo.adicionarGolosEquipaVisitada(5, 321); //Método para adicionar os golos à equipa visitada
			//System.out.println(jogo.getGolosEquipaVisitada()); //Mostrar os golos da equipa visitada
			//jogo.removerGolosEquipaVisitante(2, 323); // Método para remover os golos à equipa visitante
			//jogo.adicionarGolosEquipaVisitante(7, 323); // Método para adicionar os golos à equipa visitante
			//System.out.println(jogo.getGolosEquipaVisitante()); //Mostrar os golos da equipa visitante
			
			//Validações
			
			//jogo.setEquipaVisitada(equipaA); //
			//jogoB.setEquipaVisitante(equipaA); // Não deverá ser possivel adicionar a equipa visitada igual à equipa visitante
			
			//jogo.addArbitro(arbitroA); //
			//jogo.addArbitro(arbitroA); //Não deverá ser possivel adicionar dois árbitros com o mesmo numero de CC(Cartão Cidadão)
		
			
		
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	
		
		
		
	}

}