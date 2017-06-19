import javax.swing.*;
import java.awt.*;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by BPCT on 6/19/2017.
 */

public class ButtonPanel extends JPanel {

    GuiPanel guiPanel;

    private JButton enterButton = new JButton("Enter");
    private JButton clearButton = new JButton("Clear");

    public ButtonPanel(){
        JPanel buttonPanel = new JPanel();
        setLayout(new FlowLayout(FlowLayout.CENTER));
        enterButton.setToolTipText("Click enter for result");
        clearButton.setToolTipText("Clear entry");
        buttonPanel.add(enterButton);
        buttonPanel.add(clearButton);
        this.add(buttonPanel);


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO implement prime number check


                int number = Integer.parseInt(TextAreas.inputField.getText());
                System.out.println(number);

                if(PrimeNumberCheck.isPrime(number)){
                    TextAreas.answerField.setText("Number is Prime");
                    TextAreas.answerField.repaint();
                } else {
                    TextAreas.answerField.setText("Number is not Prime");
                    TextAreas.answerField.repaint();
                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO add clear function
            }
        });

    }

} // end ButtonPanel class
