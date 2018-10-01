package ct; 
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Sql
{
public static Connection connectdb()
{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/ctlab","root","");
System.out.println("Success");
return conn;
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null,e);
return null;
   }
   }}