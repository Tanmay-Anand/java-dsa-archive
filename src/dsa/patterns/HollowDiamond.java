package dsa.patterns;

public class HollowDiamond {
    public static void main(String[] args) {

        int n = 7;

        // upper half
        for (int i = 0; i < n; i++) {

            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                if(j == 0 || j == 2*i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 2; i >= 0; i--) {

            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                if(j == 0 || j == 2*i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
