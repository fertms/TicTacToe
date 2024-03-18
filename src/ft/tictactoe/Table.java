package ft.tictactoe;


public class Table implements IReadableTable{
	
	public static final int TABLE_SIZE = 3;
	
	// criacao do tabuleiro de 3x3 de inteiros
	public PIECE table [][] = new PIECE[TABLE_SIZE][TABLE_SIZE];
		
	// definir as peças de cada jogador
	// caso for -1, imprime X
	// caso for 1, imprime O
	// caso for 0, o espaco fica vazio
		
	// construtor que chama o método para limpar o tabuleiro, onde todos os inteiros da matriz recebem 0
	public Table() {
		clearTable();
	}
	
	// metodo para limpar o tabuleiro
	// esse método só reseta o tabuleiro dentro desta classe
	private void clearTable() {
		for(int i = 0; i < TABLE_SIZE; i++)
			for(int j = 0; j < TABLE_SIZE; j++)
				table[i][j] = PIECE.E;
	}
	
	// método que verifica se algum jogador venceu, se o jogo continua ou se empatou
	// caso alguma linha, coluna ou diagonal vencer, os metodos pegam a soma dos valores (-3 ou 3)
	// e retorna -1 caso o jogador 1 venca, ou 1 caso o vencedor seja o jogador 2	
	private int tableSituation() {
		// primeiramente, checa se há diagonais
		if(isDiagonal() != 0) {
	      return isDiagonal();
	    }
	    if(isHorizontal() != 0) {
	      return isHorizontal();
	    }
	    if(isVertical() != 0) {
	      return isVertical();
	    }
			return 0;
	}

	// retorna uma peça se uma uma peça venceu, caso contrário retorna uma peça vazia
	public PIECE hasWon() {
		int val = tableSituation();
	    if (val != 0) {
	    	if(val == PIECE.X.getSum()) {
	    		return PIECE.X;
	    	}
	    	else {
	    		return PIECE.O;
	    	}
	    }
	    return PIECE.E;
	 }

	// método para verificar as duas diagonais
	private int isDiagonal() {
		int firstDiagonal = table[0][0].getValue() + table[1][1].getValue()
	    + table[2][2].getValue();
	    if(firstDiagonal == PIECE.X.getSum() || firstDiagonal == PIECE.O.getSum()) {
	      return firstDiagonal;
	    }
	    int secondDiagonal = table[2][0].getValue() + table[1][1].getValue()
	    + table[0][2].getValue();
	    if(secondDiagonal == PIECE.X.getSum() || secondDiagonal == PIECE.O.getSum()) {
	      return secondDiagonal;
	    }
	    return 0;
	}
	
	// método para verificar a horizontal
	private int isHorizontal() {
		for(int i = 0; i < TABLE_SIZE; i++) {
			int sum = 0;
			for(int j = 0; j < TABLE_SIZE; j++) {
				sum += table[i][j].getValue();
			}
			if(sum == PIECE.X.getSum() || sum == PIECE.O.getSum()) {
	        return sum;
			}
	    }
		return 0;
	}
	
	// método para verificar a vertical, ou seja, as colunas
	private int isVertical() {
		for(int i = 0; i < TABLE_SIZE; i++) {
			int sum = 0;
			for(int j = 0; j < TABLE_SIZE; j++) {
				sum += table[j][i].getValue();
			}
			if(sum == PIECE.X.getSum() || sum == PIECE.O.getSum()) {
				return sum;
			}
	    }
	    return 0;
	}
	
	// metodo para visualizar o tabuleiro
	public void showTable() {
		for (int i = 0; i < TABLE_SIZE; i++) { // verifica as  linhas
			for (int j = 0; j < TABLE_SIZE; j++) { // verifica as colunas
				System.out.print(" " + table[i][j].getRepr());
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	// metodos get e set
	// getter retorna a posicao em que o numero esta no tabuleiro
	// setter altera o numero caso seja X ou O
	// para deixar mais claro, ao invés de utilizar um array, utilizar dois index separadamente
	public PIECE getPosition(Position p) {
		return table[p.getX()][p.getY()];
	}
	
	public void setPosition(Position p, PIECE player) {
		table[p.getX()][p.getY()] = player;
		showTable();
	}
	
	// metodo que confere todo o tabuleiro, e caso encontre 0 retorna falso
	// caso nao encontre 0, significa que o tabuleiro esta completo
	public boolean fullTable() {
		for(int i = 0; i < TABLE_SIZE; i++)
			for(int j = 0; j < TABLE_SIZE; j++)
				if(table[i][j] == PIECE.E)
					return false;
		return true;
	}
	
	// método para verificar se a posição escolhida pelo jogador está vazio ou já foi preenchida por outro jogador
	public boolean isPositionEmpty(Position p) {
		if(table[p.getX()][p.getY()] == PIECE.E) {
			return true;
	    }
		else {
			return false;
	    }
	}
		
}



