

import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{
	
	 JFrame frame = new JFrame();
	 JButton nextButton = new JButton("Συνέχεια");
	 JPanel panel = new JPanel();
	 JLabel nameLabel = new JLabel("Όνομα");
     JLabel LnameLabel = new JLabel("Επίθετο");
     JLabel numberButton = new JLabel("Τηλέφωνο");


 
 LaunchPage(){
	
	 //panel.setLayout(null);

          
     nameLabel.setBounds(10,40,80,25);
     frame.add(nameLabel);

     
     JTextField nameText = new JTextField(20);
     nameText.setBounds(100,40,165,25);
     frame.add(nameText);
     
     LnameLabel.setBounds(10,110,80,25);
     frame.add(LnameLabel);

    
     JTextField LnameText = new JTextField(20);
     LnameText.setBounds(100,110,165,25);
     frame.add(LnameText);
     
     numberButton.setBounds(10,180,80,25);
     frame.add(numberButton);

    
     JTextField numberText = new JTextField(20);
     numberText.setBounds(100,180,165,25);
     frame.add(numberText);
     
     //panel.setVisible(true);
	 
  
	nextButton.setBounds(200, 280, 80, 25);
	nextButton.setFocusable(false);
	nextButton.addActionListener(this);
	
  
    frame.add(nextButton);
  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(350, 380);   
    frame.setLayout(null);
    frame.setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e){
	 
  
     if(e.getSource()==nextButton) {
      frame.dispose();
      NewWindow myWindow = new NewWindow();
     }
   }
}