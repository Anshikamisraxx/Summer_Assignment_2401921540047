package Day_4;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

    int row = mat.length;
    int col = mat[0].length;

    if (row * col != r * c) {
        return mat;
    }

    int[][] matR = new int[r][c];

    int index = 0;

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {

            matR[index / c][index % c] = mat[i][j];
            index++;
        }
    }

    return matR;
}

    public static void main(String[] args) {
        ReshapeMatrix reshapeMatrix = new ReshapeMatrix();
        int mat[][] = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int result[][] = reshapeMatrix.matrixReshape(mat,r,c);
        for(int i = 0; i<result.length; i++){
            for(int j =0;j<result[0].length;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
