package LocalStore;
import java.util.*;
import java.util.regex.Pattern;

public class Stockmanager extends Stock {

		public Stockmanager() {
		

		}
public void Stocklist(Stock p) {
	  p.stocks = new ArrayList<>();
	  Stock Item1=new Stock("1234","Banana",5,5.5f);
	  Stock Item2=new Stock("1235","Mango",12,34.4f);
	  Stock Item3=new Stock("1236","Apple",18,56.4f);
	  Stock Item4=new Stock("1237","PineApple",56,56.4f);
	  Stock Item5=new Stock("1238","Biscuits",14,98.1f);
	  Stock Item6=new Stock("1239","Chocolates",89,34.1f);
	  p.stocks.add(Item1);
	  p.stocks.add(Item2);
	  p.stocks.add(Item3);
	  p.stocks.add(Item4);
	  p.stocks.add(Item5);
	  p.stocks.add(Item6);
	 
}
public Stock AddStock()throws invalidIcode,invalidIcode,invalidIprice {
	
	
	Scanner s=new Scanner(System.in);
	
	 int f4=0;
     do {
    	 System.out.println("Enter the Item Code:");
    		Icode=s.nextLine();
		
		try {
			f4 = 0;
			if (checkPhone(Icode) == false) {

				f4= 1;
				throw new invalidIcode("Item code should contain 4 digit");
//throws exception
			}
		} catch (invalidIcode i) {
			System.err.println(i.getMessage());
		}

		}while(f4==1);
	int flag = 0;
	do {
		System.out.println("Enter the Item Name:");
		Iname=s.nextLine();
         try {
				
				flag = 0;

				if (checkName(Iname) == false) {
					flag = 1;

					throw new invalidname("Name Should not contain numbers or special characters or be null");
					// throws exception

				}
			} catch (invalidname ie) {
				System.err.println(ie.getMessage());
			}
	} while (flag == 1);
	
	System.out.println("Enter the Item Quantity Available:");
	Iquantity=Integer.parseInt(s.nextLine());
	int f5=0;
    do {
    	System.out.println("Enter the Item Price:");
    	Iprice=s.nextFloat();
		
		try {
			f5 = 0;
			if (checkIprice(Iprice) == false) {

				f5= 1;
				throw new invalidIprice("Item code should contain 4 digit");
//throws exception
			}
		} catch (invalidIprice i) {
			System.err.println(i.getMessage());
		}

		}while(f5==1);

	
	return new Stock(Icode,Iname,Iquantity,Iprice);
}
public void Viewstock(Stock p) {
     
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.printf("%70s\n","DETAILS OF STOCK");
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.format("%10s %10s %10s %10s\n", "CODE","NAME","QUANTITY","PRICE");
	
	/*System.out.printf("Item Code : %-30s Item Name : %-1s Item Quantity:%-27s Item Price:%-20s\n",p.getIcode(),p.getIname(),p.getIquantity(),p.getIprice());
	System.out.println("\n----------------------------------------------------------------------------------------------------");
    */
		System.out.format("%10s %10s %10d %10.2f",p.getIcode(),p.getIname(),p.getIquantity(),p.getIprice());
		System.out.println();
	
}
public void Updatestock(String CodetoUpdate,Stock p) {
	Scanner s = new Scanner(System.in);
	for(Stock k:stocks) {
		if (k.getIcode() == CodetoUpdate) {
	
     System.out.println("Enter the new ItemName: ");
	String newname = s.nextLine();
	System.out.println("Enter the new ItemQuantity: ");
	int newquantity = s.nextInt();
	System.out.println("Enter the new ItemPrice: ");
	float newprice = s.nextFloat();
			
	k.setIname(newname);
	k.setIquantity(newquantity);
	k.setIprice(newprice);
	System.out.println("updated Successfully");}
		else
		System.out.println("No Item Found");

	    }
}

public boolean checkName(String Iname) {
	int f = 0;
	
	Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z\\s]+$");
		
		if(p.matcher(Iname).matches()) {
	
			this.Iname = Iname;
			return true;
		}
		else {
			return false;
		}
		
}
public boolean checkPhone(String Icode) {
	Pattern p = Pattern.compile("^\\d{4}$");
	if((p.matcher(Icode).matches())) {
		this.Icode=Icode;
		return true;
	}
	else {
		return false;
	}
}
public boolean checkIprice(float Iprice) {
	String price=Float.toString(Iprice);
	Pattern p = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+");
	if((p.matcher(price).matches())) {
		this.Iprice=Iprice;
		return true;
	}
	else {
		return false;
	}
}

}