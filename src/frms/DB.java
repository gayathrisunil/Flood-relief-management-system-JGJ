package frms;

public class DB {
    String query;
    String result;
    public String get_from_db(String table, String cond, String val){
        query = "SELECT * FROM " + table + " WHERE " + cond + "= '"+ val + "';";
        ExecuteDBQ exec = new ExecuteDBQ();
        result = exec.fetch_execute(query);
        return result;
    }
    
    public void insert_into_db_reg(String mobnum, String aadhar){
        query = "INSERT INTO reg_for_req VALUES ('" + mobnum + "' , '" + aadhar + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);    
    }
    
    public void insert_into_evac(String mobnum,String name, String location){
        
        query = "INSERT INTO evac_req VALUES ('" + mobnum + "' , '" + name + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);  
    }
    
}
