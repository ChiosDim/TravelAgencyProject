
public class StudentPackage extends EconomyPackage {
	private int discount;
	
	public  StudentPackage(int price,int hotelstars,boolean car , int priceperday,int discount) 
	{
		super(price,hotelstars,car,priceperday);
		this.discount=discount;
	}
	
	public void CalculatePrice(Travelinformation t)
	{
		int totalprice;
		int totalpricewd;
		totalpricewd =Getprice()*(t.getNumber())*(t.getDays());
		totalprice=totalpricewd-totalpricewd*(discount/100);
		
	}

}
