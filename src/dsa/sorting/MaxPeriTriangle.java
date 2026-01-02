package dsa.sorting;

public class MaxPeriTriangle {

    static int maxPerimeter(int[] arr) {
        int n = arr.length;

        int ans = -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    if (arr[i] + arr[j] > arr[k] &&
                            arr[j] + arr[k] > arr[i] &&
                            arr[k] + arr[i] > arr[j]) {
                        ans = Math.max(ans, arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {6, 1, 6, 5, 8, 4};
        System.out.println(maxPerimeter(arr));
    }
}


