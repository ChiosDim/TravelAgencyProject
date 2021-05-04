

	import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JPanel;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
	import javax.swing.ScrollPaneConstants;

	import java.util.*;

	public class GUI extends JFrame {
	   private JPanel panel,panel2,Panel3,Panel4,paneldestination;
	   private JFrame frame ,frame2,Frame3,Frame4, framedestination;
		 private JLabel unsuccess,name,sg_friends,lastname,phonenumber,destinationlabel;
		private  JTextField userText,nameText,lastnameText,phonenumberText;
		private  JButton next_button,infection_button,back_login_button1,BackLoginButton,back_login_button2,post_button;
		private JTextArea textArea_name,textArea_Email,textArea_covid,postText,postfriends, Sg_friends;
		private String post;
		private User User;
		private JList listView;
		private DefaultListModel model;
		private  ArrayList<User> Allusers = new ArrayList<>(); 
		
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
				 nameText =new JTextField("Please enter your name..");
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
	          
	           long phonenumber = Integer.parseInt(phonenumberText.getText());
	           User user = new User(name,lastname,phonenumber);
	           frame2 = new JFrame();
	           panel2= new JPanel();
	           paneldestination= new JPanel();
				 
				 listView = new JList<String>();
				 model = new DefaultListModel<String>();
				 
				 
				 model.addElement("Αθήνα");
					model.addElement("Πάτρα");
					model.addElement("Ρόδος");
					model.addElement("Κρήτη");
					
					listView.setModel(model);
					destinationlabel = new JLabel("Προορισμός");
					paneldestination.setLayout(new BoxLayout(paneldestination, BoxLayout.Y_AXIS));
					paneldestination.setAlignmentX(Component.CENTER_ALIGNMENT);
					paneldestination.add(destinationlabel);
					paneldestination.add(listView);
					panel2.add(paneldestination);
					paneldestination.setBorder(BorderFactory.createLineBorder(Color.black));
					panel2.add(paneldestination);
					frame2.setContentPane(panel2);
					 frame2.setVisible(true);
				frame2.setSize(350,320);
				frame2.setLocation(200, 0);
				frame2.setTitle("Μενού Προορισμού/Ημερομηνία");
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     
				
				
				
				 
				
				
				
				
			
				
				
				
				
				
				
	           
	        }
		}
	}
	           /*
	          
	            boolean flag = true;
	              //Έλεγχος αν το ονομα του χρήστη είναι έγκυρο
	                for(User user :Allusers) {
	               //Αν το όνομα χρήστη είναι έγκυρο 
	                if(name.equals(user.Name)) {
	                	User=user;
	                     flag = false;
	                   //Δημιούργια παραθύρου-λογαριασμού του χρήστη
	                     Panel4= new JPanel();
	                     Frame4 = new JFrame();
	                     Frame4.setSize(520,600);
	                     Frame4.setTitle("Σέλιδα Χρήστη");
	                     Frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                     Frame4.add(Panel4);
	                     Panel4.setLayout(null);
	                     Frame4.setVisible(true);
	                    //Εμφάνιση:
	                     //Όνομα 
	                      textArea_name = new JTextArea();
	                     textArea_name.setBounds(10, 7,100, 20);
	                     textArea_name.append(user.Name);
	                     textArea_name.setEditable(false); 
	                     Panel4.add(textArea_name);
	                                   
	                     //Email              
	                     textArea_Email= new JTextArea();
	                     textArea_Email.setBounds(120, 7,170, 20);
	                     textArea_Email.append(user.Email);
	                     textArea_Email.setEditable(false);
	                     Panel4.add(textArea_Email);
	                    //Δημιουργία  κουμπιού που στέλνει τον χρήστη στο αρχικό παράθυρο  
	                     back_login_button2 = new JButton("Back to Login Screen"); 
	                     back_login_button2.setBounds(300, 4, 180, 25);
	                     Panel4.add(back_login_button2);
	                     ButtonListener5 listener5 = new ButtonListener5();
	                     back_login_button2.addActionListener(listener5);
	                     
	                     
	                   //Δημιουργία πλαίσιο κειμένου στο οποίο ο χρήστης κάνει  posts
	                    postText =new JTextArea();
	         			postText.setBounds(80,140,220,160);
	         			Panel4.add(postText);
	         			Frame4.setVisible(true);
	         			
	         			
	         			byfriends = new JLabel("Recent Posts by Friends");
	         			byfriends.setBounds(65, 370, 300, 25);
	         			Panel4.add(byfriends);
	         			
	         		//Δημιουργία πλαίσιο κειμένου στο οποίο εμφανίζει τα ποστ των φίλων του χρήστη καθως και τα ποστ του χρήστη
	         			postfriends =new JTextArea();
	         			postfriends.setBounds(210,310,220,160);
	         			
	         			postfriends.setEditable(false); 
	         	       
	         			Panel4.add(postfriends);
	         			//Ταξηνόμηση ημερομηνιας 
	         			user.Posts().sort(Comparator.comparing(Post::getDate));
	         		    Collections.reverse(user.Posts());
	         			for(Post post : user.Posts())
	         			{
	         				
	         			
	         				postfriends.append(post.name + "" +post.date+"\n"+ post.post+"\n");
	         				
	         			}
	         			sg_friends = new JLabel("Suggested Friends");
	         			sg_friends.setBounds(170, 480, 300, 25);
	                    Panel4.add(sg_friends);
	                    
	                   //Δημιουργία πλαίσιο κειμένου που εμφανίζει τους προροτεινόμενους φίλους
	                       Sg_friends = new JTextArea();
	                       Sg_friends.setBounds(280,482,80,58);
	                       Sg_friends.setEditable(false); 
	                       for(User user1 : user. suggested_friends())
	            			{
	            				
	            			
	                    	   Sg_friends.append(user1.Name+"\n");
	            				
	            			}
	                     
	                       Panel4.add(Sg_friends);
	                      
	         	      
	         			
	                    
	                    
	                    //δημιουργία κουμπιού το οποίο αποθηκεύει το ποστ
	         			post_button = new JButton("Post");
	         			post_button.setBounds(310, 200, 70, 25);
	         			Panel4.add(post_button);
	         			 ButtonListener6 listener6 = new ButtonListener6();
	         			post_button.addActionListener(listener6);
	         			
	         			
	                     
	                }

	            }
	         //Αν το όνομα του χρήστη δεν είναι έγκυρο
	            if(flag==true) {

	              //δημιουργεια παραθύρου-μηνύματος 
	                Panel2= new JPanel();
	                Frame2 = new JFrame();
	                Frame2.setSize(300,130);
	                Frame2.setTitle("Message");
	                Frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	                Frame2.add(Panel2);
	                Panel2.setLayout(null);

	                unsuccess = new JLabel("User "+name+" Not found");
	                unsuccess.setBounds(65, 15, 300, 25);
	                
	                Panel2.add(unsuccess);

	                Frame2.setVisible(true);
	              //Δήμιουργια κουμπιου το οποίο στελνει τον χρηστη στο αρχικό παράθυρο
	                back_login_button1 = new JButton("OK");
	                back_login_button1.setBounds(100, 40, 60, 20);
	                Panel2.add(back_login_button1);
	                

	                ButtonListener2 listener2 = new ButtonListener2();
	                back_login_button1.addActionListener(listener2);
	     
	                
	                
	    			 
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                
	                

	            }


	        }
	    }

		//κλάση ανταπόκρισης του κουμπιού -ΟΚ-
		class ButtonListener2 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Frame2.setVisible(false);
	        }
	    }

	//κλάση ανταπόκρισης του κουμπιού -infection_button-
		class ButtonListener3 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	ArrayList<User> covidfr = new ArrayList<>();
	            String name = userText.getText();

	       for(User user :Allusers) {
	                if(name.equals(user.Name)) {
	                	covidfr = user.detect_virus();

	 //Δημιουργία πλαίσιο κειμένου με τους χρήστες που πιθανόν να έχουν μολυνθεί
	                    Panel3= new JPanel();
	                    Frame3 = new JFrame();
	                    Frame3.setSize(471,299);
	                    Frame3.setTitle("Πιθανή Μετάδοση Ιού");
	                    Frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	                    Frame3.add(Panel3);
	                    Panel3.setLayout(null);

	                     textArea_covid = new JTextArea();
	                    textArea_covid.setBounds(11, 4, 431, 189);
	                    textArea_covid.append("****************************************************************************"+"\n"
	                                   +name+ " has been inflected. The following users have to been tested"+"\n"
	                                   +"****************************************************************************"+"\n");
	                    for(User friends :covidfr) {
	                    	textArea_covid.append(friends.Name+"\n");
	                    }
	                    textArea_covid.setEditable(false);
	                    Panel3.add(textArea_covid);

	                    

	                    Frame3.setVisible(true);
	                    
	                    
	                  //Δήμιουργια κουμπιου το οποίο στελνει τον χρηστη στο αρχικό παράθυρο
	                    BackLoginButton = new JButton("Back to Login Screen");
	                    BackLoginButton.setBounds(119, 197, 197, 22);
	                    Panel3.add(BackLoginButton);

	                    ButtonListener4 listener4 = new ButtonListener4();
	                    BackLoginButton.addActionListener(listener4);
	                    
	                }
	            }
	        }
	    }
		
		 
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
	
	
	

