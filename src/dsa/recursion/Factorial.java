package dsa.recursion;

import java.util.Scanner;

public class Factorial {

    public int meth(int n)
    {
        if(n==0)
            return 1;

        return n*meth(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        Factorial f=new Factorial();
        System.out.println(f.meth(n));
    }
}
