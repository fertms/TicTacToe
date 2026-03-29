# ♟️ Tic-Tac-Toe in Java

A classic Tic-Tac-Toe console game built in Java, featuring Object-Oriented Programming principles and three distinct AI difficulty levels.

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=flat)
![License](https://img.shields.io/badge/License-MIT-green?style=flat)

---

## 🎮 About the Game

This project implements the classic Tic-Tac-Toe game where a human player competes against a computer opponent. The game was developed as an academic project to demonstrate Object-Oriented Programming concepts such as interfaces, abstract classes, inheritance, and encapsulation.

---

## ✨ Features

- **3 AI Difficulty Levels:**
  - 🟢 **Easy** — Computer plays on the first available empty space
  - 🟡 **Medium** — Computer plays on a random empty space
  - 🔴 **Hard** — Computer plays strategically forming a triangle pattern on the board
- **Human vs Computer** gameplay
- **Clean OOP design** with interfaces and abstract classes
- **Console-based UI** with clear board display

---

## 🏗️ Project Architecture

The project follows a clean OOP structure:

| Class / Interface | Type | Description |
|---|---|---|
| `IPlayer` | Interface | Defines common methods for all player types |
| `IReadableTable` | Interface | Represents the game board contract |
| `AbstractComputerPlayer` | Abstract Class | Shared logic for all computer players |
| `HumanPlayer` | Class | Implements the human player |
| `SimplePlayer` | Class | Easy AI — first available space |
| `SimplePlayer2` | Class | Medium AI — random available space |
| `SimplePlayer3` | Class | Hard AI — strategic triangle pattern |
| `Table` | Class | Game board logic and state |
| `Position` | Class | Stores board positions |
| `PIECE` | Enum | Defines X and O piece constants |
| `Main` | Class | Entry point and game flow controller |

---

## 📁 Project Structure
```
TicTacToe/
├── src/ft/tictactoe/
│   ├── Main.java
│   ├── IPlayer.java
│   ├── IReadableTable.java
│   ├── AbstractComputerPlayer.java
│   ├── HumanPlayer.java
│   ├── SimplePlayer.java
│   ├── SimplePlayer2.java
│   ├── SimplePlayer3.java
│   ├── Table.java
│   ├── Position.java
│   └── PIECE.java
└── README.md
```

---

## ▶️ How to Run

### Prerequisites
- Java JDK 8 or higher installed
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or terminal

### Running from terminal
```bash
# Clone the repository
git clone https://github.com/fertms/TicTacToe.git
cd TicTacToe

# Compile
javac -d bin src/ft/tictactoe/*.java

# Run
java -cp bin ft.tictactoe.Main
```

### Running from IDE
1. Open the project in your preferred Java IDE
2. Run `Main.java` as the entry point

---

## 🎯 OOP Concepts Applied

- **Interfaces** — `IPlayer` and `IReadableTable` define contracts for players and the board
- **Abstract Classes** — `AbstractComputerPlayer` provides shared behavior for AI players
- **Inheritance** — All computer players extend `AbstractComputerPlayer`
- **Encapsulation** — Board state and player data are properly encapsulated
- **Polymorphism** — Different AI strategies share the same `IPlayer` interface

---

## 📜 License

This project is licensed under the MIT License.
