
public class DeluxePackage extends BasicPackage {
	private boolean dinner;
	private boolean guidedtour;

	public DeluxePackage(int price, int hotelstars, boolean car, int priceperday, boolean breakfast,boolean dinner,boolean guidedtour) {
		super(price, hotelstars, car, priceperday, breakfast);
		this.dinner=dinner;
		this.guidedtour=guidedtour;
	}
	
	
	

}
