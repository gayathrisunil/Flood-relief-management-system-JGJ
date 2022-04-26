package frms;

import javax.swing.JOptionPane;

public class VolunteerProc {
    String donate_to;
    String item;
    String qty;
    
    public void setVals(String donate_to, String item, String qty){
        this.donate_to = donate_to;
        this.item = item;
        this.qty = qty;
    }
    
    public void send_donation(){
        //code to send and process
        
        //check if ngo is accepting, if yes then process successfully, if no, decline
        String status = "true";
        
        if(status=="true"){
            JOptionPane.showMessageDialog(null, "Thank you for donating, you can drop your package in person or courier it to us!","Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "This NGO is not accepting donations right now. Choose another NGO or try again later","Failure", JOptionPane.INFORMATION_MESSAGE);
        }
        }
}
