package frms;

import java.sql.*;

public class DB {
    String database_connection_string = "jdbc:postgresql://localhost:5432/postgres";
    String database_user_name = "postgres";
    String database_user_password = "1612";
    Connection conn = null;
    
    public void insert_into_db(){
        try {
            conn = DriverManager.getConnection(database_connection_string, database_user_name, database_user_password );

            System.out.println("You are successfully connected to the PostgreSQL database server.");
            String sql = "INSERT INTO reg_for_req VALUES (9663397195, 123456789123)";

            PreparedStatement statement = conn.prepareStatement(sql);
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
