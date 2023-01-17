package windowbuilder.view.panel;

import java.awt.CardLayout;


import lombok.Data;

@Data
public class MainPanel extends InitPanel {
	
	private static final long serialVersionUID = 1L;
	private CardLayout mainCard;
	private static MainPanel instance;
	
	public static MainPanel getInstance() { //싱글톤 자기자신을 담을수 있는 static변수와..
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	private MainPanel() {
		mainCard = new CardLayout();
		setLayout(mainCard);		
		
	}
	
	public void init() {
		LoginPanel loginPanel = new LoginPanel();
		add(loginPanel, "loginPanel");
		
		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
	}

}
