package ft.tictactoe;

//como ambos o jogador humano e o jogador computador podem ser considerados jogadores, 
//seria l�gico que eles fossem subclasses de uma mesma classe, esta contendo apenas um m�todo abstrato
//caracterizando a como uma classe abstrata, ou seja, uma interface.
//uma interface que qualquer classe que utiliz�-la deve ter os m�todos definidos

interface IPlayer {
	
	public void setPiece(PIECE piece);

	public Position makeMove(IReadableTable readableTable);
}











