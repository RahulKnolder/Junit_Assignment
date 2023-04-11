package juint_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testReverse_non_empty_String() {
        //testing with an nonempty string
        String result = StringUtils.reverse("abcdefg");
        assertEquals("gfedcba", result);
    }

    @Test
    public void test_reverse_with_empty_string() {
        //tesing with an empty string
        String result = StringUtils.reverse("");
        assertEquals("", result);
    }

    @Test
    public void test_reverse_with_one_character() {
        //tests the case where the input string has only one character.
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void test_reverse_with_null() {
        // tests the case where the input string is null
        String input = null;
        String expectedOutput = ""; // Or, we could throw an exception
        String actualOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void test_reverse_with_non_alphabetic_characters() {
        // tests the case where the input string contains non-alphabetic characters.
        String input = "hello, world!";
        String actualOutput = "!dlrow ,olleh";
        String expectedOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testReverse_nonASCII_values() {

        //tests the case where the input string contains non-ASCII characters.
        String input = "héllo wørld";
        String actualOutput = "dlrøw olléh";
        String expectedOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testReverse_with_whitespace() {
        // tests the case where the input string contains whitespace characters.
        String input = "hello world";
        String actualOutput = "dlrow olleh";
        String expectedOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testIsEmpty_with_empty_String() {
        //testing with an empty string
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmpty_with_non_empty_String() {
        //testing with a string value
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsEmpty_with__whiteSpaces() {
        //testing with white spaces
        assertTrue(StringUtils.isEmpty("                "));
    }

    @Test
    public void testIsPalindrome_with_palindrome_String() {
        // Test with palindrome string
        assertTrue(StringUtils.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindrome_with_nonPalindrome_String() {
        // Test with non-palindrome string
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_with_empty_String() {
        // Test with empty string
        assertTrue(StringUtils.isPalindrome(""));
    }


    @Test
    public void testIsPalindrome_with_single_character() {

        // Test with single-character string
        assertTrue(StringUtils.isPalindrome("a"));
    }

    @Test
    public void testIsPalindrome_with_null_Value() {
        // Test with a null value string
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testIsPalindrome_with_xwhite_Space() {
        //testing with a with white space  value
        assertTrue(StringUtils.isPalindrome("                     "));
    }

}


