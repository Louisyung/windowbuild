package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class forget extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void changeToForget() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forget frame = new forget();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public forget() {
		setTitle("忘記密碼怎麼辦...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("忘記密碼就要怪你自己了...");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(76, 76, 434, 92);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("回到註冊畫面繼續猜");
		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setFont(new Font("新細明體", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windowbuilder signin = new windowbuilder();
				signin.changeToSignin();
				//contentPane.setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(169, 205, 212, 57);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\我就爛2.jpg"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 571, 360);
		contentPane.add(lblNewLabel_1);
	}

}
