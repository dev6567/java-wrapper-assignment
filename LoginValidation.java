
public class LoginValidation {
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] tests = {"20", "abc", "17"};
        for (String t : tests) {
            System.out.println("Age " + t + " valid? " + isValidAge(t));
        }
    }
}
