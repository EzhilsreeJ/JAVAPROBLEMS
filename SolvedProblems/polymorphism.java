public class polymorphism {
    public static void main(String[] args) {
        int n1=10;
        int n2=5;
        String result =""+calc(n1,n2);
        System.out.println("Result: " + calc(n1,n2));
        System.out.println("Result: " + calc(n1));
    }
    public static int calc(int n1, int n2) {
        return n1+n2;
    }
    public static int calc(int n1) {
        return n1*n1;
    }
    
}
