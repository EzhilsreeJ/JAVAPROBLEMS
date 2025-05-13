public class division {
    public static void main(String[] args) {
        int num = 10;
        int div = 5;
        int sub = num;
        int count = 0;
        for (int i = 1; i < div; i++) {
            sub -= div;
            count++;
            if (sub == 0) {
                break;
            }

        }
        System.out.println(count);
    }

}
