package dsa.array;

import java.util.ArrayList;
//Brute Force
public class LeadersInArray {

    public ArrayList<Integer> printArr(int[] arr, int n) {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0; i<n; i++) {
            boolean leader = true;
            for(int j=i+1; j<n; j++) {
                if(arr[j]>arr[i])
                {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                arr2.add(arr[i]);
            }
        }
        return arr2;
    }

    public static void main(String[] args) {

        LeadersInArray lia= new LeadersInArray();
        int[] arr= {10,22,12,3,0,6};
        int larr= arr.length;

        ArrayList<Integer> finalArr = lia.printArr(arr, larr);

        for(int num : finalArr) {
            System.out.print(num+ " ");
        }
    }
}
