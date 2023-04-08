package juint_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testReverse() {

        //testing with an nonempty string
        String result = StringUtils.reverse("abcdefg");
        assertEquals("gfedcba", result);


        //tesing with an empty string
        result = StringUtils.reverse("");
        assertEquals("", result);


        //tests the case where the input string has only one character.
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);


        // tests the case where the input string is null
        String input_2 = null;
        String expectedOutput_2 = ""; // Or, we could throw an exception
        String actualOutput_2 = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);




        // tests the case where the input string contains non-alphabetic characters.
        String input_3 = "hello, world!";
        String expectedOutput_3 = "!dlrow ,olleh";
        String actualOutput_3 = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);


        //tests the case where the input string contains non-ASCII characters.
        String input_4 = "héllo wørld";
        String expectedOutput_4 = "dlrøw olléh";
        String actualOutput_4 = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);


        // tests the case where the input string contains whitespace characters.
        String input_5 = "hello world";
        String expectedOutput_5 = "dlrow olleh";
        String actualOutput_5 = StringUtils.reverse(input);
       assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testIsEmpty() {
        //testing with an empty string
        assertTrue(StringUtils.isEmpty(""));

        //testing with a string value
        assertFalse(StringUtils.isEmpty("abc"));

        //testing with white spages
       assertTrue(StringUtils.isEmpty("                "));

    }

    @Test
    public void testIsPalindrome() {

        // Test with palindrome string
        assertTrue(StringUtils.isPalindrome("racecar"));

        // Test with non-palindrome string
        assertFalse(StringUtils.isPalindrome("hello"));

        // Test with empty string
        assertTrue(StringUtils.isPalindrome(""));

        // Test with single-character string
        assertTrue(StringUtils.isPalindrome("a"));

        // Test with a null value string
        assertFalse(StringUtils.isPalindrome(null));

        //testing with a with white space  value
        assertTrue(StringUtils.isPalindrome("                     "));


    }

}
