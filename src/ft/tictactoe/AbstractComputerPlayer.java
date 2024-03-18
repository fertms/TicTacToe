package ft.tictactoe;



//esta classe abstrata tem algumas funcionalidades que serão comuns para todos os três níveis de computador
//armazenando os valores das peças do jogador


abstract class AbstractComputerPlayer implements IPlayer {
	
	public static final int TABLE_SIZE=3;
	private PIECE myPiece;
	
	// não se importa em saber qual peça é a peça do jogador
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







