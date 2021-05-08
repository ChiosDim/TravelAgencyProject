

	import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.sound.sampled.Line;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.ScrollPaneConstants;

	import java.util.*;

	public class GUI extends JFrame {
	   private JPanel panel,panel2,Panel3,Panel4,paneldestination,panel3;
	   private JFrame frame ,frame2,Frame3,Frame4, framedestination,frame3;
		 private JLabel unsuccess,name,sg_friends,lastname,phonenumber,destinationlabel,numberofpeoplelabel,arrivaldatelabel,daysofstaylabel;
		private  JTextField userText,nameText,lastnameText,phonenumberText,numberofpeopletext,arrivaldatetext,daysofstaytext;
		private  JButton next_button,post_button,next_button_2,next_button_3;
		private JTextArea textArea_name,textArea_Email,textArea_covid,postText,postfriends, Sg_friends, line;
		private String post;
		private User User;
		private JList<String> listView;
		private DefaultListModel model;
		private  ArrayList<User> Allusers = new ArrayList<>(); 
		private String Selecteddestination;
		
		public GUI()
		 {
			 
			 
			
		        
	   //Δημιουργία αρχικού παραθύρου  
			  panel= new JPanel();
				 frame = new JFrame();
				frame.setSize(350,400);
				frame.setTitle("Μενού Στοιχείων Κράτησης");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame.add(panel);
				panel.setLayout(null);
				
		 
			
	  //Δημιουργία πλαίσιο κειμένου που θα εισάγουμε τα στοιχεια του χρηστη
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

	 //κλάση ανταπόκρισης του κουμπιού -user_page_button-
		class ButtonListener implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent arg0) {
	            String name = nameText.getText();
	            String lastname = lastnameText.getText();
	            frame.setVisible(false);
	          
	           long phonenumber = Integer.parseInt(phonenumberText.getText());
	           User user = new User(name,lastname,phonenumber);
	           frame2 = new JFrame();
	           panel2= new JPanel();
	           paneldestination= new JPanel();
				 
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
					panel2.add(paneldestination);
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
	
	                     

	            
	    

	  //κλάση ανταπόκρισης του κουμπιού -ΟΚ-
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
	
	  		
	  		
	  		
	  		

	//κλάση ανταπόκρισης του κουμπιού -infection_button-
		class ButtonListener3 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	int daysofstay = Integer.parseInt(daysofstaytext.getText());
	        	String arrivaldate = arrivaldatetext.getText();
	        	int numberofpeo = Integer.parseInt(numberofpeopletext.getText());
	        	Travelinformation travelinformation = new Travelinformation(Selecteddestination,daysofstay,arrivaldate,numberofpeo );	
	        	if( travelinformation.ValidDate()) {
	        		
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "No valid days of stay(1-7)");
	        	}
	        	
	            
	                }
	            }
	        
	    
	    }
		
		/*
		//κλάση ανταπόκρισης του κουμπιού -BackLoginButton-
	    class ButtonListener4 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Frame3.setVisible(false);
	        }
	    }
	    
	    
	  //κλάση ανταπόκρισης του κουμπιού -back_login_button2-
	    class ButtonListener5 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Frame4.setVisible(false);
	        }
	    }
	    
	    
	    
	  //κλάση ανταπόκρισης του κουμπιού -post_button-
	    class ButtonListener6 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	 post = postText.getText();
	        	 //Γίνεται αντικείμενο το πόστ του χρήστη 
	 			Post pst = new Post(post,User);
	        }
	    }
	   
	   
	     */
	
	
	

