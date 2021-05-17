import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Arrays;

public class MainMenu extends JFrame implements Ventanita{
    JPanel panel;
    JButton alta, cliente, listado, buscar, salir;

    MainMenu(){
        initComponents();
        stitchEverything();
        initFrame();
    }
    @Override
    public void initComponents() {
        panel = new JPanel();
        alta = new JButton("Alta");
        cliente = new JButton("Cliente");
        listado = new JButton("Listado");
        buscar = new JButton("Buscar");
        salir = new JButton("Salir");

        addEvents();
    }

    @Override
    public void addEvents(){
        alta.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        spawnAltaPanel();
                        //Alta altaUser = new Alta();
                    }
                }

        );
        cliente.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //abrir ventana de login de usuario. También podría ser un JOPtionPane que cuando
                        //se exitoso, entonces abra la ventana de MainCliente
                    }
                }

        );
        listado.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //abrir ventana de listado de users, con JLISt o ComboBox
                    }
                }

        );
        buscar.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //abrir ventana de buscar
                    }
                }

        );

        salir.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        dispose();
                    }
                }
        );


    }
    @Override
    public void stitchEverything(){
        panel.add(alta);
        panel.add(cliente);
        panel.add(listado);
        panel.add(buscar);
        panel.add(salir);
    }



    @Override
    public void initFrame() {
        repaint();
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Menú");
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    public void spawnAltaPanel(){
        String[] data = new String[7];
        JPanel myPanel = new JPanel();
        JLabel lfield1 = new JLabel("Nom");
        JLabel lfield2 = new JLabel("DNI");
        JLabel lfield3 = new JLabel("Usuari");
        JLabel lfield4 = new JLabel("Contrasenya");

        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);
        JTextField field3 = new JTextField(10);
        JPasswordField field4 = new JPasswordField(10);

        myPanel.add(lfield1);
        myPanel.add(field1);
        myPanel.add(lfield2);
        myPanel.add(field2);
        myPanel.add(lfield3);
        myPanel.add(field3);
        myPanel.add(lfield4);
        myPanel.add(field4);

        try {
            int result = JOptionPane.showInternalConfirmDialog(null, myPanel,
                    "Registra un nou usuari", JOptionPane.OK_CANCEL_OPTION);
            if (result == 0) {
                if (field1.getText().equals("") || field2.getText().equals("")
                        || field3.getText().equals("") || field4.getPassword().length == 0) {
                    //could throw an exception here, and then show the JOPtionPane as a catch
                    int warning = JOptionPane.showOptionDialog(myPanel, "Algún dels camps està buit. Repeteix",
                            "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE,
                            null, new Object[]{"OK"}, "OK");
                } else {
                    String field1Value = field1.getText();
                    String field2Value = field2.getText();
                    String field3Value = field3.getText();
                    String field4ValueString = Arrays.toString(field4.getPassword());

                    //needs rework
                    //new CRUDHandler().insertData(new String[]{field1Value, field2Value, field3Value, field4ValueString});

                }


                //Aquí hay que insertar esto en un array proporcionado por el DBHandler, y luego meterlo
                // en el fichero

            }
        } catch (NumberFormatException altaexception) {
            System.out.println("Maldito gilipollas");
        }
    }



}


