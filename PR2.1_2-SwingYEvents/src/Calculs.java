import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculs extends JFrame {
    //Atributos
    JPanel panel;
    JLabel num1;
    JTextField num1Field;
    JLabel num2;
    JTextField num2Field;
    JLabel resultat;
    JTextField resultatField;
    JLabel intents;
    JTextField intentsField;
    JLabel encerts;
    JTextField encertsField;
    JLabel errors;
    JTextField errorsField;
    JButton activar;
    JButton comprovar;
    JButton sortir;
    int tries = 0;
    int successes = 0;
    int failures = 0;

    //Constructor
    Calculs() {
        initComponents();
        composeWindow();
        makeComponentsListen();
        initFrame();
    }


    public void initComponents() {
        //Inicializa todo
        panel = new JPanel(new FlowLayout());
        num1 = new JLabel("Número 1");
        num1Field = new JTextField();
        num1Field.setPreferredSize(new Dimension(50, 20));
        num2 = new JLabel("Número 2");
        num2Field = new JTextField();
        num2Field.setPreferredSize(new Dimension(50, 20));
        resultat = new JLabel("Resultat");
        resultatField = new JTextField();
        resultatField.setPreferredSize(new Dimension(50, 20));
        intents = new JLabel("Intents");
        intentsField = new JTextField();
        intentsField.setPreferredSize(new Dimension(50, 20));
        encerts = new JLabel("Encerts");
        encertsField = new JTextField();
        encertsField.setPreferredSize(new Dimension(50, 20));
        errors = new JLabel("Errors");
        errorsField = new JTextField();
        errorsField.setPreferredSize(new Dimension(50, 20));
        activar = new JButton("Activar");
        activar.setPreferredSize(new Dimension(100, 30));
        comprovar = new JButton("Comprovar");
        comprovar.setPreferredSize(new Dimension(120, 30));
        sortir = new JButton("Sortir");
        sortir.setPreferredSize(new Dimension(100, 30));
    }

    public void makeComponentsListen() {

        activar.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        tries++;
                        try {
                            int num1 = Integer.parseInt(num1Field.getText());
                            int num2 = Integer.parseInt(num2Field.getText());
                            resultatField.setText(Integer.toString(num1 + num2));
                            successes++;
                        } catch (NumberFormatException exception) {
                            int seleccion = JOptionPane.showOptionDialog(
                                    rootPane, "Sólo números, leches", "What's wrong with you?",
                                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                                    null, null, null
                            );
                            failures++;
                        }


                    }
                }
        );
        comprovar.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        intentsField.setText(Integer.toString(tries));
                        encertsField.setText(Integer.toString(successes));
                        errorsField.setText(Integer.toString(failures));
                    }
                }
        );

    }

    public void composeWindow() {
        panel.add(num1);
        panel.add(num1Field);
        panel.add(num2);
        panel.add(num2Field);
        panel.add(resultat);
        panel.add(resultatField);
        panel.add(intents);
        panel.add(intentsField);
        panel.add(encerts);
        panel.add(encertsField);
        panel.add(errors);
        panel.add(errorsField);
        panel.add(activar);
        panel.add(comprovar);
        panel.add(sortir);

        add(panel);
    }

    public void initFrame() {
        setTitle("Por qué es todo tan redundante");
        setPreferredSize(new Dimension(400, 150));
        pack();
        setVisible(true);
    }
}
