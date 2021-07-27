import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class sellfood extends JFrame {

	private JPanel contentPane;
	private Component textField_5;
	private JTextField x4;
	private Component textField_3;
	private JTextField x2;
	private Component x1;
	private Component x3;
	private JTextField x01;
	private JTextField x03;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sellfood frame = new sellfood("","","","");
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
	public sellfood(String s,String s2,String s3,String s4) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 0, 1917, 85);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox pf = new JComboBox();
		pf.setForeground(new Color(255, 127, 80));
		pf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		pf.setBounds(1584, 51, 333, 34);
		panel.add(pf);
		pf.addItem("profile");
		panel.add(pf);
		pf.addItem(s);
		pf.addItem(s2);
		pf.addItem(s3);
		pf.addItem(s4);
		
		JButton btnNewButton = new JButton("H.HAND");
		btnNewButton.setForeground(new Color(0, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 48));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HOME o=new HOME(s,s2,s3,s4);
				o.setVisible(true);
		
			}
		});
		btnNewButton.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\img.png"));
		btnNewButton.setBounds(0, 84, 406, 107);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Add Item");
		lblNewLabel.setForeground(new Color(70, 130, 180));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(10, 255, 199, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Item Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(136, 327, 114, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(136, 376, 114, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Type");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(136, 422, 114, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("available");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(136, 478, 114, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(136, 521, 114, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(136, 571, 114, 29);
		contentPane.add(lblNewLabel_6);
		
	
		
		x2 = new JTextField();
		x2.setBounds(260, 377, 305, 20);
		contentPane.add(x2);
		x2.setColumns(10);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(260, 479, 305, 20);
		contentPane.add(textField_3);
		((JTextField) textField_3).setColumns(10);
		
		x4 = new JTextField();
		x4.setBounds(260, 527, 305, 20);
		contentPane.add(x4);
		x4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(260, 575, 305, 20);
		contentPane.add(textField_5);
		((JTextField) textField_5).setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				buyfood o=new buyfood(s,s2,s3,s4);
				o.item(x01.getText(),x4.getText(),x03.getText(),x2.getText());
				
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(382, 674, 183, 36);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Home");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				HOME o=new HOME(s,s2,s3,s4);
				o.setVisible(true);
				
			}
		});
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		btnNewButton_2.setBounds(382, 820, 183, 51);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_7.setBounds(260, 733, 305, 29);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("#     Do you  want to add more item");
		lblNewLabel_8.setForeground(Color.DARK_GRAY);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_8.setBounds(711, 327, 338, 23);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("Yes");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				sellfood o=new sellfood(s,s2,s3,s4);
				o.setVisible(true);
				
			}
		});
		btnNewButton_3.setForeground(Color.DARK_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_3.setBounds(872, 361, 89, 23);
		contentPane.add(btnNewButton_3);
		
		x01 = new JTextField();
		x01.setBounds(260, 330, 310, 20);
		contentPane.add(x01);
		x01.setColumns(10);
		
		x03 = new JTextField();
		x03.setBounds(260, 428, 305, 20);
		contentPane.add(x03);
		x03.setColumns(10);
	}
}
