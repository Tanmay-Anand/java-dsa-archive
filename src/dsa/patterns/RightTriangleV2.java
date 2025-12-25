package dsa.patterns;

public class RightTriangleV2 {

    public void method() {
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangleV2 rtv2= new RightTriangleV2();
        rtv2.method();
    }
}
