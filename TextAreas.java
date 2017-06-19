import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.*;

/**
 * Created by BPCT on 6/19/2017.
 */
public class TextAreas extends JPanel {

    private JPanel inputPanel = new JPanel(new GridLayout(2,1,5,5));
    protected static JTextField inputField;
    protected static JTextField answerField;




    TextAreas(){
       inputTextArea();
       outputAnswerTextArea();
       this.add(inputPanel);


    }

    private void inputTextArea(){
        inputField = new JTextField(15);
        inputField.setToolTipText("Enter an Integer");
        inputField.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Enter an Integer"), inputField.getBorder()));
        inputPanel.add(inputField);


    }

    private void outputAnswerTextArea(){
        answerField = new JTextField(15);
        answerField.setToolTipText("Answer");
        answerField.setText("answer");
        answerField.setEditable(false);
        answerField.setBackground(Color.white);
        answerField.setBorder(new CompoundBorder(BorderFactory.createTitledBorder("Answer"), answerField.getBorder()));
        inputPanel.add(answerField);


    }

    public static void aMethod(){

    }



}
