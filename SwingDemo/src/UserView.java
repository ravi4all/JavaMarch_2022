import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class UserView {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) {
		UserView window = new UserView();
	}

	public UserView() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 917, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 22));
		btnNewButton.setBounds(178, 335, 169, 58);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(454, 119, 319, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter your email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(132, 119, 228, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter your password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(132, 218, 228, 58);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setFont(new Font("Dialog", Font.BOLD, 22));
		btnReset.setBounds(454, 335, 169, 58);
		frame.getContentPane().add(btnReset);
		
		JLabel lblNewLabel_2 = new JLabel("User Login Screen");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(277, 22, 273, 74);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(454, 218, 319, 58);
		frame.getContentPane().add(passwordField);
		frame.setVisible(true);
	}
}
