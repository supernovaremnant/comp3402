import java.awt.*;
import javax.swing.*;

import javax.swing.JPanel;

public class CardPanel extends JPanel {

	int suit;
	int num;

	public CardPanel(int s, int n) {
		this.suit = s;
		this.num = n;
	}

	public void paintComponent(Graphics g) {
//		Image i = new ImageIcon("images/"+this.num+this.suit+".gif").getImage();
		Image i = new ImageIcon("images/04.gif").getImage();
		g.drawImage(i, 0, 0, this);
	}
}
