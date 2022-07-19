import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;



import java.net.URL;
import java.util.ResourceBundle;


public class frame {
	static JLabel QuestionLbl;
	static JLabel QuestionNumLbl;
	static JLabel scoreLbl;
	static JLabel playerlbl;
	static JLabel cateLbl;
	static JLabel lblNumberOfQuestions;
	static JLabel TypeLbl;
	static JLabel lblNewLabel_2;
	static JLabel lblNewLabel_1;
	static JLabel lblNewLabel;
	static JLabel BackgroundLbl;
	
	static JComboBox typeBox;
	static JComboBox numBox;
	static JComboBox cateBox;
	
	static JButton TrueBtn;
	static JButton startBtn;
	static JButton FalseBtn;
	static JButton choiceBtn2;
	static JButton choiceBtn1;
	static JButton choiceBtn3;
	static JButton choiceBtn4;
	public static Main main;
	
		
	
	
	private static Color startColor;
	private static Color endColor;
	private JFrame frame;
	private static String[] questionTypeArr = {"Multiple choice", "True or False" , "Any Type"};
	private static String[] numbOfQuestionsArr = {"5","10","15","20","25"};
	private static String[] questionCategoryArr = {"Computers","Mathmatics","Animals","VideoGames"};
	
	public static void gameStarted() {
		QuestionLbl.setVisible(true);
		lblNewLabel_2.setVisible(true);
		QuestionNumLbl.setVisible(true);
		playerlbl.setVisible(true);
		lblNewLabel_1.setVisible(true);
		scoreLbl.setVisible(true);
		cateLbl.setVisible(false);
		lblNumberOfQuestions.setVisible(false);
		TypeLbl.setVisible(false);
		typeBox.setVisible(false);
		cateBox.setVisible(false);
		numBox.setVisible(false);
		startBtn.setVisible(false);
	}
	
	public static void Player2() {
		QuestionLbl.setVisible(true);
		lblNewLabel_2.setVisible(false);
		QuestionNumLbl.setVisible(false);
		playerlbl.setVisible(false);
		lblNewLabel_1.setVisible(false);
		scoreLbl.setVisible(false);
		cateLbl.setVisible(false);
		lblNumberOfQuestions.setVisible(false);
		TypeLbl.setVisible(false);
		typeBox.setVisible(false);
		cateBox.setVisible(false);
		numBox.setVisible(false);
		startBtn.setVisible(false);
		TrueBtn.setVisible(false);
		FalseBtn.setVisible(false);
		choiceBtn1.setVisible(false);
		choiceBtn2.setVisible(false);
		choiceBtn3.setVisible(false);
		scoreLbl.setText(""+Main.score+"");
		playerlbl.setText("Player 2");
		QuestionLbl.setText("Player two");
		QuestionLbl.setFont(new Font("Tahoma", Font.PLAIN, 50));
		choiceBtn4.setVisible(true);
	}
	public static void Player2Next() {
		QuestionLbl.setVisible(true);
		lblNewLabel_2.setVisible(true);
		QuestionNumLbl.setVisible(true);
		playerlbl.setVisible(true);
		lblNewLabel_1.setVisible(true);
		scoreLbl.setVisible(true);
		cateLbl.setVisible(false);
		lblNumberOfQuestions.setVisible(false);
		TypeLbl.setVisible(false);
		typeBox.setVisible(false);
		cateBox.setVisible(false);
		numBox.setVisible(false);
		startBtn.setVisible(false);
		QuestionLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
	}
	
