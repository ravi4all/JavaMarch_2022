import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserScreen extends JFrame {
	int counter;
	public UserScreen() {
		counter = 0;
		setSize(600,500);
		setResizable(false);
		setTitle("My First App");
//		setLocation(100,100);
		setLocationRelativeTo(null);
		
		JLabel title = new JLabel("Welcome to GUI App...");
		title.setFont(new Font("Arial", Font.BOLD, 20));
		title.setBounds(10,20,300,40);
		
		JLabel counterLabel = new JLabel("0");
		counterLabel.setFont(new Font("Arial", Font.BOLD, 20));
		counterLabel.setBounds(350,200,100,40);
		
		JButton btn = new JButton("Increment...");
		btn.setFont(new Font("Arial", Font.BOLD, 20));
		btn.setBounds(100,200,150,40);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				counterLabel.setText("Count : " + counter);
			}
		});
		
		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(title);
		container.add(btn);
		container.add(counterLabel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		UserScreen us = new UserScreen();
	}

}
