package LocalStore;

public class Sales extends Stock{
	public void buyItem(String Itemcode,int Itemquan)
	{
		if(getIcode()==Itemcode) {
		
			this.stocks.get(this.stocks.indexOf(Itemcode));
			float total=Iprice*Itemquan;
			
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.printf("%70s\n","DETAILS OF Items");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.printf("Item Code : %-20s Item Name : %-1s Item Quantity:%-15s Item Price:%-20s Total:%-15s"
					+ "\n",Itemcode,getIname(),Itemquan,getIprice(),total);
			System.out.println("\n----------------------------------------------------------------------------------------------------");
		    System.out.println();
		}
	}
	
}
