package dsa.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArr {

    public void meth(int[] arr, int left, int right)
    {
        if(left>=right) {
            return;
        }

        int temp=arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        meth(arr, left+1, right-1);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ReverseArr ra=new ReverseArr();
        ra.meth(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}
