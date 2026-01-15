package dsa.array;

public class MaxSubarraySum {

    public int maximumsum(int[] arr)
    {
        int maxi = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr.length; j++) {
                int sum = 0;
                for(int k=i;k<=j;k++) {
                    sum += arr[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        MaxSubarraySum mss=new MaxSubarraySum();
        int[] arr= {-2, -3, 4, -1, -2, 1, 5, -3};
        int maximum = mss.maximumsum(arr);
        System.out.println(maximum);
    }
}
