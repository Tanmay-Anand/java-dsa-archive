package dsa.string;

public class EmailValidation {
    public static boolean isValidEmail(String email) {

        if (email == null || email.isEmpty()) {
            return false;
        }

        // spaces allowed nahi
        if (email.contains(" ")) {
            return false;
        }

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        // exactly ek @ hona chahiye
        if (atIndex == -1 || atIndex != lastAtIndex) {
            return false;
        }

        // @ first ya last position pe nahi hona chahiye
        if (atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }

        int dotIndex = email.indexOf('.', atIndex);

        // @ ke baad dot hona chahiye
        if (dotIndex == -1) {
            return false;
        }

        // dot last character nahi hona chahiye
        if (dotIndex == email.length() - 1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@gmail.com"));     // true
        System.out.println(isValidEmail("test@gmail"));         // false
        System.out.println(isValidEmail("@gmail.com"));         // false
        System.out.println(isValidEmail("test@.com"));          // false
        System.out.println(isValidEmail("test@@gmail.com"));    // false
    }
}
