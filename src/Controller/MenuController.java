package Controller;

import View.ConsoleView;

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
            String choice = consoleView.getInput("Seleccione una opción: ");
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
    
    

}
