import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelCome {
JFrame frame = new JFrame();
JLabel WelComeLabel = new JLabel("Hello Bro");

WelCome(){

    WelComeLabel.setBounds(0,0,200,35);
    WelComeLabel.setFont(new Font("MV Boli",Font.PLAIN, 120));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.add(WelComeLabel);

}
}
