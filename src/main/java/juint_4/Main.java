package juint_4;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.reverse("Rahul"));

        //isempty check
        if (StringUtils.isEmpty(""))
            System.out.println("string is empty");
        else
            System.out.println("not empty");


        //palindrome checkk
        if (StringUtils.isPalindrome("saas"))
            System.out.println("string is palindrom");
        else
            System.out.println("not a plaindrom");
    }

}
