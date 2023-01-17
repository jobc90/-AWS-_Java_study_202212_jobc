package windowbuilder.view.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class MainPanel extends JPanel {
	
	private CardLayout mainCard;
	
	public MainPanel() {
		mainCard = new CardLayout();
		setLayout(mainCard);
		setBorder(null);
		
	}

}
