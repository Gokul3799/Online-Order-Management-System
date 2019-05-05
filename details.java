
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
class userDet{
	String name,p_add,s_add,city,state,z_code,phn_no;
	Payment pay=new Payment();
	void user_det()
	{
		
		Font f1=new Font("Arial",Font.BOLD,18);
		Font f3=new Font("Arial",Font.PLAIN,14);
		//JOptionPane.showMessageDialog(null,"Enter the user details");
		//name=JOptionPane.showInputDialog(null,"enter the name");
		JFrame fram=new JFrame();
		fram.setTitle("User details");
		fram.setVisible(true);
		fram.setBounds(100,80, 530, 530);
		
		Container con=fram.getContentPane();
		con.setBackground(Color.LIGHT_GRAY);
		con.setLayout(null);
		JLabel l2=new JLabel("USER DETAILS");
		l2.setBounds(200,5,200,40);
		con.add(l2);
		l2.setFont(f1);
		
		JLabel l1=new JLabel("Name : ");
		l1.setBounds(50,100,100,50);
		con.add(l1);
		l1.setFont(f1);
		
		JLabel l3=new JLabel("Phone no :");
		l3.setBounds(50,180,100,50);
		l3.setFont(f1);
		con.add(l3);
		
		JTextField text = new JTextField();  
	     text.setBounds(200,110, 140,30); 
	     con.add(text);
	     text.setFont(f3);
	     text.setToolTipText("enter your name here.. ");
	     
		 JTextField ph=new JTextField();
		 ph.setBounds(200, 186, 140, 30);
		 con.add(ph);
		 ph.setFont(f3);
		 ph.setToolTipText("enter your phone number");
		 
		 JButton b1=new JButton("Next");
		 b1.setBounds(190,310, 150,50);
		 b1.setVisible(true);
		 b1.setBackground(Color.red);
		 b1.setForeground(Color.yellow);
		 b1.setFont(f1);
		 con.add(b1);
		 
		 
		 b1.addActionListener(new ActionListener()
				 {
			 public void actionPerformed(ActionEvent e) {
				 boolean ee;
				 String name1=text.getText();
	 	         String phn=ph.getText();
				 
		         ee=Pattern.matches("[0-9]{10}",phn);
		 		if(ee==true)
		 		{
		 			
		 		System.out.println(name1);
		 		System.out.println(phn);
		 		 
		 		add_det();
		 		}
		 		else
		 		{
		 			JOptionPane.showMessageDialog(null,"Enter valid details");
		 			user_det();
		 		}
				 
				 }});
		 
		 
        
		//phn_no=JOptionPane.showInputDialog(null,"enter the phone number");
		
	}
	void add_det()
	{
		Font f2=new Font("Arial",Font.BOLD,18);
		Font f3=new Font("Arial",Font.PLAIN,14);
		//System.out.println(" "+name1);
		//JOptionPane.showMessageDialog(null,"Address Details");
		JFrame fra=new JFrame();
		fra.setTitle("Address details");
		fra.setVisible(true);
		fra.setBounds(100,80, 600, 650);
		Container co=fra.getContentPane();
		co.setLayout(null);
		co.setBackground(Color.LIGHT_GRAY);
		int c=0;
		boolean rr;
		//p_add=JOptionPane.showInputDialog(null,"enter the primary address");
		JLabel l4=new JLabel("User Address");
		l4.setBounds(250,5 , 200, 40);
		co.add(l4);
		l4.setFont(f2);
		
		JLabel l5=new JLabel("Primary Address : ");
		l5.setBounds(50,120 , 200, 20);
		co.add(l5);
		l5.setFont(f2);
		
		JTextField t1=new JTextField();
		t1.setBounds(240,110, 190,40);
		t1.setFont(f3);
		co.add(t1);
		
		JLabel l6=new JLabel("Secondary Address : ");
		l6.setBounds(48,200 , 200, 20);
		co.add(l6);
		l6.setFont(f2);
		
		JTextField t2=new JTextField();
		t2.setBounds(240,190, 190,40);
		t2.setFont(f3);
		co.add(t2);
		
		JLabel l7=new JLabel("city     : ");
		l7.setBounds(100,290 , 200, 20);
		co.add(l7);
		l7.setFont(f2);
		
		JTextField t3=new JTextField();
		t3.setBounds(240,280, 190,40);
		t3.setFont(f3);
		co.add(t3);
		
		//s_add=JOptionPane.showInputDialog(null,"enter the secondary address");
		//city=JOptionPane.showInputDialog(null,"enter the city");
		
		JLabel l8=new JLabel("state     : ");
		l8.setBounds(100,380 , 200, 20);
		co.add(l8);
		l8.setFont(f2);
		
		JTextField t4=new JTextField();
		t4.setBounds(240,370, 190,40);
		t4.setFont(f3);
		co.add(t4);
		//state=JOptionPane.showInputDialog(null,"enter the state");
		//z_code=JOptionPane.showInputDialog(null,"enter the pin code");
		
		JLabel l9=new JLabel("Pincode     : ");
		l9.setBounds(100,470 , 200, 20);
		co.add(l9);
		l9.setFont(f2);
		
		JTextField t5=new JTextField();
		t5.setBounds(240,460, 190,40);
		t5.setFont(f3);
		co.add(t5);
		
		JButton b2=new JButton("Placeorder");
		 b2.setBounds(230,520, 150,50);
		 b2.setVisible(true);
		 b2.setBackground(Color.red);
		 b2.setForeground(Color.yellow);
		 b2.setFont(f2);
		 co.add(b2);
		 
		 b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int c=0;
				boolean rr;
                 p_add=t1.getText();
                	 s_add=t2.getText();
                	 city=t3.getText();
                	 state=t4.getText();
                	 z_code=t5.getText();
                	rr=Pattern.matches("[0-9]{6}", z_code);
                	String s1="tamilnadu";
            		String s2="kerala";
            		String c1="chennai";
            		String c2="coimbatore";
            		String c3="trichy";
            		String c4="cochin";
            		String c5="palakad";
            		String c6="thrissur";
            		if(s1.equals(state)&&rr==true)
            		{
            			if(city.equals(c1)||city.equals(c2)||city.equals(c3))
            			{
            				c=1;
            			}
            			if(c==1)
            			{
            				JOptionPane.showMessageDialog(null,"Address verified");
            				pay.pay_det();
            				
            				delivery();
            			}
            			else
            			{
            				JOptionPane.showMessageDialog(null,"Incorrect Address");
            				add_det();
            			}
            		}
            		else if(s2.equals(state)&&rr==true)
            		{
            			if(city.equals(c4)||city.equals(c5)||city.equals(c6))
            			{
            				c=1;
            			}
            			if(c==1)
            			{
            				JOptionPane.showMessageDialog(null,"Address verified");
            				pay.pay_det();
            				int choice=Integer.parseInt(JOptionPane.showInputDialog(null,"Press 1 to place order"));
            				if(choice==1)
            				{
            					JOptionPane.showMessageDialog(null,"Order placed");
            					delivery();	
            				}
            				else
            				{
            					System.exit(0);
            				}
            				
            			}
            			else
            			{
            				JOptionPane.showMessageDialog(null,"Incorrect Address");
            				add_det();
            			}
            		}
            		else
            		{
            			JOptionPane.showMessageDialog(null,"Invalid Address");
            			add_det();
            		}
               
				
			}
		 });
		
		/*System.out.println(p_add);
		System.out.println(s_add);
		System.out.println(city);
		System.out.println(state);
		System.out.println(z_code);*/
	
	}
	void delivery()
	{
		int oid = ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
		int iid = ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
		int otp = ThreadLocalRandom.current().nextInt(100000, 999999 + 1);
	try
	{
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		PrintStream f = new PrintStream(new File("E://invoice.txt"));
		f.println("\t\t\t\t\t\tInvoice");
		f.println("\n\ninvoice id=OD"+iid);
		f.println("-----------------------------------------------------------------------------------------------------------------------");
		f.println("\n\nSold by:Health & Happiness Pvt Ltd");
		f.println("ship from address:No 345,xyz colony,Bangalore,India-560007");
		f.println("-----------------------------------------------------------------------------------------------------------------------");
		f.println("\n\nOrder id=OD"+oid);
		f.println("Order date="+date);
		f.println("Invoice date="+date);
		f.println("");
		f.println("Bill to:");
		f.println("\t"+name);
		
		f.println("\t"+phn_no);
		f.println("\t"+p_add);
		f.println("\t"+s_add);
		f.println("\t"+city);
		f.println("\t"+state);
		f.println("\t"+z_code);
		f.println("");
		f.println("\n\nShip to:");
		f.println("\t"+name);
		f.println("\t"+phn_no);
		f.println("\t"+p_add);
		f.println("\t"+s_add);
		f.println("\t"+city);
		f.println("\t"+state);
		f.println("\t"+z_code);
		f.println("--------------------------------------------------------------------------------------------------------------------");
		f.close();
		PrintStream s=new PrintStream(new File("E://Shipping_label.txt"));
		s.println("Shipping label");
		s.println("");
		
	}
	catch(IOException e)
	{
		System.out.print("error");
	}	
	JOptionPane.showMessageDialog(null,"otp="+otp);
	System.out.print(otp);
	int u_otp=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the otp received"));
	if(u_otp==otp)
	{
		JOptionPane.showMessageDialog(null,"Product delivered");
		
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Incorrect otp Product not delivered");
	}
	}
	}
