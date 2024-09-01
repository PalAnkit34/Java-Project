import java.util.HashMap;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JTextField userPasswordField = new JPasswordField();

    JLabel userIDLabel = new JLabel("user ID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel MessageLabel = new JLabel();

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInfoOriginal){
        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        MessageLabel.setBounds(125,250,250,35);
        MessageLabel.setFont(new Font(null,Font.BOLD, 20));


        userIDField.setBounds(100,100,205,25);
        userPasswordField.setBounds(120,150,205,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(250,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setBackground(new Color(145, 015, 45));
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(MessageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(resetButton);
        frame.add(loginButton);
    }
    @SuppressWarnings("unused")
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");

            MessageLabel.setText("");
        }
        if (e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(((JPasswordField) userPasswordField).getPassword());

            if (loginInfo.containsKey(userID)) {
                if (loginInfo.get(userID).equals(password)) {
                    MessageLabel.setForeground(Color.BLACK);
                    MessageLabel.setText("Login Successful");
                    WelCome welcome = new WelCome();
                }
                else {
                    MessageLabel.setForeground(Color.RED);
                    MessageLabel.setText("wrong password");
                }
            }else{
                MessageLabel.setForeground(Color.RED);
                    MessageLabel.setText("username Not Found");
            }
        }
    } 
}
