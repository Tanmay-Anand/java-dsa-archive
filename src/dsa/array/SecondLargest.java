package dsa.array;

import java.util.Arrays;

public class SecondLargest {

    public void meth(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest element is : " + secondLargest);
    }

    public static void main(String[] args) {
        SecondLargest sl = new SecondLargest();
        int[] arr = {20, 10, 50, 80, 100};
        sl.meth(arr);
    }
}
