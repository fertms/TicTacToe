package ft.tictactoe;


/* implementa a interface de IPlayer (outros jogadores computadores, e tamb�m os jogadores humanos
 * este � o terceiro n�vel do computador, onde caso escolhido pelo jogador humano, executa uma implementa��o
 * onde o jogador computador faz suas jogadas formando um tri�ngulo no tabuleiro
 * esse m�todo consiste em criar uma oportunidade em que � poss�vel ganhar de duas formas, como por exemplo
 * 
 * X - X
 * - - -
 * X - -
 * 
 * existem outras varia��es de movimenta��o da pe�a, mas a l�gica � a mesma
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
		
		throw new RuntimeException("N�o foi encontrada uma posi��o v�lida");
	}
}
		

	