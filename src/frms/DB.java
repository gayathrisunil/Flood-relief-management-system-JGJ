package frms;

import java.sql.*;

public class DB {
    String query;
    
    public void get_from_db(String table, String cond, String val){
        query = "SELECT * FROM " + table + " WHERE " + cond + "= '"+ val + "';";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);
    }
    
    public void insert_into_db_reg(String mobnum, String aadhar){
        query = "INSERT INTO reg_for_req VALUES ('" + mobnum + "' , '" + aadhar + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);    
    }
    
}
