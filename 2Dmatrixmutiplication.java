class Main {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = mat.length;
        int m = mat[0].length;
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = 0; 
                for (int k = 0; k < n; k++) {
                    c[i][j] += mat[i][k] * mat[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
