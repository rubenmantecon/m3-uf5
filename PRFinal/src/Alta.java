import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Alta extends JFrame implements Ventanita {
    JPanel panel;
    Dimension field;
    JLabel nom, dni, username, password;
    JTextField tNom, tDNI, tUsername;
    JPasswordField pPassword;
    JButton register;

    Alta() {
        initComponents();
        stitchEverything();
        initFrame();
    }

    Alta(String s, String t) {
        initComponents(s, t);
        stitchEverything();
        initFrame();
    }



    public void initComponents() {
        panel = new JPanel();
        field = new Dimension(80, 20);
        nom = new JLabel("Nom");
        tNom = new JTextField();
        tNom.setPreferredSize(field);
        dni = new JLabel("DNI");
        tDNI = new JTextField();
        tDNI.setPreferredSize(field);
        username = new JLabel("Usuari");
        tUsername = new JTextField();
        tUsername.setPreferredSize(field);
        password = new JLabel("Contrasenya");
        pPassword = new JPasswordField();
        pPassword.setPreferredSize(field);
        register = new JButton("Registra't");
        setTitle("Alta");
        addEvents();
    }
    public void initComponents(String s, String t) {
        panel = new JPanel();
        field = new Dimension(60, 20);
        nom = new JLabel("Nom");
        tNom = new JTextField();
        tNom.setPreferredSize(field);
        dni = new JLabel("DNI");
        tDNI = new JTextField();
        tDNI.setPreferredSize(field);
        username = new JLabel("Usuari");
        tUsername = new JTextField();
        tUsername.setPreferredSize(field);
        password = new JLabel("Contrasenya");
        pPassword = new JPasswordField();
        pPassword.setPreferredSize(field);
        register = new JButton(s);
        setTitle(t);


        addEvents();
    }

    @Override
    public void addEvents() {
        register.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        /*Inserta los datos en el txt.
                         * Tendrá que escanear todos los campos, y si están bien (oportunidad para excepción custom),
                         * y si no hay duplicados (otra excepción custom), entonces proceder a insertar en el fichero. En la inserción
                         * */
                    }
                }
        );
    }


    @Override
    public void stitchEverything() {
        panel.add(nom);
        panel.add(tNom);
        panel.add(dni);
        panel.add(tDNI);
        panel.add(username);
        panel.add(tUsername);
        panel.add(password);
        panel.add(pPassword);
        panel.add(register);

    }

    @Override
    public void initFrame() {
        repaint();
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
}


