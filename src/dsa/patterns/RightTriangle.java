package dsa.patterns;

public class RightTriangle {

    public void method1() {

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        RightTriangle rt= new RightTriangle();
        rt.method1();
    }
}
