package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class legends extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void changeToLegends() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					legends frame = new legends();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public legends() {
		setTitle("選擇聯盟");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\森林.jpg"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 61, 155, 203);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\海洋.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(199, 61, 155, 203);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\沙漠.jpg"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(387, 86, 155, 203);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("請選擇想要加入的聯盟");
		lblNewLabel_3.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(158, 22, 261, 54);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("選擇");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerinfo1 change = new playerinfo1();
				change.changeToPlayer();
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 16));
		btnNewButton.setBounds(36, 300, 99, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("選擇");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerinfo2 change = new playerinfo2();
				change.changeToPlayer();
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("新細明體", Font.BOLD, 16));
		btnNewButton_1.setBounds(219, 300, 99, 38);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("選擇");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerinfo3 change = new playerinfo3();
				change.changeToPlayer();
				setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("新細明體", Font.BOLD, 16));
		btnNewButton_2.setBounds(416, 300, 99, 38);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("回到玩家資料");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playerinfo change = new playerinfo();
				change.changeToPlayer();
				setVisible(false);
			}
		});
		btnNewButton_3.setFont(new Font("新細明體", Font.BOLD, 12));
		btnNewButton_3.setBounds(421, 10, 121, 54);
		contentPane.add(btnNewButton_3);
	}
}
