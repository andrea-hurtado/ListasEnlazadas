package Controller;

import View.ConsoleView;
import model.Contact;

public class MenuController {

    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }
    
    public void showMenu(){
        
        boolean running = true;

        while(running){
            consoleView.displayMenu();
            String choice = consoleView.getInput("Seleccione una opción");
            switch (choice) {
                case "1":
                addContact();
                    
                    break;
                case "2":
                findContact();
                    break;

                case "3":
                deleteContact();
                    break;

                case "4": 
                printList();
                    break;
                
                case "5":
                running = false;
                consoleView.showMessage("Adios!");
                break;

                default:
                consoleView.showMessage("Esa opción no existe, intente nuevamente.");
            
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto: ");
        String phone = consoleView.getInput("Ingrese el teléfono del contacto: ");
        Contact contact = new Contact(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Se agregó correctamente!");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a buscar: ");
        Contact foundContact = contactManager.findContact(name);
        if (foundContact != null) {
            consoleView.showMessage("Contacto encontrado: " + foundContact);
        } else {
            consoleView.showMessage("Contacto no encontrado");
        }
    }

     private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        contactManager.deleteContact(name);
        consoleView.showMessage("El contacto eliminado si existía");
    }

    private void printList() {
        contactManager.printList();
    }
    
}
 