
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
			Clube clube = new Clube();
			Equipa equipa1 = new Equipa();
			Equipa equipa2 = new Equipa();
			equipa1.addTreinador(treinador);
			equipa1.addTreinador(treinador1);
			equipa1.setCodigo(20);
			equipa1.addJogador(jogador1);
			equipa2.setCodigo(21);
			equipa2.addTreinador(treinador2);
			equipa2.addJogador(jogador1);
			clube.addEquipa(equipa2);
			clube.addEquipa(equipa1);
			
			System.out.println(clube.nTotalTreinador());
			System.out.println(clube.nTotalJogador());
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
		}
		
		
		
	
		
	;
	
		
		//clube.removerEquipa(52);
		//System.out.println(clube.numeroTreinador(0));
		//System.out.println(clube.numeroJogadores(0));
		
		
		
		
	}

}