	public static void qBoolean() {
		TrueBtn.setVisible(true);
		FalseBtn.setVisible(true);
		choiceBtn1.setVisible(false);
		choiceBtn2.setVisible(false);
		choiceBtn3.setVisible(false);
	}
	public static void qMultipleChoice() {
		TrueBtn.setVisible(false);
		FalseBtn.setVisible(false);
		choiceBtn1.setVisible(true);
		choiceBtn2.setVisible(true);
		choiceBtn3.setVisible(true);
	}
	public static void DisplayWinner() {
		QuestionLbl.setVisible(true);
		lblNewLabel_2.setVisible(false);
		QuestionNumLbl.setVisible(false);
		playerlbl.setVisible(false);
		lblNewLabel_1.setVisible(false);
		scoreLbl.setVisible(false);
		cateLbl.setVisible(false);
		lblNumberOfQuestions.setVisible(false);
		TypeLbl.setVisible(false);
		typeBox.setVisible(false);
		cateBox.setVisible(false);
		numBox.setVisible(false);
		startBtn.setVisible(false);
		TrueBtn.setVisible(false);
		FalseBtn.setVisible(false);
		choiceBtn1.setVisible(false);
		choiceBtn2.setVisible(false);
		choiceBtn3.setVisible(false);
		choiceBtn4.setVisible(false);
		QuestionLbl.setFont(new Font("Tahoma", Font.PLAIN, 50));
		if (Main.player1Score > Main.player2Score) {
			QuestionLbl.setText("Player 1 won");
		}else if (Main.player1Score < Main.player2Score) {
			QuestionLbl.setText("Player 2 won");
		}else if (Main.player1Score == Main.player2Score) {
			QuestionLbl.setText("Tie");
		}
	}
	
	
	
	public static void start() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		
		cateLbl = new JLabel("Categories\r\n");
		cateLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cateLbl.setForeground(new Color(255, 255, 255));
		cateLbl.setBounds(154, 161, 106, 22);
		frame.getContentPane().add(cateLbl);
		
		lblNumberOfQuestions = new JLabel("Number of Questions\r\n");
		lblNumberOfQuestions.setForeground(Color.WHITE);
		lblNumberOfQuestions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfQuestions.setBounds(154, 229, 195, 22);
		frame.getContentPane().add(lblNumberOfQuestions);
		
		TypeLbl = new JLabel("Question Type\r\n");
		TypeLbl.setForeground(Color.WHITE);
		TypeLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TypeLbl.setBounds(153, 291, 142, 22);
		frame.getContentPane().add(TypeLbl);
		
		QuestionLbl = new JLabel("");
		QuestionLbl.setFont(new Font("Times New Roman", Font.BOLD, 25));
		QuestionLbl.setVerticalAlignment(SwingConstants.TOP);
		QuestionLbl.setHorizontalAlignment(SwingConstants.CENTER);
		QuestionLbl.setForeground(Color.WHITE);
		QuestionLbl.setBounds(20, 124, 824, 73);
		QuestionLbl.setVisible(false);
		frame.getContentPane().add(QuestionLbl);
		
		typeBox = new JComboBox(questionTypeArr);
		typeBox.setBounds(153, 319, 579, 33);
		typeBox.setBackground(new Color(18, 18, 18));
		typeBox.setForeground(Color.white);
		frame.getContentPane().add(typeBox);
		
		numBox = new JComboBox(numbOfQuestionsArr);
		numBox.setBounds(153, 252, 579, 33);
		numBox.setBackground(new Color(18, 18, 18));
		numBox.setForeground(Color.white);
		frame.getContentPane().add(numBox);
		
		cateBox = new JComboBox(questionCategoryArr);
		cateBox.setBounds(154, 186, 579, 33);
		cateBox.setBackground(new Color(18, 18, 18));
		cateBox.setForeground(Color.white);
		frame.getContentPane().add(cateBox);
		
		startBtn = new JButton("Start");		
		startBtn.setVerticalAlignment(SwingConstants.BOTTOM);
		startBtn.setFont(new Font("Adobe Caslon Pro Bold", Font.PLAIN, 50));
		startBtn.setBounds(118, 438, 642, 71);
		startBtn.setBackground(new Color(18, 18, 18));
		startBtn.setForeground(Color.white);
		startBtn.setBorder(new LineBorder(Color.darkGray, 2, true));
		frame.getContentPane().add(startBtn);
		startBtn.addActionListener(new Main.start());
		
