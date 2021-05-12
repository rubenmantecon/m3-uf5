import javax.swing.*;

public class First extends JFrame {
    //Atributos
    JButton button;
    String optionPane;
    int resultPane;

     //Contructor
    First() {
        initComponents();
    }

    public void initJFrame() {
        repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initComponents(){
        try {

            optionPane = JOptionPane.showInputDialog(rootPane, "Introduce un número",
                    "Entrada",JOptionPane.QUESTION_MESSAGE);
            if (optionPane != null) {
                double average= Math.floor(Integer.parseInt(optionPane) / 2);
                resultPane = JOptionPane.showConfirmDialog(rootPane, "El resultado es: " + average,
                        "Resultado", JOptionPane.DEFAULT_OPTION);
            }
        } catch (NumberFormatException exception){
            int seleccion = JOptionPane.showOptionDialog(
                    rootPane, "I need a number.", "You failed",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, null, null
            );
        }

    }
}

