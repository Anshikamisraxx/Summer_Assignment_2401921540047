package Day_4;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat; // Return original matrix if reshape is not possible
        }

        int[][] reshaped = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }

        return reshaped;
    }

    public static void main(String[] args) {
        ReshapeMatrix solution = new ReshapeMatrix();
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] reshaped = solution.matrixReshape(mat, r, c);

        for (int i = 0; i < reshaped.length; i++) {
            for (int j = 0; j < reshaped[0].length; j++) {
                System.out.print(reshaped[i][j] + " ");
            }
            System.out.println();
        }
    }
}
