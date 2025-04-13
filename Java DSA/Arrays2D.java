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

    
    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        printSpiral(matrix);
    }
}
