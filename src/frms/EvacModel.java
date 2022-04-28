package frms;

import javax.swing.JOptionPane;

public class EvacModel{
    String mobno, name, loc;
    EvacController ec = new EvacController();
    
    public void Evac_init(String mobno, String name){
        this.mobno = mobno;
        this.name = name;
        this.loc = ec.getLocation();
    }
    
    public void send_location(){
        //call to db
        DB dbreq = new DB();
        dbreq.insert_into_evac(mobno, name, loc);
        JOptionPane.showMessageDialog(null, "Request sent", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
