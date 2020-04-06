
public interface GameType {

    void printGameboard(char[][]gameBoard);
    void placePiece(char[][]gameBoard,int pos,String user);
    String checkWinner();
    void play();

}