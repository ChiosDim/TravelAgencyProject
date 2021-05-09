
public class EconomyPackage {

	
	private int price;
	private int hotelstars;
	private boolean car;
	private int priceperday;
	protected int pricecar= 20;// for car//
	
	
	public  EconomyPackage(int price,int hotelstars ) 
	{
		this.price=price;
		this.hotelstars=hotelstars;
		
		
		
	}
	 public int  Getprice()
	   {
		   return price;
	   }
	
	public void CalculatePrice(Travelinformation t)
	{
		int totalprice;
		if(car==true) {
		totalprice = price *(t.getNumber())*(t.getDays())+(pricecar*t.getDays()+ t.GetdestinationPrice());}
		else {totalprice =Getprice()*(t.getNumber())*(t.getDays()+ t.GetdestinationPrice());
				}
	}
		public int Getpricecar() {
			return pricecar;
		}
	   
		public boolean Getcar()
		{
			return car;
		}
	
}
