package oops;

public class interface1 {
    public static void main(String[] args) {
    Queen q1=new Queen();
    q1.moves();
    }
}
interface chessplayer{
    void moves();
}
class Queen implements chessplayer{
    public void moves (){
        System.out.println("move up ,down, left right");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("move 1 stap up down left and right");
    }
}

