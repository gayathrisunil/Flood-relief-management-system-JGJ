package frms;

import javax.swing.JOptionPane;

public class NGO_Controller{
   
    String name,mob,addr,stat;
    public NGO_Controller(String NGO_name, String NGO_mob, String NGO_addr, String NGO_stat){
        name = NGO_name;
        mob = NGO_mob;
        addr = NGO_addr;
        stat = NGO_stat;
    }
    
    public void process_reg(){
        //call add_to_db
        DB dbreq = new DB();
        dbreq.insert_into_ngo_reg(name, mob, addr, stat);
        
        JOptionPane.showMessageDialog(null, "Registered NGO successfully ","Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void update_stat(){
        //call to db to update 
        DB dbreq = new DB();
        dbreq.update_ngo(name, stat);
        JOptionPane.showMessageDialog(null, "Updated status" , "Success", JOptionPane.INFORMATION_MESSAGE);
    } 
    
}
