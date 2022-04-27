package frms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteDBQ {
    String database_conn_string = "jdbc:postgresql://localhost:5432/postgres";
    String database_user_name = "postgres";
    String database_user_password = "1612";
    Connection conn = null;
    
    public void execute_query(String stmt){
        
        String query = stmt;
        try {
            conn= DriverManager.getConnection(database_conn_string, database_user_name, database_user_password);
            //System.out.println("You are successfully connected to the PostgreSQL database server.");
            
            PreparedStatement statement = conn.prepareStatement(query);
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0){
                System.out.println("A new entry was inserted successfully!");
            }
        } 
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
            
    }
}
