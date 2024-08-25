import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame1 extends JFrame implements ActionListener {

      JButton button; // move local to global
      JLabel label = new JLabel(); // move local to global and initialize
      JPanel panel = new JPanel(); // move local to global

      @SuppressWarnings("unused")
      MyFrame1() {
            ImageIcon image = new ImageIcon("image/emoji.png"); // create an ImageIcon
            ImageIcon image2 = new ImageIcon("image/Profile2.png");

            label = new JLabel(); // create a label
            label.setIcon(image2); // set image of label
            label.setText("Join Instagram channel"); // set text of label
            label.setHorizontalTextPosition(JLabel.CENTER); // set horizontal position of text
            label.setVerticalTextPosition(JLabel.TOP); // set vertical position of text
            label.setIconTextGap(8); // set gap of text to image
            label.setBounds(225, 200, 220, 220); // set x and y dimensions of label
            label.setVisible(false); // set label visible
            label.setForeground(new Color(0, 0, 0)); // set color of text
            label.setFont(new Font("MV Boli", Font.BOLD, 22)); // set font of text
            label.setBackground(new Color(14, 120, 145)); // set background color of label

            panel = new JPanel(); // create a panel
            panel.setBounds(205, 200, 250, 250); // set x and y dimensions of panel
            panel.setVisible(false);
            panel.setForeground(new Color(0,0,0));
            panel.setBackground(new Color(65, 115, 224)); // set background color of panel

            button = new JButton(); // create a button
            button.setBounds(245, 100, 150, 50); // set x and y dimensions of button
            button.addActionListener(this); // add action listener

            /*
             * button.addActionListener(e -> System.out.println("Hello")); //add action
             * listener and this second method to call when button is clicked but first
             * remove "implements ActionListener" from class definition
             */
            button.setText("Click me"); // set text of button
            button.setFocusable(false); // set button focusable
            button.setHorizontalTextPosition(JButton.RIGHT); // set horizontal position of text
            button.setVerticalTextPosition(JButton.CENTER); // set vertical position of text
            button.setHorizontalAlignment(JButton.CENTER); // set horizontal position of text
            button.setVerticalAlignment(JButton.CENTER); // set vertical position of text
            button.setIcon(image); // set icon of button
            button.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
            button.setForeground(new Color(61, 115, 224)); // set color of text
            button.setIconTextGap(5); // set gap text and image
            button.setBackground(Color.lightGray); // set background of button
            button.setBorder(BorderFactory.createEtchedBorder());
            // button.setEnabled(false); // off your button

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
            this.setSize(600, 600); // sets x and y dimensions of farme
            this.setResizable(false); // prevent frame from being resized
            this.setLayout(null); // no layout manager
            this.setVisible(true); // make this visible
            this.add(button); // add button to frame
            this.add(label); // add label to frame
            this.add(panel); // add panel to frame
            panel.add(label); // add label to panel

            ImageIcon image1 = new ImageIcon("image/Designer.jpeg"); // create an ImageIcon
            this.setIconImage(image1.getImage()); // change icon of this
            this.getContentPane().setBackground(new Color(61, 115, 224)); // change color of background

      }

      @Override
      public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {
                  System.out.println("I'm Join instagram channel"); // print "Happy Birthday" to console
                  label.setVisible(true);
                  panel.setVisible(true);
                  button.setEnabled(false); // if you click on button is off
            }
            // this first method is the one that is called when the button is clicked

      }
}