class Payment
{
	
	String c_name,exp_date,c_no,cvv;
	int ch;	
	boolean qq,ww;
	void pay_det()
	{
		JOptionPane.showMessageDialog(null,"Payment");
		JOptionPane.showMessageDialog(null,"Enter 1 for COD and 2 for Netbanking");
		ch=Integer.parseInt(JOptionPane.showInputDialog(null,"enter the choice"));
		if(ch==1)
		{
			JOptionPane.showMessageDialog(null,"COD");
			//JOptionPane.showMessageDialog(null,price);	
		}
		else
		{
			c_name=JOptionPane.showInputDialog(null,"Enter the card holder name");
			c_no=JOptionPane.showInputDialog(null,"Enter the card number");
			exp_date=JOptionPane.showInputDialog(null,"Enter the expiry date");
			cvv=JOptionPane.showInputDialog(null,"Enter the cvv");
			qq=Pattern.matches("[0-9]{16}",c_no);
			ww=Pattern.matches("[0-9]{3}",cvv);
			
			if(qq==false||ww==false)
			{
				JOptionPane.showMessageDialog(null,"Incorrect card details");
				pay_det();
			}
			
			else
			{
				JOptionPane.showMessageDialog(null,"Card verified");
				
				}
			
		}
		
	}
	
}
public class details { 
	public static void main(String args[])
	{
		//Order1 o1=new Order1();
		//Order1 p1=new Payment();
		//float x=p1.price;
		userDet usr=new userDet();
		usr.user_det();
		
		}
}