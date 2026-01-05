package dsa.array;


public class CheckSorted {
    public boolean meth(int[] arr) {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] >= arr[i-1])
            {

            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckSorted cs = new CheckSorted();
        int[] arr = {20, 10, 50, 80, 100};
        System.out.println(cs.meth(arr));
    }
}
