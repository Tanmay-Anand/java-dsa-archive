package dsa.numbers;

import java.util.Scanner;

public class ReverseDigit {

    public void meth(int num) {

        int reverse = 0;
        while(num>0)
        {
            int digit=num%10;
            reverse = reverse*10 + digit;
            num=num/10;
        }
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        ReverseDigit rd= new ReverseDigit();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        rd.meth(n);
    }
}
