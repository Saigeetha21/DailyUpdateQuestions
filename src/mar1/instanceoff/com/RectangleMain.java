package mar1.instanceoff.com;

interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        // Create an instance of Rectangle and assign it to a Drawable reference
        Drawable drawable = new Rectangle();

        // Check if the object referenced by 'drawable' is an instance of Drawable
        System.out.println(drawable instanceof Drawable); // Output: true

        // Call the draw() method
        drawable.draw(); // Output: Drawing a rectangle
    }
}
