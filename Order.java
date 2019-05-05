import javax.swing.JOptionPane;
class Order1 
 {
	String name;
	void brand()
	{
		System.out.println("1.Samsung\n\n2.Apple\n\n3.MI\n\n4.Vivo\n\n5.One-plus");
		int x=Integer.parseInt(JOptionPane.showInputDialog(null,"choose the brand"));
		switch(x)
		{
		case 1:
		{
			Samsung();
			break;
		}
		case 2:
		{
			Apple();
			break;
		}
		case 3:
		{
			MI();
			break;
		}
		case 4:
		{
			Vivo();
			break;
		}
		case 5:
		{
			One_plus();
			break;
		}
		default:
		{
			System.out.println("Enter the correct choice\n");
			brand();
			break;
		}
		
	}
	void Samsung()
	{
		
        JOptionPane.showMessageDialog(null,"\t\t\t\tSamsung\t\t\t\n\n");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"The Model available in Samsung are\n1.Samsung_J7\n2.Samsung_J2\n3.Samsung_s6\nChoose the model"));
        switch(x)
      {
        case 1:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tSamsung_J7\t\t\t\n\n");
          System.out.print("\tfront camera=8MP\n\tRear camera=13MP\n\tROM=32GB\nRAM=3GB\nColor=black\n\tprice=12000\n\n\t");
          name="Samsung_J7";
          float price=12000;
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
        	 if(a==1)
        	 {
        		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
        	 if(quan>=1)
        	     {
        		 float t=(float)price*quan;
        		System.out.println("The quantity is "+quan +",total price is " +t);
        	     }
        	 //Payment();
             }
        	 if(a==2)
        	    {
        		 Samsung();
                }
        	 if(a==3)
        	    {
        		 brand();
        	    }
         }
        case 2:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tSamsung_J2\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=16GB,RAM=3GB\n\tprice=10000\n\n\t");
            float price=10000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	 {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	 if(quan>=1)
          	 {float t=(float)price*quan;
          		System.out.println("The quantity is "+quan +",total price is " +t);
          	 }
          	 //Payment();
               }
          	 if(a==2)
          	 {
          		 Samsung();}
          	 if(a==3)
          	 {
          		 brand();
          	 }	
             }
        }
	case 3:
     {
    	JOptionPane.showMessageDialog(null,"\t\t\t\tSamsung_S6\t\t\t\n\n");
        System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=16GB,RAM=3GB\n\tColor=Rose gold\n\tprice=9000\n\n\t");
        float price=9000;
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
      	 if(a==1)
      	 {
      		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
      	 if(quan>=1)
      	     {
      		 float t=(float)price*quan;
      		System.out.println("The quantity is "+quan +",total price is " +t);
      	     }
      	 //Payment();
          }
      	 if(a==2)
      	     {
      		 Samsung();
      		 }
      	 if(a==3)
      	    {
      		 brand();
      	    }	
      }
   }
        
}
	void Apple()
	{
        JOptionPane.showMessageDialog(null,"\t\t\t\tAPPLE\t\t\t\n\n");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"The Model available in Apple are\n1.Iphone_6s\n2.Iphone_7\n3.IphoneX\nChoose the model"));
        switch(x)
        {
        case 1:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tIphone_6s\t\t\t\n\n");
          System.out.print("\tfront camera=16MP\n\tRear camera=13MP\n\tROM=32GB,RAM=3GB\n\tprice=50000\n\n\t");
          float price=50000;
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
        	 if(a==1)
        	 {
        		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
        	 if(quan>=1)
        	 {float t=(float)price*quan;
        		System.out.println("The quantity is "+quan +",total price is " +t);
        	 }
        	 //Payment();
             }
        	 if(a==2)
        	 {
        		 Apple();
              }
        	 if(a==3)
        	 {
        		 brand();
        	 }
         }
        case 2:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tIphone7\t\t\t\n\n");
            System.out.print("\tfront camera=16MP\n\tRear camera=24MP\n\tROM=16GB,RAM=3GB\n\tprice=10000\n\n\t");
            float price=10000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      Apple();
          		      break;
          		 }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
        case 3:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tIphoneX\t\t\t\n\n");
            System.out.print("\tfront camera=16MP\n\tRear camera=24MP\n\tROM=16GB,RAM=3GB\n\tColor=silver\n\tprice=100000\n\n\t");
            float price=100000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      Apple();
                       break;
          	     }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
   
    }
}
	void MI()
	{

		System.out.println("\t\t\t\tMI\t\t\t\n\n");
        System.out.println("The Model available in MI are\n\t\t\t1.REDMI Note 4plus\n\t\t\t2.REDMI Note 5plus\n\t\t\t3.REDMI 6plus\n");
        JOptionPane.showMessageDialog(null,"\t\t\t\tREDMI\t\t\t\n\n");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"The Model available in Apple are\n1.Redmi Note4 plus\n2.Redmi Note 5plus\n3.Redmi 6 plus\nChoose the model"));
        switch(x)
        {
        case 1:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tRedmi Note4 plus\t\t\t\n\n");
          System.out.print("\tfront camera=16MP\n\tRear camera=13MP\n\tROM=32GB,RAM=2GB\n\tcolor=balck\n\tprice=12000\n\n\t");
          float price=12000;
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
        	 if(a==1)
        	 {
        		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
        	 if(quan>=1)
        	 {float t=(float)price*quan;
        		System.out.println("The quantity is "+quan +",total price is " +t);
        	 }
        	 //Payment();
             }
        	 if(a==2)
        	 {
        		 MI();
              }
        	 if(a==3)
        	 {
        		 brand();
        	 }
         }
        case 2:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tRedmi note5 plus\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=32GB,RAM=3GB\n\tprice=12300\n\n\t");
            float price=12300;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      MI();
          		      break;
          		 }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
        case 3:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tRedmi note 6plus\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=16GB,RAM=3GB\n\tColor=Black\n\tprice=10000\n\n\t");
            float price=10000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      MI();
                       break;
          	     }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
   
    }
	}
	void Oppo()
	{

		System.out.println("\t\t\t\tVivo\t\t\t\n\n");
        System.out.println("The Model available in Vivo are\n\t\t\t1.Vivo v5\n\t\t\t2.Vivo v7\n\t\t\t3.Vivo v9\n");
        JOptionPane.showMessageDialog(null,"\t\t\t\tAPPLE\t\t\t\n\n");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"The Model available in Vivo are\\n\\t\\t\\t1.Vivo v5\\n\\t\\t\\t2.Vivo v7\\n\\t\\t\\t3.Vivo v9\nChoose the model"));
        switch(x)
        {
        case 1:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tVIVO_V5\t\t\t\n\n");
          System.out.print("\tfront camera=8MP\n\tRear camera=13MP\n\tROM=32GB,RAM=3GB\n\tcolor=white\n\tprice=9000\n\n\t");
          float price=9000;
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
        	 if(a==1)
        	 {
        		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
        	 if(quan>=1)
        	 {float t=(float)price*quan;
        		System.out.println("The quantity is "+quan +",total price is " +t);
        	 }
        	 //Payment();
             }
        	 if(a==2)
        	 {
        		 Oppo();
        		 break;
              }
        	 if(a==3)
        	 {
        		 brand();
        		 break;
        	 }
         }
        case 2:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tviv0_v7\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=16GB,RAM=3GB\n\tprice=10000\n\n\t");
            float price=10000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      Oppo();
          		      break;
          		 }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
        case 3:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tVivov9\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=13MP\n\tROM=16GB,RAM=3GB\n\tColor=silver\n\tprice=11400\n\n\t");
            float price=11400;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      	Oppo();
                       break;
          	     }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
   
    }
	}
	void One_plus()
	{

		System.out.println("\t\t\t\tOne plus\t\t\t\n\n");
        System.out.println("The Model available in One plus are\n\t\t\t1.One_plus_3t\n\t\t\t2.One_plus_5t\n\t\t\t3.One_plus_6t\n");

		System.out.println("\t\t\t\tVivo\t\t\t\n\n");
        System.out.println("The Model available in One plus are\\n\\t\\t\\t1.One_plus_3t\\n\\t\\t\\t2.One_plus_5t\\n\\t\\t\\t3.One_plus_6t\\n ");
        JOptionPane.showMessageDialog(null,"\t\t\t\tONE_PLUS\t\t\t\n\n");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"The Model available in Vivo are\\n\\t\\t\\t1.Vivo v5\\n\\t\\t\\t2.Vivo v7\\n\\t\\t\\t3.Vivo v9\nChoose the model"));
        switch(x)
        {
        case 1:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tOne_Plus_3t\t\t\t\n\n");
          System.out.print("\tfront camera=8MP\n\tRear camera=13MP\n\tROM=32GB,RAM=3GB\n\tcolor=white\n\tprice=19000\n\n\t");
          float price=19000;
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
        	 if(a==1)
        	 {
        		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
        	 if(quan>=1)
        	 {float t=(float)price*quan;
        		System.out.println("The quantity is "+quan +",total price is " +t);
        	 }
        	 //Payment();
             }
        	 if(a==2)
        	 {
        		 One_plus();
        		 break;
              }
        	 if(a==3)
        	 {
        		 brand();
        		 break;
        	 }
         }
        case 2:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tOne_plus_5t\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=11MP\n\tROM=16GB,RAM=3GB\n\tprice=14000\n\n\t");
            float price=14000;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      One_plus();
          		      break;
          		 }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
        case 3:
        {
        	JOptionPane.showMessageDialog(null,"\t\t\t\tVivov9\t\t\t\n\n");
            System.out.print("\tfront camera=6MP\n\tRear camera=13MP\n\tROM=16GB,RAM=3GB\n\tColor=silver\n\tprice=11400\n\n\t");
            float price=11400;
            int a=Integer.parseInt(JOptionPane.showInputDialog(null,"For payment process press 1\notherwise to see further model press 2\nAnd for Brand press 3"));
          	 if(a==1)
          	   {
          		 int quan=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter quantity"));
          	     if(quan>=1)
          	         {
          		            float t=(float)price*quan;
          		            System.out.println("The quantity is "+quan +",total price is " +t);
          	         }
          	           //Payment();
               }
          	 if(a==2)
          	     {
          		      	One_plus();
                       break;
          	     }
          	 if(a==3)
          	 {
          		 brand();
          		 break;
          	 }	
        }
   
    }

	}
	
}
public class Order
{
	public static void main(String args[])
	{
		Order1 ob=new Order1();
		ob.brand();
	}
}
