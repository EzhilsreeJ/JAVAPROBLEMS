public class verifycuberoot {
    public static void main(String [] args){
        int num=27;
        int cubeRoot = (int) Math.cbrt(num);
        if (cubeRoot * cubeRoot * cubeRoot == num) {
            System.out.println("It is a perfect cube");
        } else {
            System.out.println("It is not a perfect cube");
        }
    }
} 