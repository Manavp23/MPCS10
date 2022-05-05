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

public class Integercr5GUI {

	private JFrame frame;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Integercr5GUI window = new Integercr5GUI();
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
	public Integercr5GUI() {
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
		
		JLabel lbl = new JLabel("Integer Calculator");
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl.setBounds(137, 11, 160, 37);
		panel.add(lbl);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(45, 105, 342, 27);
		panel.add(lbl2);
		
		JLabel lbl1 = new JLabel("Enter a number");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl1.setBounds(35, 67, 102, 27);
		panel.add(lbl1);
		
		txt1 = new JTextField();
		txt1.setBounds(168, 69, 102, 27);
		panel.add(txt1);
		txt1.setColumns(10);
		
		JButton btn1 = new JButton("Submit");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ String integer = txt1.getText();
			  int number= Integer.parseInt(integer);
			  if (number % 2 == 0) {
		      lbl2.setText("The integer " +number+ " is even");
	          } else {
		       lbl2.setText("The integer " +number+ " is odd");
		       
			}
			}
		});
		btn1.setBounds(25, 193, 112, 37);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Clear");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ txt1.setText("");
			  lbl2.setText("");
				
				
			}
		});
		btn2.setBounds(234, 193, 112, 37);
		panel.add(btn2);
		 
		
		
	}
}
