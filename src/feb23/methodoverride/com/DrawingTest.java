package feb23.methodoverride.com;

class DrawingTool {
    protected void draw() {
        System.out.println("Using drawing tool");
    }
}

class Pen extends DrawingTool {
    @Override
    public void draw() {
        System.out.println("Using pen to draw");
    }
}

class Pencil extends DrawingTool {
    @Override
    protected void draw() {
        System.out.println("Using pencil to draw");
    }
}

public class DrawingTest {
    public static void main(String[] args) {
        DrawingTool pen = new Pen();
        pen.draw(); // Output: Using pen to draw

        DrawingTool pencil = new Pencil();
        pencil.draw(); // Output: Using pencil to draw
    }
}
