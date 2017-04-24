package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class CustomButton extends JButton {
	
	private Color sweetRed, kindBlue, softBlack, greyish;
	
	public CustomButton(String label){
		super(label);
		this.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
	
	public void setBGColor(String name){
		switch (name) {
		case "sweetRed":
			this.sweetRed = new Color(197,77,77);
			this.setBackground(this.sweetRed);
			break;
			
		case "kindBlue":
			this.kindBlue = new Color(81,140,161);
			this.setBackground(this.kindBlue);
			break;
			
		case "softBlack":
			this.softBlack = new Color(58,60,68);
			this.setBackground(this.softBlack);
			break;
			
		default:
			this.greyish = new Color(233,237,240);
			this.setBackground(this.greyish);
			break;
		}

	}
	
	public void setFGColor(String name){
		switch (name) {
		case "sweetRed":
			this.sweetRed = new Color(197,77,77);
			this.setForeground(this.sweetRed);
			break;
			
		case "kindBlue":
			this.kindBlue = new Color(81,140,161);
			this.setForeground(this.kindBlue);
			break;
			
		case "softBlack":
			this.softBlack = new Color(58,60,68);
			this.setForeground(this.softBlack);
			break;
			
		default:
			this.greyish = new Color(233,237,240);
			this.setForeground(this.greyish);
			break;
		}
	}
}
