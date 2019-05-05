import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frontpage extends JFrame implements ActionListener  
{
	JButton b;
	JCheckBox cb;
	Frontpage()
	{
	
		JFrame frame=new JFrame();
		   frame.setTitle("Online purchase");
		   frame.setVisible(true);
		   frame.setBounds(700,700,900,600);
		   frame.setBackground(Color.pink);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   Container con=frame.getContentPane();
		   con.setLayout(null);
		JLabel label=new JLabel("Welcome to Online Purchasement");
		
		frame.add(label,BorderLayout.CENTER);
		
		label.setBounds(310,230,580,140);
		
		Font font=new Font("Verdana",Font.ITALIC,32);
		label.setFont(font);
		
		label.setForeground(Color.BLACK);
		
		 
		 label.setOpaque(true);
		 //label.setBackground(Color.YELLOW);
		 label.setForeground(Color.RED);
		   ImageIcon icon=new ImageIcon("D:\\pro.png");
		   JLabel label1=new JLabel(icon);
		   frame.add(label1);
		   label1.setBounds(8,20,icon.getIconWidth(),icon.getIconHeight());
		   ImageIcon icon1=new ImageIcon("D:\\colorful.jpg");
		   JLabel l1=new JLabel(icon1);
		   frame.add(l1);
		   l1.setBounds(8, 230,icon1.getIconWidth() ,icon1.getIconHeight() );
		   
		   
		   cb=new JCheckBox("Start purchase");
		  cb.setBounds(520,410, 150, 20);
		  cb.setVisible(true);
		  cb.setLayout(null);
		  frame.add(cb);
		   
		    b=new JButton("click");
		  
		   b.setBounds(520,470,80,80);
		   b.setLayout(null);
		   //b.setSize(80,80);
		   b.setVisible(true);
		   frame.add(b);
		    b.addActionListener(this);
		    
	}
	public void actionPerformed(ActionEvent e)
	{
		if(cb.isSelected())
		{
			new signinprocess();
		}
	}
	public static void main(String args[])
	{
		new Frontpage();
	}
}
