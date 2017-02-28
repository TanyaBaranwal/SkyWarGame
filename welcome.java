package gamedemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class welcome extends JFrame {

	private JPanel contentPane;
	private String userid;

	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public welcome(String userid) {
		this.userid = userid;
		
		this.setVisible(false);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JLabel msg = new JLabel("Welcome"+" "+ userid);
		msg.setForeground(Color.RED);
		msg.setHorizontalAlignment(SwingConstants.CENTER);
		msg.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		msg.setBounds(56, 69, 153, 43);
		contentPane.add(msg);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);  // add menubar in frame
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile); // add menu in menubar
		
		JMenuItem mntmGame = new JMenuItem("Game 1");
		mntmGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startGameOne();
			}

			private void startGameOne() {
				// TODO Auto-generated (method stub
				welcome.this.setVisible(false);
				myintro m=new myintro();
				m.setVisible(true);
			}
		});
		mnFile.add(mntmGame); 
		
		JMenuItem mntmGame_1 = new JMenuItem("Game 2");
		mntmGame_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile.add(mntmGame_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				welcome.this.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		mnFile.add(mntmExit);
		
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		//menuBar.setBounds(90, 146, 132, 22);
		//contentPane.add(menuBar);
	}
	}

