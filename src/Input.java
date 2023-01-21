import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Input extends JFrame {
	
	public JLabel lblClass;
	public JLabel lblShift;
	public JLabel lblYear;
	public JLabel lblSemester;

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtRoll;
	private JTextField txtBan;
	private JTextField txtEng;
	private JTextField txtMath;
	private JTextField txtBWI;
	private JTextField txtGS;
	private JTextField txtRMS;
	private JComboBox classbox;
	private JComboBox shiftbox;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Input frame = new Input();
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
	public Input() {
		setResizable(false);
		setTitle("Student Information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 780, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 139), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblName.setBounds(83, 160, 55, 24);
		contentPane.add(lblName);
		
		JLabel lblRoll = new JLabel("Roll");
		lblRoll.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblRoll.setBounds(96, 211, 40, 20);
		contentPane.add(lblRoll);
		
		JLabel lblNewLabel = new JLabel("Bangla");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblNewLabel.setBounds(259, 319, 57, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setForeground(Color.BLACK);
		lblEnglish.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblEnglish.setBounds(258, 369, 57, 20);
		contentPane.add(lblEnglish);
		
		JLabel lblMathemetics = new JLabel("Mathemetics");
		lblMathemetics.setForeground(Color.BLACK);
		lblMathemetics.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblMathemetics.setBounds(218, 411, 97, 20);
		contentPane.add(lblMathemetics);
		
		JLabel lblNewLabel_1 = new JLabel("Bangladesh and World Identity");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(96, 459, 225, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblGenarelScience = new JLabel("General Science");
		lblGenarelScience.setForeground(Color.BLACK);
		lblGenarelScience.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblGenarelScience.setBounds(196, 506, 120, 20);
		contentPane.add(lblGenarelScience);
		
		JLabel lblIslumicStudy = new JLabel("Religion and Moral Education");
		lblIslumicStudy.setForeground(Color.BLACK);
		lblIslumicStudy.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblIslumicStudy.setBounds(106, 551, 212, 20);
		contentPane.add(lblIslumicStudy);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 139));
		separator.setBounds(103, 298, 577, 5);
		contentPane.add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 139));
		separator_2.setBounds(96, 598, 577, 5);
		contentPane.add(separator_2);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		txtName.setBounds(147, 160, 167, 25);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtRoll = new JTextField();
		txtRoll.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		txtRoll.setBounds(147, 208, 167, 25);
		contentPane.add(txtRoll);
		txtRoll.setColumns(10);
		
		txtBan = new JTextField();
		txtBan.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtBan.setBounds(594, 313, 45, 30);
		contentPane.add(txtBan);
		txtBan.setColumns(10);
		
		txtEng = new JTextField();
		txtEng.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEng.setBounds(594, 361, 45, 30);
		contentPane.add(txtEng);
		txtEng.setColumns(10);
		
		txtMath = new JTextField();
		txtMath.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtMath.setBounds(594, 408, 45, 30);
		contentPane.add(txtMath);
		txtMath.setColumns(10);
		
		txtBWI = new JTextField();
		txtBWI.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtBWI.setBounds(594, 456, 45, 30);
		contentPane.add(txtBWI);
		txtBWI.setColumns(10);
		
		txtGS = new JTextField();
		txtGS.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtGS.setBounds(594, 503, 45, 30);
		contentPane.add(txtGS);
		txtGS.setColumns(10);
		
		txtRMS = new JTextField();
		txtRMS.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtRMS.setBounds(594, 548, 45, 30);
		contentPane.add(txtRMS);
		txtRMS.setColumns(10);
		
		JLabel lblSubject = new JLabel("Subject Name");
		lblSubject.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSubject.setBounds(190, 262, 125, 28);
		contentPane.add(lblSubject);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblMarks.setBounds(587, 262, 65, 28);
		contentPane.add(lblMarks);
		
		//Submit Button Function!
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setToolTipText("Submit For Output");
		btnSubmit.setBackground(new Color(0, 0, 139));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Result result = new Result();
				result.show_Name.setText(txtName.getText());
				result.show_Roll.setText(txtRoll.getText());
				result.ban_Mark.setText(txtBan.getText());
				result.eng_Mark.setText(txtEng.getText());
				result.math_Mark.setText(txtMath.getText());
				result.bwi_Mark.setText(txtBWI.getText());
				result.gs_Mark.setText(txtGS.getText());
				result.rme_Mark.setText(txtRMS.getText());							
				result.setVisible(true);
				dispose();
	
				
				// For Bangla!
				float i = Float.parseFloat(txtBan.getText());
				if ((i <= 100.0) && (i >= 80.0)) {
					result.show_BanGD.setText("A+");
					result.show_BanPt.setText("5.00");
				}
				else if ((i <= 79.0) && (i >= 70.0)) {
					result.show_BanGD.setText("A");
					result.show_BanPt.setText("4.00");
				}
				else if ((i <= 69.0) && (i >= 60.0)) {
					result.show_BanGD.setText("A-");
					result.show_BanPt.setText("3.50");
				}
				else if ((i <= 59.0) && (i >= 50.0)) {
					result.show_BanGD.setText("B");
					result.show_BanPt.setText("3.00");
				}
				else if ((i <= 49.0) && (i >= 40.0)) {
					result.show_BanGD.setText("C");
					result.show_BanPt.setText("2.00");
				}
				else if ((i <= 39.0) && (i >= 33.0)) {
					result.show_BanGD.setText("D");
					result.show_BanPt.setText("1.00");
				}
				else {
					result.show_BanGD.setText("F");
					result.show_BanPt.setText("0.00");
				}
				
				// For English!
				float i1 = Float.parseFloat(txtEng.getText());
				if ((i1 <= 100.0) && (i1 >= 80.0)) {
					result.show_EngGD.setText("A+");
					result.show_EngPt.setText("5.00");
				}
				else if ((i1 <= 79.0) && (i1 >= 70.0)) {
					result.show_EngGD.setText("A");
					result.show_EngPt.setText("4.00");
				}
				else if ((i1 <= 69.0) && (i1 >= 60.00)) {
					result.show_EngGD.setText("A-");
					result.show_EngPt.setText("3.50");
				}
				else if ((i1 <= 59.0) && (i1 >= 50.0)) {
					result.show_EngGD.setText("B");
					result.show_EngPt.setText("3.00");
				}
				else if ((i1 <= 49.0) && (i1 >= 40.0)) {
					result.show_EngGD.setText("C");
					result.show_EngPt.setText("2.00");
				}
				else if ((i1 <= 39.0) && (i1 >= 33.0)) {
					result.show_EngGD.setText("D");
					result.show_EngPt.setText("1.00");
				}
				else {
					result.show_EngGD.setText("F");
					result.show_EngPt.setText("0.00");
				}
				
				// For Mathematics!
				float i2 = Float.parseFloat(txtMath.getText());
				if ((i2 <= 100.0) && (i2 >= 80.0)) {
					result.show_MathGD.setText("A+");
					result.show_MathPt.setText("5.00");
				}
				else if ((i2 <= 79.0) && (i2 >= 70.0)) {
					result.show_MathGD.setText("A");
					result.show_MathPt.setText("4.00");
				}
				else if ((i2 <= 69.0) && (i2 >= 60.0)) {
					result.show_MathGD.setText("A-");
					result.show_MathPt.setText("3.50");
				}
				else if ((i2 <= 59.0) && (i2 >= 50.0)) {
					result.show_MathGD.setText("B");
					result.show_MathPt.setText("3.00");
				}
				else if ((i2 <= 49.0) && (i2 >= 40.0)) {
					result.show_MathGD.setText("C");
					result.show_MathPt.setText("2.00");
				}
				else if ((i2 <= 39.0) && (i2 >= 33.0)) {
					result.show_MathGD.setText("D");
					result.show_MathPt.setText("1.00");
				}
				else {
					result.show_MathGD.setText("F");
					result.show_MathPt.setText("0.00");
				}
				
				// Bangladesh and World Identity!    
				float i3 = Float.parseFloat(txtBWI.getText());
				if ((i3 <= 100.0) && (i3 >= 80.0)) {
					result.show_BwiGD.setText("A+");
					result.show_BWIPt.setText("5.00");
				}
				else if ((i3 <= 79.0) && (i3 >= 70.0)) {
					result.show_BwiGD.setText("A");
					result.show_BWIPt.setText("4.00");
				}
				else if ((i3 <= 69.0) && (i3 >= 60.0)) {
					result.show_BwiGD.setText("A-");
					result.show_BWIPt.setText("3.50");
				}
				else if ((i3 <= 59.0) && (i3 >= 50.0)) {
					result.show_BwiGD.setText("B");
					result.show_BWIPt.setText("3.00");
				}
				else if ((i3 <= 49.0) && (i3 >= 40.0)) {
					result.show_BwiGD.setText("C");
					result.show_BWIPt.setText("2.00");
				}
				else if ((i3 <= 39.0) && (i3 >= 33.0)) {
					result.show_BwiGD.setText("D");
					result.show_BWIPt.setText("1.00");
				}
				else {
					result.show_BwiGD.setText("F");
					result.show_BWIPt.setText("0.00");
				}
				
				//For General Science!
				float i4 = Float.parseFloat(txtGS.getText());
				if ((i4 <= 100.0) && (i4 >= 80.0)) {
					result.show_GsGD.setText("A+");
					result.show_GSPt.setText("5.00");
				}
				else if ((i4 <= 79.0) && (i4 >= 70.0)) {
					result.show_GsGD.setText("A");
					result.show_GSPt.setText("4.00");
				}
				else if ((i4 <= 69.0) && (i4 >= 60.0)) {
					result.show_GsGD.setText("A-");
					result.show_GSPt.setText("3.50");
				}
				else if ((i4 <= 59.0) && (i4 >= 50.0)) {
					result.show_GsGD.setText("B");
					result.show_GSPt.setText("3.00");
				}
				else if ((i4 <= 49.0) && (i4 >= 40.0)) {
					result.show_GsGD.setText("C");
					result.show_GSPt.setText("2.00");
				}
				else if ((i4 <= 39.0) && (i4 >= 33.0)) {
					result.show_GsGD.setText("D");
					result.show_GSPt.setText("1.00");
				}
				else {
					result.show_GsGD.setText("F");
					result.show_GSPt.setText("0.00");
				}
				
				// For Religion and Moral Education!
				float i5 = Float.parseFloat(txtRMS.getText());
				if ((i5 <= 100.0) && (i5 >= 80.0)) {
					result.show_RmeGD.setText("A+");
					result.show_RMEPt.setText("5.00");
				}
				else if ((i5 <= 79.0) && (i5 >= 70.0)) {
					result.show_RmeGD.setText("A");
					result.show_RMEPt.setText("4.00");
				}
				else if ((i5 <= 69.0) && (i5 >= 60.0)) {
					result.show_RmeGD.setText("A-");
					result.show_RMEPt.setText("3.50");
				}
				else if ((i5 <= 59.0) && (i5 >= 50.0)) {
					result.show_RmeGD.setText("B");
					result.show_RMEPt.setText("3.00");
				}
				else if ((i5 <= 49.0) && (i5 >= 40.0)) {
					result.show_RmeGD.setText("C");
					result.show_RMEPt.setText("2.00");
				}
				else if ((i5 <= 39.0) && (i5 >= 33.0)) {
					result.show_RmeGD.setText("D");
					result.show_RMEPt.setText("1.00");
				}
				else {
					result.show_RmeGD.setText("F");
					result.show_RMEPt.setText("0.00");
				}
				
				float mean = (i+i1+i2+i3+i4+i5);
				result.show_TotalMarks.setText("" +mean);
				
				if ((mean <= 600.0) && (mean >= 480.0)) {
					result.show_TotalGrade.setText("A+");
					result.show_TotalPoint.setText("5.00");
				}
				else if ((mean <= 479.0) && (mean >= 420.0)) {
					result.show_TotalGrade.setText("A");
					result.show_TotalPoint.setText("4.00");
				}
				else if ((mean <= 419.0) && (mean >= 360.0)) {
					result.show_TotalGrade.setText("A-");
					result.show_TotalPoint.setText("3.50");
				}
				else if ((mean <= 359.0) && (mean >= 300.0)) {
					result.show_TotalGrade.setText("B");
					result.show_TotalPoint.setText("3.00");
				}
				else if ((mean <= 299.0) && (mean >= 240.0)) {
					result.show_TotalGrade.setText("C");
					result.show_TotalPoint.setText("5.00");
				}
				else if ((mean <= 239.0) && (mean >= 198.0)) {
					result.show_TotalGrade.setText("D");
					result.show_TotalPoint.setText("5.00");
				}
				else {
					result.show_TotalGrade.setText("F");
					result.show_TotalPoint.setText("0.00");
				}
				
				dispose();

			}
		});
		btnSubmit.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnSubmit.setBounds(339, 624, 95, 35);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.WHITE);
		btnClear.setToolTipText("Clear All Text Field");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtName.setText(null);
				txtRoll.setText(null);
				txtBan.setText(null);
				txtEng.setText(null);
				txtMath.setText(null);
				txtBWI.setText(null);
				txtGS.setText(null);
				txtRMS.setText(null);
			}
		});
		btnClear.setBackground(new Color(0, 0, 139));
		btnClear.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnClear.setBounds(127, 624, 85, 35);
		contentPane.add(btnClear);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setToolTipText("Close Student Info. Window");
		btnNewButton.setBackground(new Color(0, 0, 139));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 15));
		btnNewButton.setBounds(561, 624, 85, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblSubjectCode = new JLabel("Subject Code");
		lblSubjectCode.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSubjectCode.setBounds(389, 262, 122, 28);
		contentPane.add(lblSubjectCode);
		
		JLabel label_1 = new JLabel("111");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_1.setBounds(435, 317, 27, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("112");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_2.setBounds(435, 367, 27, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("113");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_3.setBounds(435, 412, 27, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("114");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_4.setBounds(435, 457, 27, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("115");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_5.setBounds(435, 507, 27, 20);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("116");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_6.setBounds(435, 552, 27, 20);
		contentPane.add(label_6);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("I:\\Eclipse\\Final RMS\\Images\\download.jfif"));
		lblNewLabel_2.setBounds(228, 15, 318, 120);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblClass = new JLabel("Class");
		lblClass.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblClass.setBounds(368, 160, 55, 25);
		contentPane.add(lblClass);
		
		JLabel lblShift = new JLabel("Shift");
		lblShift.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblShift.setBounds(372, 210, 52, 25);
		contentPane.add(lblShift);
		
		JComboBox classbox = new JComboBox();
		classbox.setModel(new DefaultComboBoxModel(new String[] {"5", "4", "3"}));
		classbox.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		classbox.setBounds(430, 160, 42, 25);
		contentPane.add(classbox);
		
		JComboBox shiftbox = new JComboBox();
		shiftbox.setModel(new DefaultComboBoxModel(new String[] {"1st", "2nd"}));
		shiftbox.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		shiftbox.setBounds(430, 209, 52, 25);
		contentPane.add(shiftbox);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSemester.setBounds(525, 209, 90, 25);
		contentPane.add(lblSemester);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblYear.setBounds(567, 162, 47, 20);
		contentPane.add(lblYear);
		
		JComboBox semesterbox = new JComboBox();
		semesterbox.setModel(new DefaultComboBoxModel(new String[] {"2nd", "3rd", "1st"}));
		semesterbox.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		semesterbox.setBounds(620, 210, 60, 25);
		contentPane.add(semesterbox);
		
		JComboBox yearbox = new JComboBox();
		yearbox.setModel(new DefaultComboBoxModel(new String[] {"2019", "2020", "2021", "2022"}));
		yearbox.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		yearbox.setBounds(620, 161, 65, 25);
		contentPane.add(yearbox);
	}
}
