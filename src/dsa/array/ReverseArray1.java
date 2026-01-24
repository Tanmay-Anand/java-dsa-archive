package dsa.array;

//Taking extra space

public class ReverseArray1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] revArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[arr.length - 1 - i];
        }

        for (int num : revArr) {
            System.out.print(num + " ");
        }
    }
}
