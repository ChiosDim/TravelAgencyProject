import java.util.ArrayList;

public class Main {

 public static void main(String[] args) {
  
     
    ArrayList<EconomyPackage> packages = new ArrayList<EconomyPackage>();
    
    StudentPackage package1= new StudentPackage(20,2,20 );
    EconomyPackage package2= new EconomyPackage(30,3);
    BasicPackage   package3= new BasicPackage(50,4,true);
    DeluxePackage  package4= new DeluxePackage(100,5,true,true,true);
   
    packages.add(package1);
    packages.add(package2);
    packages.add(package3);
    packages.add(package4);
    
   
    
    


	
   
    	
    
    
    		
   new GUI( packages);
 }
}
