package CreationSystem;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class LogInInterface extends JFrame {

	private JPanel contentPane;
	private JPasswordField password;
	private JButton passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogInInterface frame = new LogInInterface();
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
	public LogInInterface() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screensize.width, screensize.height);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(233, 255, 210));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 255, 0));
		panel.setBounds(0, 0, 581, 768);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel LOG = new JLabel("LOG IN");
		LOG.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 40));
		LOG.setForeground(new Color(255, 255, 196));
		LOG.setHorizontalAlignment(SwingConstants.CENTER);
		LOG.setBounds(84, 161, 417, 77);
		panel.add(LOG);
		
		JTextField username = new JTextField("");
		username.setForeground(new Color(53, 53, 53));
		username.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 35));
		username.setBounds(84, 298, 417, 52);
		panel.add(username);
		
		password = new JPasswordField("");
		password.setForeground(new Color(53, 53, 53));
		password.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 35));
		password.setBounds(84, 393, 417, 52);
		panel.add(password);
		
		JLabel lblNewLabel = new JLabel("Username : ");
		lblNewLabel.setForeground(new Color(25, 25, 25));
		lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		lblNewLabel.setBounds(84, 263, 221, 35);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(new Color(25, 25, 25));
		lblPassword.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 23));
		lblPassword.setBounds(84, 358, 221, 35);
		panel.add(lblPassword);
		
		passwordField = new JButton("ENTER");
		passwordField.setBackground(new Color(255, 255, 128));
		passwordField.setForeground(new Color(53, 53, 53));
		passwordField.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 35));
		passwordField.setBounds(84, 500, 197, 52);
		panel.add(passwordField);
		
		JButton btnSigmUp = new JButton("SIGN UP");
		btnSigmUp.setForeground(new Color(53, 53, 53));
		btnSigmUp.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 35));
		btnSigmUp.setBackground(new Color(255, 255, 128));
		btnSigmUp.setBounds(304, 500, 197, 52);
		panel.add(btnSigmUp);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Show Password");
		rdbtnNewRadioButton.setIconTextGap(10);
		rdbtnNewRadioButton.setForeground(new Color(53, 53, 53));
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 0));
		rdbtnNewRadioButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 25));
		rdbtnNewRadioButton.setBounds(84, 452, 417, 41);
		panel.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("DESIGN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 99));
		lblNewLabel_1.setForeground(new Color(128, 255, 0));
		lblNewLabel_1.setBounds(597, 168, 759, 178);
		contentPane.add(lblNewLabel_1);
	}
}
