public class increasingorderarray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        int[] sortedArr = sortArray(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArray(int[] arr) {
        java.util.Arrays.sort(arr);
        return arr;
    }

}