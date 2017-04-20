import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Constructor;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddService extends JPanel implements ActionListener, MouseListener{
	
	private UsuarioLayout userPanel;
	
	private JComboBox dropDown;
	private String[] services;
	private JLabel tipLb;
	private JButton btnAddService, btnGoBack;
	private JTextField accountTxt;
	
	public AddService(UsuarioLayout usuario){
		this.userPanel = usuario;
		this.services = new String[]{"Select a Service","Light","Gas","Cable/TV","Comunication/Phone"};
		
		
		this.dropDown = new JComboBox(this.services);
		//this.setLayout(new FlowLayout());
		
		this.accountTxt = new JTextField(15);
		this.accountTxt.setText("Account No.");
		//this.tipLb = new JLabel("Account No.");
		this.btnAddService = new JButton("Add Service");
		this.btnGoBack = new JButton("Back");
		
		this.setLayout(new GridLayout(0, 1));
		this.add(this.dropDown);

		//this.add(this.tipLb);
		this.add(this.accountTxt);
		
		this.add(this.btnAddService);
		this.add(this.btnGoBack);
		
		this.btnAddService.addActionListener(this);
		this.btnGoBack.addActionListener(this);
		this.dropDown.addActionListener(this);
		this.accountTxt.addMouseListener(this);
		
		this.repaint();
		
		/*for (int i = 0; i < services.length; i++) {
			System.out.println(this.services[i]);
		}*/
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.userPanel.setVisible(true);
		}
		else if(e.getSource().equals(this.btnAddService)){
			if(this.dropDown.getSelectedIndex()>0){
				System.out.println("Service Added: " + this.dropDown.getSelectedItem()+ " with account: " + this.accountTxt.getText());
			}
		}
		else{
			if(this.dropDown.getSelectedIndex()>0){ 
	            System.out.println("YOU CLICK INDEX: "+dropDown.getSelectedIndex());
	       }  
		}
		
	}
	
	
	public static boolean isParsable(String input){
		//CHECK IF THE ACCOUNT NUMBER IS A NUMBER
		//RETURNS TRUE IF ITS PARSABLE (A NUMBER)
		//OTHERWISE RETURNS FALSE
	    boolean parsable = true;
	    try{
	    	Long.parseLong(input);
	        //Integer.parseInt(input);
	    }catch(NumberFormatException e){
	        parsable = false;
	    }
	    return parsable;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(!isParsable(this.accountTxt.getText())){
			this.accountTxt.setText("");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
