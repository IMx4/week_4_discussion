/*
* File: titleBanner.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: to create the title banner
*/

import javax.swing.*;
import java.awt.*;

public class TitleBanner extends JPanel{

    private String title = "Check an integer to see if it's Prime";
    private JPanel titlePanel;

    // default constructor
    TitleBanner(){
        titlePanel = new JPanel(); // instantiate JPanel
        createTitle(title); // set default title
        this.add(titlePanel); // add JPanel to JFrame
    }

    // overloaded constructor
    TitleBanner(String banner){
        titlePanel = new JPanel(); // instantiate JPanel
        createTitle(banner); // set title
        this.add(titlePanel); // add JPanel to JFrame

    }

    /*
        createTitle method - sets the title banner
     */
    public void createTitle(String title){

        // instantiate JLabel
        JLabel titleLabel = new JLabel();
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(titleLabel.getFont().deriveFont(22f));
        titleLabel.setText(title);

        // add JLabel to JPanel
        titlePanel.add(titleLabel);

    } // end createTitle method


}
