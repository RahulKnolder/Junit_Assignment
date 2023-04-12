package juint_5;

public class EmailFormatChecker {
    public static boolean isEmailValid(String email) {
        boolean isValid = true;

        // Check if the email contains only one @ symbol
        if (email.indexOf("@") == -1 || email.indexOf("@") != email.lastIndexOf("@")) {
            isValid = false;
        }

        // Check if the email starts with a letter or number
        if (!Character.isLetterOrDigit(email.charAt(0))) {
            isValid = false;
        }

        // Check if the email ends with a letter or number
        if (!Character.isLetterOrDigit(email.charAt(email.length() - 1))) {
            isValid = false;
        }

        // Check if the email contains a valid domain name
        String[] parts = email.split("@");
        if (parts.length != 2 || parts[1].indexOf(".") == -1) {
            isValid = false;
        }

        return isValid;
    }
}
