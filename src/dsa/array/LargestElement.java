package dsa.array;

public class LargestElement {

    public void meth(int[] arr) {
        int largest = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        LargestElement le = new LargestElement();
        int[] arr={20,10,50,80,100};
        le.meth(arr);
    }
}
