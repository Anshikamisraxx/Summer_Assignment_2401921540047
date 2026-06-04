package Day_4;

public class MatrixDiagonalSum {
    
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[0].length;j++) {
                if(i == j || i+j == mat[0].length-1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }

        public static void main(String[] args) {
            MatrixDiagonalSum mds = new MatrixDiagonalSum();
            int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
            System.out.println(mds.diagonalSum(mat));
        }
}
