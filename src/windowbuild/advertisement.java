package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class advertisement extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void changeToAd() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					advertisement frame = new advertisement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public advertisement() {
		setTitle("廣告方案");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("廣告支付方案");
		lblNewLabel.setBounds(5, 5, 521, 24);
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("方案一");
		lblNewLabel_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 54, 137, 56);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("方案二\r\n");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(197, 54, 137, 56);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("方案三");
		lblNewLabel_1_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.BOLD, 20));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(389, 54, 137, 56);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("日付版\r\n");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(10, 132, 137, 37);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("月付版\r\n");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setBounds(197, 132, 137, 37);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("年付版");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setBounds(389, 132, 137, 37);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2 = new JLabel("日費:100元/每日");
		lblNewLabel_2.setFont(new Font("新細明體", Font.ITALIC, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 179, 115, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("月費:2800元/每月");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("新細明體", Font.ITALIC, 12));
		lblNewLabel_2_1.setBounds(207, 179, 115, 56);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("年費:28000元/每年");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("新細明體", Font.ITALIC, 12));
		lblNewLabel_2_2.setBounds(399, 179, 115, 56);
		contentPane.add(lblNewLabel_2_2);
		
		JButton plan1 = new JButton("選擇");
		plan1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder change = new windowbuilder();
				change.changeToSignin();
				setVisible(false);
			}
		});
		plan1.setBounds(30, 245, 85, 45);
		contentPane.add(plan1);
		
		JButton plan2 = new JButton("選擇");
		plan2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder change = new windowbuilder();
				change.changeToSignin();
				setVisible(false);
			}
		});
		plan2.setBounds(217, 245, 85, 45);
		contentPane.add(plan2);
		
		JButton plan3 = new JButton("選擇");
		plan3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder change = new windowbuilder();
				change.changeToSignin();
				setVisible(false);
			}
		});
		plan3.setBounds(409, 245, 85, 45);
		contentPane.add(plan3);
	}
}
