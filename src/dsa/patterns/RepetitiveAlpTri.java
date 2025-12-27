package dsa.patterns;

public class RepetitiveAlpTri {

    public void main() {

        char ch='A';
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch += 1;
        }
    }

    public static void main(String[] args) {
        RepetitiveAlpTri rat=new RepetitiveAlpTri();
        rat.main();
    }
}
