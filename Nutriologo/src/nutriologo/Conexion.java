
package nutriologo;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * @author Alejandro
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/"
            + "patron?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    public static Connection getConnection(){
        Connection connection = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch(Exception e){
            System.out.println(e);
        }
        return connection;
    }
}
