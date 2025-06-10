import Controller.ContactManager;
import Controller.MenuController;
import View.ConsoleView;
public class App {
    public static void main(String[] args) throws Exception {
        ContactManager manager = new ContactManager();
        ConsoleView view = new ConsoleView();
        MenuController controller = new MenuController(manager, view);
        controller.showMenu();

    }
}
