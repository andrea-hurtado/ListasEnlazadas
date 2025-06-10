package View;
import java.util.Scanner;
public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("-MENU-");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Ver todos los contactos");
        System.out.println("5. Salir");
    }
    public String getInput(String mensaje){
        System.out.print(mensaje);
        return scanner .nextLine();
    }
    public void showMessage(String mensaje){
        System.out.println(mensaje);
    }

}
