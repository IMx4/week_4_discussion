/*
* File: TextAreas.java
* Author: Edward Benzenberg
* Date: 6/19/2017
* Purpose: to create text areas
*/

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class TextAreas extends JPanel {

    // declare variables
    private JPanel inputPanel;
    protected static JTextField inputField;
    protected static JTextField answerField;

    // constructor
    TextAreas(){
        // create text areas
       inputTextArea();
       outputAnswerTextArea();

       // create JPanel
       createJPanel();

       // add text areas to JPanel
       inputPanel.add(inputField);
       inputPanel.add(answerField);

        // add JPanel to JFrame
       this.add(inputPanel);
    }

    private void createJPanel(){

        // instantiate JPanel
        inputPanel = new JPanel(new GridLayout(2,1,5,5));
    } // end createJPanel method

    /*
        inputTextArea method - creates text area for user input
     */
    private void inputTextArea(){

        // instantiate JTextField
        inputField = new JTextField(15);
        inputField.setToolTipText("Enter an Integer");
        inputField.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Enter an Integer"), inputField.getBorder()));

    } // end inputTextArea

    /*
        outputAnswerTextArea method - create text area for answer output
     */
    private void outputAnswerTextArea(){

        // instantiate JTextField
        answerField = new JTextField(15);
        answerField.setToolTipText("Answer");
        answerField.setEditable(false);
        answerField.setBackground(Color.white);
        answerField.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Answer"), answerField.getBorder()));

    } // end outputAnswerTextArea

    /*
        setAnswerField method - sets the text in the answer field
     */
    public static void setAnswerField(String text){
        answerField.setText(text);
        answerField.repaint();

    } // end setAnswerField method

} // end TextAreas class
