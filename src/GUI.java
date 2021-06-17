

	import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	

	import java.util.*;

	public class GUI extends JFrame {
	   private JPanel panel,panel2,paneldestination,panel3,panel4,panelpackage,panel5,carpanel,panel6,panel7,panel0,panelsh;
	   private JFrame frame ,frame2, frame3,frame4,frame5,frame6,frame7,frame0, framesh;
	
		 private JLabel name,lastname,phonenumber,destinationlabel,numberofpeoplelabel,arrivaldatelabel,daysofstaylabel,packagelabel,carlabel,prizelabel,label;
		private  JTextField nameText,lastnameText,phonenumberText,numberofpeopletext,arrivaldatetext,daysofstaytext;
		private  JButton next_button,next_button_2,next_button_3,next_button_4,back_button,next_button_5,next_button_7,  next_button_8,next_button_9,next_button_0,showdata_button,next_button_sh;
		private JTextArea textArea_price,textArea_data,textArea_sh;
		
		
		private JList<String> listView, listView2,listView3;
		private DefaultListModel model,model2,model3;
	
		private String Selecteddestination;
		private String Selectedpackage;
		private String Selectedcar;
		 ArrayList<EconomyPackage> packages = new ArrayList<>();
		 private Travelinformation t;
		 private User USER;
		 private EconomyPackage PACKAGE;
		 ArrayList<BookingInformation> BIlist = new ArrayList<>();
		
		 
		public GUI( ArrayList<EconomyPackage> packages)
		 {
			 
			 this.packages=packages;
			
		        
	   //Δημιουργία αρχικού παραθύρου  
			  panel0= new JPanel();
				 frame0 = new JFrame();
				frame0.setSize(300,300);
				frame0.setTitle("AΡΧΙΚΗ");
				frame0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame0.add(panel0);
				panel0.setLayout(null);
				
		 
		
		//Δημιουργία  κουμπιού το οποίο θα εμφανίσει επομενο παραθυρο  
				next_button_0 = new JButton("Συνέχεια");
				next_button_0.setBounds(80,100,130,25);
				panel0.add(next_button_0);
				frame0.setVisible(true);
			
		//Δημιουργία  κουμπιού το οποίο θα εμφανίσει τα δεδομένα  
				showdata_button = new JButton("Show data");
				showdata_button.setBounds(80,150,130,25);
				panel0.add(showdata_button);
				frame0.setVisible(true);
					
				ButtonListener0 listener0 = new ButtonListener0();
				next_button_0.addActionListener(listener0);
				
	  	
				ButtonListeners listeners = new ButtonListeners();
				showdata_button.addActionListener(listeners);
				
				
				
				
			
		       
		       
			 
		 }
		
		//Κλάση ανταπόκρισης του κουμπιού(showdata_button)
		
		 class ButtonListeners implements ActionListener {

		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	
		        	frame0.setVisible(false);
		        	panelsh= new JPanel();
					 framesh = new JFrame();
					 framesh.setSize(400,400);
					 framesh.setTitle("ΔΕΔΟΜΕΝΑ");
					 framesh.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					 framesh.add(panelsh);
					 panelsh.setLayout(null);
					 
					 label = new JLabel("ΣΤΑΤΙΣΤΙΚΑ :");
						label.setBounds(20,20,165,25);
						panelsh.add(label);
		   			textArea_sh= new JTextArea();
		            textArea_sh.setBounds(150, 20, 200, 150);
		          
		          //Διαδικασία δημιουργίας στατιστικών
		            
		          double athenspr=0;
		          double  cretepr=0;
		          double rodespr=0;
		          double patrapr=0;
		          double athenspl=0;
		          double  cretepl=0;
		          double rodespl=0;
		          double  patrapl=0;
		          double total=0;
		          for(BookingInformation b: BIlist) {
		        	  if(b.getTravelInfo().getdestination()=="Αθήνα(50 ευρώ)") {
		        		  athenspl++;
		        		  
		        	  }
		        	  if(b.getTravelInfo().getdestination()=="Κρήτη(100 ευρώ)") {
		        		  cretepl++;
		        	  }
                     if(b.getTravelInfo(). getdestination()=="Ρόδος(80 ευρώ)") {
                    	 rodespl++;
		        	  }
                     if(b.getTravelInfo().getdestination()=="Πάτρα(60 ευρώ)") {
                    	 patrapl++;
		        	  }
		          }
		          total=athenspl+cretepl+rodespl+patrapl;
		          if(total!=0) {
		          athenspr=athenspl*(100/total);
		          cretepr=cretepl*(100/total);
		          rodespr=rodespl*(100/total);
		          patrapr= patrapl*(100/total);}
		          
		           
		          //Εμφάνιση στατιστικών 
		            
		            textArea_sh.append("ΠΡΟΟΡΙΣΜΟΙ" +"\n"+"ΑθΗΝΑ:"+athenspr+"%"+"\n"+"ΚΡΗΤΗ:"+cretepr+"%"+"\n"+"ΡΟΔΟΣ:"+rodespr+"%"+"\n"+"ΠΑΤΡΑ:"+ patrapr+"%");
		            panelsh.add(textArea_sh);
		           
		            
		            textArea_sh.setEditable(false);
					
			 
		          //Δημιουργία  κουμπιού το οποίο θα εμφανίσει το κουμπί που θα πάει πίσω

					next_button_sh = new JButton("ΠΙΣΩ");
					next_button_sh.setBounds(80,300,130,25);
					panelsh.add(next_button_sh);
					 framesh.setVisible(true);
						
					
						
					 ButtonListene listene = new ButtonListene();
					next_button_sh.addActionListener(listene);
					
		        }
		    }
		 
		//Κλάση ανταπόκρισης του κουμπιού(next_button_sh)
		 
		 class ButtonListene implements ActionListener {

		        @Override
		        public void actionPerformed(ActionEvent e) {
		        	framesh.setVisible(false);
		        	 frame0.setVisible(true);
		        	
		           
					
		        }
		    }
		//Κλάση ανταπόκρισης του κουμπιού(next_button_0)
		class ButtonListener0 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame0.setVisible(false);
	 
	        	panel= new JPanel();
                frame = new JFrame();
               frame.setSize(350,400);
               frame.setTitle("Μενού Στοιχείων Κράτησης");
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(panel);
               panel.setLayout(null);



               
        	   //Δημιουργία αρχικού παραθύρου 
               name = new JLabel("'Ονομα :");
               name.setBounds(20,20,165,25);
                panel.add(name);
            nameText =new JTextField("Please enter your name...");
               nameText.setBounds(100,20,190,25);
               panel.add(nameText);

               lastname = new JLabel("Eπίθετο :");
               lastname.setBounds(20,100,165,25);
                panel.add(lastname);
                lastnameText =new JTextField("Please enter your lastname..");
                lastnameText.setBounds(100,100,190,25);
               panel.add(lastnameText);

               phonenumber = new JLabel("Tηλέφωνο :");
               phonenumber.setBounds(15,180,165,25);
                panel.add(phonenumber);
                phonenumberText =new JTextField("Please enter your phonenumber..");
                phonenumberText.setBounds(100,180,190,25);
               panel.add(phonenumberText);


      //Δημιουργία  κουμπιού το οποίο θα εμφανίσει το επόμενο παράθυρο
               next_button = new JButton("Συνέχεια");
               next_button.setBounds(180,320,130,25);
               panel.add(next_button);
               frame.setVisible(true);


     //Δημιουργία  κουμπιού το οποίο θα εμφανίσει επομενο παραθυρο
               ButtonListener listener = new ButtonListener();
               next_button.addActionListener(listener);
	           
				
	        }
	    }
	 //κλάση ανταπόκρισης του κουμπιού (next_button)
		class ButtonListener implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	        	 
	            String name = nameText.getText();
	            String lastname = lastnameText.getText();
	            frame.setVisible(false);
	          
	           long phonenumber = Integer.parseInt(phonenumberText.getText());
	           //Δημιουργία αντικειμένου τύπου User
	           User user = new User(name,lastname,phonenumber);
	           USER=user;
	           frame2 = new JFrame();
	           panel2= new JPanel();
	           paneldestination= new JPanel();
				//Δημιουργία λίστας 
				 listView = new JList<String>();
				 model = new DefaultListModel<String>();
				 
				 
				    model.addElement("Αθήνα(50 ευρώ)");
					model.addElement("Πάτρα(60 ευρώ)");
					model.addElement("Ρόδος(80 ευρώ)");
					model.addElement("Κρήτη(100 ευρώ)");
					
					listView.setModel(model);
					destinationlabel = new JLabel("Προορισμός:");
					
					paneldestination.add(destinationlabel);
					paneldestination.add(listView);
					paneldestination.setBorder(BorderFactory.createLineBorder(Color.black));
					panel2.add(paneldestination);
					frame2.setContentPane(panel2);
					paneldestination.setLayout(new BoxLayout(paneldestination, BoxLayout.Y_AXIS));
					
					numberofpeoplelabel = new JLabel("Πλήθος ατόμων:");
					numberofpeoplelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
					numberofpeoplelabel.setBounds(100, 300, 333, 333);
	     			frame2.add(numberofpeoplelabel);
	     			numberofpeopletext =new JTextField("Please enter the number of people..");
	     			numberofpeopletext.setLayout(new BoxLayout(numberofpeopletext, BoxLayout.Y_AXIS));
					frame2.add(numberofpeopletext);
					next_button_2 = new JButton("Συνέχεια");
					next_button_2.setBounds(180,320,130,25);
					panel2.add(next_button_2);
					
					 
				frame2.setSize(220,300);
				
				frame2.setTitle("Μενού Προορισμού/Ημερομηνία");
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setVisible(true);
				
			
				
				ButtonListener2 listener2 = new ButtonListener2();
				next_button_2.addActionListener(listener2);
				
				
				
				
				 
				
				
				
				
			
				
				
				
				
				
				
	           
	        }
		}
	
	                     

	            
	    

	  //κλάση ανταπόκρισης του κουμπιού (next_button_2)
	  		class ButtonListener2 implements ActionListener {
	  			
	  	        @Override
	  	        public void actionPerformed(ActionEvent e) {
	  	        	 
	  	        	Graphics g = null;
	  	            frame2.setVisible(false);
	  	          String selecteddestination = listView.getSelectedValue();
		  			Selecteddestination =selecteddestination ;
		  			if(Selecteddestination==null) {
		  			JOptionPane.showMessageDialog(null, "No destination selected!");
		  			frame2.setVisible(true);
		  			
		  			
		  			}
		  			else {
		  			panel3= new JPanel();
					 frame3 = new JFrame();
		  			arrivaldatelabel = new JLabel("Επιλογή ημερομηνίας αναχώρησης:");
		  			arrivaldatelabel.setBounds(50,20,200,25);
	     			panel3.add(arrivaldatelabel);
	     			arrivaldatetext =new JTextField("Please enter your arrival date..");
	     			arrivaldatetext.setBounds(50,50,200,25);
					panel3.add(arrivaldatetext);
					
					frame3.setSize(350,400);
					frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				     frame3.add(panel3);
					panel3.setLayout(null);
					
					
					daysofstaylabel = new JLabel("Ημέρες διαμονής:");
					daysofstaylabel.setBounds(50,200,225,25);
	     			panel3.add(daysofstaylabel);
	     			daysofstaytext =new JTextField("Please enter the days of stay..");
	     			daysofstaytext.setBounds(50,230,200,25);
					panel3.add(daysofstaytext);
	
					
					
	                                   
					frame3.setVisible(true);
					next_button_3 = new JButton("Συνέχεια");
					next_button_3.setBounds(180,320,130,25);
					panel3.add(next_button_3);
					
					ButtonListener3 listener3 = new ButtonListener3();
					next_button_3.addActionListener(listener3);
					
		  			}
		  			
		  			
	  	         
	  	          
	  	        
	  	          
	  	            
	  	        }

				
	  		
	}
	
	  		
	  		
	  		
	  		

	//κλάση ανταπόκρισης του κουμπιού (next_button_3)
		class ButtonListener3 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	int daysofstay = Integer.parseInt(daysofstaytext.getText());
	        	String arrivaldate = arrivaldatetext.getText();
	        	int numberofpeo = Integer.parseInt(numberofpeopletext.getText());
	        	//Δημιουργία αντικειμένου Travelinformation
	        	Travelinformation travelinformation = new Travelinformation(Selecteddestination,daysofstay,arrivaldate,numberofpeo );
	        	
	        	travelinformation.DestinationPrice();
	        	//Έλεγχος εγκυρότητας ημερών
	        	if( travelinformation.ValidDate()) {
	        		travelinformation.GetdestinationPrice();
	        		frame3.setVisible(false);
	        		panel4= new JPanel();
					 frame4 = new JFrame();

						frame4.setSize(300,250);
					     frame4.add(panel4);
					     //Δημιουργία λίστας
		     			 listView2 = new JList<String>();
						 model2 = new DefaultListModel<String>();
						 panelpackage= new JPanel();
						 
						 
						 
						
						 
						 
						 
						    model2.addElement("Φοιτητικό(20 ευρώ/ημέρα)");
							model2.addElement("Οικονομικό(30 ευρώ/ημέρα)");
							model2.addElement("Κανονικό(50 ευρώ/ημέρα)");
							model2.addElement("Πολυτελείας(100 ευρώ/ημέρα)");
							
							listView2.setModel(model2);
							packagelabel = new JLabel("Eπιλογή πακέτου διαμονής:");
							
							
							panelpackage.add(packagelabel);
							panelpackage.add(listView2);
							panelpackage.setBorder(BorderFactory.createLineBorder(Color.black));
							panel4.add(panelpackage);
							frame4.setContentPane(panel4);
							panelpackage.setLayout(new BoxLayout(panelpackage, BoxLayout.Y_AXIS));
							
							
							frame4.setTitle("Mενού Πακέτων Διαμονής");
							frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
							back_button = new JButton("Πίσω");
							back_button.setBounds(180,320,130,25);
							panel4.add(back_button);
							ButtonListener4 listener4 = new ButtonListener4();
							back_button.addActionListener(listener4);
							
							next_button_4 = new JButton("Συνέχεια");
							next_button_4.setBounds(180,320,130,25);
							panel4.add(next_button_4);
							ButtonListener5 listener5 = new ButtonListener5();
							next_button_4.addActionListener(listener5);
							
							
							
								
							frame4.setVisible(true);
							t=travelinformation;
							
							
						
	        		
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "No valid days of stay(1-7)");
	        	}
	        	
	            
	                }
	            }
	        
	    
	    
		
		
		//κλάση ανταπόκρισης του κουμπιού (back_button)
	    class ButtonListener4 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame4.setVisible(false);
	        	frame3.setVisible(true);
	            
	        }
	    }
	
	    
	    
	  //κλάση ανταπόκρισης του κουμπιού (next_button_4)
	    class ButtonListener5 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            frame4.setVisible(false);
	            panel5= new JPanel();
	            carpanel= new JPanel();
				 frame5 = new JFrame();
				frame5.setSize(350,200);
				frame5.setTitle("Μενού Ενοικίασης Αυτοκινήτου");
				
			     frame5.add(panel5);
				//Δημιουργία λίστας
				 listView3 = new JList<String>();
				 model3 = new DefaultListModel<String>();
				 
				 
				    model3.addElement("ΝΑΙ (20 ευρώ/ημέρα)");
					model3.addElement("ΟΧΙ");
					
					
					listView3.setModel(model3);
					carlabel = new JLabel("Θα επιθυμούσατε να ενοικιάσετε αυτοκίνητο:");
					
					 carpanel.add(carlabel);
					 carpanel.add(listView3);
					 carpanel.setBorder(BorderFactory.createLineBorder(Color.black));
					panel5.add(carpanel);
					carpanel.setLayout(new BoxLayout(carpanel, BoxLayout.Y_AXIS));
					next_button_5 = new JButton("Συνέχεια");
					
					frame5.setContentPane(panel5);
					panel5.add(next_button_5);
					ButtonListener6 listener6 = new ButtonListener6();
					next_button_5.addActionListener(listener6);
					
					
     			frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     			frame5.setVisible(true);
	            
	            
	        }
	    }
	
	    
	    
	    
	    
	  //κλάση ανταπόκρισης του κουμπιού (next_button_5)
	    class ButtonListener6 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	String selectedpackage = listView2.getSelectedValue();
	        	Selectedpackage=selectedpackage;
	        	String selectedcar = listView3.getSelectedValue();
	        	Selectedcar=selectedcar;
	        	//Δημιουργία αντικείμενου τύπου EconomyPackage
	        	EconomyPackage  Package = null;
	        	
	        		for(EconomyPackage P: packages ) {
	        			
	        			
	        		if(selectedpackage.equals("Φοιτητικό(20 ευρώ/ημέρα)")&& packages.get(0).equals(P)) {
	        			Package=P;
	        			
	        		}
	        		if(selectedpackage.equals("Οικονομικό(30 ευρώ/ημέρα)")&& packages.get(1).equals(P)) {
	        			Package=P;
	        			
	        		}
	        		if(selectedpackage.equals("Κανονικό(50 ευρώ/ημέρα)")&& packages.get(2).equals(P)) {
	        			Package=P;
	        			
	        		}
	        		if(selectedpackage.equals("Πολυτελείας(100 ευρώ/ημέρα)")&& packages.get(3).equals(P)) {
	        			Package=P;
	        			
	        		}
	        		
	        		 
	        		}
	        		
	        		Package.Car(selectedcar);
	        		Package.CalculatePrice(t);
	        		PACKAGE=Package;
	        		frame5.setVisible(false);
	 	            panel6= new JPanel();
	 				 frame6 = new JFrame();
	 				frame6.setSize(350,300);
	 				frame6.setTitle("Tελικό ποσό κράτησης");
	 				prizelabel = new JLabel("Τελικό ποσό πληρωμής:");
	 				//Εμφάνιση τιμής
	 				textArea_price = new JTextArea();
                    textArea_price.setBounds(11, 4, 431, 189);
                    textArea_price.append(String.valueOf(Package.Gettotalprice())+"");
                   
                    
                    textArea_price.setEditable(false);
	 				
                    frame6.add(panel6);
                    panel6.add(prizelabel);
                    panel6.add(textArea_price);
                    next_button_7 = new JButton("Κράτηση");
                    panel6.add(next_button_7);
                   
                    frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame6.setVisible(true);
                    
                     
                    
 					ButtonListener7 listener7 = new ButtonListener7();
 					next_button_7.addActionListener(listener7);
 					
	        	
	        	
	        		}
	       }
	  //κλάση ανταπόκρισης του κουμπιού (next_button_7)
	    class ButtonListener7 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame6.setVisible(false);
	        	
	        //Δημιουρία αντικειμένου BookingInformation
	           BookingInformation bi= new  BookingInformation(USER,t,PACKAGE );
	           BIlist.add(bi);
	           
	          
	           panel7= new JPanel();
				 frame7 = new JFrame();
				frame7.setSize(400,400);
				frame7.setTitle("Ολοκλήρωση κράτησεις");
				frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame7.add(panel7);
				panel7.setLayout(null);
				
		 
			
	  //Δημιουργία πλαίσιο κειμένου που θα εισάγουμε τα στοιχεια του χρηστη
				label = new JLabel("Στοιχεία κράτησεις :");
				label.setBounds(20,20,165,25);
   			panel7.add(label);
   			textArea_data = new JTextArea();
            textArea_data.setBounds(150, 20, 200, 150);
            textArea_data.append("Όνομα:"+ USER.Getname()+"\n"+"Επίθετο:"+ USER.Getlastname()+"\n"+"Τηλέφωνο:"+ USER.Getphonenumber()+"\n"+"Ημερομηνία:"+ t.getarrivaldate()+"\n"+"Πακέτο:"+Selectedpackage+"\n"+"’τομα:"+t.getNumber()+"\n"+"Αυτοκίνητο:"+Selectedcar);
            panel7.add(textArea_data);
           
            
            textArea_data.setEditable(false);
				
			
				frame7.setVisible(true);
					
				next_button_8 = new JButton("ΤΕΛΟΣ");
                panel7.add(next_button_8);
                next_button_8.setBounds(180,250,130,25);
	  //Δημιουργία  κουμπιού το οποίο θα εμφανίσει επομενο παραθυρο  	
				ButtonListener8 listener8 = new ButtonListener8();
				next_button_8.addActionListener(listener8);
				next_button_9 = new JButton("AΡΧΙΚΗ");
                panel7.add(next_button_9);
                next_button_9.setBounds(50,250,130,25);
                ButtonListener9 listener9 = new ButtonListener9();
				next_button_9.addActionListener(listener9);
				
	           
				
	        }
	    }
	  //κλάση ανταπόκρισης του κουμπιού (next_button_8)
	    class ButtonListener8 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame7.setVisible(false);
	           
				
	        }
	    }
	    class ButtonListener9 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	frame7.setVisible(false);
	        	frame0.setVisible(true);
	           
				
	        }
	    }
	}
	
	
	
	    
	   
	   
	     
	
	
	

