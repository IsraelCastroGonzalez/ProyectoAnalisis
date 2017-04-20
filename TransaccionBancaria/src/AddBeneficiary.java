import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class AddBeneficiary extends JPanel implements ActionListener{

	private JLabel tipLb, beneficiatyLb;
	private JTextField beneficiaryTxt;
	private JButton btnAdd, btnGoBack;
	private UsuarioLayout userPanel;
	
	
	public AddBeneficiary(UsuarioLayout usuario) {
		this.userPanel = usuario;
		
		this.setLayout(new GridLayout(0, 1));
		
		this.tipLb = new JLabel("Write the XXXXXX of the Beneficiary to add");
		this.beneficiatyLb = new JLabel("Beneficiary");
		this.beneficiaryTxt = new JTextField(15);
		this.btnAdd = new JButton("Add");
		this.btnGoBack = new JButton("Back");
		
		this.add(this.tipLb);
		
		this.add(this.beneficiatyLb);
		this.add(this.beneficiaryTxt);
		this.add(this.btnAdd);
		this.add(this.btnGoBack);
		
		this.btnAdd.addActionListener(this);
		this.btnGoBack.addActionListener(this);
		
		this.repaint();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//BUTTON LOGIC HERE!
		
		if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.userPanel.setVisible(true);
		}
		else{
			System.out.println("Beneficiary Added");
		}
		
	}

}
