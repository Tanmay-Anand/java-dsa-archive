package dsa.patterns;

public class HollowTriangle {
    public static void main(String[] args) {

            int i, j, k;

            // rows
            for (i = 1; i <= 9; i++) {

                // spaces.
                for (j = i; j < 9; j++) {
                    System.out.print(" ");
                }

                for (k = 1; k <= (2 * i - 1); k++) {

                    // printing stars.
                    if (k == 1 || i == 9 || k == (2 * i - 1)) {
                        System.out.print("*");
                    }

                    // printing spaces.
                    else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
    }
}
