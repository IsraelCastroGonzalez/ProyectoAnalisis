package interfaz;

import database.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import classes.Usuario;

public class UsuarioLayout extends JPanel implements ActionListener{
	
	private String file = "data.txt";
	
	private String username;
	private String password;
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
	
	private CustomButton btnAddBeneficiary,
					btnAddUser,
					btnChangeMail,
					btnMakeTransaccion,
					btnSeeTransactions,
					btnAddService,
					btnSendTransaccions,
					btnGoBack;
	private Database data;
	private Color greyish, softBlack;
	
	public UsuarioLayout(MainWindow window,String user, String password, LogIn login, Database data){
		
		this.ventana = window;
		this.username = user;
		this.password = password;
		this.logInPanel = login;
		this.data = data;

		this.greyish = new Color(233,237,240);
		this.softBlack = new Color(58,60,68);
		
		this.ventana.setResizable(false);
		CheckUser(this.username,this.password);
		
	}

	public Database getData() {
		return data;
	}

	public void setData(Database data) {
		this.data = data;
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
			
//			this.logInPanel.setEnabled(true);
//			this.logInPanel.setVisible(true);
//			this.logInPanel.setOpaque(true);

			this.ventana.setSize(300,200);
			this.logInPanel = new LogIn(this.ventana);
			this.ventana.add(logInPanel);
			
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
	public void CheckUser(String user, String password){
		
		//IF the account type is Admin then 
		if(this.data.getUsers().containsKey(user) 
				&& this.data.getUsers().get(user).getPassword().equalsIgnoreCase(password)
				&&this.data.getUsers().get(user).getAccountType().equals("admin")){
			
			AdminWindow();
			
		}
		else if(this.data.getUsers().containsKey(user) 
				&& this.data.getUsers().get(user).getPassword().equalsIgnoreCase(password)
				&&this.data.getUsers().get(user).getAccountType().equals("client")){
			
			UserWindow(user);
			
		
		}else{
			// poner caso en el que no se encuentra en la base de datos
		}
	}
	
	public String putBenef(LinkedList<Usuario> list){
		String benef = "";
		for (int i = 0; i < list.size(); i++) {
			benef = benef + (i+1) + ": " + list.get(i).getName(); 
		}
		return benef;
	}
	
	public void UserWindow(String user){
		
		Usuario us = this.data.getUsers().get(user);
		this.setLayout(new GridLayout(0,2,10,5));
		this.ventana.setSize(450, 500);

		this.userNameLb = new JLabel("Nombre de Usuario: " + us.getName());
		this.accountNoLb = new JLabel("Account Number: " + us.getAccountNo());
		this.addressLb = new JLabel("Address: " + us.getAddress());
		this.beneficiariesLb = new JLabel(putBenef(us.getBeneficiaries()));
		this.mailLb = new JLabel("Mail: " + us.getEmail());
		this.balanceLb = new JLabel(us.getBalance() + "$");
		
		
		this.userNameLb.setForeground(this.greyish);
		this.accountNoLb.setForeground(this.greyish);
		this.addressLb.setForeground(this.greyish);
		this.beneficiariesLb.setForeground(this.greyish);
		this.mailLb.setForeground(this.greyish);
		this.balanceLb.setForeground(this.greyish);
		
		
		this.userNameLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.accountNoLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.addressLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.beneficiariesLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.mailLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.balanceLb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		
		this.btnChangeMail = new CustomButton("Change e-mail");
		this.btnMakeTransaccion = new CustomButton("Make Transaccion");
		this.btnSeeTransactions = new CustomButton("See Transaccions");
		this.btnSendTransaccions = new CustomButton("Send Transaccions");
		this.btnAddService = new CustomButton("Add Service");
		this.btnGoBack = new CustomButton("Log Out");
		
		///////////////////BUTTON FORMAT/////////////////////////
		this.btnChangeMail.setBGColor("kindBlue");			   //
		this.btnMakeTransaccion.setBGColor("kindBlue");		   //
		this.btnSeeTransactions.setBGColor("kindBlue");		   //
		this.btnSendTransaccions.setBGColor("kindBlue");	   //
		this.btnAddService.setBGColor("kindBlue");   		   //
		this.btnGoBack.setBGColor("kindBlue");				   //
															   //
		this.btnChangeMail.setFGColor("greyish");			   //
		this.btnMakeTransaccion.setFGColor("greyish");		   //
		this.btnSeeTransactions.setFGColor("greyish");		   //
		this.btnSendTransaccions.setFGColor("greyish");	   //
		this.btnAddService.setFGColor("greyish");			   //
		this.btnGoBack.setFGColor("greyish");				   //
															   //
		/////////////////////////////////////////////////////////
		
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
		
		
		this.btnMakeTransaccion.addActionListener(this);
		this.btnChangeMail.addActionListener(this);
		this.btnSeeTransactions.addActionListener(this);
		this.btnSendTransaccions.addActionListener(this);
		this.btnAddService.addActionListener(this);
		this.btnGoBack.addActionListener(this);

		this.setBackground(new Color(58,60,68));
		this.repaint();
	}
	
	public void AdminWindow(){
		this.setLayout(new GridLayout(0,1,10,5));
		this.ventana.setSize(300, 250);
		
		this.btnAddBeneficiary = new CustomButton("Add Beneficiary");
		this.btnAddUser = new CustomButton("Add User");
		this.btnGoBack = new CustomButton("Log Out");
		
		this.btnAddBeneficiary.setBGColor("greyish");
		this.btnAddUser.setBGColor("greyish");
		this.btnGoBack.setBGColor("greyish");
		
		this.btnAddBeneficiary.setFGColor("softBlack");
		this.btnAddUser.setFGColor("softBlack");
		this.btnGoBack.setFGColor("softBlack");
		
		this.add(this.btnAddBeneficiary);
		this.add(this.btnAddUser);
		this.add(this.btnGoBack);
		
		this.btnAddBeneficiary.addActionListener(this);
		this.btnAddUser.addActionListener(this);
		this.btnGoBack.addActionListener(this);
		this.setBackground(new Color(197,77,77));
		
		this.repaint();
		this.setVisible(true);
		
	}
	
	
}
