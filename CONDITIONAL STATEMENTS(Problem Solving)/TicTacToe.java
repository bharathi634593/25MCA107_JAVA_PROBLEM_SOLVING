package conditional_statements;
import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	10. Tic Tac Toe using Switch Case (Advanced)
	    Simulate basic game logic with switch cases.
	*/
		
		

		        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		        Scanner sc = new Scanner(System.in);

		        for (int turn = 0; turn < 9; turn++) {
		            char player = (turn % 2 == 0) ? 'X' : 'O';
		            System.out.print("Player " + player + ", enter position (1-9): ");
		            int pos = sc.nextInt() - 1;

		            if (pos >= 0 && pos < 9 && board[pos] == ' ') {
		                board[pos] = player;
		            } else {
		                System.out.println("Invalid Move, try again!");
		                turn--;
		                continue;
		            }

		            // Display board
		            for (int i = 0; i < 9; i++) {
		                System.out.print(board[i] == ' ' ? "_" : board[i]);
		                if ((i + 1) % 3 == 0) System.out.println();
		                else System.out.print(" | ");
		            }

		            // Check win
		            int[][] win = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
		            for (int[] w : win) {
		                if (board[w[0]] != ' ' && board[w[0]] == board[w[1]] && board[w[1]] == board[w[2]]) {
		                    System.out.println(player + " wins!");
		                    return;
		                }
		            }
		        }
		        System.out.println("Draw!");
		    }
		}
