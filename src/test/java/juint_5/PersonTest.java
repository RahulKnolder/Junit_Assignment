package juint_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    Person person;

    @BeforeEach
    public void createInstance() {
        person = new Person();
    }

    @Test
    public void testGetName() {
        //test getname with not null values
        person.setName("rahul");
        assertNotNull(person.getName());

        // Test the getter method for a null value
        person.setName(null);
        assertEquals("", person.getName());

        //testing getname with white spaces
        person.setName("         ");
        assertEquals("", person.getName());
    }


    @Test
    public void testGetAge() throws InvalidAgeException {
        // Test the getter method for a non-null value
        person.setAge(56);
        assertNotNull(person.getAge());

        // Test the getter method for a null value
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(null);
        });
        assertNotNull(person.getAge());
    }


    @Test
    public void testGetEmail() {
        // Test the getEmail() method for a non-null value
        person.setEmail("john.doe@example.com");
        assertNotNull(person.getEmail());

        // Test the getEmail() method for a null value
        person.setEmail(null);
        String email = person.getEmail();
        assertEquals("", email);


        //test for a valid value
        person.setEmail("john.doe@example.com");
        assertEquals("john.doe@example.com", person.getEmail());

        //testing with invalidInput
        person.setEmail("rahul@@gmai.com");
        assertEquals("",person.getEmail());

        //for white spaces
        person.setEmail("   ");
        assertEquals("", person.getEmail());
    }

    @Test
    public void testNegativeAge() {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(-10);
        });
        assertEquals("age cannot be null or in negative", e.getMessage());
    }


    @Test
    public void testSetAgeZero() throws InvalidAgeException {
        //testing age with zero
        InvalidAgeException e = assertThrows(InvalidAgeException.class, () -> {
            person.setAge(0);
        });
        assertEquals("age cannot be less than 18", e.getMessage());
    }


}
