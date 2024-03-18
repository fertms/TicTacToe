package ft.tictactoe;


//implementa a interface de IPlayer (outros jogadores computadores, e também os jogadores humanos
//este é o primeiro nível do computador, onde caso escolhido pelo jogador humano, executa uma implementação
//onde o jogador computador coloca sua peça no primeiro espaço vazio disponível

class SimplePlayer extends AbstractComputerPlayer {
	// não há necessidade de se preocupar com qual peça é de qual jogador
	// este método pega o estado atual do tabuleiro, e então tem que fazer uma jogada
	// retornando a posição que o jogador quer colocar a sua peça
	
	public Position makeMove(IReadableTable readableTable) {
		for(int i = 0; i < AbstractComputerPlayer.TABLE_SIZE; i++) {
			for(int j = 0; j < AbstractComputerPlayer.TABLE_SIZE; j++) {
				Position p = new Position(i, j);
				if(readableTable.isPositionEmpty(p)) {
					return p;
				}
			}
		}
		
		throw new RuntimeException("Ooopsie! Parece que o jogo já acabou!");
	}
	
}









