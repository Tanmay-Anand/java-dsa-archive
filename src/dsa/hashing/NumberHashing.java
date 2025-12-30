package dsa.hashing;

import java.util.Scanner;

public class NumberHashing {

    public void meth(int num, int[] arr) {

        // find max value in array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // hash array based on max value
        int[] hash = new int[max + 1];

        // count frequencies
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        // print result safely
        if (num >= 0 && num < hash.length) {
            System.out.println(hash[num]);
        } else {
            System.out.println(0);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take array size
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // take array elements
        System.out.println("Enter " + size + " array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // take the number to count it
        System.out.print("Enter number to count: ");
        int num = sc.nextInt();

        NumberHashing ca = new NumberHashing();
        ca.meth(num, arr);

        sc.close();
    }
}
