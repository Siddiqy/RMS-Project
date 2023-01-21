import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Result extends JFrame {
	
	public JLabel show_Name;
	public JLabel show_Roll;
	public JLabel ban_Mark;
	public JLabel eng_Mark;
	public JLabel math_Mark;
	public JLabel bwi_Mark;
	public JLabel gs_Mark;
	public JLabel rme_Mark;
	public JLabel show_BanGD;
	public JLabel show_EngGD;
	public JLabel show_MathGD;
	public JLabel show_BwiGD;
	public JLabel show_GsGD;
	public JLabel show_RmeGD;
	public JLabel show_BanPt;
	public JLabel show_EngPt;
	public JLabel show_MathPt;
	public JLabel show_BWIPt;
	public JLabel show_GSPt;
	public JLabel show_RMEPt;
	public JLabel show_TotalMarks;
	public JLabel show_TotalGrade;
	public JLabel show_TotalPoint;
	public JLabel show_class;
	public JLabel show_shift;
	public JLabel show_year;
	public JLabel show_semester;	
	public JPanel contentPane;
	
	private JLabel lblSubjectCode;
	private JLabel label_2;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel lblNewLabel;
	private JLabel lblClass;
	private JLabel lblShift;
	private JLabel lblYear;
	private JLabel lblSemester;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result frame = new Result();
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
	public Result() {
		setResizable(false);
		setTitle("Result Preview");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 930, 745);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 139), 15));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblName.setBounds(125, 169, 55, 25);
		contentPane.add(lblName);
		
		// Student Information!
		show_Name = new JLabel();
		show_Name.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_Name.setBounds(200, 170, 200, 25);
		contentPane.add(show_Name);
		
		JLabel lblRoll = new JLabel("Roll:");
		lblRoll.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblRoll.setBounds(140, 212, 40, 25);
		contentPane.add(lblRoll);
		
		show_Roll = new JLabel("");
		show_Roll.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_Roll.setBounds(200, 212, 200, 25);
		contentPane.add(show_Roll);
		
		JLabel lblIslamicStudies = new JLabel("Religion and Moral Education");
		lblIslamicStudies.setForeground(Color.BLACK);
		lblIslamicStudies.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblIslamicStudies.setBounds(109, 549, 208, 20);
		contentPane.add(lblIslamicStudies);
		
		JLabel label_1 = new JLabel("Genarel Science");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_1.setBounds(201, 504, 116, 20);
		contentPane.add(label_1);
		
		JLabel lblBangladeshAndWorld = new JLabel("Bangladesh and World Identity");
		lblBangladeshAndWorld.setForeground(Color.BLACK);
		lblBangladeshAndWorld.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		lblBangladeshAndWorld.setBounds(102, 458, 215, 20);
		contentPane.add(lblBangladeshAndWorld);
		
		JLabel label_3 = new JLabel("Mathemetics");
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_3.setBounds(225, 411, 92, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("English");
		label_4.setForeground(Color.BLACK);
		label_4.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_4.setBounds(265, 366, 52, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Bangla");
		label_5.setForeground(Color.BLACK);
		label_5.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_5.setBounds(265, 319, 52, 20);
		contentPane.add(label_5);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(102, 153, 255));
		separator.setBounds(96, 305, 721, 5);
		contentPane.add(separator);
		
		JLabel lblSubject = new JLabel("Subject Name");
		lblSubject.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSubject.setBounds(200, 269, 123, 25);
		contentPane.add(lblSubject);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblMarks.setBounds(558, 269, 57, 25);
		contentPane.add(lblMarks);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblGrade.setBounds(658, 269, 57, 25);
		contentPane.add(lblGrade);
		
		JLabel lblPoint = new JLabel("Point");
		lblPoint.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblPoint.setBounds(760, 269, 58, 25);
		contentPane.add(lblPoint);
		
		// Subject Marks
		ban_Mark = new JLabel("");
		ban_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		ban_Mark.setBounds(568, 317, 35, 20);
		contentPane.add(ban_Mark);
		
		eng_Mark = new JLabel("");
		eng_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		eng_Mark.setBounds(568, 364, 35, 20);
		contentPane.add(eng_Mark);
		
		math_Mark = new JLabel("");
		math_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		math_Mark.setBounds(568, 407, 35, 20);
		contentPane.add(math_Mark);
		
		bwi_Mark = new JLabel("");
		bwi_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		bwi_Mark.setBounds(568, 454, 35, 20);
		contentPane.add(bwi_Mark);
		
		gs_Mark = new JLabel("");
		gs_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		gs_Mark.setBounds(568, 502, 35, 20);
		contentPane.add(gs_Mark);
		
		rme_Mark = new JLabel("");
		rme_Mark.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		rme_Mark.setBounds(568, 547, 35, 20);
		contentPane.add(rme_Mark);
		
		// Subject Grades
		show_BanGD = new JLabel("");
		show_BanGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_BanGD.setBounds(678, 315, 30, 20);
		contentPane.add(show_BanGD);
		
		
		show_EngGD = new JLabel("");
		show_EngGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_EngGD.setBounds(678, 362, 30, 20);
		contentPane.add(show_EngGD);
		
		show_MathGD = new JLabel("");
		show_MathGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_MathGD.setBounds(678, 407, 30, 20);
		contentPane.add(show_MathGD);
		
		show_BwiGD = new JLabel("");
		show_BwiGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_BwiGD.setBounds(678, 454, 30, 20);
		contentPane.add(show_BwiGD);
		
		show_GsGD = new JLabel("");
		show_GsGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_GsGD.setBounds(678, 502, 30, 20);
		contentPane.add(show_GsGD);
		
		show_RmeGD = new JLabel("");
		show_RmeGD.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_RmeGD.setBounds(678, 547, 30, 20);
		contentPane.add(show_RmeGD);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(102, 153, 255));
		separator_2.setBounds(96, 580, 721, 5);
		contentPane.add(separator_2);
		
		show_BanPt = new JLabel("");
		show_BanPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_BanPt.setBounds(768, 315, 35, 20);
		contentPane.add(show_BanPt);
		
		show_EngPt = new JLabel("");
		show_EngPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_EngPt.setBounds(768, 362, 35, 20);
		contentPane.add(show_EngPt);
		
		show_MathPt = new JLabel("");
		show_MathPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_MathPt.setBounds(768, 407, 35, 20);
		contentPane.add(show_MathPt);
		
		show_BWIPt = new JLabel("");
		show_BWIPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_BWIPt.setBounds(768, 454, 35, 20);
		contentPane.add(show_BWIPt);
		
		show_GSPt = new JLabel("");
		show_GSPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_GSPt.setBounds(768, 502, 35, 20);
		contentPane.add(show_GSPt);
		
		show_RMEPt = new JLabel("");
		show_RMEPt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_RMEPt.setBounds(768, 547, 35, 20);
		contentPane.add(show_RMEPt);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		lblTotal.setBounds(272, 594, 46, 23);
		contentPane.add(lblTotal);
		
		show_TotalMarks = new JLabel("");
		show_TotalMarks.setFont(new Font("Source Sans Pro", Font.BOLD, 16));
		show_TotalMarks.setBounds(563, 597, 45, 20);
		contentPane.add(show_TotalMarks);
		
		show_TotalGrade = new JLabel("");
		show_TotalGrade.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_TotalGrade.setBounds(678, 597, 45, 20);
		contentPane.add(show_TotalGrade);
		
		show_TotalPoint = new JLabel("");
		show_TotalPoint.setFont(new Font("Times New Roman", Font.BOLD, 15));
		show_TotalPoint.setBounds(768, 594, 46, 20);
		contentPane.add(show_TotalPoint);
		
		JButton btnNew = new JButton("New");
		btnNew.setForeground(Color.WHITE);
		btnNew.setToolTipText("New Result Input");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Input input = new Input();
				Input.main(null);
				dispose();
			}
		});
		btnNew.setBackground(new Color(0, 0, 139));
		btnNew.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnNew.setBounds(164, 646, 85, 35);
		contentPane.add(btnNew);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setToolTipText("Print To JTextArea");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Output output = new Output();
				output.txtReceiver.append("\n\t\t\t\t"+"          Daffodil International School"+
						            "\n\t"+"\t\t\t\t\t"+"     Result Sheet"+"\n"+
						            "\n\n"+lblName.getText()+"   "+show_Name.getText()+"\t\t\t  "+lblClass.getText()+" "+"  "+show_class.getText()+"\t\t"+"\tYear"+"   "+show_year.getText()+
						            "\n    "+lblRoll.getText()+"   "+show_Roll.getText()+"\t\t\t\t  "+lblShift.getText()+" "+"  "+show_shift.getText()+"\t\t"+"  Semester"+"   "+show_semester.getText()+
				                    "\n\n\n"+"\t"+"Subject Name"+"\t"+"\t"+"Subject Code"+"\t"+"Marks"+"\t\t"+"Grade"+"\t"+"Point"+
				                    "\n===================================================================\t\t"+ 
				                    "\nBangla\t\t"+"\t"+"\t\t112\t\t "+ban_Mark.getText()+"\t\t  "+show_BanGD.getText()+"     \t"+show_BanPt.getText()+"\n\n"+
						            "English\t\t"+"\t"+"\t\t113\t\t "+eng_Mark.getText()+"\t\t  "+show_EngGD.getText()+"     \t"+show_EngPt.getText()+"\n\n"+
						          "Mathematics\t\t"+"\t\t113\t\t "+math_Mark.getText()+"\t\t  "+show_MathGD.getText()+"      \t"+show_MathPt.getText()+"\n\n"+
						       ""+"Bangladesh and World Identity"+"\t114\t\t "+bwi_Mark.getText()+"\t\t  "+show_BwiGD.getText()+"      \t"+show_BWIPt.getText()+"\n\n"+
						       ""+"Genarel Science\t"+"\t"+"\t\t115\t\t "+gs_Mark.getText()+"\t\t  "+show_GsGD.getText()+"      \t"+show_GSPt.getText()+"\n\n"+
						       ""+"Religion and Moral Education\t"+"\t116\t\t "+rme_Mark.getText()+"\t\t  "+show_RmeGD.getText()+"      \t" +show_RMEPt.getText()+"\n"+
						          "===================================================================\t\t"+
						             "\nTotal\t\t\t\t\t"+"\t\t\t"+show_TotalMarks.getText()+"\t\t  "+show_TotalGrade.getText()+"\t\t"+show_TotalPoint.getText()+
				                     "\n\n\n\n\t Student Signature"+"\t\t\t\t\t\t Principal Signature");
				output.setVisible(true);

			}
		});
		btnPrint.setBackground(new Color(0, 0, 139));
		btnPrint.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnPrint.setBounds(413, 646, 85, 35);
		contentPane.add(btnPrint);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.WHITE);
		btnExit.setToolTipText("Exit Window");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(null, "Confirm Exit   Yes/ No", "System Exit", JOptionPane.YES_NO_OPTION)
						== JOptionPane.YES_NO_OPTION) {
					
					dispose();
				}
			}
		});
		btnExit.setBackground(new Color(0, 0, 139));
		btnExit.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnExit.setBounds(662, 646, 85, 35);
		contentPane.add(btnExit);
		
		lblSubjectCode = new JLabel("Subject Code");
		lblSubjectCode.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSubjectCode.setBounds(387, 271, 122, 25);
		contentPane.add(lblSubjectCode);
		
		label_2 = new JLabel("111");
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_2.setBounds(428, 319, 24, 20);
		contentPane.add(label_2);
		
		label_6 = new JLabel("112");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_6.setBounds(428, 366, 24, 20);
		contentPane.add(label_6);
		
		label_7 = new JLabel("113");
		label_7.setForeground(Color.BLACK);
		label_7.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_7.setBounds(428, 411, 24, 20);
		contentPane.add(label_7);
		
		label_8 = new JLabel("114");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_8.setBounds(428, 458, 33, 20);
		contentPane.add(label_8);
		
		label_9 = new JLabel("115");
		label_9.setForeground(Color.BLACK);
		label_9.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_9.setBounds(428, 504, 24, 20);
		contentPane.add(label_9);
		
		label_10 = new JLabel("116");
		label_10.setForeground(Color.BLACK);
		label_10.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		label_10.setBounds(428, 549, 24, 20);
		contentPane.add(label_10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("I:\\Eclipse\\Final RMS\\Images\\download.jfif"));
		lblNewLabel.setBounds(278, 15, 318, 125);
		contentPane.add(lblNewLabel);
		
		lblClass = new JLabel("Class:");
		lblClass.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblClass.setBounds(445, 170, 52, 25);
		contentPane.add(lblClass);
		
		lblShift = new JLabel("Shift:");
		lblShift.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblShift.setBounds(451, 212, 46, 25);
		contentPane.add(lblShift);
		
		show_class = new JLabel("5");
		show_class.setForeground(Color.BLACK);
		show_class.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_class.setBounds(510, 170, 30, 25);
		contentPane.add(show_class);
		
		show_shift = new JLabel("1st");
		show_shift.setForeground(Color.BLACK);
		show_shift.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_shift.setBounds(510, 210, 30, 25);
		contentPane.add(show_shift);
		
		lblYear = new JLabel("Year:");
		lblYear.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblYear.setBounds(652, 169, 45, 25);
		contentPane.add(lblYear);
		
		lblSemester = new JLabel("Semester:");
		lblSemester.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		lblSemester.setBounds(612, 212, 85, 25);
		contentPane.add(lblSemester);
		
		show_year = new JLabel("2019");
		show_year.setForeground(Color.BLACK);
		show_year.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_year.setBounds(710, 170, 40, 25);
		contentPane.add(show_year);
		
		show_semester = new JLabel("2nd");
		show_semester.setForeground(Color.BLACK);
		show_semester.setFont(new Font("Source Sans Pro", Font.PLAIN, 17));
		show_semester.setBounds(710, 214, 30, 25);
		contentPane.add(show_semester);
	}
}
