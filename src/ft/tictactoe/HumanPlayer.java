package ft.tictactoe;


import java.util.Scanner;

// subclasse de IPlayer, implementa o jogador humano

class HumanPlayer implements IPlayer {
	private PIECE mypiece;
	public void setPiece(PIECE piece) {
		System.out.println("Voc� � o " + piece.getRepr() + "!");
		System.out.println();
		
		this.mypiece = piece;
	}
	
	// m�todo que pede ao jogador humano que fa�a sua jogada, com input de um valor para a horizontal e outro para a vertical
	// 0 representa a primeira linha e primeira coluna, 1 a sugunda linha e segunda coluna, e 2 a terceira linha e coluna
	// os valores s�o armazenados nas vari�veis x e y (Position) e ent�o retornados
	
	public Position makeMove(IReadableTable readableTable) {
		System.out.println("Sua vez, fa�a uma jogada");
		System.out.println();
		System.out.println("Digite um valor para a horizontal entre 0 e 2");
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt(); 
	    System.out.println("Digite um valor para a vertical entre 0 e 2");
	    sc = new Scanner(System.in);
	    int y = sc.nextInt(); 
	    
	    return new Position(x,y);
	}
	
}









