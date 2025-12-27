package dsa.patterns;

public class AlphabetTriangle2 {

    public void meth() {
        for(int i=0; i<5; i++)
        {
            for(char ch='A'; ch<='A'+ (5-i-1); ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AlphabetTriangle2 at = new AlphabetTriangle2();
        at.meth();
    }
}
