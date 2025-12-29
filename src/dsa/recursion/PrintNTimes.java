package dsa.recursion;

public class PrintNTimes {

    public void meth(int i, int n)
    {
        if (i>n)
            return;

        System.out.println("Raj");
        meth(i+1, n);

    }

    public static void main(String[] args) {
        int n=3;
        int i=0;
        PrintNTimes pnt=new PrintNTimes();
        pnt.meth(i, n);
    }
}
