import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class form2 {
    private JTextField textUser;
    private JPasswordField passwd;
    JPanel Validacion;
    private JButton Ingreso;
    private JTextPane descripcion;

    public form2(){
        String dbURL="jdbc:mysql://localhost:3306/deberjavaswing";
        String dbuserName="root";
        String dbpassword="Tsuki1904";

        String usuario=textUser.getText();
        String contraseña=new String(passwd.getPassword());
        Ingreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    java.sql.Connection connection=null;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(dbURL,dbuserName, dbpassword);
                    Statement statement;
                    statement=connection.createStatement();
                    java.sql.ResultSet resultset;

                    char[] xd = passwd.getPassword();
                    String xd2 = new String(xd);
                    resultset=statement.executeQuery("select * from amigos where Usuario='"+textUser.getText()+"'"+
                            "and Contraseña='"+xd2+"'");

                    if (resultset.next()){
                        String desc = resultset.getString("Descripcion");
                        descripcion.setText(desc);
                    }else{
                        descripcion.setText("Credenciales Incorrectas");
                    }




                }catch (Exception exception){
                    System.out.println(exception);
                }

            }
        });
    }
}
