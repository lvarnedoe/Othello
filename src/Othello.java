import cs251.lab2.*;
public class Othello implements OthelloInterface {
    Piece s;
    Result r;
    public static void main (String[] args){
        Othello game = new Othello();
        if(args.length > 0){
            game.setComputerPlayer(args[0]);

        }
     OthelloGUI.showGUI(game);
    }
    public int getSize(){ return 10;};

    public void initializeGame(){};

    public String getBoardString(){ return "";};

    public Piece getCurrentTurn(){return s;};
    public void setComputerPlayer(String opponent){

    };
    public Result handleClickAt(int row, int col){ return r;};

}
