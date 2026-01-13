package dsa.numbers;

public class CheckArmstrong {

    public boolean result(int num, int length) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, length);
            num = num / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        CheckArmstrong ca = new CheckArmstrong();
        int num = 153;
        String snum= String.valueOf(num);
        int lnum= snum.length();
        System.out.println(ca.result(num, lnum));
    }
}
