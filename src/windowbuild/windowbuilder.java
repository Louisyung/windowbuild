package windowbuild;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import windowbuild.database;
public class windowbuilder extends JFrame {

	
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JPasswordField passwordField_1;
	private JTextField ID;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowbuilder window = new windowbuilder();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void changeToSignin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowbuilder window = new windowbuilder();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public windowbuilder() {
		setTitle("登入或註冊");
		initialize();
	}
	
	//public static String findUserName(String str)
	//{
		//return str;
	//}

	ArrayList<String> user = new ArrayList<String>();
	
	private void initialize() {
		
		setBounds(100, 100, 699, 439);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		lblNewLabel = new JLabel("請登入或註冊以進入遊戲");
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setBounds(0, 0, 685, 59);
		lblNewLabel.setFont(new Font("\u5FAE\u8EDF\u6B63\u9ED1\u9AD4 Light", lblNewLabel.getFont().getStyle() | Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("登入");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				database signin = new database();
				String getID = ID.getText();
				String getPW = String.valueOf(passwordField_1.getPassword());
				if(signin.Login(getID,getPW)) 
				{
					homeScreen homes = new homeScreen();
					setVisible(false);
					homes.setVisible(true);
					//dispose();
				}
				//homes.changeToHome();
				//frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(597, 81, 78, 91);
		getContentPane().add(btnNewButton);
		
		
		btnNewButton_1 = new JButton("即刻註冊");
		btnNewButton_1.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register reg = new register();
				reg.changeToReg();
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(180, 350, 138, 42);
		getContentPane().add(btnNewButton_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(new Color(128, 255, 255));
		passwordField_1.setBounds(105, 130, 492, 42);
		getContentPane().add(passwordField_1);
		
		ID = new JTextField();
		ID.setBackground(new Color(128, 255, 255));
		ID.setBounds(105, 81, 492, 42);
		getContentPane().add(ID);
		ID.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(0, 81, 101, 42);
		lblNewLabel_1.setFont(new Font("\u5FAE\u8EDF\u6B63\u9ED1\u9AD4 Light", lblNewLabel_1.getFont().getStyle() | Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("\u5FAE\u8EDF\u6B63\u9ED1\u9AD4 Light", lblNewLabel_2.getFont().getStyle() | Font.BOLD, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 130, 101, 42);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("忘記密碼...");
		btnNewButton_2.setFont(new Font("新細明體", Font.BOLD | Font.ITALIC, 18));
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				forget frg= new forget();
				frg.changeToForget();
				setVisible(false);
			}
		});
		btnNewButton_2.setBounds(366, 350, 130, 42);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("廣告支付方案");
		btnNewButton_3.setForeground(new Color(255, 128, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				advertisement change = new advertisement();
				change.changeToAd();
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.BOLD, 16));
		btnNewButton_3.setBounds(528, 333, 147, 59);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\終極密碼.jpg"));
		lblNewLabel_3.setBounds(10, 175, 665, 169);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\r\n");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\—Pngtree—starry background dot starlight and_916891.jpg"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 698, 402);
		getContentPane().add(lblNewLabel_4);
	}
}
