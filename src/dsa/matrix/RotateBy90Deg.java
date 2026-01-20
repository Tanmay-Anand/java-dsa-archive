package dsa.matrix;

public class RotateBy90Deg {

    public void outputMatrix(int[][] input) {
        int n = input.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = input[i][left];
                input[i][left] = input[i][right];
                input[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        RotateBy90Deg rbd = new RotateBy90Deg();

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Input matrix:");
        System.out.println();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Output matrix:");
        System.out.println();

        rbd.outputMatrix(input);
    }
}
