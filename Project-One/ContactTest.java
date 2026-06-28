package com.taskapp.Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {
    @Test
    public void testContactConstructorSuccess() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testContactConstructorFailures() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "Address"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "Address"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "TooLongFirstName", "Doe", "1234567890", "Address"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("123", "John", "Doe", "12345", "Address"));
    }
}