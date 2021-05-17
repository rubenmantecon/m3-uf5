import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class DibujandoFrame {
    public static void main(String[] args) {
        new Ventana();
    }
}

class Ventana extends JFrame {
    JButton limpiar;

    Ventana() {
        initComponent();
        initJFrame();
        this.addMouseMotionListener(
                new MouseMotionAdapter() {
                    @Override
                    public void mouseMoved(MouseEvent e) {
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
                        //int seleccion = JOptionPane.showOptionDialog(rootPane, "Desea liarla parda?", "A BORRAR",
                        // JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, "No");
                        //String texto = JOptionPane.showInputDialog(rootPane, "Escriu el nom: ", "DATOS",
                        // JOptionPane.INFORMATION_MESSAGE);
                        Object texto = JOptionPane.showInputDialog(rootPane, "Escriu el nom: ", "DATOS",
                                JOptionPane.INFORMATION_MESSAGE, null,
                                new Object[] {"AWS1", "AWS2", "AMS"}, "AWS2");

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
        /*@Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D)g; {

                g2D.setColor(Color.red);
                g2D.setStroke(new BasicStroke(10));

                 g2D.drawLine(100, 100, 150, 150);
                g2D.drawRoundRect(160, 160, 200, 300, 10, 10);

                Toolkit pantalla = Toolkit.getDefaultToolkit();
                Image imagen = pantalla.getImage("ponlo aquí perro");
                g2D.drawImage(imagen, 100, 100, this);

                GradientPaint p = new GradientPaint(150, 170, Color.BLUE, 170, 190, Color.RED);
                g2D.setPaint(p);
                g2D.fillRect(150, 170, 200, 300);

            }


        }*/
    }
}

