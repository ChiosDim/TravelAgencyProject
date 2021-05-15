
public class StudentPackage extends EconomyPackage {
	private double discount;
	
	
	
	public  StudentPackage(int price,int hotelstars  ,double discount) 
	{
		super(price,hotelstars );
		this.discount=discount;
	}
	
	public void CalculatePrice(Travelinformation t)
	{
		double totalprice;
		int totalpricewd;
		totalpricewd =Getprice()*(t.getNumber())*(t.getDays());
		if (Getcar()==true)
		{
		totalprice=(totalpricewd-totalpricewd*(discount/100)) + (Getpricecar()*t.getDays()) + t.GetdestinationPrice();
		}
		else {
			totalprice=totalpricewd-(totalpricewd*(discount/100))+ t.GetdestinationPrice();}
		
		Totalprice=totalprice;
		System.out.println(totalprice);
		
		
	}

}
