import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main extends JFrame {

    public static void main(String[] args) throws IOException {
        CRUDHandler crudHandler = new CRUDHandler();
        MainMenu mainMenu = new MainMenu();
        crudHandler.getSomeStringByIndex(1);
        //Alta alta = new Alta("Alta", "Registra't");
        //ClienteUpdate clienteUpdate = new ClienteUpdate("Actualitza", "Actualització de dades");
    }
}
