public class Arrays2D {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0, startCol = 0, EndRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while(startRow <= EndRow && startCol <= endCol) {
            //top
            for (int i=startCol; i<=endCol; i++) {
                System.out.print(matrix[startRow][i]+" ");
            }

            //right
            for (int i=startRow+1; i<=EndRow; i++) {
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom
            for (int i=endCol-1; i>=startCol; i--) {
                if (startRow == EndRow) {
                    break;
                }
                System.out.print(matrix[EndRow][i]+" ");
            }
            //left
            for (int i=EndRow-1; i>=startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            EndRow--;
            endCol--;
        }
        System.out.println();

    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        // --------------Brute Force Method------------
        // for (int i=0; i<matrix.length; i++) { // Time complexity = O(n²)
        //     for (int j=0; j<matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i+j == matrix.length-1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // --------------Brute Force Method------------
        
        // ----------------More Optimised Method--------------
        for (int i=0; i<n; i++) { // Time complexity = O(n)
            // pd
            sum +=  matrix[i][i];
            // sd
            if (i != matrix.length-i-1) {
                sum += matrix[i][matrix.length-i-1];
            }
        }
        // ----------------More Optimised Method--------------

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // printSpiral(matrix);
        System.out.print("%d", diagonalSum(matrix));
    }
}
