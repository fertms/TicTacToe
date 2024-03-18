package ft.tictactoe;

//como ambos o jogador humano e o jogador computador podem ser considerados jogadores, 
//seria lógico que eles fossem subclasses de uma mesma classe, esta contendo apenas um método abstrato
//caracterizando a como uma classe abstrata, ou seja, uma interface.
//uma interface que qualquer classe que utilizá-la deve ter os métodos definidos

interface IPlayer {
	
	public void setPiece(PIECE piece);

	public Position makeMove(IReadableTable readableTable);
}