		lblNewLabel_2 = new JLabel("Question:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(181, 34, 93, 22);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);
		
		QuestionNumLbl = new JLabel("1/10");
		QuestionNumLbl.setForeground(Color.WHITE);
		QuestionNumLbl.setFont(new Font("Times New Roman", Font.BOLD, 22));
		QuestionNumLbl.setBounds(272, 34, 61, 22);
		QuestionNumLbl.setVisible(false);
		frame.getContentPane().add(QuestionNumLbl);
		
		TrueBtn = new JButton("True");
		TrueBtn.setBackground(new Color(26, 45, 111));
		TrueBtn.setVisible(false);
		TrueBtn.setBackground(new Color(18, 18, 18));
		TrueBtn.setForeground(Color.white);
		TrueBtn.setBorder(new LineBorder(Color.darkGray, 2, true));
		TrueBtn.setFont(new Font("Times New Roman", Font.BOLD, 19));
		TrueBtn.setBounds(118, 467, 243, 73);
		frame.getContentPane().add(TrueBtn);
		TrueBtn.addActionListener(new Main.answered());
		
		FalseBtn = new JButton("False");
		FalseBtn.setVisible(false);
		FalseBtn.setBounds(517, 467, 243, 73);
		FalseBtn.setBackground(new Color(18, 18, 18));
		FalseBtn.setForeground(Color.white);
		FalseBtn.setBorder(new LineBorder(Color.darkGray, 2, true));
		FalseBtn.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(FalseBtn);
		FalseBtn.addActionListener(new Main.answered());
		
		playerlbl = new JLabel("Player 1");
		playerlbl.setVisible(false);
		playerlbl.setForeground(Color.WHITE);
		playerlbl.setBounds(53, 11, 93, 33);
		playerlbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(playerlbl);
		
		lblNewLabel_1 = new JLabel("score:");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(53, 39, 61, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		scoreLbl = new JLabel("0");
		scoreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLbl.setVisible(false);
		scoreLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scoreLbl.setForeground(Color.WHITE);
		scoreLbl.setBounds(118, 34, 36, 33);
		frame.getContentPane().add(scoreLbl);
		
		lblNewLabel = new JLabel("Trivia\r\n");
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.lightGray);
		lblNewLabel.setFont(new Font("Adobe Caslon Pro Bold", Font.PLAIN, 80));
		lblNewLabel.setBounds(10, 11, 834, 95);
		frame.getContentPane().add(lblNewLabel);
		
		choiceBtn2 = new JButton("New button");
		choiceBtn2.setVisible(false);
		choiceBtn2.setBounds(119, 300, 642, 50);
		choiceBtn2.setBorder(new LineBorder(Color.darkGray, 2, true));
		choiceBtn2.setBackground(new Color(18, 18, 18));
		choiceBtn2.setForeground(Color.white);
		choiceBtn2.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(choiceBtn2);
		choiceBtn2.addActionListener(new Main.answered());
		
		choiceBtn4 = new JButton("Next");
		choiceBtn4.setVisible(false);
		choiceBtn4.setBounds(119, 300, 642, 50);
		choiceBtn4.setBorder(new LineBorder(Color.darkGray, 2, true));
		choiceBtn4.setBackground(new Color(18, 18, 18));
		choiceBtn4.setForeground(Color.white);
		choiceBtn4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(choiceBtn4);
		choiceBtn4.addActionListener(new Main.NextBtn());
		
		choiceBtn1 = new JButton("New button");
		choiceBtn1.setVisible(false);
		choiceBtn1.setBounds(119, 400, 642, 50);
		choiceBtn1.setBorder(new LineBorder(Color.darkGray, 2, true));
		choiceBtn1.setBackground(new Color(18, 18, 18));
		choiceBtn1.setForeground(Color.white);
		choiceBtn1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(choiceBtn1);
		choiceBtn1.addActionListener(new Main.answered());
		
		choiceBtn3 = new JButton("New button");
		choiceBtn3.setVisible(false);
		choiceBtn3.setBounds(119, 500, 642, 50);
		choiceBtn3.setBorder(new LineBorder(Color.darkGray, 2, true));
		choiceBtn3.setBackground(new Color(18, 18, 18));
		choiceBtn3.setForeground(Color.white);
		choiceBtn3.setFont(new Font("Times New Roman", Font.BOLD, 19));
		frame.getContentPane().add(choiceBtn3);
		choiceBtn3.addActionListener(new Main.answered());
		
		BackgroundLbl = new JLabel("New label");
		BackgroundLbl.setIcon(new ImageIcon(frame.class.getResource("/background.jpg")));
		BackgroundLbl.setBounds(0, 0, 854, 613);
		frame.getContentPane().add(BackgroundLbl);
		frame.setBounds(100, 100, 860, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

