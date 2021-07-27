import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JList;

public class buyfood extends JFrame {

	private JPanel contentPane;
	JLabel b1;
	public static String a,b,c,d;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buyfood frame = new buyfood("","","","");
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
	public buyfood(String s,String s2,String s3,String s4) {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, 1917, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JComboBox pf = new JComboBox();
		pf.setForeground(new Color(255, 127, 80));
		pf.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		pf.setBounds(1610, 34, 307, 37);
		panel.add(pf);
		pf.addItem("profile");
		panel.add(pf);
		pf.addItem(s);
		pf.addItem(s2);
		pf.addItem(s3);
		pf.addItem(s4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(65, 105, 225));
		panel_1.setBounds(73, 226, 1090, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Item");
		lblNewLabel_1.setForeground(new Color(255, 245, 238));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(20, 11, 103, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Price");
		lblNewLabel_2.setForeground(new Color(255, 245, 238));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_2.setBounds(340, 11, 95, 20);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Type");
		lblNewLabel_3.setForeground(new Color(255, 245, 238));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(610, 11, 103, 20);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Quantity");
		lblNewLabel_4.setForeground(new Color(255, 245, 238));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_4.setBounds(897, 11, 149, 20);
		panel_1.add(lblNewLabel_4);
		
		                                           
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(66, 342, 1076, 42);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("H.HAND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				HOME o=new HOME(s,s2,s3,s4);
				o.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(95, 158, 160));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
		btnNewButton.setBounds(0, 67, 341, 97);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				finalbrd o=new finalbrd(s,s2,s3,b1.getText());
				o.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(1221, 293, 108, 45);
		panel_3.add(btnNewButton_1);
		 
	    b1 = new JLabel(a+"                   "+b+"                     "+c+"                       "+d);
		b1.setForeground(new Color(70, 130, 180));
		b1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 32));
		b1.setBounds(70, 293, 1090, 45);
		panel_3.add(b1);
	}
	
	public void item(String x,String x2,String x3,String x4)
	{
	a=x;b=x2;c=x3;d=x4;
	}
}
