import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 * 
 * allikas mängu jaoks:
 * https://www.youtube.com/watch?v=gQb3dE-y1S4
 */
public class TicTacToe implements GameType  {

    public static ArrayList<Integer> playerPositions=new ArrayList<Integer>();
    public static ArrayList<Integer> cpuPositions=new ArrayList<Integer>();
    public static char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
            { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
            
    public void play(){
        final Scanner scan = new Scanner(System.in);
        while (true) {
            final Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int playerPos = scan.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPositions)) {
                System.out.println("Position taken!Enter a correct Position");
                playerPos = scan.nextInt();

            }
        

            placePiece(gameBoard, playerPos, "player");
            final String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            final Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPositions)) {
                cpuPos = scan.nextInt();

            }
            placePiece(gameBoard, cpuPos, "cpu");

            printGameboard(gameBoard);

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

        }
    }
    public ArrayList<Integer> getPlayerPositions() {
        return playerPositions;
    }

    public void printGameboard(final char[][] gameBoard) {
        for (final char[] row : gameBoard) {
            for (final char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void placePiece(final char[][] gameBoard, final int pos, final String user) {

        char symbol = ' ';
        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(pos);
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;

        }
    }

    public String checkWinner() {

        final List topRow = Arrays.asList(1, 2, 3);
        final List midRow = Arrays.asList(4, 5, 6);
        final List botRow = Arrays.asList(7, 8, 9);
        final List leftCol = Arrays.asList(1, 4, 7);
        final List midCol = Arrays.asList(2, 5, 8);
        final List rightCol = Arrays.asList(3, 6, 9);
        final List cross1 = Arrays.asList(1, 5, 9);
        final List cross2 = Arrays.asList(7, 5, 3);

        final List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (final List l : winning) {
            if(playerPositions.containsAll(l)){
                return "Congrats,you won!";
            }else if(cpuPositions.containsAll(l)){
                return "CPU wins!Sorry";
            }else if(playerPositions.size()+cpuPositions.size()==9){
                return "CAT!";
            }
        }

        return"";
    }
    
}