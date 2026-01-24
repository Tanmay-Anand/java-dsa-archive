package dsa.string;

public class CountString {
    public static void main(String[] args) {

        String str = "Tanmay";
        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println(count);
    }
}
