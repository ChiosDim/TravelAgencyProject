
public class EconomyPackage {

	
	private int price;
	private int hotelstars;
	private boolean car;
	private int priceperday;
	 private int pricecar= 20;// for car//
	
	
	public  EconomyPackage(int price,int hotelstars,boolean car , int priceperday) 
	{
		this.price=price;
		this.hotelstars=hotelstars;
		this.car=car;
		this.priceperday=priceperday;
		
	}
	 public int  Getprice()
	   {
		   return price;
	   }
	
	public void CalculatePrice(Travelinformation t)
	{
		int totalprice;
		if(car==true) {
		totalprice = price *(t.getNumber())*(t.getDays())+(pricecar*t.getDays());}
		else {totalprice =Getprice()*(t.getNumber())*(t.getDays());
				}
	}
		
	
	
}
