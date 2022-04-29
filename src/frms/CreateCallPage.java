
package frms;


public class CreateCallPage implements Factoryint{
    @Override
    public void making_new_page(){
        CallPage call = new CallPage();
        call.setVisible(true);
    }
}
