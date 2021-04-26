
public class BasicPackage extends EconomyPackage {
	private boolean breakfast;

	public BasicPackage(int price, int hotelstars, boolean car, int priceperday,boolean breakfast) {
		super(price, hotelstars, car, priceperday);
		this.breakfast=breakfast;
	}
	

}
