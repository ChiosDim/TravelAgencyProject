
public class StudentPackage extends EconomyPackage {
	private int discount;
	
	
	public  StudentPackage(int price,int hotelstars  ,int discount) 
	{
		super(price,hotelstars );
		this.discount=discount;
	}
	
	public void CalculatePrice(Travelinformation t)
	{
		int totalprice;
		int totalpricewd;
		totalpricewd =Getprice()*(t.getNumber())*(t.getDays());
		if (Getcar()==true)
		{
		totalprice=totalpricewd-totalpricewd*(discount/100) + Getpricecar() + t.GetdestinationPrice();
		}
		else 
			totalprice=totalpricewd-totalpricewd*(discount/100)+ t.GetdestinationPrice();
		
	}

}
