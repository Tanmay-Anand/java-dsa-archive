package dsa.searchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;
//an array or list must be sorted before performing the binary search.

public class BinarySearch {

    static void firstOccur(int[] arr, int first, int last, int key)
    {
        int mid = (first + last) / 2;
        while (first <= last) {
            //right side
            if (arr[mid] < key) {
                first = mid + 1; //shift right side
            } else if (arr[mid] == key) { //agar beech mein hi hai toh
                System.out.println("Element found at index: " + mid);
                break;
            } else { //left side
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    public static void main(String[] args) {

        int[] arr= {1,5,3,6,8,7,4,5,6,8,1,2,5,4,1};
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose your number:");

        int last= arr.length-1;
        int key= sc.nextInt();

        Arrays.sort(arr);

        firstOccur(arr,0,last, key);
    }

}
