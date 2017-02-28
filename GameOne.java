package gamedemo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
// this is just a game launcher class
public class GameOne extends JFrame {
	static final  int BOARD_WIDTH  = 2000;
	static final int BOARD_HEIGHT = 2000;
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameOne frame = new GameOne();
					frame.setVisible(true);
			
	}
	private void askForClose(){
		int choice = JOptionPane.showConfirmDialog(this,
				"Do u really want to close this window"
				,"My Gaming",JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION){
					this.setVisible(false);
					this.dispose();
				}
				else
				if(choice == JOptionPane.NO_OPTION){	
					return;
				}
	}

	/**
	 * Create the frame.
	 */
	public GameOne() {
		
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				askForClose();
			}
		});
		this.setTitle("Sky War - 2017");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(BOARD_WIDTH,BOARD_HEIGHT);
		this.setLocationRelativeTo(null);
		//setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		Board board = new Board();
		this.getContentPane().add(board);
		
		
	
	}
}