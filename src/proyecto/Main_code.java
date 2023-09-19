/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author karin
 */
public class Main_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://proyectotdb.c5osr7na0iiv.us-east-1.rds.amazonaws.com";
        String user = "admin";
        String password = "Pedifart15";

        
      
        try {
            // Initialize the connection
            Connection connection = DriverManager.getConnection(url, user, password);

            // Check if the connection is successful
            if (connection != null) {
                System.out.println("Connected to the database!");
                connection.close(); // Close the connection when done
            } else {
                System.out.println("Failed to connect to the database!");
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        LOgin v = new LOgin();
        v.setVisible(true);
    }
    
}
