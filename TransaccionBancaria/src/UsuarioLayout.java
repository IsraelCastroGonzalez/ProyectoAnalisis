import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UsuarioLayout extends JPanel implements ActionListener{
	
	////USER OPTIONS PANELS///////////////////
	private MakeTransaction transactionPanel;
	private AddBeneficiary beneficiaryPanel;
	private ChangeMail mailPanel;
	private SeeTransactions transactionsPanel;
	private AddService servicePanel;
	/////////////////////////////////////////

	private MainWindow ventana;
	
	private JLabel userNameLb,
				   accountNoLb,
				   addressLb,
				   beneficiariesLb,
				   mailLb,
				   balanceLb;
	
	private JButton btnAddBeneficiary,
					btnChangeMail,
					btnMakeTransaccion,
					btnSeeTransactions,
					btnAddService,
					btnSendTransaccions;
	
	public UsuarioLayout(MainWindow v){
		this.ventana = v;
		
		this.setLayout(new GridLayout(0,2,10,5));
		this.setPreferredSize(new Dimension(300, 500));
		
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
		this.btnSeeTransactions = new JButton("See Transaccions");
		this.btnSendTransaccions = new JButton("Send Transaccions");
		
		this.add(this.userNameLb);
		this.add(this.accountNoLb);
		this.add(this.balanceLb);
		this.add(this.addressLb);
		this.add(this.beneficiariesLb);
		this.add(this.btnAddBeneficiary);
		this.add(this.mailLb);
		this.add(this.btnChangeMail);
		this.add(this.btnAddService);
		this.add(this.btnMakeTransaccion);
		this.add(this.btnSeeTransactions);
		this.add(this.btnSendTransaccions);
		
		this.setVisible(true);
		
		this.btnMakeTransaccion.addActionListener(this);
		this.btnAddBeneficiary.addActionListener(this);
		this.btnAddService.addActionListener(this);
		this.btnChangeMail.addActionListener(this);
		this.btnSeeTransactions.addActionListener(this);
		this.btnSendTransaccions.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.btnMakeTransaccion)){
			//System.out.println("IT WORKS!!!");
			this.setVisible(false);
			this.transactionPanel = new MakeTransaction(this);
			this.ventana.add(this.transactionPanel);
			this.transactionPanel.setVisible(true);
		}
		else if(e.getSource().equals(this.btnAddBeneficiary)){
			
			this.setVisible(false);
			this.beneficiaryPanel = new AddBeneficiary(this);
			this.ventana.add(this.beneficiaryPanel);
			this.beneficiaryPanel.setVisible(true);
		}
		else if(e.getSource().equals(this.btnAddService)){
			
			this.setVisible(false);
			this.servicePanel = new AddService(this);
			this.ventana.add(this.servicePanel);
			this.servicePanel.setVisible(true);
		}
		else if(e.getSource().equals(this.btnChangeMail)){
			
			this.setVisible(false);
			this.mailPanel = new ChangeMail(this);
			this.ventana.add(this.mailPanel);
			this.mailPanel.setVisible(true);
		}
		else if(e.getSource().equals(this.btnSeeTransactions)){
			
			this.setVisible(false);
			this.transactionsPanel = new SeeTransactions(this);
			this.ventana.add(this.transactionsPanel);
			this.transactionsPanel.setVisible(true);
		}
		else{
			System.out.println("Transactions Sent!");
		}
		
	}

	public JLabel getBeneficiariesLb() {
		return beneficiariesLb;
	}

	public void setBeneficiariesLb(String beneficiariesLb) {
		this.beneficiariesLb.setText(beneficiariesLb);
	}

	public JLabel getBalanceLb() {
		return balanceLb;
	}

	public void setBalanceLb(String balanceLb) {
		this.balanceLb.setText(balanceLb);
	}

	public JLabel getMailLb() {
		return mailLb;
	}

	public void setMailLb(String mailLb) {
		this.mailLb.setText(mailLb);
	}
	
	
}
