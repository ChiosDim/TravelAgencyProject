
public class Travelinformation {

private  String destination;
private   int daysofstay;
private   String arrivaldate;
private   int numberofpeople;


public Travelinformation(String  destination, int daysofstay, String arrivaldate,int numberofpeople)
{ 
	this.destination=destination;
	this.daysofstay=daysofstay;
	this.arrivaldate=arrivaldate;
	this.numberofpeople=numberofpeople;
}

public boolean  ValidDate() {
	boolean flag=false;
	if(daysofstay<7&&daysofstay>0) {
		flag=true;
	
	}
	return flag;
}
   public int   getNumber()
   {
	   return numberofpeople;
   }
   public int   getDays()
   {
	   return  daysofstay;
	   
   }
   public void printinfo(){
   System.out.println( destination+daysofstay+arrivaldate+numberofpeople);
    }
}
 
