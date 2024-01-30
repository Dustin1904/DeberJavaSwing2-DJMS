import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;
public class form1 {
    JPanel Pantalla;
    private JLabel Img;
    private JButton dustinButton;
    private JButton jesyButton;
    private JButton johnButton;
    private JButton nayeliButton;
    private JButton alejandroButton;

    public form1(){
        String dbURL="jdbc:mysql://localhost:3306/deberjavaswing";
        String dbuserName="root";
        String dbpassword="Tsuki1904";

        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = 1000;
        int alto = (int) screensize.getHeight();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("Fondo.jpg").getImage().getScaledInstance(ancho,alto, Image.SCALE_SMOOTH));
        Img.setIcon(imageIcon);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Credenciales");
                frame2.setContentPane(new form2().Validacion);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.pack();
                frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame2.setVisible(true);
            }
        };
        dustinButton.addActionListener(listener);
        jesyButton.addActionListener(listener);
        johnButton.addActionListener(listener);
        nayeliButton.addActionListener(listener);
        alejandroButton.addActionListener(listener);
    }
}

