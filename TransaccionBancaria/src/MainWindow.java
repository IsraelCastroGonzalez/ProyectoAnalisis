import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainWindow extends JFrame {

	private LogIn logIn;
	private UsuarioLayout user;
	
	public MainWindow() {
		super("Transaccion Bancaria");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.logIn = new LogIn();
		this.user = new UsuarioLayout();
		
		this.add(this.logIn,BorderLayout.CENTER);
		this.add(this.user,BorderLayout.CENTER);
		
		
		this.pack();
		this.setVisible(true);
		this.setSize(500,300);
		this.setResizable(false);
		
	}

	public static void main(String[] args) {
		new MainWindow();
		
	}
}


