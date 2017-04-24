import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUp extends JPanel implements ActionListener{
	
	private JButton btnSignUp, btnGoBack; 
	private JLabel nameLb, accountLb, mailLb, addressLb, balanceLb ;
	private JTextField nameTxt, accountTxt, mailTxt, addressTxt, balanceTxt;
	
	private UsuarioLayout userP;
	
	public SignUp(UsuarioLayout usuario) {
		this.userP = usuario;

		//this.setPreferredSize(new Dimension(450, 500));
		this.setLayout(new GridLayout(0, 2,10,5));
		
		this.btnGoBack = new JButton("Back");
		this.btnSignUp = new JButton("Sign Up!");
		this.btnGoBack.addActionListener(this);
		this.btnSignUp.addActionListener(this);
		
		this.nameLb = new JLabel("Nombre:");
		this.accountLb = new JLabel("No. Cuenta: ");
		this.mailLb = new JLabel("E-Mail: ");
		this.addressLb = new JLabel("Direccion: ");
		this.balanceLb = new JLabel("Balance: ");
		
		this.nameTxt = new JTextField(30);
		this.accountTxt = new JTextField(30);
		this.mailTxt = new JTextField(30);
		this.addressTxt = new JTextField(30);
		this.balanceTxt = new JTextField(30);
		
		
		this.add(this.nameLb);
		this.add(this.nameTxt);
		this.add(this.accountLb);
		this.add(this.accountTxt);
		this.add(this.mailLb);
		this.add(this.mailTxt);
		this.add(this.addressLb);
		this.add(this.addressTxt);
		this.add(this.balanceLb);
		this.add(this.balanceTxt);
		
		this.add(this.btnGoBack);
		this.add(this.btnSignUp);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.userP.setVisible(true);
		}
	}
	
}
