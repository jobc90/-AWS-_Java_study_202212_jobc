package windowbuilder.view.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;

import windowbuilder.view.panel.MainPanel;

public class MainFrame  extends JFrame{
	
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		
		JPanel mainPanel = new MainPanel();
		setContentPane(mainPanel);
		
	}


}
