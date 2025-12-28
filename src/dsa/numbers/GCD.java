package dsa.numbers;

import java.util.Scanner;

public class GCD {

    public void meth(int num1, int num2) {

        int result = 0;
        for(int i=1; i<=Math.min(num1, num2); i++)
        {
            if((num1%i)==0 && (num2%i)==0)
            {
                result=i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        GCD rd= new GCD();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1= sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2= sc.nextInt();
        rd.meth(n1, n2);
    }
}
