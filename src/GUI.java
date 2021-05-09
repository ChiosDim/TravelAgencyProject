

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
	   private JPanel panel,panel2,Panel3,Panel4,paneldestination,panel3,panel4,panelpackage;
	   private JFrame frame ,frame2,Frame3,Frame4, framedestination,frame3,frame4;
	
		 private JLabel unsuccess,name,sg_friends,lastname,phonenumber,destinationlabel,numberofpeoplelabel,arrivaldatelabel,daysofstaylabel,Packages,packagelabel;
		private  JTextField userText,nameText,lastnameText,phonenumberText,numberofpeopletext,arrivaldatetext,daysofstaytext;
		private  JButton next_button,post_button,next_button_2,next_button_3,next_button_4,back_button;
		private JTextArea textArea_name,textArea_Email,textArea_covid,postText,postfriends, Sg_friends, line;
		private String post;
		private User User;
		private JList<String> listView, listView2;
		private DefaultListModel model,model2;
		private  ArrayList<User> Allusers = new ArrayList<>(); 
		private String Selecteddestination;
		 ArrayList<EconomyPackage> packages = new ArrayList<EconomyPackage>();
		public GUI( ArrayList<EconomyPackage> packages)
		 {
			 
			 this.packages=packages;
			
		        
	   //���������� ������� ���������  
			  panel= new JPanel();
				 frame = new JFrame();
				frame.setSize(350,400);
				frame.setTitle("����� ��������� ��������");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			     frame.add(panel);
				panel.setLayout(null);
				
		 
			
	  //���������� ������� �������� ��� �� ��������� �� �������� ��� ������
				name = new JLabel("'����� :");
				name.setBounds(20,20,165,25);
     			panel.add(name);
			 nameText =new JTextField("Please enter your name...");
				nameText.setBounds(100,20,190,25);
				panel.add(nameText);
				
				lastname = new JLabel("E������ :");
				lastname.setBounds(20,100,165,25);
     			panel.add(lastname);
     			lastnameText =new JTextField("Please enter your lastname..");
     			lastnameText.setBounds(100,100,190,25);
				panel.add(lastnameText);
				
				phonenumber = new JLabel("T������� :");
				phonenumber.setBounds(15,180,165,25);
     			panel.add(phonenumber);
     			phonenumberText =new JTextField("Please enter your phonenumber..");
     			phonenumberText.setBounds(100,180,190,25);
				panel.add(phonenumberText);
				
				
	   //����������  �������� �� ����� �� ��������� �� ������� ��������
				next_button = new JButton("��������");
				next_button.setBounds(180,320,130,25);
				panel.add(next_button);
				frame.setVisible(true);
					
			
	  //����������  �������� �� ����� �� ��������� ������� ��������  	
				ButtonListener listener = new ButtonListener();
				next_button.addActionListener(listener);
				
				
				
		       
		       
			 
		 }

	 //����� ������������ ��� �������� -user_page_button-
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
				 
				 
				    model.addElement("�����(50 ����)");
					model.addElement("�����(60 ����)");
					model.addElement("�����(80 ����)");
					model.addElement("�����(100 ����)");
					
					listView.setModel(model);
					destinationlabel = new JLabel("����������:");
					
					paneldestination.add(destinationlabel);
					paneldestination.add(listView);
					paneldestination.setBorder(BorderFactory.createLineBorder(Color.black));
					panel2.add(paneldestination);
					frame2.setContentPane(panel2);
					paneldestination.setLayout(new BoxLayout(paneldestination, BoxLayout.Y_AXIS));
					
					numberofpeoplelabel = new JLabel("������ ������:");
					numberofpeoplelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
					numberofpeoplelabel.setBounds(100, 300, 333, 333);
	     			frame2.add(numberofpeoplelabel);
	     			numberofpeopletext =new JTextField("Please enter the number of people..");
	     			numberofpeopletext.setLayout(new BoxLayout(numberofpeopletext, BoxLayout.Y_AXIS));
					frame2.add(numberofpeopletext);
					next_button_2 = new JButton("��������");
					next_button_2.setBounds(180,320,130,25);
					panel2.add(next_button_2);
					
					 
				frame2.setSize(220,300);
				
				frame2.setTitle("����� ����������/����������");
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setVisible(true);
				
			
				
				ButtonListener2 listener2 = new ButtonListener2();
				next_button_2.addActionListener(listener2);
				
				
				
				
				 
				
				
				
				
			
				
				
				
				
				
				
	           
	        }
		}
	
	                     

	            
	    

	  //����� ������������ ��� �������� -��-
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
		  			arrivaldatelabel = new JLabel("������� ����������� ����������:");
		  			arrivaldatelabel.setBounds(50,20,200,25);
	     			panel3.add(arrivaldatelabel);
	     			arrivaldatetext =new JTextField("Please enter your arrival date..");
	     			arrivaldatetext.setBounds(50,50,200,25);
					panel3.add(arrivaldatetext);
					
					frame3.setSize(350,400);
					frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				     frame3.add(panel3);
					panel3.setLayout(null);
					
					
					daysofstaylabel = new JLabel("������ ��������:");
					daysofstaylabel.setBounds(50,200,225,25);
	     			panel3.add(daysofstaylabel);
	     			daysofstaytext =new JTextField("Please enter the days of stay..");
	     			daysofstaytext.setBounds(50,230,200,25);
					panel3.add(daysofstaytext);
	
					
					
	                                   
					frame3.setVisible(true);
					next_button_3 = new JButton("��������");
					next_button_3.setBounds(180,320,130,25);
					panel3.add(next_button_3);
					
					ButtonListener3 listener3 = new ButtonListener3();
					next_button_3.addActionListener(listener3);
					
		  			}
		  			
		  			
	  	         
	  	          
	  	        
	  	          
	  	            
	  	        }

				
	  		
	}
	
	  		
	  		
	  		
	  		

	//����� ������������ ��� �������� -infection_button-
		class ButtonListener3 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	int daysofstay = Integer.parseInt(daysofstaytext.getText());
	        	String arrivaldate = arrivaldatetext.getText();
	        	int numberofpeo = Integer.parseInt(numberofpeopletext.getText());
	        	Travelinformation travelinformation = new Travelinformation(Selecteddestination,daysofstay,arrivaldate,numberofpeo );
	        	travelinformation.DestinationPrice();
	        	if( travelinformation.ValidDate()) {
	        		travelinformation.GetdestinationPrice();
	        		frame3.setVisible(false);
	        		panel4= new JPanel();
					 frame4 = new JFrame();

						frame4.setSize(250,250);
					     frame4.add(panel4);		
		     			 listView2 = new JList<String>();
						 model2 = new DefaultListModel<String>();
						 panelpackage= new JPanel();
						 
						 
						 
						
						 
						 
						 
						    model2.addElement("���������(20 ����/�����)");
							model2.addElement("����������(30 ����/�����)");
							model2.addElement("��������(50 ����/�����)");
							model2.addElement("�����������(100 ����/�����)");
							
							listView2.setModel(model2);
							packagelabel = new JLabel("E������ ������� ��������:");
							
							
							panelpackage.add(packagelabel);
							panelpackage.add(listView2);
							panelpackage.setBorder(BorderFactory.createLineBorder(Color.black));
							panel4.add(panelpackage);
							frame4.setContentPane(panel4);
							panelpackage.setLayout(new BoxLayout(panelpackage, BoxLayout.Y_AXIS));
							
							
							frame4.setTitle("M���� ������� ��������");
							frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
							back_button = new JButton("����");
							back_button.setBounds(180,320,130,25);
							panel4.add(back_button);
							
							next_button_4 = new JButton("��������");
							next_button_4.setBounds(180,320,130,25);
							panel4.add(next_button_4);
							
							
							
							
							
							
							frame4.setVisible(true);
							
							
						
	        		
	        	}
	        	else {
	        		JOptionPane.showMessageDialog(null, "No valid days of stay(1-7)");
	        	}
	        	
	            
	                }
	            }
	        
	    
	    }
		
		/*
		//����� ������������ ��� �������� -BackLoginButton-
	    class ButtonListener4 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	           Frame4.setVisible(false);
	            
	        }
	    }
	    
	    /*
	  //����� ������������ ��� �������� -back_login_button2-
	    class ButtonListener5 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Frame4.setVisible(false);
	        }
	    }
	    
	    
	    
	  //����� ������������ ��� �������� -post_button-
	    class ButtonListener6 implements ActionListener {

	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	
	        	 post = postText.getText();
	        	 //������� ����������� �� ���� ��� ������ 
	 			Post pst = new Post(post,User);
	        }
	    }
	   
	   
	     */
	
	
	

