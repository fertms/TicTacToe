package ft.tictactoe;



//esta classe abstrata tem algumas funcionalidades que ser�o comuns para todos os tr�s n�veis de computador
//armazenando os valores das pe�as do jogador


abstract class AbstractComputerPlayer implements IPlayer {
	
	public static final int TABLE_SIZE=3;
	private PIECE myPiece;
	
	// n�o se importa em saber qual pe�a � a pe�a do jogador
	public void setPiece(PIECE piece) {
		System.out.println("Hellow Hu-Man! Vamos jogar!!");
		System.out.println();
		System.out.println("Eu sou o " + piece.getRepr() + "!");
		this.myPiece = piece;
	}
	
	public PIECE getPiece() {
		return this.myPiece;
	}
	  
}







