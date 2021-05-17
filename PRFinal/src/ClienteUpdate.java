import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClienteUpdate extends Alta{

    ClienteUpdate(){
        initComponents();
        stitchEverything();
        initFrame();
    }

    ClienteUpdate(String s, String t) {
        super(s,t);
        initComponents(s,t);
        stitchEverything();
        initFrame();
    }

    @Override
    public void addEvents(){
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


}
