import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UsuarioLayout extends JPanel implements ActionListener{
	
	private JPanel contentPanel, userOverview;
	

	private JLabel userNameLb,
				   accountNoLb,
				   addressLb,
				   beneficiariesLb,
				   mailLb,
				   balanceLb;
	
	private JButton btnAddBeneficiary,
					btnChangeMail,
					btnMakeTransaccion,
					btnSeeTransaccions,
					btnAddService,
					btnSendTransaccions;
	
	public void UserOverview(){
		
		this.userOverview = new JPanel();
		this.userOverview.setLayout(new GridLayout(0,2,10,5));
		
		this.userNameLb = new JLabel("Nombre de Usuario: ***********");
		this.accountNoLb = new JLabel("Account Number: XXXXXXXXXXXX");
		this.addressLb = new JLabel("Address: ************");
		this.beneficiariesLb = new JLabel("1: ******\n" + "2: *******");
		this.mailLb = new JLabel("Mail: **********");
		this.balanceLb = new JLabel("10,000 $");
		
		this.btnAddBeneficiary = new JButton("Add Beneficiary");
		this.btnAddService = new JButton("Add Service");
		this.btnChangeMail = new JButton("Change e-mail");
		this.btnMakeTransaccion = new JButton("Make Transaccion");
		this.btnSeeTransaccions = new JButton("See Transaccions");
		this.btnSendTransaccions = new JButton("Send Transaccions");
		
		this.userOverview.add(this.userNameLb);
		this.userOverview.add(this.accountNoLb);
		this.userOverview.add(this.balanceLb);
		this.userOverview.add(this.addressLb);
		this.userOverview.add(this.beneficiariesLb);
		this.userOverview.add(this.btnAddBeneficiary);
		this.userOverview.add(this.mailLb);
		this.userOverview.add(this.btnChangeMail);
		this.userOverview.add(this.btnAddService);
		this.userOverview.add(this.btnMakeTransaccion);
		this.userOverview.add(this.btnSeeTransaccions);
		this.userOverview.add(this.btnSendTransaccions);
		
		this.userOverview.setSize(400,400);
		
	}
	
	public UsuarioLayout(){
		UserOverview();
		this.add(this.userOverview,BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
