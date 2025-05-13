import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        int fact = 7777;
        
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= fact; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of " + fact + " is:");
        System.out.println(result);

        int count = 0;
        for (int i = 5; fact / i >= 1; i *= 5) {
            count += fact / i;
        }
        System.out.println("Trailing zeros in " + fact + "! = " + count);
    }
}
