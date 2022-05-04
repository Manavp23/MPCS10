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

public class DigitsGUI {

	private JFrame frame;
	private JTextField Dig1text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitsGUI window = new DigitsGUI();
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
	public DigitsGUI() {
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
		
		JLabel dis = new JLabel("");
		dis.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dis.setBounds(10, 107, 414, 33);
		panel.add(dis);
		
		JLabel Title = new JLabel("Digits APP");
		Title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Title.setBounds(170, 11, 108, 43);
		panel.add(Title);
		
		JLabel Dig1 = new JLabel("Enter a 3 dig number");
		Dig1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Dig1.setBounds(10, 63, 138, 33);
		panel.add(Dig1);
		
		Dig1text = new JTextField();
		Dig1text.setBounds(158, 71, 86, 20);
		panel.add(Dig1text);
		Dig1text.setColumns(10);
		
		JButton btn1 = new JButton("Enter");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ String dig= Dig1text.getText();
			  int dig3= Integer.parseInt(dig);
			  int first = dig3 / 100;
			  int second = (dig3 % 100) /10;
			  int third = dig3 % 10;	
			  dis.setText("The first digit is " + first + " The second digit is " + second + " The third digit is " + third);
			  
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(273, 68, 89, 23);
		panel.add(btn1);
		
		JButton btn2 = new JButton("Clear");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{ dis.setText("");
			  Dig1text.setText("");
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(248, 194, 108, 33);
		panel.add(btn2);
		
		
	}
}
