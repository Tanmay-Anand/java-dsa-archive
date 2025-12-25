package dsa.patterns;

public class InvertedRightTriangle {
    public void method() {
        for(int i=0; i<=5; i++)
        {
            for(int j=0; j<5-i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        InvertedRightTriangle irt=new InvertedRightTriangle();
        irt.method();
    }
}
