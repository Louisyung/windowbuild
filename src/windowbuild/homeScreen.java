package windowbuild;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.json.simple.JSONObject;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class homeScreen extends JFrame {
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public static void changeToHome() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeScreen frame = new homeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /*public static void processJsonData(database jsonDataHolder) {
	        // 获取 JSON 数据
	        String jsonData = database.getName();

	        // 解析 JSON 数据
	        JSONObject jsonObject = new JSONObject();

	        // 提取数据
	        String name = jsonObject.("name");

	        // 输出数据
	        System.out.println("Name: " + name);
	    }*/
	 
	public homeScreen() {
		setTitle("聯盟排行榜");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("直接來試試看\r\n\r\n");
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				game gm = new game();
				gm.changeToGame();
				//contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 18));
		btnNewButton.setBounds(233, 314, 166, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("聯盟排行榜");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 148, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 77, 72, 47);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2");
		lblNewLabel_1_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 170, 72, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("3");
		lblNewLabel_1_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 227, 72, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("名稱");
		lblNewLabel_2.setForeground(new Color(0, 128, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_2.setBounds(172, 10, 97, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("最高得分紀錄");
		lblNewLabel_3.setForeground(new Color(0, 128, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("微軟正黑體", Font.BOLD, 18));
		lblNewLabel_3.setBounds(354, 10, 236, 36);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("森林幫\r\n\r\n");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("微軟正黑體", Font.BOLD, 26));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(146, 79, 159, 36);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("海洋幫\r\n");
		lblNewLabel_4_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_4_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(146, 166, 159, 36);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("沙漠幫\r\n");
		lblNewLabel_4_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_4_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(146, 223, 159, 36);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_5 = new JLabel("30");
		lblNewLabel_4_5.setForeground(new Color(255, 0, 0));
		lblNewLabel_4_5.setFont(new Font("新細明體", Font.BOLD, 26));
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setBounds(392, 85, 159, 36);
		contentPane.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_5_1 = new JLabel("27");
		lblNewLabel_4_5_1.setForeground(new Color(0, 255, 255));
		lblNewLabel_4_5_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_1.setBounds(392, 166, 159, 36);
		contentPane.add(lblNewLabel_4_5_1);
		
		JLabel lblNewLabel_4_5_2 = new JLabel("22");
		lblNewLabel_4_5_2.setForeground(new Color(128, 0, 128));
		lblNewLabel_4_5_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_4_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5_2.setBounds(392, 223, 159, 36);
		contentPane.add(lblNewLabel_4_5_2);
		
		JButton btnNewButton_1 = new JButton("回到登入介面\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder change = new windowbuilder();
				change.changeToSignin();
				//contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_1.setBounds(22, 320, 112, 56);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("查看玩家資料");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerinfo change = new playerinfo();
				change.changeToPlayer();
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_2.setBounds(459, 314, 141, 56);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\爆炸.jpg"));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(0, 0, 651, 404);
		contentPane.add(lblNewLabel_6);
		
		
	}
}
