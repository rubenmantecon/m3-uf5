import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainCliente extends JFrame implements Ventanita {
    JPanel panel;
    JButton modificar, calcular, compra, canjeo;

    MainCliente(){
        setTitle("Menú de cliente");
        initComponents();
        stitchEverything();

    }

    @Override
    public void initComponents() {
        panel = new JPanel();
        modificar = new JButton("Modificar dades");
        calcular = new JButton("Calcular punts");
        compra = new JButton("Registra una nova compra");
        canjeo = new JButton("Bescanvia punts");

        addEvents();

    }

    @Override
    public void addEvents() {
        modificar.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //A ventana de modificación de datos
                    }
                }
        );
        calcular.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //Salta un JOptionPane que muestra las normas de cálculo, y muestra el 'saldo' de puntos actual
                        //(Ya calculado)
                    }
                }
        );
        compra.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //JOPtionPane para introducir una compra
                    }
                }
        );
        canjeo.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //JOptionPane que muestra el saldo de puntos, y al darle, de devuelve otro JOptionPane
                        //mostrando el regalo ganado
                    }
                }
        );
    }

    @Override
    public void stitchEverything() {

    }

    @Override
    public void initFrame() {

    }


}
