package frms;

import javax.swing.JOptionPane;

public class EvacModel {
    String mobno, name;
    
    public void Evac_init(String mobno, String name){
        this.mobno = mobno;
        this.name = name;
    }
    
    public void send_location(){
        //call to db
        
        JOptionPane.showMessageDialog(null, "Request sent", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
