package interview.application;

import java.util.Scanner;

public class TicTacToe {
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
    
    static char player = 'X', computer = 'O';
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("1. Play with a friend (Two-Player Mode)");
        System.out.println("2. Play with computer (One-Player Mode)");

        int choice = scanner.nextInt();
        if (choice == 1)
        {
            playTwoPlayer();
        } else if (choice == 2) {
            playWithComputer();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Method to play with two players
    public static void playTwoPlayer() {
    	
        char currentPlayer = 'X'; 
        // Start with player X
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn.");
            playerMove(currentPlayer);

            if (checkWinner(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            } else if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Switch turns
        }
    }

    // Method to play against the computer
    public static void playWithComputer() {
    	
        System.out.println("Do you want to be X or O? (X plays first)");
        char humanPlayer = scanner.next().charAt(0);
        player = humanPlayer;
        computer = (player == 'X') ? 'O' : 'X';

        while (true) {
            if (player == 'X') {
                printBoard();
                System.out.println("Your turn:");
                playerMove(player);
            }

            if (checkWinner(player)) {
                printBoard();
                System.out.println("You win!");
                break;
            } else if (isDraw()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            System.out.println("Computer's turn:");
            computerMove();
            printBoard();

            if (checkWinner(computer)) {
                System.out.println("Computer wins!");
                break;
            } else if (isDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            if (player == 'O') {
                printBoard();
                System.out.println("Your turn:");
                playerMove(player);
            }
        }
    }

    // Method for player's move
    public static void playerMove(char currentPlayer) {
        int row, col;
        while (true) {
            System.out.print("Enter row  (1-3): ");
            row = scanner.nextInt() - 1;
            System.out.print("Enter column (1-3): ");
            col = scanner.nextInt() - 1;
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    // Method for computer's move using minimax
    public static void computerMove() {
        int[] bestMove = findBestMove();
        board[bestMove[0]][bestMove[1]] = computer;
    }

    // Minimax algorithm to find the best move for the computer
    public static int[] findBestMove() {
        int bestVal = Integer.MIN_VALUE;
        int[] bestMove = {-1, -1};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = computer;
                    int moveVal = minimax(0, false);
                    board[i][j] = ' '; // Undo the move

                    if (moveVal > bestVal) {
                        bestMove[0] = i;
                        bestMove[1] = j;
                        bestVal = moveVal;
                    }
                }
            }
        }
        return bestMove;
    }

    // Minimax function to simulate all possible moves
    public static int minimax(int depth, boolean isMax) {
    	
        if (checkWinner(computer)) {
            return 10 - depth;
        }
        if (checkWinner(player)) {
            return depth - 10;
        }
        if (isDraw()) {
            return 0;
        }

        if (isMax) {
            int best = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = computer;
                        best = Math.max(best, minimax(depth + 1, false));
                        board[i][j] = ' ';
                    }
                }
            }
            return best;
        } else {
            int best = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = player;
                        best = Math.min(best, minimax(depth + 1, true));
                        board[i][j] = ' ';
                    }
                }
            }
            return best;
        }
    }

    // Method to check if a player has won
    public static boolean checkWinner(char currentPlayer) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Method to check if the game is a draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to print the board
    public static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }
}







