package ft.tictactoe;

/* O jogo inicia apresentando as pe�as de cada um dos jogadores:
 * Jogador computador (chamado de SimplePlayer, SimplePlayer2, e SimplePlayer3) e do jogador humano (HumanPlayer)
 * Na sequ�ncia, pede ao jogador humano que escolha qual nivel de dificuldade ele quer enfrentar. Os n�veis s�o:
 * 1 - computador joga no primeiro espa�o vazio dispon�vel;
 * 2 - computador joga em um espa�o aleat�rio vazio;
 * 3 - computador joga formando um "tri�ngulo" no tabuleiro.
 * 
 * O jogo termina quando um dos jogadores venceu, ou se der empate.
 * 
 */

import java.util.Scanner;

public class Main {
	
	  public static void mainMethod() {
		  		  
		  Table t = new Table();
		  IPlayer player1 = new SimplePlayer(); // representa o jogador computador
		  IPlayer player2 = new HumanPlayer(); // representa o jogador humano
		  PIECE player1Piece = PIECE.X; // define qual pe�a cada jogador ter� e na sequ�ncia, o m�todo dir� a cada jogador qual � a sua pe�a
		  PIECE player2Piece = PIECE.O;
		  player1.setPiece(player1Piece); // estabelece a pe�a de cada jogador
		  player2.setPiece(player2Piece);
		  	
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Escolha um n�vel entre 1, 2, e 3:");
		  int level = sc.nextInt();
		  System.out.println("Yippieeeee! Voc� vai jogar contra o nivel " + level + "!");
		  System.out.println();
		 		  
		  if(level == 1) {
			  player1 = new SimplePlayer();
		  }
		  else if(level == 2) {
			  player1 = new SimplePlayer2();
		  }
		  else if(level == 3) {
			  player1 = new SimplePlayer3();
		  }

		  boolean p1Turn = true; // define que quem come�a o jogo � o jogador 1
	    
		  // o loop checa de quem � a vez com base no boolean p1Turn
		  // se for o jogador 1, requer que este fa�a uma jogada chamando o m�todo makeMove, e sua jogada � definida no tabuleiro
		  // antes do pr�ximo jogador fazer sua jogada, � checado se algu�m venceu
		  // em caso afirmativo, sai do loop
		  // tamb�m checa a possibilidade de haver um empate e imprimir na tela
		  // caso contr�rio, o loop continua e o valor de p1Turn muda por causa desse statement p1Turn = !p1Turn;
		  // o statement reverte o valor, se antes era falso, agora ser� verdadeiro e vice versa
		  
		  while(true) {
			  if(p1Turn == true) {
				  Position p = player1.makeMove(t);
				  t.setPosition(p, player1Piece);
				  p1Turn = !p1Turn;
			  }
			  
			  else {
				  Position p = player2.makeMove(t);
				  t.setPosition(p, player2Piece);
				  p1Turn = !p1Turn;
			  }
		

	      if(t.hasWon()!= PIECE.E) {
	        System.out.println("A pe�a " + t.hasWon().getRepr() + " venceu!!!"); // retorna qual jogador venceu
	        return;
	      }
	      
	      if(t.fullTable()) {
	        System.out.println("Deu velha!"); // retorna que o resultado foi um empate
	      }
	    }
	    
	  }
	  
	  // m�todo principal
	  public static void main(String[] args) {
		  
		  mainMethod();
	  }
}









