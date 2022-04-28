package frms;

import java. util. Random;

public class EvacController {
    
    String loc;
    String[] arr_loc ={"Kannur", "Kasargod", "Mallapuram", "Pathanamthitta", "Wayanad"};
    
    Random r=new Random();   
    int choice = r.nextInt(arr_loc.length);
    public String getLocation(){
        //can add logic to get live location
        return arr_loc[choice];
    }
    
}
