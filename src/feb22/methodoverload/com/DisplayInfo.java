package feb22.methodoverload.com;

public class DisplayInfo {

    // Method to display information about an integer
    public void display(int num) {
        System.out.println("Integer: " + num);
    }

    // Method to display information about a double
    public void display(double num) {
        System.out.println("Double: " + num);
    }

    // Method to display information about a string
    public void display(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        DisplayInfo displayInfo = new DisplayInfo();

        // Testing different overloaded methods
        displayInfo.display(10);
        displayInfo.display(3.14);
        displayInfo.display("Hello, Method Overloading!");
    }
}
