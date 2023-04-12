package juint_4;

public class StringUtils {
    public static String reverse(String inputString) {
        if(inputString==null){
            inputString="";
        }
        String reversedInputStrig = "";
        for (int indexOfInputString = inputString.length() - 1; indexOfInputString >= 0; indexOfInputString--) {
            reversedInputStrig = reversedInputStrig.concat(String.valueOf(inputString.charAt(indexOfInputString)));
        }
        return reversedInputStrig;
    }

    public static boolean isEmpty(String inputString) {
        inputString=inputString.trim();
       if(inputString==null){
           return true;
       }
       else if(inputString==""){
           return true;
       }
       else {
           return false;
       }

    }

    public static boolean isPalindrome(String inputString) {
        if (inputString == null) {
            return false;
        }
        else if(inputString.trim()==""){
            return true;
        }

        int length = inputString.length();
        for (int indexofString = 0; indexofString < length / 2; indexofString++) {
            if (inputString.charAt(indexofString) != inputString.charAt(length - 1 - indexofString)) {
                return false;
            }
        }
        return true;
    }


}
