package interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database.Database;


public class LogIn extends JPanel implements ActionListener{

	private JTextField usernameTxt, 
					   passwordTxt;
	
	private CustomButton btnLogIn,
				    	 btnSignUp;
	
	private MainWindow ventana;
	private UsuarioLayout userP;
	
	private Database data;
	
	private Color greyish, softBlack;
	
	public LogIn(MainWindow window){
		
		this.ventana = window;
		this.data = new Database();
		
		this.setLayout(new GridLayout(0, 1));

		this.greyish = new Color(233,237,240);
		this.softBlack = new Color(58,60,68);
		//////////////////CUSTOM BUTTON STYLE//////////////
//		Available BG and FG colors:  sweetRed, kindBlue, softBlack, greyish.
//		Must be a String i.e: button.setBGColor("kindBlue");
		
		this.btnLogIn = new CustomButton("Log-In");
		//this.btnSignUp = new CustomButton("Sign Up");
		this.btnLogIn.setBGColor("kindBlue");
		//this.btnSignUp.setBGColor("kindBlue");
		this.btnLogIn.setFGColor("greyish");
		//////////////////////////////////////////////////

		
		this.usernameTxt = new JTextField(15);
		this.passwordTxt = new JTextField(15);
		
		this.usernameTxt.setForeground(this.greyish);
		this.passwordTxt.setForeground(this.greyish);
		
		this.usernameTxt.setBackground(this.softBlack);
		this.passwordTxt.setBackground(this.softBlack);
		
		this.usernameTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.passwordTxt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		this.setLayout(new GridLayout(0, 1));
		this.add(this.usernameTxt);
		this.add(this.passwordTxt);
		this.add(this.btnLogIn);
		
		this.usernameTxt.grabFocus();
		
		this.btnLogIn.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(this.btnLogIn)){
			
			this.setVisible(false);
			this.userP = new UsuarioLayout(this.ventana,this.usernameTxt.getText(),
										   this.passwordTxt.getText(),this, this.data);
			this.removeAll();
			this.ventana.add(this.userP);
		}
	}

}
