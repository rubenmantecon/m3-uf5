import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Second extends JFrame{
    JButton limpiar;


    Second(){
        initComponent();
        initJFrame();
        this.addMouseListener(
                new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int x = e.getX();
                        int y = e.getY();
                        Graphics g = getGraphics();
                        g.setColor(Color.GREEN);
                        g.fillOval(x, y, 6, 6);
                    }

                }
        );
        limpiar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int seleccion = JOptionPane.showOptionDialog(rootPane, "Desea liarla parda?", "A BORRAR", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
                        if (seleccion == 0){
                            repaint();
                        }
                    }
                }
        );
    }

    public void initJFrame() {
        setSize(500, 500);
        repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    public void initComponent() {
        limpiar = new JButton("Limpiar");
        add(limpiar, BorderLayout.SOUTH);
    }

}
