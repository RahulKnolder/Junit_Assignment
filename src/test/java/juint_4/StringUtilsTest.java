package juint_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testReverse_withNonEmptyString_shouldReturnReverseString() {
        String result = StringUtils.reverse("abcdefg");
        assertEquals("gfedcba", result);
    }

    @Test
    public void testReverse_withEmptyString_ShouldReturnEmptyString() {
        String result = StringUtils.reverse("");
        assertEquals("", result);
    }

    @Test
    public void testReverse_withOneCharacter_ShouldReturnInput() {
        String input = "a";
        String expectedOutput = "a";
        String actualOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverse_withNull_ShouldReturnEmptyString() {
        // tests the case where the input string is null
        String input = null;
        String expectedOutput = ""; // Or, we could throw an exception
        String actualOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testReverse_withNonAlphabeticCharacters_SholdReturnReverseString() {
        String input = "hello, world!";
        String actualOutput = "!dlrow ,olleh";
        String expectedOutput = StringUtils.reverse(input);
        assertEquals(expectedOutput, actualOutput);

    }


    @Test
    public void testIsEmpty_withEmptyString_ShouldReturnTrue() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmpty_withNonEmptyString_ShouldReturnTrue() {
        assertFalse(StringUtils.isEmpty("abc"));
    }

    @Test
    public void testIsEmpty_withWhiteSpaces_ShouldReturnTrue() {
        assertTrue(StringUtils.isEmpty("                "));
    }

    @Test
    public void testIsPalindrome_withPalindromeString_shouldReturnTrue() {
        assertTrue(StringUtils.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindrome_withNonPalindromeString_shouldReturnTrue() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_withEmptyString_shouldReturnTrue() {
        assertTrue(StringUtils.isPalindrome(""));
    }


    @Test
    public void testIsPalindrome_withSingleCharacter_shouldReturnTrue() {
        assertTrue(StringUtils.isPalindrome("a"));
    }

    @Test
    public void testIsPalindrome_withNullValue_shouldReturnTrue() {
        assertFalse(StringUtils.isPalindrome(null));
    }

    @Test
    public void testIsPalindrome_withWhiteSpace_shouldReturnTrue() {
        assertTrue(StringUtils.isPalindrome("                     "));
    }

}


