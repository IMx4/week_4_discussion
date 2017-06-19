/**
 * Created by BPCT on 6/19/2017.
 */
public class PrimeNumberApp extends GuiPanel{


    PrimeNumberApp(){


    }


    public static void main(String[] args) {
       GuiPanel guiPanel = new GuiPanel();
       guiPanel.add(new titleBanner());
       guiPanel.add( new TextAreas());
       guiPanel.add( new ButtonPanel());

       guiPanel.display();



    }


}
