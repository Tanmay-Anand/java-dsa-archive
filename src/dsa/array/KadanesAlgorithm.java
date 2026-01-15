package dsa.array;

public class KadanesAlgorithm {
    public Long maximumsum(int[] arr, int n)
    {
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        for(int i=0; i<n; i++) {
            sum += arr[i];

            if(sum>maxi) {
                maxi = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        KadanesAlgorithm mss=new KadanesAlgorithm();
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        int n=arr.length;
        Long maximum = mss.maximumsum(arr, n);
        System.out.println(maximum);
    }
}
