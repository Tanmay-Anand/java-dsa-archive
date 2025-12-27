package dsa.patterns;

public class AlphabetTriangle {

    public void meth() {
        for(int i=0; i<5; i++)
        {
            for(char ch='A'; ch<='A'+i; ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AlphabetTriangle at = new AlphabetTriangle();
        at.meth();
    }
}
