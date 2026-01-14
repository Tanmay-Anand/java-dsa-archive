package dsa.numbers;

import java.util.Scanner;

public class Fibonacci2 {
    public void printFibonacci(int num) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(num1 + " ");

            int temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }

    public static void main(String[] args) {
        Fibonacci2 fib= new Fibonacci2();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();

        fib.printFibonacci(num);
    }
}
