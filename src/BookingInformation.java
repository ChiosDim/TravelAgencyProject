
public class BookingInformation {
  
	 private User user;
	 private Travelinformation travelInfo;
	 private EconomyPackage  apackage;
	 
	 
	 public BookingInformation ( User user ,Travelinformation  travelInfo ,EconomyPackage   apackage)
	 {
		 this.user=user;
		 this.travelInfo=travelInfo;
		 this.apackage=apackage;
	 }


	public Travelinformation getTravelInfo() {
		return travelInfo;
	}


	
	 
	 
}
