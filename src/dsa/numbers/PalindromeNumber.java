package dsa.numbers;

import java.util.Scanner;

public class PalindromeNumber {

    public void checkPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is NOT a Palindrome");
        }
    }


    public static void main(String[] args) {
        PalindromeNumber pn= new PalindromeNumber();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        pn.checkPalindrome(num);
    }
}
