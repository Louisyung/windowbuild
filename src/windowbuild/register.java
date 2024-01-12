package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import windowbuild.database;
import javax.swing.ImageIcon;
public class register extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ID;
    private JTextField usernameField;
	private JPasswordField passwordField;
	private JPasswordField password;
	public boolean checkRE=false;
	

	public static void changeToReg() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public register() {
		setTitle("註冊");
		setResizable(false);
		JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("請輸入註冊資料\r\n");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 713, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號\r\n");
		lblNewLabel_1.setForeground(new Color(0, 128, 64));
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(20, 73, 111, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setForeground(new Color(0, 128, 64));
		lblNewLabel_2.setBackground(new Color(240, 240, 240));
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 149, 111, 64);
		contentPane.add(lblNewLabel_2);
		
		ID = new JTextField();
		ID.setBackground(new Color(128, 255, 255));
		ID.setFont(new Font("新細明體", Font.BOLD, 18));
		ID.setBounds(141, 73, 527, 53);
		contentPane.add(ID);
		ID.setColumns(10);
		
		password = new JPasswordField();
		password.setBackground(new Color(128, 255, 255));
		password.setFont(new Font("新細明體", Font.BOLD, 18));
		password.setBounds(141, 149, 527, 53);
		contentPane.add(password);
		
		JButton registerButton = new JButton("馬上註冊");
		registerButton.setBackground(new Color(128, 255, 128));
		registerButton.setFont(new Font("新細明體", Font.BOLD, 18));
		registerButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			windowbuilder signin = new windowbuilder();
			database db = new database();
			String getID =ID.getText();
			String getPW =String.valueOf(password.getPassword());
			try {
				db.Users(getID);				
			} 
			catch (Exception e1) {	
				database.Register(getID,getPW);
			}
			setVisible(false);
			signin.changeToSignin();
		}
		}
		);
		registerButton.setBounds(301, 228, 123, 47);
		contentPane.add(registerButton);
		
		
		JLabel lblNewLabel_3 = new JLabel("您還沒註冊帳號嗎 馬上註冊並進行挑戰吧!");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setBackground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(73, 296, 591, 80);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("回到登入介面");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder change = new windowbuilder();
				setVisible(false);
				change.changeToSignin();
			}
		});
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 18));
		btnNewButton.setBounds(545, 349, 157, 53);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\問號.jpg"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 745, 424);
		contentPane.add(lblNewLabel_4);
	}
}
