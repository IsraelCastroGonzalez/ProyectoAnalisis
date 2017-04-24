import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainWindow extends JFrame implements ActionListener {

	private LogIn logIn;
	private UsuarioLayout user;
	
	public MainWindow() {
		super("Transaccion Bancaria");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.logIn = new LogIn(this);
		
		this.add(this.logIn,BorderLayout.CENTER);
		
		
		this.pack();
		this.setVisible(true);
		this.setSize(300,200);
		this.setResizable(false);
		
	}

	public static void main(String[] args) {
	MainWindow ventana = new MainWindow();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}


