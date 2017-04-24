import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UsuarioLayout extends JPanel implements ActionListener{
	
	private String file = "data.txt";
	
	private String username;
	////USER OPTIONS PANELS///////////////////
	private MakeTransaction transactionPanel;
	private AddBeneficiary beneficiaryPanel;
	private SignUp addUserPanel;
	private ChangeMail mailPanel;
	private SeeTransactions transactionsPanel;
	private AddService servicePanel;
	private LogIn logInPanel;
	/////////////////////////////////////////

	private MainWindow ventana;
	
	private JLabel userNameLb,
				   accountNoLb,
				   addressLb,
				   beneficiariesLb,
				   mailLb,
				   balanceLb;
	
	private JButton btnAddBeneficiary,
					btnAddUser,
					btnChangeMail,
					btnMakeTransaccion,
					btnSeeTransactions,
					btnAddService,
					btnSendTransaccions,
					btnGoBack;
	
	public UsuarioLayout(MainWindow window,String user,LogIn login){
		this.ventana = window;
		this.username = user;
		this.logInPanel = login;
		
		
		this.userNameLb = new JLabel("Nombre de Usuario: ***********");
		this.accountNoLb = new JLabel("Account Number: XXXXXXXXXXXX");
		this.addressLb = new JLabel("Address: ************");
		this.beneficiariesLb = new JLabel("1: ******\n" + "2: *******");
		this.mailLb = new JLabel("Mail: **********");
		this.balanceLb = new JLabel("10000 $");
		
		this.btnAddBeneficiary = new JButton("Add Beneficiary");
		this.btnAddUser = new JButton("Add User");
		this.btnAddService = new JButton("Add Service");
		this.btnChangeMail = new JButton("Change e-mail");
		this.btnMakeTransaccion = new JButton("Make Transaccion");
		this.btnSeeTransactions = new JButton("See Transaccions");
		this.btnSendTransaccions = new JButton("Send Transaccions");
		this.btnGoBack = new JButton("Back");
		
		
		this.btnMakeTransaccion.addActionListener(this);
		this.btnAddBeneficiary.addActionListener(this);
		this.btnAddUser.addActionListener(this);
		this.btnAddService.addActionListener(this);
		this.btnChangeMail.addActionListener(this);
		this.btnSeeTransactions.addActionListener(this);
		this.btnSendTransaccions.addActionListener(this);
		this.btnGoBack.addActionListener(this);
		
		CheckUser(user);
		this.setVisible(true);
		
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
		else if(e.getSource().equals(this.btnAddUser)){
			this.setVisible(false);
			this.addUserPanel = new SignUp(this);
			this.ventana.add(this.addUserPanel);
			this.addUserPanel.setVisible(true);
			
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
		else if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.setVisible(false);
			this.ventana.setSize(300,200);
			this.logInPanel.setVisible(true);
			
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
	
	
	//Verificar las acciones que tiene disponibles el usuario ingresado
	public void CheckUser(String user){
		String accountType = "";
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        accountType = line;
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		//IF the account type is Admin then 
		if(accountType.equalsIgnoreCase("admin")){
			this.setLayout(new GridLayout(0,1,10,5));
			this.ventana.setSize(new Dimension(300, 250));
			this.add(this.btnAddBeneficiary);
			this.add(this.btnAddUser);
			//this.add(this.btnGoBack);
		}
		else{
			this.setLayout(new GridLayout(0,2,10,5));
			this.ventana.setSize(new Dimension(450, 500));
			this.add(this.userNameLb);
			this.add(this.accountNoLb);
			this.add(this.balanceLb);
			this.add(this.addressLb);
			this.add(this.beneficiariesLb);
			
			this.add(this.mailLb);
			this.add(this.btnChangeMail);
			this.add(this.btnAddService);
			this.add(this.btnMakeTransaccion);
			this.add(this.btnSeeTransactions);
			this.add(this.btnSendTransaccions);
			this.add(this.btnGoBack);
		}
	}
	
	
}
