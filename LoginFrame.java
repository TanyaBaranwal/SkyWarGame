package gamedemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	JLabel userLabel = new JLabel("");
	JLabel passwordLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	
	public void login()
	{
		String userid=textField.getText();
		String password=passwordField.getText();
		if(userid.length()==0){
			userLabel.setText("Cannot be left blank");
			userLabel.setForeground(Color.RED);
			passwordLabel.setText("");
		}
		if(password.length()==0){
		
			passwordLabel.setText("Cannot be left blank");
			passwordLabel.setForeground(Color.RED);
			
		}
		if(userid.equals(password)&&userid.length()!=0){
			this.setVisible(false);
			this.dispose();
			welcome screen=new welcome(userid);
			screen.setVisible(true);
		}
		else if(password.length()!=0&&userid.length()!=0)
		{
			userLabel.setText("");
			passwordLabel.setText("Invalid Credential");
			passwordLabel.setForeground(Color.RED);
		}
	}
	public static void main(String[] args) throws IOException {
		
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LoginFrame = new JLabel("Login Frame");
		LoginFrame.setForeground(Color.RED);
		LoginFrame.setFont(new Font("Constantia", Font.BOLD, 18));
		LoginFrame.setBounds(144, 13, 178, 32);
		contentPane.add(LoginFrame);
		
		JLabel userName = new JLabel("User Name");
		userName.setFont(new Font("Tahoma", Font.BOLD, 17));
		userName.setBounds(35, 69, 93, 26);
		contentPane.add(userName);
		
		textField = new JTextField();
		textField.setBounds(148, 73, 252, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 131, 252, 22);
		contentPane.add(passwordField);
		
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Tahoma", Font.BOLD, 17));
		password.setBounds(35, 130, 93, 21);
		contentPane.add(password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
				
			}
		});
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(64, 197, 97, 25);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			reset();
			}

			private void reset() {
				// TODO Auto-generated method stub
				textField.setText("");
				passwordField.setText("");
				userLabel.setText("");
				passwordLabel.setText("");
				textField.requestFocus();
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnReset.setBounds(225, 197, 97, 25);
		contentPane.add(btnReset);
		
		
		userLabel.setBounds(144, 108, 256, 16);
		contentPane.add(userLabel);
		
		passwordLabel.setBounds(144, 168, 256, 16);
		contentPane.add(passwordLabel);
	}
	
}