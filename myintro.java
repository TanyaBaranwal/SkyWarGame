package gamedemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import jaco.mp3.player.MP3Player;


public class myintro extends JWindow {
	JLabel photo = new JLabel(""); // Instance Variable
	JLabel lblGameOne = new JLabel("Game One");
	JProgressBar progressBar = new JProgressBar();
	Timer timer ;
	private final int DELAY = 100;
	private boolean isVisible = false;
	private int counter = 1;
	
	MP3Player player ;
	private void playSong(){
		player = new MP3Player(MyIntroScreen.class.getResource("Mujhko Barsaat Bana Lo_320(MyMp3Song).mp3"));
		player.play();
	}
	
	private void animation(){
		
		ActionListener action = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lblGameOne.setVisible(isVisible);
				isVisible = !isVisible;
				progressBar.setValue(counter);
				
				if(counter>=100){
					timer.stop();
					player.stop();
					myintro.this.setVisible(false);
					GameOne frame = new GameOne();
					frame.setVisible(true);
				}
				counter++;
				
				
			}
		};
		timer = new Timer(DELAY,action);
		timer.start();
	}
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					myintro frame = new myintro();
					frame.setVisible(true);
					frame.animation();
					frame.playSong();
				
	}

	/**
	 * Create the frame.
	 */
	public myintro() {
		Icon icon = new ImageIcon(myintro.class.getResource("graphics-helicopters-513607.gif"));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 358);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Local Variable
		
		photo.setIcon(icon);
		photo.setBounds(6, 6, 438, 252);
		contentPane.add(photo);
		
		
		lblGameOne.setFont(new Font("Lucida Grande", Font.BOLD, 28));
		lblGameOne.setBounds(161, 270, 149, 41);
		contentPane.add(lblGameOne);
		
		
		progressBar.setFont(new Font("Lucida Grande", Font.BOLD, 24));
		progressBar.setStringPainted(true);
		progressBar.setBounds(6, 310, 438, 20);
		contentPane.add(progressBar);
		this.animation();
		this.playSong();
	}
}