/*
* File: PrimeNumberApp.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: Controls the Prime Number App
*/


public class PrimeNumberApp extends GuiPanel{

    // main method
    public static void main(String[] args) {

       GuiPanel guiPanel = new GuiPanel(); // instantiate GuiPanel Object
       guiPanel.add(new TitleBanner()); // Add title Banner JPanel
       guiPanel.add( new TextAreas()); // Add Text Areas JPanel
       guiPanel.add( new ButtonPanel()); // Add Button Panel JPanel

       guiPanel.display(); // display JFrame

    } // end Main method

} // end PrimeNumberApp class
