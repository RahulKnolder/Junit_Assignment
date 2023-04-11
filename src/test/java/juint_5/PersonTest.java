package juint_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;

    @BeforeEach
    public void setup() {
        person = new Person();
    }

    @Test
    public void test_getName_with_notNullValues() {
        //test getname with not null values
        person.setName("rahul");
        assertNotNull(person.getName());
    }

    @Test
    public void testGetName_with_nullValue() {
        // Test the getter method for a null value
        person.setName(null);
        assertEquals("", person.getName());

    }

    @Test
    public void test_getName_with_WhiteSpaces() {
        //testing getname with white spaces
        person.setName("         ");
        assertEquals("", person.getName());
    }

    @Test
    public void test_getAge_with_nonNullValue() throws InvalidAgeException {
        // Test the getter method for a non-null value
        person.setAge(56);
        assertNotNull(person.getAge());
    }

    @Test
    public void test_getAge_with_nullValue() throws InvalidAgeException {
        // Test the getter method for a null value
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(null);
        });
        assertNull(person.getAge());
    }


    @Test
    public void test_getEmail_with_nonNullValue() {
        // Test the getEmail() method for a non-null value
        person.setEmail("john.doe@example.com");
        assertNotNull(person.getEmail());
    }

    @Test
    public void test_getEmail_with_nullValue() {
        // Test the getEmail() method for a null value
        person.setEmail(null);
        String email = person.getEmail();
        assertEquals("", email);

    }

    @Test
    public void test_getEmail_with_validValue() {
        //test for a valid value
        person.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", person.getEmail());
    }

    @Test
    public void test_getEmail_with_invalidInput() {
        //testing with invalidInput
        person.setEmail("rahul@@gmai.com");
        assertEquals("", person.getEmail());
    }

    @Test
    public void test_getEmail_with_whiteSpaces() {
        //for white spaces
        person.setEmail("   ");
        assertEquals("", person.getEmail());
    }

    @Test
    public void test_age_with_negative_values() {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(-10);
        });
        assertEquals("age cannot be null or in negative", e.getMessage());
    }


    @Test
    public void test_setAge_with_zero() throws InvalidAgeException {
        //testing age with zero
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(0);
        });
        assertEquals("age cannot be less than 18", e.getMessage());
    }


}
