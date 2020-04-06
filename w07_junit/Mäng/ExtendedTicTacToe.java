import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExtendedTicTacToe implements GameType {
    static ArrayList<Integer> playerPositions=new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions=new ArrayList<Integer>();
    static char[][] gameBoard = { { ' ', '|', ' ', '|', ' ','|',' ','|',' ' }, { '-', '+', '-', '+', '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ','|',' ','|',' '},
    { '-', '+', '-', '+', '-', '+', '-', '+', '-'}, {  ' ', '|', ' ', '|', ' ','|',' ','|',' ' },{ '-', '+', '-', '+', '-', '+', '-', '+', '-'}, {  ' ', '|', ' ', '|', ' ','|',' ','|',' ' },{ '-', '+', '-', '+', '-', '+', '-', '+', '-'}, {  ' ', '|', ' ', '|', ' ','|',' ','|',' ' }};

    
    public void play(){
        Scanner scan = new Scanner(System.in);
        while (true) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter your placement (1-25):");
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
            int cpuPos = rand.nextInt(25) + 1;
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
    

    @Override
    public void printGameboard(char[][] gameBoard) {
        // TODO Auto-generated method stub
        for (final char[] row : gameBoard) {
            for (final char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }

    }

    @Override
    public void placePiece(char[][] gameBoard, int pos, String user) {
        // TODO Auto-generated method stub
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
                gameBoard[0][6] = symbol;
                break;
            case 5:
                gameBoard[0][8] = symbol;
                break;
            case 6:
                gameBoard[2][0] = symbol;
                break;
            case 7:
                gameBoard[2][2] = symbol;
                break;
            case 8:
                gameBoard[2][4] = symbol;
                break;
            case 9:
                gameBoard[2][6] = symbol;
                break;
            case 10:
                gameBoard[2][8] = symbol;
                break;
            case 11:
                gameBoard[4][0] = symbol;
                break;
            case 12:
                gameBoard[4][2] = symbol;
                break;
            case 13:
                gameBoard[4][4] = symbol;
                break;
            case 14:
                gameBoard[4][6] = symbol;
                break;
            case 15:
                gameBoard[4][8] = symbol;
                break;
            case 16:
                gameBoard[6][0] = symbol;
                break;
            case 17:
                gameBoard[6][2] = symbol;
                break;
            case 18:
                gameBoard[6][4] = symbol;
                break;
            case 19:
                gameBoard[6][6] = symbol;
                break;
            case 20:
                gameBoard[6][8] = symbol;
                break;
            case 21:
                gameBoard[8][0] = symbol;
                break;
            case 22:
                gameBoard[8][2] = symbol;
                break;
            case 23:
                gameBoard[8][4] = symbol;
                break;
            case 24:
                gameBoard[8][6] = symbol;
                break;
            case 25:
                gameBoard[8][8] = symbol;
                break;
            default:
                break;

        }

    }

    @Override
    public String checkWinner() {
        // TODO Auto-generated method stub
        final List topRow = Arrays.asList(1, 2, 3,4,5);
        final List secondRow = Arrays.asList(6,7,8,9,10);
        final List thirdRow = Arrays.asList(11,12,13,14,15);
        final List fourthRow = Arrays.asList(16,17,18,19,20);
        final List botRow = Arrays.asList(21,22,23,24,25);
        final List leftCol = Arrays.asList(1,6,11,16,21);
        final List leftMidCol = Arrays.asList(2,7,12,17,22);
        final List midCol = Arrays.asList(3,8,13,18,23);
        final List rightMidCol = Arrays.asList(4,9,14,19,24);
        final List rightCol = Arrays.asList(5,10,15,20,25);
        final List cross1 = Arrays.asList(1, 7, 13,19,25);
        final List cross2 = Arrays.asList(5,9,13,17,21);

        final List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(secondRow);
        winning.add(thirdRow);
        winning.add(fourthRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(leftMidCol);
        winning.add(midCol);
        winning.add(rightMidCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (final List ll : winning) {
            if(playerPositions.containsAll(ll)){
                return "Congrats,you won!";
            }else if(cpuPositions.containsAll(ll)){
                return "CPU wins!Sorry";
            }else if(playerPositions.size()+cpuPositions.size()==25){
                return "CAT!";
            }
        }

        return"";
    }
    }
