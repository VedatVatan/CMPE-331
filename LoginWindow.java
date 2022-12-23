/*
 * Stage: Development-01
 * @author: Ahmet Berkay Seyhun
 * @author: Elif Kýrýkkaya
 * 
 * 
 * CODE REVIEW
 * @author: AHMET KIVANÇ DEMİRKIRAN, 120200133
 * @author: Vedat Vatan, 120200148
 *
 */

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class LoginWindow extends JFrame implements ActionListener {

	// main method for testing the application
	public static void main(String[] args) {

		new LoginWindow();
	}


	/*
	 * Graphical User Interface (GUI) Elements
	 *
	 * ! PLEASE RENAME THE OBJECTS ACCORDING TO THEIR PURPOSES !
	 * ! YOU CAN ADD MORE ELEMENTS IF IT IS NECESSARY !
	 */

	
	private JButton btn01, btn02;
	private JLabel lbl01, lbl02, lbl03;
	private JTextField txt01, txt02, txt03;


	// Constructor
	public LoginWindow () {

		this.initializeGUI();
		this.setWindowProperties(4, 2);
		this.addGUIElementsToFrame();

	}


	/**
	 * Initialize GUI elements. If it is necessary, you can add more
	 * 	elements.
	 */
	public void initializeGUI() {
		lbl01 = new JLabel("Username", SwingConstants.CENTER);
		lbl02 = new JLabel("Password", SwingConstants.CENTER);
		lbl03 = new JLabel("Requested Book", SwingConstants.CENTER);
		

		txt01 = new JTextField("*Please Write Your Username*");
		txt02 = new JTextField("*Please Write Your Password*");
		txt03 = new JTextField("*Please Write the Book You Want*");

		
		txt01.setHorizontalAlignment(SwingConstants.CENTER);
		txt02.setHorizontalAlignment(SwingConstants.CENTER);
		txt03.setHorizontalAlignment(SwingConstants.CENTER);

		btn01 = new JButton("Library");
		btn02 = new JButton("Borrow the Book");

		btn01.addActionListener(this);
		btn02.addActionListener(this);
	}


	/**
	 * Set the necessary properties for the window
	 *
	 * @param numRow number of row for GUI elements
	 * @param numCol number of column for GUI elements
	 */
	public void setWindowProperties(int numRow, int numCol) {
		this.setLayout(new GridLayout(numRow, numCol));

		this.setSize(900,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Add GUI elements to the layout of the frame. If it is necessary,
	 * 	you can add more elements.
	 */
	public void addGUIElementsToFrame() {
		this.add(lbl01);
		this.add(txt01);

		this.add(lbl02);
		this.add(txt02);
		
		this.add(lbl03);
		this.add(txt03);

		this.add(btn01);
		this.add(btn02);
	}


	/**
	 * Add margin to the frame.
	 */
	@Override
    public Insets getInsets() {
        return new Insets(100, 50, 100, 50);
    }


	/**
	 * Action listener for the buttons. If e.getSource() is from
	 * 	one of the buttons, apply the related operation.
	 *
	 * @param e action event for detecting which button is clicked
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	/*	
		// demo username and passwords
		String  username = "bilgi";
		String password = "20222023";
		
		if(txt01.equals("username" && txt02.equals("20222023"))) {
			
			Library lframe = new Library();
			lframe.setVisible(true);
		
		}
		else {
			JOptionPane.showMessageDialog(btn01, "Invalid Username or Password");
		}
		*/
	}
}