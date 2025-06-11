package Controller;

import java.util.LinkedList;

import model.Contact;

public class ContactManager {
    private LinkedList<Contact> contacts;

    public ContactManager(){
        contacts = new LinkedList<>();
    }
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    public Contact findContact(String name){
        for (Contact contact: contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }
    public void deleteContact(String name){
        Contact toDelete = findContact(name);
        if(toDelete != null){
            contacts.remove(toDelete);
        }
    }
    public void printList(){
        if (contacts.isEmpty()){
            System.out.println("No se registro ningun contacto");

        }
        else {
            for (Contact contact: contacts){
                System.out.print(contact);
            }
        }
    }

}
