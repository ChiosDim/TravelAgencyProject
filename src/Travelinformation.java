
public class Travelinformation {

private  String destination;
private   int daysofstay;
private   String arrivaldate;
private   int numberofpeople;
private   int destinationPrice;


public Travelinformation(String  destination, int daysofstay, String arrivaldate,int numberofpeople)
{ 
	this.destination=destination;
	this.daysofstay=daysofstay;
	this.arrivaldate=arrivaldate;
	this.numberofpeople=numberofpeople;
}

public boolean  ValidDate() {
	boolean flag=false;
	if(daysofstay<=7&&daysofstay>0) {
		flag=true;
	
	}
	return flag;
}
   public int   getNumber()
   {
	   return numberofpeople;
   }
   public String   getdestination()
   {
	   return destination;
   }
   public String   getarrivaldate()
   {
	   return  arrivaldate;
	   
   }
   public int   getDays()
   {
	   return  daysofstay;
	   
   }
  
   public void DestinationPrice() {
	    //destinationprice=5;
	   if(destination.equals("Αθήνα(50 ευρώ)"))
		   this.destinationPrice=50;
	   else if (destination.equals("Πάτρα(60 ευρώ)"))
			   this.destinationPrice=60;
	   else if (destination.equals("Ρόδος(80 ευρώ)"))
			   this.destinationPrice=80;
	   else if (destination.equals("Κρήτη(100 ευρώ)"))
		   this.destinationPrice=100;
   }
   public int GetdestinationPrice()
   {
	  
	   return destinationPrice;
	   
   }
  
}
 
