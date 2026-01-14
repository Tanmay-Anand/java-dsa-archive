package dsa.numbers;

import java.util.Scanner;

public class Fibonacci {

    public void printFibonacci(int num) {
        int temp = 0;
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+ num2+" ");
        for(int i=0; i<=num; i++)
        {
            temp = num1+num2;
            System.out.print(temp+ " ");
            num1=num2;
            num2=temp;
        }
    }

    public static void main(String[] args) {
        Fibonacci fib= new Fibonacci();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();

        fib.printFibonacci(num);
    }
}
