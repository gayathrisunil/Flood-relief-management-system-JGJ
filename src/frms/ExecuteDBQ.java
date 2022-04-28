package frms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class ExecuteDBQ {
    String database_conn_string = "jdbc:postgresql://localhost:5432/postgres";
    String database_user_name = "postgres";
    String database_user_password = "1612";
    Connection conn = null;
    
    String query;
    public void execute_query(String stmt){
        
        query = stmt;
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
    
    public String fetch_execute(String stmt, String cond){
        query = stmt;
        
        try {
            conn= DriverManager.getConnection(database_conn_string, database_user_name, database_user_password);
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
             while (rs.next()){
                //System.out.println(rs.getString(cond));
                 return rs.getString(cond);
                 
             }
            
        } 
        catch (SQLException e){
            //System.out.println(e.getMessage());
        }    
        return "";
    }
    
    public String[] fetch(String stmt, int n){
        query = stmt;
        String[] results = new String[10];
        
        try {
            conn= DriverManager.getConnection(database_conn_string, database_user_name, database_user_password);
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            int i=0;
             while (rs.next()){
                //System.out.println(rs.getString(1));
                
                String make = "";
                for(int k=1; k<=n; k++){
                    String temp = rs.getString(k) + "\t ";
                    make+= temp;
                }
                make+= "\n";
                //rs.getString(1)+ "\t  " + rs.getString(2)+ "\t   " + rs.getString(3) + "\n";
                results[i] = make;
                i= i+ 1;
             }
            return results;
        } 
        catch (SQLException e){
            System.out.println(e.getMessage());
        }    
        return results ;
    }
}
