import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checkboxes extends JFrame {
    //Atributos
    JPanel checkboxes;
    JCheckBox color, negreta, cursiva, gran;
    JPanel panel;
    JLabel etiqueta;
    Font font = new Font("Default", Font.PLAIN, 13);


    //Constructor
    Checkboxes() {
        initComponents();
        initFrame();
    }

    public void initComponents() {
        checkboxes = new JPanel();
        checkboxes.setPreferredSize(new Dimension(100, 200));
        panel = new JPanel();
        etiqueta = new JLabel("Jugant amb checkboxes", SwingConstants.CENTER);
        etiqueta.setFont(new Font("Default", Font.PLAIN, 13));
        etiqueta.setPreferredSize(new Dimension(200, 100));
        color = new JCheckBox("color", false);
        negreta = new JCheckBox("negreta", false);
        cursiva = new JCheckBox("cursiva", false);
        gran = new JCheckBox("gran", false);
        etiqueta.setFont(font);

        color.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED){
                            panel.setBackground(Color.RED);
                        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                            panel.setBackground(null);
                        }

                    }
                }
        );

        negreta.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED){
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.BOLD));
                        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.PLAIN));
                        }

                    }
                }
        );
        cursiva.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED){
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.ITALIC));


                        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.PLAIN));
                        }

                    }
                }
        );
        gran.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        if (e.getStateChange() == ItemEvent.SELECTED){
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.PLAIN, 20));
                        } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                            etiqueta.setFont(etiqueta.getFont().deriveFont(Font.PLAIN, 13));
                        }

                    }
                }
        );


        checkboxes.add(color);
        checkboxes.add(negreta);
        checkboxes.add(cursiva);
        checkboxes.add(gran);

        panel.add(etiqueta);
    }

    public void initFrame() {
        //Composición de los elementos en la ventana final
        add(checkboxes, BorderLayout.EAST);
        add(panel, BorderLayout.CENTER);
        setTitle("Jugant amb checkboxes");
        setPreferredSize(new Dimension(400, 150));
        pack();
        setVisible(true);

    }


}
