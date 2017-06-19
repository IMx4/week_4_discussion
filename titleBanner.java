import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;

/**
 * Created by BPCT on 6/19/2017.
 */
public class titleBanner extends JPanel{

    private String title = "Check an integer to see if it's Prime";
    private JPanel titlePanel;

    titleBanner(){


        titlePanel = new JPanel();
        createTitle(title);
        this.add(titlePanel);


    }

    public void createTitle(String title){

        JLabel titleLabel = new JLabel();
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setFont(titleLabel.getFont().deriveFont(24f));
        titleLabel.setText(title);
        titlePanel.add(titleLabel);
    }


}
