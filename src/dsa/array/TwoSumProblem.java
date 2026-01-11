package dsa.array;

public class TwoSumProblem {

    public boolean verify(int[] arr, int target)
        {
            for (int i=0; i<arr.length; i++)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[i] + arr[j] == target)
                        return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        TwoSumProblem tsp = new TwoSumProblem();

        int[] arr= {2,6,5,8,11};
        int target = 14;

        System.out.println(tsp.verify(arr, target));
    }
}
