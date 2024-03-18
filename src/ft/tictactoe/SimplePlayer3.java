package ft.tictactoe;


/* implementa a interface de IPlayer (outros jogadores computadores, e também os jogadores humanos
 * este é o terceiro nível do computador, onde caso escolhido pelo jogador humano, executa uma implementação
 * onde o jogador computador faz suas jogadas formando um triângulo no tabuleiro
 * esse método consiste em criar uma oportunidade em que é possível ganhar de duas formas, como por exemplo
 * 
 * X - X
 * - - -
 * X - -
 * 
 * existem outras variações de movimentação da peça, mas a lógica é a mesma
 * 
 */
class SimplePlayer3 extends AbstractComputerPlayer {
	
	PIECE p;
	
	public SimplePlayer3() {
		super();
		p = super.getPiece();
	}
	
	public Position makeMove(IReadableTable r) {
		Position p = new Position(0,0);
		if(r.isPositionEmpty(p)) {
			return p;
		}
		p = new Position(0,2);
		if(r.isPositionEmpty(p)) {
			return p;
		}
		p = new Position(2,0);
		if(r.isPositionEmpty(p)) {
			return p;
		}
		if(r.getPosition(new Position(0,2)) == r.getPosition(new Position(2,0)) && r.getPosition(new Position(0,2)) == this.p) {
			p = new Position(0,1);
			if(r.isPositionEmpty(p)) {
				return p;
			}
			p = new Position(1,0);
			if(r.isPositionEmpty(p)) {
				return p;
			}
			p = new Position(1,1);
			if(r.isPositionEmpty(p)) {
				return p;
			}
			p = new Position(1,2);
			if(r.isPositionEmpty(p)) {
				return p;
			}
			p = new Position(2,1);
			if(r.isPositionEmpty(p)) {
				return p;
			}
		} else {
			return new Position(2,2);
		}
		
		throw new RuntimeException("Não foi encontrada uma posição válida");
	}
}
		

	