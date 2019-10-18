package LocalStore;

import java.util.Scanner;

public class main  {

	public static void main(String[] args) throws invalidname,invalidIcode,invalidIprice{
		 Stockmanager p=new Stockmanager();
            Sales m=new Sales();

            int option=0;
            do {
    			Scanner s = new Scanner(System.in);
    			System.out.println("\n Menu");
    			System.out.println("1.View Stock ");
    			System.out.println("2.Add Stock ");
    			System.out.println("3. Update Stock");
    			System.out.println("4.Buying Items");
    			System.out.println("\nPlease Enter Your Option");
    			option = Integer.parseInt(s.nextLine());
    			switch (option) {
    			case 1:
    				
    				p.Viewstock(p);
    		        break;
    			case 2:
    				p.AddStock();
    				break;
    			case 3:
    				System.out.println("Enter the ItemCode you want to Update:");
    				String CodetoUpdate=s.nextLine();;
    				p.Updatestock(CodetoUpdate,p);
    				break;
    			case 4:
    				int f=0;
    				do {
    					
    				System.out.println("Enter the Itemcode you want to Buy:");
    				String Itemcode=s.nextLine();
    			     System.out.println("Enter the Quantity you want to Buy:");
    			     int Itemquan=s.nextInt();
    			     m.buyItem(Itemcode,Itemquan);
    			     System.out.println("Do you want to buy Another item(y/n)?");
    			      String scan=s.nextLine();
    			      f=0;
    			     if(scan.equals("Y")||scan.equals("y"))
    			     {f=1;}
    			     else {
    			    	 
    			    	 System.out.println();
    			     }
    				}while(f==1);
    				break;
    			}
            }while(option!=-1);
	}

}
