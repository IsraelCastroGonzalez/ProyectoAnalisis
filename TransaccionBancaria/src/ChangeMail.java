import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeMail extends JPanel implements ActionListener{
	
	private JButton btnChange, btnGoBack;
	private JTextField newMailTxt;
	private UsuarioLayout userPanel;
	
	public ChangeMail(UsuarioLayout usuario) {
		this.userPanel = usuario;
		
		this.btnChange = new JButton("Change");
		this.btnGoBack = new JButton("Back");
		this.newMailTxt = new JTextField(20);
		
		this.add(this.newMailTxt);
		this.add(this.btnChange);
		this.add(this.btnGoBack);
		
		this.btnChange.addActionListener(this);
		this.btnGoBack.addActionListener(this);
		 this.repaint();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.userPanel.setVisible(true);
		}
		else{
			this.userPanel.setMailLb(this.newMailTxt.getText());
			System.out.println("Mail Changed!");
		}
		
	}

}
