import javax.swing.*;
class signinprocess
{

	signinprocess()
	{
		Uadmin();
	}
public void Uadmin()
{
	int x=Integer.parseInt((String) JOptionPane.showInputDialog(null,"Signin\n\t1.UserLogin\n\t2.AdminLogin\nEnter your choice"));
	if(x==1)
	{
		new User();
	}
	if(x==2)
	{
		new Admin();
	}
}

}
public class signin
{
	public static void main(String args[])
	{
		new signinprocess();
	}
}