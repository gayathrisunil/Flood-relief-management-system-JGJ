package frms;

import javax.swing.JOptionPane;

public class VolunteerProc {
    String mobno;
    String donate_to;
    String item;
    String qty;
    
    public void setVals(String mobno,String donate_to, String item, String qty){
        this.mobno= mobno;
        this.donate_to = donate_to;
        this.item = item;
        this.qty = qty;
    }
    
    public void send_donation(){
 
        //check if ngo is accepting, if yes then process successfully, if no, decline
        String status = "true";
        
        if(status=="true"){
            
            DB dbreq = new DB();
            dbreq.insert_into_donation_kind(mobno, donate_to, item, qty);
            JOptionPane.showMessageDialog(null, "Thank you for donating, you can drop your package in person or courier it to us!","Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "This NGO is not accepting donations right now. Choose another NGO or try again later","Failure", JOptionPane.INFORMATION_MESSAGE);
        }
        }
}
