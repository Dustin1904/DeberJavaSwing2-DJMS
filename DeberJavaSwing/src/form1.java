import javax.swing.*;
import java.awt.*;

public class form1 {
    JPanel Pantalla;
    private JLabel Img;
    private JButton dustinButton;
    private JButton jesyButton;
    private JButton johnButton;
    private JButton nayeliButton;
    private JButton alejandroButton;

    public form1(){
        Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
        int ancho = 1000;
        int alto = (int) screensize.getHeight();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("Fondo.jpg").getImage().getScaledInstance(ancho,alto, Image.SCALE_SMOOTH));
        Img.setIcon(imageIcon);
    }
}

