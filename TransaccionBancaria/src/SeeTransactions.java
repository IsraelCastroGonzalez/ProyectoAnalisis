import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class SeeTransactions extends JPanel implements ActionListener {
	
	private UsuarioLayout userPanel;
	private JButton btnGoBack;
	private JList transactionList;
	private String[] data;
	
	public SeeTransactions(UsuarioLayout usuario) {
		this.userPanel = usuario;
		
		this.btnGoBack = new JButton("Back");
		this.btnGoBack.addActionListener(this);
		this.data = new String[]{"Transaction 1","Transaction 2","Transaction 3","Transaction 4","Transaction 5"};
	
		
		this.transactionList = new JList(data); //data has type Object[]
		this.transactionList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		this.transactionList.setLayoutOrientation(JList.VERTICAL);
		this.transactionList.setVisibleRowCount(-1);
		JScrollPane listScroller = new JScrollPane(this.transactionList);
		listScroller.setPreferredSize(new Dimension(250, 80));
		
		this.add(this.transactionList);
		this.add(this.btnGoBack);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.btnGoBack)){
			this.removeAll();
			this.userPanel.setVisible(true);
		}
		
	}

}
