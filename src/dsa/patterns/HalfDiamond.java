package dsa.patterns;

public class HalfDiamond {

    public void meth() {
        //upper triangle
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower triangle
        for(int i=5; i>=0; i--)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HalfDiamond fd = new HalfDiamond();
        fd.meth();
    }
}
