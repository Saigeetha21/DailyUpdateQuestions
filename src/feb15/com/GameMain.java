package feb15.com;

//Abstract Class with Static Method
abstract class Game {
    abstract void play();

    static void printRules(Game game) {
        System.out.println("Game Rules:");
        game.play();
    }
}

class Chess extends Game {
    void play() {
        System.out.println("Play chess on a checkered gameboard with 64 squares arranged in an 8×8 grid.");
    }
}

public class GameMain {
    public static void main(String[] args) {
        Game chess = new Chess();
        Game.printRules(chess);
    }
}
