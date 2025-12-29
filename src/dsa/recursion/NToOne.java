package dsa.recursion;

import java.util.Scanner;

public class NToOne {

    public void meth(int i, int n)
    {
        if(n<1)
            return;

        System.out.print(n);
        meth(i, n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number limit: ");
        int n= sc.nextInt();
        int i=0;
        NToOne nto=new NToOne();
        nto.meth(i, n);
    }
}
