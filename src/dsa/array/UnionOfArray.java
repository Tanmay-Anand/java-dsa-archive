package dsa.array;

import java.util.ArrayList;
import java.util.Collections;

public class UnionOfArray {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            if (!res.contains(a[i])) {
                res.add(a[i]);
            }
        }

        for (int i = 0; i < b.length; i++) {

            if (!res.contains(b[i])) {
                res.add(b[i]);
            }
        }

        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,4,5};
        int[] b = {6,3,2};

        ArrayList<Integer> res = findUnion(a, b);

        for (Integer num : res) {
            System.out.print(num + " ");
        }
    }
}
