public class exception {
    public static void main(String[] args) {
        int n1=10;
        int n2=0;
        int result =n1/n2;
        System.out.println("endpoint 1");
        try{
             result = n1/n2;
            System.out.println("Result: " + result);

        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        finally{
            System.out.println("This block always executes.");
        }
        
    }
}
