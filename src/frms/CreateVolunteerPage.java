package frms;


public class CreateVolunteerPage implements Factoryint {
    @Override
    public void making_new_page(){
        VolunteerGUI volpage = new VolunteerGUI();
        volpage.setVisible(true);
    }
}
