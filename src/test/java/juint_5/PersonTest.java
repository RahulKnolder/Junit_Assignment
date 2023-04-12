package juint_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;

    @BeforeEach
    public void setup() {
        person = new Person();
    }


    @Test
    @DisplayName("Test getName() with null not value")
    public void testGetName_withNotNullValues_shouldReturnInput() {
        person.setName("rahul");
        assertNotNull(person.getName());
    }

    @Test
    @DisplayName("Test getName() with null value")
    public void testGetName_withNUllValues_ShouldRetrunEmptyString() {
        person.setName(null);
        assertEquals("", person.getName());
    }

    @Test
    @DisplayName("Test getName() with WhiteSpaces ")
    public void testGetName_withWhiteSpaces_shouldSetNameEmptyString() {
        person.setName("         ");
        assertEquals("", person.getName());
    }

    @Test
    @DisplayName("Test getAge() with non-null Value")
    public void test_getAge_with_nonNullValue_shouldReturnTrue() throws InvalidAgeException {
        person.setAge(56);
        assertNotNull(person.getAge());
    }

    @Test
    @DisplayName("Test getAge() with null Value")
    public void testGetAge_withNullValue_shouldReturnTrue() throws InvalidAgeException {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(null);
        });
        assertNull(person.getAge());
    }


    @Test
    @DisplayName("Test getEmail() with not null values")
    public void testGetEmail_withNonNullValue_shouldReturnTrue() {
        person.setEmail("john.doe@example.com");
        assertNotNull(person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with  null values")
    public void testGetEmail_withNullValue_shouldSetEmailToEmptyString() {
        person.setEmail(null);
        String email = person.getEmail();
        assertEquals("", email);

    }

    @Test
    @DisplayName("Test getEmail() with  valid values")
    public void testGetEmail_WithValidValue_shouldSetEmailToValid() {
        person.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with invalid values")
    public void testGetEmail_withInvalidInput_shouldSetEmailToEmptyString() {
        person.setEmail("rahul@@gmai.com");
        assertEquals("", person.getEmail());
    }

    @Test
    @DisplayName("Test getEmail() with whiteSpace")
    public void testGetEmail_withWhiteSpaces_shouldSetEmailToEmptyString() {
        person.setEmail("   ");
        assertEquals("", person.getEmail());
    }


    @Test
    @DisplayName("Test SetAge() with negative values")
    public void testSetAge_withNegativeValues_shouldThrowExceptiion() {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(-10);
        });
        assertEquals("age cannot be null or in negative", e.getMessage());
    }


    @Test
    @DisplayName("Test setAge() with Zero values")
    public void testSetAge_withZero_shouldThrowExceptiion() throws InvalidAgeException {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(0);
        });
        assertEquals("age cannot be less than 18", e.getMessage());
    }


}
