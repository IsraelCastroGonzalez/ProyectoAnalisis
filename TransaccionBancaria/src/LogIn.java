
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LogIn extends JPanel implements ActionListener{

	private JTextField usernameTxt, 
					   passwordTxt;
	
	private JButton btnLogIn,
				    btnSignUp;
	
	private MainWindow ventana;
	private UsuarioLayout userP;
	
	public LogIn(MainWindow window){
		
		this.ventana = window;
				
		this.setLayout(new GridLayout(0, 1));
		
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
		this.btnSignUp.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		if(e.getSource().equals(this.btnSignUp)){
//			this.setVisible(false);
//			this.signUpPanel = new SignUp(this);
//			this.ventana.add(this.signUpPanel);
//			this.signUpPanel.setVisible(true);
//			//this.ventana.setSize(new Dimension(450, 400));
//			
//		}else{
			this.setVisible(false);
			this.userP = new UsuarioLayout(this.ventana,this.usernameTxt.getText(),this);
			this.ventana.add(this.userP);
			this.ventana.setResizable(false);
			//this.ventana.setSize(new Dimension(450, 400));
//		}
			
	}

}
