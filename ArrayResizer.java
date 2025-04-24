public class ArrayResizer {

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int i = 0; i < array2D[0].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[][] resize(int[][] array2D) {
        int rows = array2D.length;
        int columns = array2D[0].length;
        int nonZeroRows = numNonZeroRows(array2D);
        int[][] result = new int[nonZeroRows][columns];
        int rowIndex = 0;
        for (int i = 0; i < rows; i++) {
            if (isNonZeroRow(array2D, i)) {
                for (int j = 0; j < columns; j++) {
                    result[rowIndex][j] = array2D[i][j];
                }
                rowIndex++;
            }
        }
        return result;
    }

    // CODE BELOW ADDED TO ENABLE TESTING; NOT SHOWN IN ORIGINAL FRQ
    public static int numNonZeroRows(int[][] array2D) {
        int nonZeroRowCount = 0;
        for (int row = 0; row < array2D.length; row++) {
            boolean hasZeros = false;
            for (int col = 0; col < array2D[0].length; col++) {
                if (array2D[row][col] == 0) {
                    hasZeros = true;
                }
            }
            if (!hasZeros) {
                nonZeroRowCount++;
            }
        }
        return nonZeroRowCount;
    }
}
