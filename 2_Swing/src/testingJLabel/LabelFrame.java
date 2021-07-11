package testingJLabel;

import javax.swing.*;
import java.awt.*;

public class LabelFrame extends JFrame{
    private JLabel label1;              //for text
    private JLabel label2;              //for text and icon
    private JLabel label3;              //for added text and icon

    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());        //set frame layout

        //JLabel with string argument
        label1 = new JLabel("label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        //JLabel with string,icon and alignment arguments
        Icon bug = new ImageIcon(getClass().getResource("1.gif"));
        label2 = new JLabel("Label with text and icon",bug,SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        //JLabel with icon and string at bottom
        label3 = new JLabel();
        label3.setText("label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
