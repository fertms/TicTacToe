package ft.tictactoe;

// ao utilizar enum, o c�digo fica mais claro e mais f�cil de ler
// armazena os principais valores constantes que ser�o utilizados
// ao longo do desenvolvimento desse projeto, como as pe�as (X ou O) e
// os m�todos de verifica��o do tabuleiro
enum PIECE {
	  	X(-1,-3, "X"),
	  	O(1,3, "O"),
	  	E(0,0, "-");

	  	private int value; // valor da pe�a no tabuleiro (-1)
	  	private int sum; // valor da soma das pe�as na linha, coluna, ou diagonal
	  	private String repr; // representa��o da pe�a

	  PIECE(int value, int sum, String repr) {
		  this.value = value;
		  this.sum = sum;
		  this.repr = repr;
	  }

	  public int getValue() { // recebe o valor (1 ou -1) do tabuleiro
		  return value;
	  }

	  public int getSum() { // recebe a soma dos valores do tabuleiro
		  return sum;
	  }

	  public String getRepr() { // recebe a pe�a do jogador utilizado no m�todo visualizar
		  return repr;
	  }
}







