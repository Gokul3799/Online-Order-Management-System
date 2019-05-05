import javax.swing.*;
import javax.xml.soap.Text;

import java.awt.*;
import java.awt.event.*;   
class User extends JFrame implements ActionListener
 {
	private boolean succeeded;
 
	 User()
	 {
		User_login(); 
	 }

 private void User_login()
 {
	 JFrame frame=new JFrame("User Login ");
	 frame.setBounds(200, 100, 700, 400);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 Container c=frame.getContentPane();
	 c.setLayout(null);
	 c.setBackground(Color.GREEN);
	 
	 JLabel label=new JLabel();
	 label.setBounds(250,5,200,40);
	 label.setText("Login");
	 c.add(label);
	 
	 Font f=new Font("Arial",Font.BOLD,40);
	 label.setFont(f);
	 
	  final JLabel label1 = new JLabel();            
     label1.setBounds(250,250, 50,50); 
     
     final JPasswordField value = new JPasswordField();   
     value.setBounds(50,250,50,50); 
     
     
	 Font f1=new Font("Arial",Font.PLAIN,18);
	 
	 JLabel name_lbl=new JLabel("Username : ");
	 name_lbl.setBounds(50,100,100,50); 
	 c.add(name_lbl);
	 name_lbl.setFont(f1);
	 
	 JLabel l2=new JLabel("Password :");    
     l2.setBounds(50,150, 100,50); 
     c.add(l2);
     l2.setFont(f1);
     
    
     
	 JButton btn = new JButton("Login");  
     btn.setBounds(280,220, 80,20); 
     btn.setVisible(true);
     btn.setSize(100, 80);
     btn.setLayout(null);
     btn.setBackground(Color.BLACK);
     btn.setForeground(Color.WHITE);
     btn.setFont(f1);
     c.add(btn);
     
     
     
      JTextField text = new JTextField();  
     text.setBounds(200,110, 100,30); 
     c.add(text);
     
	 JPasswordField pass=new JPasswordField();
	 pass.setBounds(200, 158, 100, 30);
	 c.add(pass);
	
 btn.addActionListener(new ActionListener() {
	 
     public void actionPerformed(ActionEvent e) {
    	 String name=text.getText();
    	 String user="anbu";
    	 
    	  
     
         if (name.equals(user)||name.equals("gokul")||name.equals("arun")) {
        	 if(pass.getText().equals("anbu1")||pass.getText().equals("gokul")||pass.getText().equals("arun1"))
        	 {
             JOptionPane.showMessageDialog(null,
                     "Hi " + text.getText() + "! You have successfully logged in.",
                     "Login",
                     JOptionPane.INFORMATION_MESSAGE);
             succeeded = true;}
             JOptionPane.showMessageDialog(null,
                     "Hi " + text.getText() + "! You have successfully logged in.",
                     "Login",
                     JOptionPane.INFORMATION_MESSAGE);
             succeeded = true;
             new Order1();
         } 
         else {
             JOptionPane.showMessageDialog(null,
                     "Invalid username or password",
                     "Login",
                     JOptionPane.ERROR_MESSAGE);
             // reset username and password
             label1.setText("");
             value.setText("");
             succeeded = false;
	
 }}});
 }

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
}
 }
 
 public class Login
 {
	public static void main(String args[])
	{
		new User();
	}
 }
 







 
