package ft.tictactoe;


//implementa a interface de IPlayer (outros jogadores computadores, e tamb�m os jogadores humanos
//este � o segundo n�vel do computador, onde caso escolhido pelo jogador humano, executa uma implementa��o
//onde o jogador computador coloca sua pe�a em um espa�o vazio dispon�vel aleatoriamente

class SimplePlayer2 extends AbstractComputerPlayer {
	
	public Position makeMove(IReadableTable readableTable) {
		while(true) {
			  Position randomPosition = getRandomPosition();
			  if(readableTable.isPositionEmpty(randomPosition))
			      return randomPosition;
		}
	}


	public static Position getRandomPosition() {
		int min = 0;
		int max = 2;
			
		int x = (int) Math.floor((Math.random() * 3) + 0);
		int y = (int) Math.floor((Math.random() * 3) + 0);
		return new Position(x, y);
	}
		
}




	
