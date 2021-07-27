import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LOGIN extends JFrame implements noticebrd {

	private JPanel contentPane;
	private JTextField t01;
	private JTextField t02;
	JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	
	String[] info=new String[500];
	int x,flag;
	public static int m=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN frame = new LOGIN();
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
	public LOGIN() {
			/***
			*info[m]=s;
			*info[m+1]=s2;
			*info[m+2]=s3;
			*info[m+3]=s4;
			*m=m+4;
		**/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel lblNewLabel = new JLabel("H.HanD");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setForeground(new Color(255, 228, 225));
		lblNewLabel.setBounds(762, 0, 416, 134);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(148, 145, 829, 761);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel l01 = new JLabel("LOGIN");
		l01.setForeground(Color.LIGHT_GRAY);
		l01.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		l01.setBounds(273, 35, 186, 32);
		panel.add(l01);
		
		JLabel l03 = new JLabel("password");
		l03.setForeground(Color.LIGHT_GRAY);
		l03.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		l03.setBounds(119, 179, 73, 22);
		panel.add(l03);
		
		t01 = new JTextField();
		t01.setForeground(new Color(0, 0, 139));
		t01.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		t01.setBackground(SystemColor.inactiveCaption);
		t01.setBounds(119, 144, 393, 32);
		panel.add(t01);
		t01.setColumns(10);
		
		t02 = new JTextField();
		t02.setForeground(new Color(0, 0, 139));
		t02.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		t02.setBackground(SystemColor.inactiveCaption);
		t02.setBounds(119, 201, 393, 32);
		panel.add(t02);
		t02.setColumns(10);
		
		JLabel l05 = new JLabel("HAVE ANY PROBLEM DURING  LOGIN");
		l05.setBackground(new Color(204, 153, 51));
		l05.setForeground(Color.LIGHT_GRAY);
		l05.setFont(new Font("Tahoma", Font.BOLD, 16));
		l05.setBounds(33, 563, 346, 14);
		panel.add(l05);
		
		JLabel l04 = new JLabel();
		l04.setForeground(Color.GREEN);
		l04.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		l04.setBounds(175, 323, 337, 32);
		panel.add(l04);
		
		JLabel lnm = new JLabel();
		lnm.setForeground(new Color(176, 196, 222));
		lnm.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lnm.setBounds(137, 392, 256, 23);
		panel.add(lnm);
		
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	m=Integer.toString(j);
				x=Integer.parseInt(t01.getText());
				
				
				if(info[(x-654321)+3].contentEquals(t02.getText()))
				{
				lnm.setText("welcome"+"  "+info[0]);
				flag++;
				
				
				}
				else 
				{
					lnm.setText("incorrect psd");
				}
	
			}
			
		});
		
		
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBounds(351, 264, 161, 45);
		panel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("YES");
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton.setBounds(33, 584, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JButton b01 = new JButton("Next ->");
		b01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(flag==1)
				{
				x=Integer.parseInt(t01.getText());
				flag=0;
				
				
				HOME o=new HOME(info[x-654321],info[x-654320],info[x-654319],t01.getText());
				o.setVisible(true);
				
				
				}
				else {}
				
				
			}
		});
		b01.setBackground(SystemColor.inactiveCaption);
		b01.setFont(new Font("Tahoma", Font.BOLD, 28));
		b01.setForeground(Color.GRAY);
		b01.setBounds(647, 376, 143, 39);
		panel.add(b01);
		
		JButton btnNewButton_1 = new JButton("TRY AGAIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGIN Oj=new LOGIN();
				Oj.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(new Color(128, 128, 128));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(199, 584, 198, 20);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Create new account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NEWACC obj10=new NEWACC();
				obj10.setVisible(true);
			}
		});
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setForeground(new Color(169, 169, 169));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_2.setBounds(33, 660, 773, 59);
		panel.add(btnNewButton_2);
		
		JLabel l06 = new JLabel("or");
		l06.setForeground(new Color(0, 0, 128));
		l06.setFont(new Font("Tahoma", Font.BOLD, 22));
		l06.setBounds(33, 614, 46, 32);
		panel.add(l06);
		
		
		
		JLabel l02 = new JLabel("ID");
		l02.setForeground(Color.LIGHT_GRAY);
		l02.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		l02.setBounds(119, 115, 46, 32);
		panel.add(l02);
		
		JLabel lbend = new JLabel("");
		lbend.setBounds(0, 0, 96, 22);
		panel.add(lbend);
		
		
		
	
	
		
		
		//m=Integer.toString(j);
		
		JLabel lblNewLabel_9 = new JLabel("thank you ... all copy right reserve to helping and . thank tou");
		lblNewLabel_9.setForeground(new Color(128, 128, 128));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_9.setBounds(666, 931, 603, 20);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setBounds(991, 145, 916, 753);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_4 = new JLabel("New label");
		board();
		lblNewLabel_4.setBounds(1083, 138, 916, 666);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Notice Board");
		lblNewLabel_5.setForeground(Color.DARK_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_5.setBounds(0, 0, 916, 57);
		panel_1.add(lblNewLabel_5);
		
	

	}
	public void information(String[] s)
	{
		info=s;
	}

	@Override
	public void board() {
		// TODO Auto-generated method stub
		lblNewLabel_4.setIcon(new ImageIcon("F:\\.data\\LAB_PROJECT\\src\\Annotation 2020-03-25 194204.png"));
	}
	


}
