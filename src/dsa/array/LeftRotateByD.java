package dsa.array;

import java.util.Scanner;

public class LeftRotateByD {

    static void leftRotateByDPlaces(int[] arr, int n) {
        if (arr == null || arr.length == 0) return;

        n = n % arr.length;

        for (int j = 0; j < n; j++) {
            int temp = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 2, 1, 5 };

        Scanner sc= new Scanner(System.in);
        System.out.println("How many places you want to shift by left?");
        int n= sc.nextInt();
        leftRotateByDPlaces(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
