package windowbuild;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Random;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class game extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;


	public static void changeToGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					game frame = new game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public game() 
	{
		setTitle("遊戲中...");
		Random random = new Random();
		int randomNum = random.nextInt(100);
		System.out.println(randomNum);
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("提示\r\n");
		lblNewLabel.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(305, 203, 88, 34);
		contentPane.add(lblNewLabel);
		
		JLabel signal = new JLabel("");
		signal.setFont(new Font("新細明體", Font.BOLD, 20));
		signal.setHorizontalAlignment(SwingConstants.CENTER);
		signal.setBounds(274, 257, 151, 52);
		contentPane.add(signal);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("新細明體", Font.BOLD, 30));
		textField.setBounds(274, 94, 151, 63);
		contentPane.add(textField);
		textField.setColumns(10);

		
		JLabel lblNewLabel_2 = new JLabel("請輸入您要猜的數字\r\n");
		lblNewLabel_2.setFont(new Font("新細明體", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(220, 25, 260, 46);
		contentPane.add(lblNewLabel_2);
		
		JButton guessButton = new JButton("猜\r\n");
		guessButton.setFont(new Font("新細明體", Font.BOLD, 18));
		guessButton.setBounds(263, 329, 176, 69);
		contentPane.add(guessButton);
		
		JButton gameToHome = new JButton("回到主畫面");
		gameToHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeScreen change = new homeScreen();
				change.changeToHome();
				dispose();
			}
		});
		gameToHome.setFont(new Font("新細明體", Font.BOLD, 18));
		gameToHome.setBounds(42, 25, 151, 46);
		contentPane.add(gameToHome);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 734, 428);
		contentPane.add(lblNewLabel_1);
		
		JLabel bomb = new JLabel("");
		bomb.setIcon(new ImageIcon("C:\\Users\\USER\\Downloads\\炸彈.jpg"));
		bomb.setHorizontalAlignment(SwingConstants.CENTER);
		bomb.setBounds(10, 85, 250, 201);
		contentPane.add(bomb);
		
		
		guessButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				int ans = 0;
				String strans = textField.getText();
				try {
					ans = Integer.parseInt(strans);
				}catch (NumberFormatException e1) {
				    e1.printStackTrace();
				}
				if(ans==randomNum)
				{
					JOptionPane.showMessageDialog(null, "恭喜答對");
					homeScreen change = new homeScreen();
					homeScreen.changeToHome();
					dispose();
				}
				else if(ans>randomNum)
					signal.setText("數字太大");
				else
					signal.setText("數字太小");
			}
		});
	}
}
