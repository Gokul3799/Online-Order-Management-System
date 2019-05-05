import javax.swing.*;
import javax.xml.soap.Text;

import java.awt.*;
import java.awt.event.*;   
class Admin extends JFrame implements ActionListener
 {
	private boolean succeeded;
 
	 Admin()
	 {
		Admin_login(); 
	 }

 private void Admin_login()
 {
	 JFrame frame=new JFrame("Admin Login ");
	 frame.setBounds(200, 100, 700, 400);
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 Container c=frame.getContentPane();
	 c.setLayout(null);
	 c.setBackground(Color.GRAY);
	 
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
	 
	 JLabel name_lbl=new JLabel("Adminname : ");
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
    	 String user="gokul";
    	 //String pas="gokul1";
    	 
     
         if (user.equals(name)) {
        	 if(pass.getText().equals("gokul1"))
        	 {
             JOptionPane.showMessageDialog(null,
                     "Hi " + text.getText() + "! You have successfully logged in.",
                     "Login",
                     JOptionPane.INFORMATION_MESSAGE);
             succeeded = true;}
        	 else
        	 {
        		 JOptionPane.showMessageDialog(null,
                         "Invalid  password",
                         "Login",
                         JOptionPane.ERROR_MESSAGE);
                 // reset username and password
                 label1.setText("");
                 value.setText("");
                 succeeded = false; 
        	 }
             //new Order1();
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
 
 public class admin
 {
	public static void main(String args[])
	{
		new Admin();
	}
 }
 

