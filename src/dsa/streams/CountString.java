package dsa.streams;

public class CountString {
    public static void main(String[] args) {

        String str = "Tanmay";

        long count = str.chars().count();

        System.out.println(count);
    }
}
