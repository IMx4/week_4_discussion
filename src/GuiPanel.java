
/*
* File: GuiPanel.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: to construct a JFrame
*/

import javax.swing.*;
import java.awt.*;

public class GuiPanel extends JFrame {

    // declare variables
    static final int HEIGHT = 400;
    static final int WIDTH = 600;
    private String title;

    // default constructor
    GuiPanel(){
        super("Prime Number Checker");
        setFrame(WIDTH,HEIGHT);
    }

    // overloaded constructor
    GuiPanel(String title, int height, int width){
        super(title);
        setFrame(width, height);
    }

    /*
        display method - sets JFrame to visible
     */
    public void display(){
        setVisible(true);
    } // end display method

    /*
        setFrame method - sets the JFrame size and parameters
     */
    private void setFrame(int width, int height){
        setSize(width, height);
        setLayout(new GridLayout(3,1,5,5));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    } // end SetFrame method

} // end GuiPanel class
