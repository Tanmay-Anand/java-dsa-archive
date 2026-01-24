package dsa.string;

public class ReverseString {

    public static void main(String[] args) {

        String input = "hello";
        char[] chars = input.toCharArray();

        StringBuilder reversed = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        System.out.println(reversed.toString());

    }
}
