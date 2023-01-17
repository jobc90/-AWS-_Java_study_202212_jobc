package usermanagement.frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import windowbuilder.view.panel.RegisterPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class UserManagementFrame extends JFrame {

	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField userNameField;
	private JPasswordField passwordField;
	private JTextField registerUserNameField;
	private JPasswordField registerPasswordField;
	private JTextField registerNameField;
	private JTextField registerEmainField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setOpaque(false);			//투명도 설정
		loginPanel.setBackground(new Color(255, 255, 255));
		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("User Management");
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setFont(new Font("CookieRun Bold", Font.BOLD, 20));
		logoText.setBounds(80, 34, 222, 74);
		loginPanel.add(logoText);
		
		JLabel logoText2 = new JLabel("Login");
		logoText2.setFont(new Font("CookieRun Regular", Font.ITALIC, 18));
		logoText2.setHorizontalAlignment(SwingConstants.CENTER);
		logoText2.setBounds(137, 84, 92, 42);
		loginPanel.add(logoText2);
		
		userNameField = new JTextField();
		userNameField.setBounds(60, 145, 253, 30);
		loginPanel.add(userNameField);
		userNameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("password");
		passwordField.setBounds(60, 196, 253, 30);
		loginPanel.add(passwordField);
		
		JButton login = new JButton("Login");
		login.setBackground(new Color(128, 128, 255));
		login.setFont(new Font("CookieRun Bold", Font.BOLD, 18));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		login.setBounds(60, 262, 253, 29);
		loginPanel.add(login);
		
		JButton register = new JButton("Sign Up");
		register.setBackground(new Color(128, 128, 255));
		register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		register.setFont(new Font("CookieRun Bold", Font.BOLD, 10));
		register.setBounds(182, 382, 81, 23);
		loginPanel.add(register);
		
		JLabel findPassword = new JLabel("forgot your password?");
		findPassword.setForeground(new Color(0, 128, 255));
		findPassword.setHorizontalAlignment(SwingConstants.CENTER);
		findPassword.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		findPassword.setBounds(108, 415, 129, 15);
		loginPanel.add(findPassword);
		
		JTextPane logoText5 = new JTextPane();
		logoText5.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		logoText5.setText("Don't have account?");
		logoText5.setBounds(60, 382, 110, 29);
		loginPanel.add(logoText5);
		
		JTextPane logoText4 = new JTextPane();
		logoText4.setText("Password");
		logoText4.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		logoText4.setBounds(60, 173, 110, 23);
		loginPanel.add(logoText4);
		
		JTextPane logoText3 = new JTextPane();
		logoText3.setText("Username or email");
		logoText3.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		logoText3.setBounds(60, 123, 110, 23);
		loginPanel.add(logoText3);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel registerBackMainPanel = new JLabel("Back to sign in");
		registerBackMainPanel.setHorizontalAlignment(SwingConstants.CENTER);
		registerBackMainPanel.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		registerBackMainPanel.setBackground(SystemColor.activeCaptionBorder);
		registerBackMainPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		registerBackMainPanel.setBounds(137, 402, 97, 25);
		registerPanel.add(registerBackMainPanel);
		
		JLabel registerlogoText1 = new JLabel("User Management");
		registerlogoText1.setHorizontalAlignment(SwingConstants.CENTER);
		registerlogoText1.setFont(new Font("CookieRun Bold", Font.BOLD, 20));
		registerlogoText1.setBounds(80, 34, 222, 74);
		registerPanel.add(registerlogoText1);
		
		JLabel registerlogoText2 = new JLabel("Register");
		registerlogoText2.setHorizontalAlignment(SwingConstants.CENTER);
		registerlogoText2.setFont(new Font("CookieRun Regular", Font.ITALIC, 18));
		registerlogoText2.setBounds(137, 84, 92, 42);
		registerPanel.add(registerlogoText2);
		
		JTextPane registerUserName = new JTextPane();
		registerUserName.setText("Username");
		registerUserName.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		registerUserName.setBounds(49, 135, 110, 23);
		registerPanel.add(registerUserName);
		
		registerUserNameField = new JTextField();
		registerUserNameField.setColumns(10);
		registerUserNameField.setBounds(49, 158, 253, 30);
		registerPanel.add(registerUserNameField);
		
		JTextPane registerPassword = new JTextPane();
		registerPassword.setText("Password");
		registerPassword.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		registerPassword.setBounds(49, 186, 110, 23);
		registerPanel.add(registerPassword);
		
		registerPasswordField = new JPasswordField();
		registerPasswordField.setToolTipText("password");
		registerPasswordField.setBounds(49, 209, 253, 30);
		registerPanel.add(registerPasswordField);
		
		JTextPane registerName = new JTextPane();
		registerName.setText("Name");
		registerName.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		registerName.setBounds(49, 240, 110, 23);
		registerPanel.add(registerName);
		
		registerNameField = new JTextField();
		registerNameField.setColumns(10);
		registerNameField.setBounds(49, 263, 253, 30);
		registerPanel.add(registerNameField);
		
		JTextPane registerEmail = new JTextPane();
		registerEmail.setText("E-mail");
		registerEmail.setFont(new Font("CookieRun Regular", Font.PLAIN, 10));
		registerEmail.setBounds(49, 293, 110, 23);
		registerPanel.add(registerEmail);
		
		registerEmainField = new JTextField();
		registerEmainField.setColumns(10);
		registerEmainField.setBounds(49, 318, 253, 30);
		registerPanel.add(registerEmainField);
		
		JButton registerUser = new JButton("Register");
		registerUser.setBackground(new Color(128, 128, 255));
		registerUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		registerUser.setBounds(137, 369, 97, 23);
		registerPanel.add(registerUser);
	}
}
