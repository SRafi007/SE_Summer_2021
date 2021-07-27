import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JLabel;

public class finalbrd extends JFrame {

	private JPanel contentPane;
	private Container panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					finalbrd frame = new finalbrd("","","","");
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
	public finalbrd(String s,String s2,String s3,String s4) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1833, 1001);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("H.HAND");
		btnNewButton.setBounds(10, 27, 297, 99);
		btnNewButton.setForeground(new Color(0, 139, 139));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 60));
		contentPane.add(btnNewButton);
		
		JLabel b1 = new JLabel(s4);
		b1.setBounds(307, 257, 858, 69);
		b1.setForeground(new Color(95, 158, 160));
		b1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		contentPane.add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("   item                            price                 type                  Avilable");
		lblNewLabel_1.setBackground(new Color(144, 238, 144));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(307, 188, 858, 42);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel c1 = new JLabel("");
		c1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		c1.setBounds(383, 617, 664, 27);
		contentPane.add(c1);
		
		JLabel o1 = new JLabel("");
		o1.setForeground(new Color(255, 127, 80));
		o1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		o1.setBounds(483, 503, 446, 69);
		contentPane.add(o1);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c1.setText("Welcome    "+ s+" .Thanks for Using our Service" );
				
				o1.setText("ORDER PLACED");
				  CreateFile obj=new CreateFile(s,s2,s3,s4);
				  obj.infor();
			}
		});
		btnNewButton_1.setForeground(new Color(119, 136, 153));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(860, 416, 187, 34);
		contentPane.add(btnNewButton_1);
		
		
		
	
		
	
	}
}
