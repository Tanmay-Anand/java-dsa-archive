package dsa.numbers;

import java.util.Scanner;

public class NumberCounter {

    public void meth(int n) {

        int count = 0;
        String numStr= Integer.toString(n);
        int[] digitArr = new int[numStr.length()];

        for(int i=0; i<=digitArr.length -1; i++)
        {
            count++;
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        NumberCounter nc= new NumberCounter();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        nc.meth(n);
    }
}
