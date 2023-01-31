import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class conexion {
    public conexion() {
        try {
// Se registra el Driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            Connection conexion = DriverManager.getConnection (
                    "jdbc:mysql://localhost/test","root", "jpzp");

            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            ResultSet rs = s.executeQuery ("select * from estudiantes");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                System.out.println (rs.getString ("nombre") + " " + rs.getString (2));
            }

            // Se cierra la conexión con la base de datos.
            conexion.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}