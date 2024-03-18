package ft.tictactoe;

/* O jogo inicia apresentando as peças de cada um dos jogadores:
 * Jogador computador (chamado de SimplePlayer, SimplePlayer2, e SimplePlayer3) e do jogador humano (HumanPlayer)
 * Na sequência, pede ao jogador humano que escolha qual nivel de dificuldade ele quer enfrentar. Os níveis são:
 * 1 - computador joga no primeiro espaço vazio disponível;
 * 2 - computador joga em um espaço aleatório vazio;
 * 3 - computador joga formando um "triângulo" no tabuleiro.
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
		  PIECE player1Piece = PIECE.X; // define qual peça cada jogador terá e na sequência, o método dirá a cada jogador qual é a sua peça
		  PIECE player2Piece = PIECE.O;
		  player1.setPiece(player1Piece); // estabelece a peça de cada jogador
		  player2.setPiece(player2Piece);
		  	
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Escolha um nível entre 1, 2, e 3:");
		  int level = sc.nextInt();
		  System.out.println("Yippieeeee! Você vai jogar contra o nivel " + level + "!");
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

		  boolean p1Turn = true; // define que quem começa o jogo é o jogador 1
	    
		  // o loop checa de quem é a vez com base no boolean p1Turn
		  // se for o jogador 1, requer que este faça uma jogada chamando o método makeMove, e sua jogada é definida no tabuleiro
		  // antes do próximo jogador fazer sua jogada, é checado se alguém venceu
		  // em caso afirmativo, sai do loop
		  // também checa a possibilidade de haver um empate e imprimir na tela
		  // caso contrário, o loop continua e o valor de p1Turn muda por causa desse statement p1Turn = !p1Turn;
		  // o statement reverte o valor, se antes era falso, agora será verdadeiro e vice versa
		  
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
	        System.out.println("A peça " + t.hasWon().getRepr() + " venceu!!!"); // retorna qual jogador venceu
	        return;
	      }
	      
	      if(t.fullTable()) {
	        System.out.println("Deu velha!"); // retorna que o resultado foi um empate
	      }
	    }
	    
	  }
	  
	  // método principal
	  public static void main(String[] args) {
		  
		  mainMethod();
	  }
}









