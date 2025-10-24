package feb22.methodoverload.com;

public class MathOperations {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to add an integer and a double
    public double add(int a, double b) {
        return a + b;
    }
    
    // Method to concatenate two strings
    public String concatenate(String a, String b) {
        return a + b;
    }
    
    // Method to concatenate three strings
    public String concatenate(String a, String b, String c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Testing different overloaded methods
        System.out.println("Addition of 5 and 10: " + math.add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + math.add(5, 10, 15));
        System.out.println("Addition of 2.5 and 3.7: " + math.add(2.5, 3.7));
        System.out.println("Addition of 7 and 4.5: " + math.add(7, 4.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + math.concatenate("Hello", "World"));
        System.out.println("Concatenation of 'Java', 'is', and 'awesome': " + math.concatenate("Java", "is", "awesome"));
    }
}

