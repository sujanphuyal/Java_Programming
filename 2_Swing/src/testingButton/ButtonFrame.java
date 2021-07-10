package testingButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JButton plainJButton;
    private JButton fancyJButton;

    //ButtonFrame adds JButtons to JFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon i1 = new ImageIcon(getClass().getResource("1.gif"));

        fancyJButton = new JButton("Fancy Button", i1);
        fancyJButton.setRolloverIcon(i1);
        add(fancyJButton);

        // create new ButtonHandler for button event handling
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener( handler );
        plainJButton.addActionListener( handler );

    }

    //inner class for button event handling
    private class ButtonHandler implements ActionListener {

        //handle button event
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
                    "you pressed: %s", event.getActionCommand()));
        }
    }
}