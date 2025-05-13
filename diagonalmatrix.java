public class diagonalmatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 3}
        };
        boolean isDiagonal = true;
        for (int i = 0; i < n && isDiagonal; i++)
            for (int j = 0; j < n; j++)
                if (i != j && matrix[i][j] != 0)
                    isDiagonal = false;
        System.out.println(isDiagonal ? "Diagonal" : "Not Diagonal");
    }
}