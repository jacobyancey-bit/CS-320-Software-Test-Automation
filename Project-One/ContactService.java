package com.taskapp.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            return false;
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    public boolean deleteContact(String contactId) {
        if (contacts.containsKey(contactId)) {
            contacts.remove(contactId);
            return true;
        }
        return false;
    }

    public boolean updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            return false;
        }
        if (firstName != null) contact.setFirstName(firstName);
        if (lastName != null) contact.setLastName(lastName);
        if (phone != null) contact.setPhone(phone);
        if (address != null) contact.setAddress(address);
        return true;
    }

    protected Map<String, Contact> getContacts() { return contacts; }
}