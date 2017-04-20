import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakeTransaction extends JPanel implements ActionListener{
	private JLabel tipLb;
	private JButton btnSend, btnGoBack;
	private JTextField toWhoTxt, quantityTxt;
	private UsuarioLayout userPanel;
	
	
	public MakeTransaction(UsuarioLayout usuario){
		//SET THE USER PANEL AS THE PREVIOUS VIEW
		this.userPanel = usuario;
		
		//SET THE LAYOUT FOR THE PANEL
		this.setLayout(new GridLayout(0, 1));
		
		this.tipLb = new JLabel("Insert the Destination Account");
		this.btnGoBack = new JButton("Back");
		this.btnSend = new JButton("Send");
		this.toWhoTxt = new JTextField("Destination",15);
		this.quantityTxt = new JTextField("$",15);
		
		this.add(this.tipLb);
		this.add(this.toWhoTxt);
		this.add(this.quantityTxt);
		this.add(this.btnSend);
		this.add(this.btnGoBack);
		
		this.btnGoBack.addActionListener(this);
		this.btnSend.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//BUTTON LOGIC HERE!
		//Check Directly the object from which the action was made
		if(e.getSource().equals(this.btnGoBack)){
			//Remove the JPanel from the JFrame
			//Instead of Only making it invisible with setVisible(false); 
			//cleans from RAM
			this.removeAll();
			
			this.userPanel.setVisible(true);
		}
		else{
			System.out.println("Transaction Complete");
		}
		
	}
	
}
