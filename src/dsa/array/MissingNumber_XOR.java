package dsa.array;

import java.util.HashSet;

public class MissingNumber_XOR {

    public int findNumber(int[] arr) {
        int xor=0;

        for(int num:arr) {
            xor ^= num;
        }

        for(int i=1; i<= arr.length+1; i++)
        {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        MissingNumber_XOR mnx=new MissingNumber_XOR();

        int[] arr= {1,2,3,5,6};
        int num=mnx.findNumber(arr);

        System.out.println(num);
    }
}
