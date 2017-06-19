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

                TextArea te = new TextArea();

                //int number = Integer.parseInt(getInput.inputField.getText());
                int number = 13;
                System.out.println(number);
                PrimeNumberCheck checkNumber = new PrimeNumberCheck(number);
                if(checkNumber.isPrime()){
                    System.out.println("in");




                } else {
                    System.out.println("not");

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
