package frms;

public class DB {
    String query;
    String result;
    String[] arr_res = new String[10];
    public String get_from_db(String table, String cond, String val, String fetch){
        query = "SELECT " +fetch+ " FROM " + table + " WHERE " + cond + "= '"+ val + "';";
        ExecuteDBQ exec = new ExecuteDBQ();
        result = exec.fetch_execute(query,fetch);
        return result;
    }
    
    public String[] fetch_all(String table,int n){
        query = "SELECT * FROM " + table + ";" ;
        query.toString();
        ExecuteDBQ exec = new ExecuteDBQ();
        arr_res = exec.fetch(query,n);
        return arr_res;
    }
    
    public void insert_into_db_reg(String mobnum, String aadhar){
        query = "INSERT INTO reg_for_req VALUES ('" + mobnum + "' , '" + aadhar + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);    
    }
    
    public void insert_into_evac(String mobnum,String name, String location){
        
        query = "INSERT INTO evac_req VALUES ('" + mobnum + "' , '" + name + "' , '" + location + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query);  
    }
    
    public void insert_into_res(String mobnum,String item, String amt){
        query = "INSERT INTO resource_req VALUES ('" + mobnum + "' , '" + item + "' , '" + amt + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query); 
    }
    
    public void insert_into_donation_kind(String mob_no, String donate_to, String item, String qty){
        query = "INSERT INTO donation_kind VALUES ('" + mob_no + "' , '" + donate_to + "' , '" + item + "' , '"  + qty + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query); 
    }
    
    public void insert_into_ngo_reg(String name, String mob_no, String addr, String stat){
        query = "INSERT INTO ngo_reg VALUES ('" + name + "' , '" + mob_no + "' , '" + addr + "' , '"  + stat + "')";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query); 
    }
    
    public void update_ngo(String name, String stat){
        query = "UPDATE ngo_reg SET stat ='" + stat + "' where name = '" + name + "';" ;
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query); 
    }
    
    public void insert_into_missing(String filling_name, String filling_mob, String missing_name, String missing_mob, String last_seen, String last_loc){
        query = "INSERT INTO missing VALUES ('" + filling_name + "' , '" + filling_mob +"' , '" + missing_name + "' , '" + missing_mob + "' , '" + last_seen + "' , '" + last_loc + "') ;";
        ExecuteDBQ exec = new ExecuteDBQ();
        exec.execute_query(query); 
    }
}
