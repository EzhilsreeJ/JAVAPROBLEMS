import java.util.Scanner;

public class menudriven {
    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int mul(int n1, int n2) {
        return n1 * n2;
    }

    public static int div(int n1, int n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;

        while (a != 5) {
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            System.out.print("Enter your choice: ");
            a = sc.nextInt();

            int n1 = 10, n2 = 5;

            switch (a) {
                case 1:
                    System.out.println("Result: " + add(n1, n2));
                    break;
                case 2:
                    System.out.println("Result: " + sub(n1, n2));
                    break;
                case 3:
                    System.out.println("Result: " + mul(n1, n2));
                    break;
                case 4:
                    System.out.println("Result: " + div(n1, n2));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
