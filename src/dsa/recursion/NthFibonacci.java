package dsa.recursion;

import java.util.Scanner;

public class NthFibonacci {

    public int meth(int n) {

        if(n<=1)
            return n;

        int last=meth(n-1);
        int secLast=meth(n-2);
        return last+secLast;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Nth position you want to know: ");
        int n=sc.nextInt();
        NthFibonacci nfn=new NthFibonacci();
        System.out.println(nfn.meth(n));
    }
}
