package windowbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import windowbuilder.view.frame.MainFrame;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;

public class UserManagementApplication  {
	
	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			
			public void run() {
				try {
					
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		EventQueue.invokeLater(runnable);
	}


}


