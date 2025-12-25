package dsa.patterns;

public class InvertedRightTriangleV2 {

    public void meth() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<= 5-i+1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedRightTriangleV2 irtv2= new InvertedRightTriangleV2();
        irtv2.meth();
    }
}
