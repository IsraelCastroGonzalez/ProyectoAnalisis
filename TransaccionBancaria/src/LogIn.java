import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogIn extends JPanel implements ActionListener{

	private JTextField usernameTxt, 
					   passwordTxt;
	private JButton btnLogIn,
				    btnSignUp;
	
	public LogIn(){
		
		this.btnLogIn = new JButton("Log-In");
		this.btnSignUp = new JButton("Sign Up");
		this.usernameTxt = new JTextField(15);
		this.passwordTxt = new JTextField(15);
		
		this.setLayout(new GridLayout(0, 1));
		this.add(this.usernameTxt);
		this.add(this.passwordTxt);
		this.add(this.btnLogIn);
		this.add(this.btnSignUp);
		
		this.btnLogIn.addActionListener(this);
		
		this.setSize(500,270);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		//System.out.println("HELLO FROM BUTTON LOG IN!");		
	}
	
}
