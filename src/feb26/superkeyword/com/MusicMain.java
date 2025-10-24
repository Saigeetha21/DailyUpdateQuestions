package feb26.superkeyword.com;

class Instrument {
    void play() {
        System.out.println("Playing the instrument");
    }
}

class Guitar extends Instrument {
    void play() {
        super.play(); // calling parent class method
        System.out.println("Strumming the guitar");
    }
}

public class MusicMain {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.play();
    }
    
    
}
