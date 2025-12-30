package dsa.hashing;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FrequencyMap {

    public void meth(int[] arr) {

        // Treemap
        TreeMap<Integer, Integer> mpp=new TreeMap<>();
        for(int i=0; i< arr.length;i++)
        {
            mpp.put(arr[i], mpp.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: mpp.entrySet())
        {
            System.out.println(entry.getKey()+ "->" + entry.getValue());
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

        FrequencyMap fm = new FrequencyMap();
        fm.meth(arr);

        sc.close();
    }
}
