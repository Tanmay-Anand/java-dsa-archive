package dsa.recursion;

public class CheckPalindrome {

    public boolean meth(int i, String s) {
        if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return meth(i + 1, s);
    }

    public static void main(String[] args) {
        String s = "madam";
        CheckPalindrome cp = new CheckPalindrome();
        System.out.print(cp.meth(0, s));
    }
}
