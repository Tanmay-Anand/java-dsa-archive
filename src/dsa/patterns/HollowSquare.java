package dsa.patterns;

public class HollowSquare {

    public void meth() {
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowSquare hs = new HollowSquare();
        hs.meth();
    }
}
