import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.plaf.OptionPaneUI;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Output extends JFrame {

	private JPanel contentPane;
	public JTextArea txtReceiver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Output frame = new Output();
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
	public Output() {
		setResizable(false);
		setTitle("Outpu Preview");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 725);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 139), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtReceiver = new JTextArea();
		txtReceiver.setTabSize(3);
		txtReceiver.setFont(new Font("Source Sans Pro", Font.PLAIN, 14));
		txtReceiver.setBounds(22, 81, 550, 585);
		contentPane.add(txtReceiver);
		
		JButton btnSave = new JButton("Save");
		btnSave.setForeground(Color.WHITE);
		btnSave.setToolTipText("Save Document or Print");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					txtReceiver.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBackground(new Color(0, 0, 139));
		btnSave.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnSave.setBounds(39, 30, 95, 35);
		contentPane.add(btnSave);
		
		JButton btnExit = new JButton("Close");
		btnExit.setForeground(Color.WHITE);
		btnExit.setToolTipText("Exit Window");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(null, "Confirm Close   Yes/ No", "System Exit", JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					
					dispose();
				}
			}
		});
		btnExit.setBackground(new Color(0, 0, 139));
		btnExit.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnExit.setBounds(463, 30, 95, 35);
		contentPane.add(btnExit);
		
		JLabel lblRmsOutput = new JLabel("{ RMS >>  Output }");
		lblRmsOutput.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 24));
		lblRmsOutput.setBounds(184, 28, 228, 27);
		contentPane.add(lblRmsOutput);
	}
}
