package dsa.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//T.C => O(n + m)
//n = number of elements in the first array a AND
//m = number of elements in the second array b
//Space complexity: O(n).
public class IntersectionOfArrayV2 {

    static ArrayList<Integer> findIntersection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (set.contains(num)) {
                res.add(num);

                set.remove(num);
            }
        }

        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 5};
        int[] b = {4, 4, 5};

        ArrayList<Integer> res = findIntersection(a, b);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
