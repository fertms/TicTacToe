# TicTacToe em Java

## Visão Geral

Este projeto em Java implementa um clássico jogo da velha utilizando os princípios da Programação Orientada a Objetos (OOP). O jogo oferece três diferentes níveis de dificuldade, permitindo que os jogadores desafiem um oponente controlado pelo computador. Além disso, o jogo suporta partidas entre humano e computador.

## Recursos

- **Design Orientado a Objetos:** O projeto é estruturado utilizando os princípios da OOP, proporcionando um design claro e modular.

- **Três Níveis de Dificuldade:**
  - Fácil: O computador joga no primeiro espaço vazio disponível.
  - Médio: O computador joga em um espaço vazio aleatório.
  - Difícil: O computador joga formando um "triângulo" no tabuleiro.

- **Partidas entre Humano e Computador:** Desfrute da experiência clássica do jogo da velha contra um oponente de computador inteligente.

## Como Jogar

1. **Clone o repositório em sua máquina local:**

   ```bash
   git clone https://github.com/your-username/tic-tac-toe-java.git

2. **Siga as instruções na tela para escolher o modo de jogo (Humano vs. Computador) e o nível de dificuldade.**

Divirta-se jogando o jogo da velha!

## Estrutura do Projeto
O projeto está organizado da seguinte forma:

- AbstractComputerPlayer.java: Esta classe abstrata contém funcionalidades comuns para todos os três níveis de jogador computador, armazenando os valores das peças do jogador.
- HumanPlayer.java: Subclasse de IPlayer, implementa o jogador humano.
- IPlayer.java: Interface que define métodos comuns para jogadores (humanos e computadores).
- IReadableTable.java: Interface que representa o tabuleiro.
- Main.java: Classe principal que inicia o jogo e gerencia as interações do usuário.
- PIECE.java: Enumeração que armazena os valores constantes das peças (X ou O).
- Position.java: Classe para armazenar as posições.
- SimplePlayer.java: Primeiro nível de jogador computador, coloca suas peças no primeiro espaço vazio disponível.
- SimplePlayer2.java: Segundo nível de jogador computador, coloca suas peças em um espaço vazio aleatório.
- SimplePlayer3.java: Terceiro nível de jogador computador, faz suas jogadas formando um "triângulo" no tabuleiro.
- Table.java: Classe que representa o tabuleiro do jogo.

## Contribuições
Se encontrar algum problema ou tiver sugestões de melhoria, sinta-se à vontade para abrir uma issue ou enviar uma pull request.

## Licença
Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.
