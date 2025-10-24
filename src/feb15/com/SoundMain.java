package feb15.com;


//Abstract Class with Interface
interface Sound {
    void makeSound();
}

abstract class Instrument implements Sound {
    abstract void play();
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Strumming the guitar");
    }

    public void makeSound() {
        System.out.println("Guitar makes sound");
    }
}

public class SoundMain {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.makeSound();
        guitar.play();
    }
}

