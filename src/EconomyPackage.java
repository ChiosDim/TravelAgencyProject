
public class EconomyPackage {

	protected double Totalprice;
	protected int price;
	protected int hotelstars;
	protected boolean car;
	protected int priceperday;
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
		double totalprice;
		
		
		if(car==true) {
	
		totalprice = (price *(t.getNumber())*(t.getDays()))+((pricecar*t.getDays())+ t.GetdestinationPrice());}
		else {totalprice = (price *(t.getNumber())*(t.getDays()))+ t.GetdestinationPrice();
				}
		
		Totalprice=totalprice;
	
		
	}
		public int Getpricecar() {
			return pricecar;
		}
	   
		public boolean Getcar()
		{
			return car;
		}
		public double Gettotalprice() {
			return Totalprice;
		}
		
		public void Car(String c)
		{
			
			if(c.equals("��� (20 ����/�����)"))
			{car=true;
			}
			
		}
		
		
		
	
}
