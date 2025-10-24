package feb27.finalkeyword.com;

public class FinalReferenceVariableExample {
    public static void main(String[] args) {
        final StringBuilder finalStringBuilder = new StringBuilder("Hello");
        
        // Appending to the final StringBuilder object is allowed
        finalStringBuilder.append(" World");

        // However, reassigning the final reference variable is not allowed
        // finalStringBuilder = new StringBuilder(); // Error: cannot assign a value to final variable 'finalStringBuilder'

        System.out.println(finalStringBuilder);
    }
}
