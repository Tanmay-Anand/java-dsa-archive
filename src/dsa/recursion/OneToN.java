package dsa.recursion;

import java.util.Scanner;

public class OneToN {

    public void meth(int i, int n)
    {
        if(i>n)
            return;

        System.out.print(i);
        meth(i+1, n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number limit: ");
        int n= sc.nextInt();
        int i=0;
        OneToN otn=new OneToN();
        otn.meth(i, n);
    }
}
