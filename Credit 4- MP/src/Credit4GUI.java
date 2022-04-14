import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit4GUI {

	private JFrame frame;
	private JTextField Fn;
	private JLabel Ln;
	private JTextField LN;
	private JLabel Age;
	private JTextField AG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4GUI window = new Credit4GUI();
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
	public Credit4GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 28, 414, 221);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First Name");
		FN.setBounds(10, 0, 70, 26);
		panel.add(FN);
		
		Fn = new JTextField();
		Fn.setBounds(75, 0, 155, 26);
		panel.add(Fn);
		Fn.setColumns(10);
		
		Ln = new JLabel("Last Name");
		Ln.setBounds(10, 33, 70, 26);
		panel.add(Ln);
		
		
		JLabel dis = new JLabel("");
		dis.setBounds(0, 159, 404, 51);
		panel.add(dis);
		
		LN = new JTextField();
		LN.setColumns(10);
		LN.setBounds(75, 33, 155, 26);
		panel.add(LN);
		
		Age = new JLabel("Age");
		Age.setBounds(10, 70, 70, 26);
		panel.add(Age);
		
		AG = new JTextField();
		AG.setColumns(10);
		AG.setBounds(75, 70, 155, 26);
		panel.add(AG);
		
		JButton ST = new JButton("Submit");
		ST.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
			  String FN= Fn.getText();
			  String Ln= LN.getText();
			  dis.setText("First name:" + FN + "last name: " + Ln);
			}
		});
		ST.setBounds(245, 3, 124, 65);
		panel.add(ST);
		
		JButton RS = new JButton("Reset");
		RS.setBounds(245, 83, 124, 65);
		panel.add(RS);
		
		
	}
}
