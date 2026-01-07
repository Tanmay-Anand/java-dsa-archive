package dsa.searchAlgorithms;

//1st occurrence of num in an array.

import java.util.Scanner;

public class LinearSearch {
    static int firstOccur(int[] arr, int n)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == n)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr= {1,5,3,6,8,7,4,5,6,8,1,2,5,4,1};
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose your number:");
        int n= sc.nextInt();

        System.out.println("The first occurrence of "+ n + " is in index: "+ firstOccur(arr, n));
    }
}
