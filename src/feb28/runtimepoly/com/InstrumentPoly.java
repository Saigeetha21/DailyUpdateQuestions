package feb28.runtimepoly.com;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Playing Piano");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Playing Guitar");
    }
}

class Violin extends Instrument {
    void play() {
        System.out.println("Playing Violin");
    }
}

public class InstrumentPoly {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();

        piano.play(); // Output: Playing Piano
        guitar.play(); // Output: Playing Guitar
        violin.play(); // Output: Playing Violin
    }
}
