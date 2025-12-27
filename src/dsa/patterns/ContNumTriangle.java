package dsa.patterns;

public class ContNumTriangle {

    public void meth() {

        int count=1;
        for(int i=0; i<5; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(count + " ");
                count = count +1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ContNumTriangle cnt = new ContNumTriangle();
        cnt.meth();
    }
}
