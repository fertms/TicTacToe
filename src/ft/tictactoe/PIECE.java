package ft.tictactoe;

// ao utilizar enum, o código fica mais claro e mais fácil de ler
// armazena os principais valores constantes que serão utilizados
// ao longo do desenvolvimento desse projeto, como as peças (X ou O) e
// os métodos de verificação do tabuleiro
enum PIECE {
	  	X(-1,-3, "X"),
	  	O(1,3, "O"),
	  	E(0,0, "-");

	  	private int value; // valor da peça no tabuleiro (-1)
	  	private int sum; // valor da soma das peças na linha, coluna, ou diagonal
	  	private String repr; // representação da peça

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

	  public String getRepr() { // recebe a peça do jogador utilizado no método visualizar
		  return repr;
	  }
}







