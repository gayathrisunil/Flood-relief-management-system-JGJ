package frms;

public class NGO_Model {
    String NGO_name;
    String NGO_mob;
    String NGO_addr;
    String NGO_stat;
    
   public void setName(String name){
       this.NGO_name = name;
   }
   
   public void setMob (String mob){
       this.NGO_mob = mob;
   }
   
   public void setAddr(String addr){
       this.NGO_addr = addr;
   }
   
   public void setStat(String stat){
       this.NGO_stat = stat;
   }
   
   public String getName(){
       return NGO_name;
   }
   
   public String getMob(){
       return NGO_mob;
   }
   
   public String getAddr(){
       return NGO_addr;
   }
   
   public String getStat(){
       return NGO_stat;
   }
   
   
}
