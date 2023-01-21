import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Label;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Log In");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(200, 200, 603, 413);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 139), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(278, 128, 80, 36);
		lblUsername.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBounds(278, 203, 80, 30);
		lblPassword.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		contentPane.add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.BOLD, 15));
		txtUsername.setBounds(375, 130, 150, 30);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(367, 147, 172, 36);
		contentPane.add(lblPassword);
		
		// Login Button Function!
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setToolTipText("Login System Button");
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.setBounds(278, 300, 70, 30);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtUsername.getText();
				String password = txtPassword.getText();
				
				// UserName and Password!
				if (username.contains("admin") && password.contains("1234")){
					txtUsername.setText(null);
					txtPassword.setText(null);
					JOptionPane.showMessageDialog(null, "Login Succesful");
					
					// Calling Input JFrame!
					Input input = new Input();
					Input.main(null);
					dispose();
					
				}
				else {
					// Error Message!
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtUsername.setText(null);
					txtPassword.setText(null);
				}

			}
		});
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial", Font.BOLD, 15));
		txtPassword.setBounds(375, 202, 150, 30);
		contentPane.add(txtPassword);
		contentPane.add(btnNewButton);
		
		// Reset Button Function!
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_1.setToolTipText("Reset All Text Field");
		btnNewButton_1.setBackground(new Color(0, 0, 139));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtUsername.setText(null);
				txtPassword.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(372, 300, 70, 30);
		contentPane.add(btnNewButton_1);
		
		// Exit Button Function!
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 12));
		btnNewButton_2.setToolTipText("Exit Login Window");
		btnNewButton_2.setBackground(new Color(0, 0, 139));
		btnNewButton_2.setBounds(468, 300, 70, 30);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(105, 105, 105));
		separator.setForeground(new Color(160, 160, 160));
		separator.setBounds(279, 270, 260, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(105, 105, 105));
		separator_1.setBounds(278, 97, 261, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("[ RMS  APPLICATION ]");
		lblNewLabel_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 29));
		lblNewLabel_1.setBounds(278, 50, 261, 49);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("I:\\Eclipse\\Final RMS\\Images\\images.jfif"));
		lblNewLabel_2.setBounds(32, 73, 225, 231);
		contentPane.add(lblNewLabel_2);
	}
//	private class SwingAction extends AbstractAction {
//		public SwingAction() {
//			putValue(NAME, "SwingAction");
//			putValue(SHORT_DESCRIPTION, "Some short description");
//		}
//		public void actionPerformed(ActionEvent e) {
//		}
//	}
	public JLabel getLblNewLabel() {
		return getLblNewLabel();
	}
}
