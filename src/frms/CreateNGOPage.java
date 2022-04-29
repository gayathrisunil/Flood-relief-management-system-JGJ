
package frms;


public class CreateNGOPage implements Factoryint{
    @Override
    public void making_new_page(){
        NGO newNGO = new NGO();
        newNGO.setVisible(true);
    }
}
