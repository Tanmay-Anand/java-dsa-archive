package dsa.numbers;

import java.util.Scanner;

public class ArmstrongNumber {

    public boolean meth(int n) {

        int original = n;
        int digits= String.valueOf(n).length();
        int sum=0;

        while(n>0)
        {
            int digit = n%10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum==original;
    }

    public static void main(String[] args) {
        ArmstrongNumber an= new ArmstrongNumber();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(an.meth(n));
    }
}
