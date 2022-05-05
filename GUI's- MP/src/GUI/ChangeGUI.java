package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeGUI {

	private JFrame frame;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeGUI window = new ChangeGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChangeGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Change App");
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		title.setBounds(160, 11, 114, 28);
		panel.add(title);
		
		JLabel dis = new JLabel("");
		dis.setBounds(10, 89, 388, 37);
		panel.add(dis);
		
		JLabel lb1 = new JLabel("Enter your change in cents");
		lb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb1.setBounds(10, 50, 176, 28);
		panel.add(lb1);
		
		txt1 = new JTextField();
		txt1.setBounds(184, 52, 96, 28);
		panel.add(txt1);
		txt1.setColumns(10);
		
		JButton btn1 = new JButton("Submit");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ String cents = txt1.getText();
			int change= Integer.parseInt(cents);
			int quarters = change / 25;
			int dimes = ((change % 25) / 10);
			int nickels = (((change % 25)%10)/ 5);	
			dis.setText("Quarters= " + quarters + " Dimes= " + dimes + " Nickels= " + nickels);
			}
		});
		btn1.setBounds(36, 197, 107, 37);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Clear");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ dis.setText("");
			  txt1.setText("");
				
			}
		});
		btn2.setBounds(244, 197, 107, 37);
		panel.add(btn2);
		
		
	}
}
