package dsa.array;

import java.util.ArrayList;
import java.util.Collections;

//O(n³) => worst case
public class IntersectionOfArray {

    static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && !res.contains(a[i])) {
                    res.add(a[i]);
                    break;
                }
            }
        }

        Collections.sort(res);
        return res;
    }


    public static void main(String[] args) {

            int[] a = {1,4,5};
            int[] b = {4,4,5};

        ArrayList<Integer> res = findIntersection(a, b);

        for (Integer num : res) {
            System.out.print(num + " ");
        }
    }
}
