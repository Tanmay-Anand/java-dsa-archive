package dsa.array;

import java.util.HashSet;

public class MissingNumber_Hashing {
    public int findNumber(int[] arr) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:arr)
        {
            set.add(num);
        }
        for(int i=1; i<arr.length+1;i++)
        {
            if(!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MissingNumber_Hashing mnh=new MissingNumber_Hashing();

        int[] arr= {1,2,3,5,6};
        int num=mnh.findNumber(arr);

        System.out.println(num);
    }
}
