public class swapwithoutthirdvariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap using arithmetic operations
        a = a ^ b; // Step 1: a now contains the sum of a and b
        b = a ^ b; // Step 2: b now contains the original value of a
        a = a ^ b; // Step 3: a now contains the original value of b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
