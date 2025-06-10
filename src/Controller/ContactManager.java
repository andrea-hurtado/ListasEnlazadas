package Controller;

import java.util.LinkedList;

public class ContactManager {
    private LinkedList<Contact<String,String>> contacts;
    public ContactManager(){
        contacts = new LinkedList<>();
    }
    public void addContact(Contact<String,String> contact){
        contacts.add(contact);
    }
    public Contact<String,String> findContact(String name){
        for (Contact<String,String> contact: contact){
            if (contact.getName(),equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }
    public void deleteContact(String name){
        Contact<String,String> toDelete = findContactByName(name);
        if(toDelete != null){
            contacts.remove(toDelete);
        }
    }
    public void printList(){
        if (contacts.isEmpty()){
            System.out.println("No se registro ningun contacto");

        }
        else {
            for (Contact<String,String> contact: contacts){
                System.out.print(contact);
            }
        }
    }

}
