import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class NEWACC extends JFrame implements noticebrd {

	private JPanel contentPane;
	private JTextField t01;
	private JTextField t02;
	private JTextField t03;
	private JTextField t05;
	private JTextField t06;
	JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	
	String[] info=new String[500];
	int n=0;
	int id=654321;
	String sid;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NEWACC frame = new NEWACC();
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
	public NEWACC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1933, 1001);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(794, 107, 1065, 709);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
	 
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\.data\\PROJECT\\src\\img3.png"));
		lblNewLabel_2.setBounds(0, 11, 666, 687);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 1917, 68);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
				
				
				
		JLabel lblNewLabel = new JLabel("Create New Account");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 36));
		lblNewLabel.setBounds(769, 11, 370, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_10 = new JLabel("H.HanD");
		lblNewLabel_10.setForeground(new Color(255, 228, 225));
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 66));
		lblNewLabel_10.setBounds(24, 0, 276, 68);
		panel.add(lblNewLabel_10);
		
		JLabel l01 = new JLabel("FIRST NAME");
		l01.setForeground(Color.DARK_GRAY);
		l01.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l01.setBounds(10, 105, 199, 31);
		contentPane.add(l01);
		
		JLabel l02 = new JLabel("LAST NAME");
		l02.setForeground(Color.DARK_GRAY);
		l02.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l02.setBounds(10, 150, 199, 31);
		contentPane.add(l02);
		
		JLabel l03 = new JLabel("GMAIL ID");
		l03.setForeground(Color.DARK_GRAY);
		l03.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l03.setBounds(10, 197, 199, 31);
		contentPane.add(l03);
		
		JLabel l04 = new JLabel("ADDRESS");
		l04.setForeground(Color.DARK_GRAY);
		l04.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l04.setBounds(10, 249, 199, 31);
		contentPane.add(l04);
		
		JLabel l05 = new JLabel("GENDER");
		l05.setForeground(Color.DARK_GRAY);
		l05.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l05.setBounds(10, 363, 199, 31);
		contentPane.add(l05);
		
		t01 = new JTextField();
		t01.setForeground(Color.DARK_GRAY);
		t01.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t01.setBounds(232, 112, 377, 20);
		contentPane.add(t01);
		t01.setColumns(10);
		
		t02 = new JTextField();
		t02.setForeground(Color.DARK_GRAY);
		t02.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t02.setBounds(232, 155, 377, 20);
		contentPane.add(t02);
		t02.setColumns(10);
		
		t03 = new JTextField();
		t03.setForeground(Color.DARK_GRAY);
		t03.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t03.setBounds(232, 202, 377, 20);
		contentPane.add(t03);
		t03.setColumns(10);
		
		JTextArea t04 = new JTextArea();
		t04.setForeground(Color.DARK_GRAY);
		t04.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t04.setBounds(232, 249, 377, 83);
		contentPane.add(t04);
		
		JComboBox c01 = new JComboBox();
		c01.setBounds(232, 367, 377, 22);
		contentPane.add(c01);
		c01.addItem("Gender");
		c01.addItem("Male");
		c01.addItem("Female");
		
		JLabel l06 = new JLabel("PASWORD");
		l06.setForeground(Color.DARK_GRAY);
		l06.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l06.setBounds(10, 405, 199, 31);
		contentPane.add(l06);
		
		JLabel l07 = new JLabel("CONFIRM PASSWORD");
		l07.setForeground(Color.DARK_GRAY);
		l07.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		l07.setBounds(0, 447, 199, 31);
		contentPane.add(l07);
		
		t05 = new JTextField();
		t05.setForeground(Color.DARK_GRAY);
		t05.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t05.setBounds(232, 410, 377, 20);
		contentPane.add(t05);
		t05.setColumns(10);
		
		t06 = new JTextField();
		t06.setForeground(Color.DARK_GRAY);
		t06.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		t06.setBounds(232, 452, 377, 20);
		contentPane.add(t06);
		t06.setColumns(10);
		
		
		JLabel t09 = new JLabel();
		t09.setForeground(new Color(255, 127, 80));
		t09.setFont(new Font("Tahoma", Font.BOLD, 29));
		t09.setBounds(20, 640, 587, 68);
		contentPane.add(t09);
		
		JLabel l09 = new JLabel("");
		l09.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		l09.setBounds(232, 596, 377, 21);
		contentPane.add(l09);
		
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(t06.getText().equals(t05.getText()))
				{
				
				l09.setText(sid=Integer.toString(id));
				t09.setText("REMEMBER YOUR ID");
				info[n]=t02.getText()  ;
				info[n+1] =t03.getText() ;
				info[n+2] =t04.getText();
				info[n+3] =t06.getText();
				n=n+4;
				}
				else
				{
					l09.setText("check you password");
				}
				
		
				
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(467, 519, 142, 46);
		contentPane.add(btnNewButton);
		
		LOGIN obj=new LOGIN();
		
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				obj.information(info);
		obj.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(321, 719, 290, 33);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_1.setBounds(10, 603, 46, 14);
		contentPane.add(lblNewLabel_1);
		

		
	
		

	}

	@Override
	public void board() {
		// TODO Auto-generated method stub
		lblNewLabel_2.setIcon(new ImageIcon("F:\\.data\\PROJECT\\src\\img3.png"));
	}
}
