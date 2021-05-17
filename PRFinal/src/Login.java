import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame implements Ventanita {
    JPanel panel;
    Dimension field;
    JLabel user, password;
    JTextField userField;
    JPasswordField passwordField;
    JButton login;

    Login(){
        initComponents();
        stitchEverything();
        initFrame();

    }

    @Override
    public void initComponents() {
        panel = new JPanel();
        field = new Dimension(60, 20);
        user = new JLabel("Usuari");
        userField = new JTextField();
        password = new JLabel("Contrasenya");
        passwordField = new JPasswordField();
        login = new JButton("Entra");

        addEvents();
    }

    @Override
    public void addEvents() {
        login.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        /*Checkeo de correctitud va aquí. Excepción personalizada también. Cuando se hace login se
                        * cierra la ventana, así que toda esta clase es en realidad un JOptionPane? Una vez se ha hecho login, tiene que quedar
                        * registrado de alguna manera a nivel global de la aplicación que el usuario está logeado y
                        * que ahora toda la aplicación la estamos viendo como user y no como visitante..?
                        * */

                    }
                }
        );
    }

    @Override
    public void stitchEverything() {
        panel.add(user);
        panel.add(userField);
        panel.add(password);
        panel.add(passwordField);
        panel.add(login);
    }

    @Override
    public void initFrame() {
        repaint();
        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setTitle("Login");
        setVisible(true);
    }
}
