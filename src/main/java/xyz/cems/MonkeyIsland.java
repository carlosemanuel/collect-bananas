package xyz.cems;

/**
 * Hello world!
 *
 */
public class MonkeyIsland {

    public int collectBananas(int[][] matrix) {
        // prevent NPE
        if (matrix == null) {
            return 0;
        }

        // matrix size
        int rows = matrix[0].length;
        int columns = matrix[1].length;

        // Create a matrix with the same size for storing, space O(m*n)
        int[][] bananaTable = new int[rows][columns];

        // starting our maximum number banana's amount collected
        int maxBananas = 0;

        // iterate over columns - O(m*n)
        for (int col = columns - 1; col >= 0; col--) {

            // iterate over rows - O(m*n)
            for (int row = 0; row < rows; row++) {

                // collect bananas on the right
                int right = (col == columns - 1) ? 0 : bananaTable[row][col + 1];

                // collect bananas on diagonal up
                int diagonalUp = (row == 0 || col == columns - 1) ? 0 : bananaTable[row - 1][col + 1];

                // collect bananas on diagonal down
                int diagonalDown = (row == rows - 1 || col == columns - 1) ? 0 : bananaTable[row + 1][col + 1];

                // comparing diagonal up with diagonal down and choosing the highest and storing on auxiliary matrix
                bananaTable[row][col] = matrix[row][col] + Math.max(right, Math.max(diagonalUp, diagonalDown));

                // updating the maximum amount collected
                maxBananas = Math.max(maxBananas, bananaTable[row][col]);
            }
        }

        return maxBananas;
    }

}
