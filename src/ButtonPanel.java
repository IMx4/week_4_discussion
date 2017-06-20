/*
* File: ButtonPanel.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: to create buttons
*/

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonPanel extends JPanel {

    // declare variables
    private JButton clearButton;
    private JButton enterButton;
    private JPanel buttonPanel;

    // constructor
    public ButtonPanel(){

        // create buttons
        createEnterButton();
        createClearButton();

        // create JPanel
        createJPanel();

        // add buttons to JPanel
        buttonPanel.add(enterButton);
        buttonPanel.add(clearButton);

        // add JPanel to JFrame
        this.add(buttonPanel);
    }

    /*
        createJPanel method - creates the JPanel to hold the buttons
     */
    private void createJPanel(){

        // instantiate a JPanel to hold buttons
        buttonPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        enterButton.setToolTipText("Click enter for result");
        clearButton.setToolTipText("Clear entry");

        // add buttons to JPanel
    }

    /*
        createEnterButton - creates an enter button
     */
    private void createEnterButton(){

        // instantiate JButton
        enterButton = new JButton("Enter");

        // add action listener to enter button
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // local variable for integer entered
                int number = 0;

                try { // validate user entered value is an int
                    number = Integer.parseInt(TextAreas.inputField.getText()); // parse int from string
                    if(PrimeNumberCheck.isPrime(number)){ // check if int is prime
                        TextAreas.setAnswerField("Number is Prime"); // set text area
                    } else { // if not prime
                        TextAreas.setAnswerField("Number is not Prime"); // set text area
                    }
                }catch (NumberFormatException ne){ // if user entered value is not an int
                    TextAreas.setAnswerField("Please enter an integer"); // set text area
                } // end try/catch

            }
        }); // end action listener for enter button
    } // end createEnterButton method

    /*
        createClearButton method - create a clear button
     */
    private void createClearButton(){

        // instantiate JButton
        clearButton = new JButton("Clear");

        // add action listener for clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // clear all values from text areas
                TextAreas.setAnswerField("");
                TextAreas.inputField.setText("");
                TextAreas.inputField.repaint();
            }
        }); // end action listener for clear button
    } // end createClearButton method

} // end ButtonPanel class
