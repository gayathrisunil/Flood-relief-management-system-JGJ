package frms;

public class Factory {
    public static void init_type(int usertype){
        switch(usertype){
            case 1: {
                Factoryint fi1 = new CreateHelpType();
                fi1.making_new_page();
                break;
            }
            case 2: {
                Factoryint fi1 = new CreateVolunteerPage();
                fi1.making_new_page();
                break;
            }
            case 3: {
                Factoryint fi1 = new CreateGovtAuth();
                fi1.making_new_page();
                break;
            }
            case 4: {
                Factoryint fi1 = new CreateMissingPage();
                fi1.making_new_page();
                break;
            }
            case 5: {
                Factoryint fi1 = new CreateNGOPage();
                fi1.making_new_page();
                break;
            }
            case 6: {
                Factoryint fi1 = new CreateCallPage();
                fi1.making_new_page();
                break;
            }
            default: ;
            
        }
        
    }
}
