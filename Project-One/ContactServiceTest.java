package com.taskapp.Contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    @Test
    public void testAddAndGetContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(service.addContact(contact));
        assertFalse(service.addContact(contact)); // Duplicate ID
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertTrue(service.deleteContact("1"));
        assertFalse(service.deleteContact("1")); // Already deleted
    }

    @Test
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(contact);
        assertTrue(service.updateContact("1", "Jane", "Smith", "0987654321", "321 Oak St"));
        assertEquals("Jane", service.getContacts().get("1").getFirstName());
    }
}