package ft.tictactoe;


//implementa a interface de IPlayer (outros jogadores computadores, e tamb�m os jogadores humanos
//este � o primeiro n�vel do computador, onde caso escolhido pelo jogador humano, executa uma implementa��o
//onde o jogador computador coloca sua pe�a no primeiro espa�o vazio dispon�vel

class SimplePlayer extends AbstractComputerPlayer {
	// n�o h� necessidade de se preocupar com qual pe�a � de qual jogador
	// este m�todo pega o estado atual do tabuleiro, e ent�o tem que fazer uma jogada
	// retornando a posi��o que o jogador quer colocar a sua pe�a
	
	public Position makeMove(IReadableTable readableTable) {
		for(int i = 0; i < AbstractComputerPlayer.TABLE_SIZE; i++) {
			for(int j = 0; j < AbstractComputerPlayer.TABLE_SIZE; j++) {
				Position p = new Position(i, j);
				if(readableTable.isPositionEmpty(p)) {
					return p;
				}
			}
		}
		
		throw new RuntimeException("Ooopsie! Parece que o jogo j� acabou!");
	}
	
}









