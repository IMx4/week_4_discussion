import javax.swing.*;
import java.awt.*;

/**
 * Created by BPCT on 6/19/2017.
 */
public class GuiPanel extends JFrame {

    static final int HEIGHT = 400;
    static final int WIDTH = 600;

    GuiPanel(){
        super("Prime Number Checker");
        setFrame(WIDTH,HEIGHT);


    }

    public void display(){
        setVisible(true);
    }

    private void setFrame(int width, int height){
        setSize(width, height);
        setLayout(new GridLayout(3,1,5,5));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


} // end GuiPanel class
