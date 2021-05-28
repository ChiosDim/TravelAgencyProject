
public class User {

 private  String name;
 private  String lastname;
 private   long  phonenumber; 
   
 
    public User(String  name, String lastname, long phonenumber)
    { 
    	this.name=name;
    	this.lastname=lastname;
    	this.phonenumber=phonenumber;
    }
    public String  Getname()
	   {
		   return name;
	   }
    public String  Getlastname()
	   {
		   return lastname;
	   }
    public long  Getphonenumber()
	   {
		   return phonenumber;
	   }
    
	
	
}
