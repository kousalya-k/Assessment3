package LocalStore;

import java.util.LinkedList;
import java.util.List;

public class Stock {
         String Icode;
         String Iname;
         int Iquantity;
         float Iprice;
         List<Stock>stocks;
         List<Stock>items;
      public  Stock() {
      }
	public Stock(String icode, String iname, int iquantity,float iprice) {
		super();
		Icode = icode;
		Iname = iname;
		Iquantity = iquantity;
		Iprice=iprice;
		stocks=new LinkedList<Stock>();
		items=new LinkedList<Stock>();
	}
	public List<Stock> getItems() {
		return items;
	}
	public void setItems(List<Stock> items) {
		this.items = items;
	}
	public String getIcode() {
		return Icode;
	}
	public void setIcode(String icode) {
		Icode = icode;
	}
	public String getIname() {
		return Iname;
	}
	public void setIname(String iname) {
		Iname = iname;
	}
	public int getIquantity() {
		return Iquantity;
	}
	public void setIquantity(int iquantity) {
		Iquantity = iquantity;
	}
	
	public float getIprice() {
		return Iprice;
	}
	public void setIprice(float iprice) {
		Iprice = iprice;
	}
	public List<Stock> getStocks() {
		return stocks;
	}
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
	@Override
	public String toString() {
		return "Stock Icode=" + Icode + ", Iname=" + Iname + ", Iquantity=" + Iquantity + "Iprice="+Iprice+", stocks=" + stocks;
	}}
	class invalidname extends Exception {
		private String message;

		public invalidname() {
		}

		public invalidname(String message) {
			super(message);
			this.message = message;
		}

	}

	class invalidIcode extends Exception {
		private String message;

		public invalidIcode() {
		}

		public invalidIcode(String message) {
			super(message);
			this.message = message;
		}
		}
	class invalidIprice extends Exception {
		private String message;

		public invalidIprice() {
		}

		public invalidIprice(String message) {
			super(message);
			this.message = message;
		}
		}

