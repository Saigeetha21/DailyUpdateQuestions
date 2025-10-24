package feb15.com;

interface Movement {
    void move();
}

abstract class Bird implements Movement {
    String name;

    Bird(String name) {
        this.name = name;
    }

    abstract void chirp();

    public void move() {
        System.out.println(name + " is flying");
    }
}

class Sparrow extends Bird {
    Sparrow(String name) {
        super(name);
    }

    void chirp() {
        System.out.println("Chirp! Chirp!");
    }
}

public class BirdMain {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("Jack");
        sparrow.chirp();
        sparrow.move();
    }
}
