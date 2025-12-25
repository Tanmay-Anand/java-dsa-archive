package dsa.patterns;

public class StTriangle {

    public void meth() {

        int rows = 4;
        for (int i = 0; i < rows; i++) {

            // print spaces
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StTriangle st = new StTriangle();
        st.meth();
    }
}
