package ft.tictactoe;


import java.util.Scanner;

// subclasse de IPlayer, implementa o jogador humano

class HumanPlayer implements IPlayer {
	private PIECE mypiece;
	public void setPiece(PIECE piece) {
		System.out.println("Você é o " + piece.getRepr() + "!");
		System.out.println();
		
		this.mypiece = piece;
	}
	
	// método que pede ao jogador humano que faça sua jogada, com input de um valor para a horizontal e outro para a vertical
	// 0 representa a primeira linha e primeira coluna, 1 a sugunda linha e segunda coluna, e 2 a terceira linha e coluna
	// os valores são armazenados nas variáveis x e y (Position) e então retornados
	
	public Position makeMove(IReadableTable readableTable) {
		System.out.println("Sua vez, faça uma jogada");
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









