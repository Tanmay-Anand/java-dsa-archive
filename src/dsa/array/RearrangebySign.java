package dsa.array;

import java.util.ArrayList;

public class RearrangebySign {
    public void arrange(int[] arr, int n) {
        ArrayList <Integer> pos= new ArrayList<>();
        ArrayList <Integer> neg = new ArrayList<>();

        for(int i=0; i<n; i++) {
            if(arr[i] > 0) {
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        for(int i=0; i<n/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }

        for(Integer num: arr) {
            System.out.print(num+ ", ");
        }
    }

    public static void main(String[] args) {
        int[] arr={3,1,-2,-5,2,-4};
        int arrlength = arr.length;

        RearrangebySign rbs = new RearrangebySign();
        rbs.arrange(arr, arrlength);
    }
}
