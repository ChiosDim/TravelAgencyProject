
public class DeluxPackage extends BasicPackage {
	private boolean dinner;
	private boolean guidedtour;

	public DeluxPackage(int price, int hotelstars, boolean car, int priceperday, boolean breakfast,boolean dinner,boolean guidedtour) {
		super(price, hotelstars, car, priceperday, breakfast);
		this.dinner=dinner;
		this.guidedtour=guidedtour;
	}
	
	
	

}
