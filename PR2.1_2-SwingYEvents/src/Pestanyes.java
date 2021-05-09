import java.awt.*;
import javax.swing.*;

public class Pestanyes extends JFrame {
    //Atributos
    JPanel tab1, tab2, tab3;
    JTabbedPane tabs;
    JTextField textField;
    JPasswordField passwordField;
    JTextArea textAreaField;
    JLabel text, password, textArea, labelField, label;
    JList list;
    JRadioButton rb;
    JComboBox cb;
    String listData[] = {"Una", "lista", "implementada"};

    //Constructor
    Pestanyes(){
        //Inicialización
        tabs = new JTabbedPane();
        tab1 = new JPanel();
        tab2 = new JPanel();
        tab3 = new JPanel();
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(120, 40));
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(120, 40));
        textAreaField= new JTextArea();
            textAreaField.setPreferredSize(new Dimension(120, 80));
        text = new JLabel("JTextField");
        password = new JLabel("JPasswordField");
        textArea = new JLabel("JTextArea");
        labelField = new JLabel("JLabel");
        labelField.setPreferredSize(new Dimension(50, 20));
        label = new JLabel("Text");
        list = new JList(listData);
        rb = new JRadioButton("Polsa");
        cb = new JComboBox();
        cb.addItem("Un combo");
        cb.addItem("inventat");
        cb.addItem("by yours truly");

        tab1.add(text);
        tab1.add(textField);
        tab1.add(password);
        tab1.add(passwordField);
        tab1.add(textArea);
        tab1.add(textAreaField);
        tab1.add(label);
        tab1.add(labelField);

        tab2.add(list);

        tab3.add(cb);
        tab3.add(rb);

        tabs.addTab("Pestanya 1", tab1);
        tabs.addTab("Pestanya 2", tab2);
        tabs.addTab("Pestanya 3", tab3);


        this.add(tabs);
        this.setTitle("Pestanyes");
        this.pack();
        this.setPreferredSize(new Dimension(400, 150));
        this.setVisible(true);



    }



    
}
