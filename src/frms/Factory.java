package frms;

public class Factory {
    public static void init_type(int usertype){
        switch(usertype){
            case 1: {
                HelpType helpchoice = new HelpType();
                helpchoice.setVisible(true);
                break;
            }
            case 2: {
                VolunteerGUI volpage = new VolunteerGUI();
                volpage.setVisible(true);
                break;
            }
            case 3: {
                GovtAuth govpage = new GovtAuth();
                govpage.setVisible(true);
                break;
            }
            case 4: {
                MissingPers pers = new MissingPers();
                pers.setVisible(true);
                break;
            }
            case 5: {
                NGO newNGO = new NGO();
                newNGO.setVisible(true);
            }
            default: ;
            
        }
        
    }
}
