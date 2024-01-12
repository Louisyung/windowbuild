package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class playerinfo3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void changeToPlayer() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playerinfo3 frame = new playerinfo3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public playerinfo3() {
		setTitle("玩家資料\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("玩家資訊\r\n");
		lblNewLabel.setBounds(5, 5, 506, 24);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("名稱:");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 67, 47, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("得分資訊:");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(10, 125, 93, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("已加入聯盟:");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(10, 191, 105, 36);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel nameInfo = new JLabel("Louis");
		nameInfo.setFont(new Font("新細明體", Font.BOLD, 18));
		nameInfo.setBounds(134, 67, 223, 36);
		contentPane.add(nameInfo);
		
		JLabel pointInfo = new JLabel("22分");
		pointInfo.setFont(new Font("新細明體", Font.BOLD, 18));
		pointInfo.setBounds(134, 125, 193, 36);
		contentPane.add(pointInfo);
		
		JLabel legendsInfo = new JLabel("沙漠幫");
		legendsInfo.setFont(new Font("新細明體", Font.BOLD, 18));
		legendsInfo.setBounds(134, 191, 188, 36);
		contentPane.add(legendsInfo);
		
		JButton btnNewButton = new JButton("選擇聯盟");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				legends change = new legends();
				change.changeToLegends();
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.ITALIC, 20));
		btnNewButton.setBounds(332, 191, 174, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("查看戰績");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeScreen change = new homeScreen();
				change.changeToHome();
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.ITALIC, 20));
		btnNewButton_1.setBounds(183, 270, 174, 36);
		contentPane.add(btnNewButton_1);
	}

}

