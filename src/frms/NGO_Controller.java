package frms;

import javax.swing.JOptionPane;


public class NGO_Controller {
    
    NGO_Model model = new NGO_Model();
    
    String NGO_name = model.getName();
    String NGO_mob = model.getMob();
    String NGO_addr = model.getAddr();
    String NGO_stat = model.getStat();
    
    public void process_reg(){
        //call add_to_db
        JOptionPane.showMessageDialog(null, "Registered NGO successfully ","Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void update_stat(){
        
        //call to db to update 
        JOptionPane.showMessageDialog(null, "Updated status" , "Success", JOptionPane.INFORMATION_MESSAGE);
    } 
    
}
