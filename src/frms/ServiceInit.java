package frms;

public class ServiceInit {
    public static void page_init(int usertype){
        switch(usertype){
            case 1: {
                EvacPage evac = new EvacPage();
                evac.setVisible(true);
                break;
            }
            case 2: {
                ResourcePage resource = new ResourcePage();
                resource.setVisible(true);
                break;
            }
            case 3: {
                MedicalPage med = new MedicalPage();
                med.setVisible(true);
                break;
            }
            case 4: {
                MoneyReqPage moneyreq = new MoneyReqPage();
                moneyreq.setVisible(true);
                break;
            }
            default: ;
            
        }
    }
}
