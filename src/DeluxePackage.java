
public class DeluxePackage extends BasicPackage {
	private boolean dinner;
	private boolean guidedtour;

	public DeluxePackage(int price, int hotelstars, boolean breakfast,boolean dinner,boolean guidedtour) {
		super(price, hotelstars, breakfast);
		this.dinner=dinner;
		this.guidedtour=guidedtour;
	}
	
	
	

}
