package dsa.patterns;

public class Diamond {

    public void meth() {

        int n = 5;

        // upper half
        for (int i = 0; i < n; i++) {

            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 2; i >= 0; i--) {

            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond di = new Diamond();
        di.meth();
    }
}
