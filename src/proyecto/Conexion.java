
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
      
       Connection connection = null;
        try {
            // Define the database URL, username, and password
        String url = "jdbc:mysql://proyectotdb.c5osr7na0iiv.us-east-1.rds.amazonaws.com";
        String user = "admin";
        String password = "Pedifart15";

            // Establish the database connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
      

        
        
}


 
 
    

