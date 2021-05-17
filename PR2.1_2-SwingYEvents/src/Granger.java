import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Granger extends JFrame{
    JTable taula;
    JTabbedPane panel1, panel2, panel3, panel4;
    JLabel id,nombre,descripcion,dinero,puntos,nivel,buscar, buscarNombre,eliminar, eliminarNombre;
    JTextField tId, tNombre, tDescripcion, tDinero, tPuntos, tNivel, tBuscar, tEliminar;
    JButton afegir, bBuscar, bEliminar;

    public Granger() {
        String url = "jdbc:mysql://localhost/farmville?serverTimezone=UTC";
        String user="ruben";
        String password="ruben";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmnt = con.createStatement();

            taula = new JTable();
            panel1 = new JTabbedPane();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JPanel panel4 = new JPanel();

            id = new JLabel("ID:");
            tId = new JTextField(10);
            nombre = new JLabel("Nombre:");
            tNombre = new JTextField(10);
            descripcion = new JLabel("Descripcion:");
            tDescripcion = new JTextField(10);
            dinero = new JLabel("Dinero:");
            tDinero = new JTextField(10);
            puntos = new JLabel("Puntos:");
            tPuntos = new JTextField(10);
            nivel = new JLabel("Nivel:");
            tNivel = new JTextField(10);

            afegir = new JButton("Añadir");
            afegir.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                String query = "INSERT INTO granjeros (id,nombre,descripcion,dinero,puntos,nivel) values (?,?,?,?,?,?)";
                                PreparedStatement stm = con.prepareStatement(query);

                                stm.setString(1, tId.getText());
                                stm.setString(2, tNombre.getText());
                                stm.setString(3, tDescripcion.getText());
                                stm.setString(4, tDinero.getText());
                                stm.setString(5, tPuntos.getText());
                                stm.setString(6, tNivel.getText());

                                stm.executeUpdate();

                                JOptionPane.showMessageDialog(null,"Se ha podido añadir el granjero.");
                            }catch (Exception g) {
                                JOptionPane.showMessageDialog(null,"No se ha podido añadir el granjero.");
                            }
                        }
                    }
            );
            panel2.add(id);
            panel2.add(tId);
            panel2.add(nombre);
            panel2.add(tNombre);
            panel2.add(descripcion);
            panel2.add(tDescripcion);
            panel2.add(dinero);
            panel2.add(tDinero);
            panel2.add(puntos);
            panel2.add(tPuntos);
            panel2.add(nivel);
            panel2.add(tNivel);
            panel2.add(afegir);

            panel1.addTab("Añadir granjero", panel2);

            buscar = new JLabel("Buscar granjero");
            buscarNombre = new JLabel("Nombre:");
            tBuscar = new JTextField(25);

            bBuscar = new JButton("Buscar");
            bBuscar.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                Connection con;
                                con = DriverManager.getConnection(url, user, password);
                                Statement stmt = (Statement) con.createStatement();
                                String query = "Select * from granjeros where nombre='"+ tBuscar.getText()+"'";
                                ResultSet rs = stmt.executeQuery(query);

                                rs.beforeFirst();

                                while (rs.next()) {
                                    String [] nomcol = {"id","nombre","descripcion","dinero","puntos","nivel"};
                                    String [][] datos = {{String.valueOf(rs.getInt(1)),rs.getString(2),rs.getString(3),String.valueOf(rs.getInt(4)),
                                            String.valueOf(rs.getInt(5)),String.valueOf(rs.getInt(6))}};

                                    taula = new JTable(datos, nomcol);
                                };
                                JOptionPane.showMessageDialog(null, new JScrollPane(taula));
                                taula.setRowHeight(24);
                                taula.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                            }
                            catch (Exception er) {
                                JOptionPane.showMessageDialog(null,"No se ha podido encontrar el granjero.");
                            }
                        }
                    }
            );
            panel3.add(buscar);
            panel3.add(buscarNombre);
            panel3.add(tBuscar);
            panel3.add(bBuscar);
            panel1.addTab("Buscar granjero", panel3);

            eliminar = new JLabel("Eliminar granjero");
            eliminarNombre = new JLabel("Nombre:");
            tEliminar = new JTextField(25);
            bEliminar = new JButton("Eliminar");
            bEliminar.addActionListener(
                    new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            try {
                                String query ="DELETE FROM granjeros where nombre='"+ tEliminar.getText()+"'";
                                Statement stmnt = con.createStatement();
                                int rs= stmnt.executeUpdate(query);

                                if (rs>0) {
                                    JOptionPane.showMessageDialog(null,"Se a eliminado correctamente.");
                                }

                            }catch (SQLException x){
                                JOptionPane.showMessageDialog(null,"No se ha podido eliminar.");
                            }
                        }
                    }
            );
            panel4.add(eliminar);
            panel4.add(eliminarNombre);
            panel4.add(tEliminar);
            panel4.add(bEliminar);
            panel1.addTab("Eliminar granjero", panel4);

            this.add(panel1);
            setTitle("Farmville");
            setSize(500,200);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);


        }catch (ClassNotFoundException error){
            error.printStackTrace();
            System.out.println("No se ha podido cargar el driver");

        }catch (SQLException error) {
            error.printStackTrace();
            System.out.println("No se ha podido acceder a la base de datos");
        }
    }
}