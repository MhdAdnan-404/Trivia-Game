import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.json.JSONArray;
import org.json.JSONObject;






public class Main {
	
	static String q;
	static String correctAnswer;
	static JSONArray questionArr;
	static int qNum = 0;
	static int score = 0;
	static int qNumDisp=1;
	static int numOfQuestions;
	public static Json json;
	public static String Qtype;
	public static String cate = "18";
	public static int ApiNum = 0;
	public static String type = "";
	public static boolean lastPlayer = false;
	public static int player1Score;
	public static int player2Score;
	

	


	public static void main(String[] args) {
		frame.start();
	}
	
	
	private static void Request() {
		HttpClient client = HttpClient.newHttpClient();
				
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://opentdb.com/api.php?amount="+ApiNum+""+cate+""+type+"")).build();
				
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenApply(Json::parse).join();
	}
	

	public static void displayQuestions() {
		if (qNumDisp == numOfQuestions&& lastPlayer == true) {
			player2Score = score;
			frame.DisplayWinner();
			
		}else if (qNumDisp == numOfQuestions) {
			
			
			player1Score = score;
			qNumDisp = 1;
			qNum = 0;
			score = 0;
			lastPlayer = true;
			frame.Player2();
			
		}else{
		JSONObject questionObj = questionArr.getJSONObject(qNum);
		Qtype = questionObj.getString("type");
		
		
		q = questionObj.getString("question");
		frame.QuestionNumLbl.setText("<html>"+qNumDisp+"/"+numOfQuestions+"<html>");
		frame.QuestionLbl.setText("<html><div style='text-align: center;'>" + q.toString() + "</div></html>");
		System.out.println(q);
		correctAnswer = questionObj.getString("correct_answer");
		frame.QuestionNumLbl.setText("<html>"+qNumDisp+"/"+numOfQuestions+"<html>");
		
		if (Qtype.equals("boolean")) {
			frame.qBoolean();
			
		}else {
			frame.qMultipleChoice();	
			JSONArray incorrectArr = questionObj.getJSONArray("incorrect_answers");
			frame.choiceBtn1.setText(""+incorrectArr.get(0)+"");
			frame.choiceBtn2.setText(""+correctAnswer+"");
			frame.choiceBtn3.setText(""+incorrectArr.get(2)+"");
			
		}
		
	  }
	}
	public static class NextBtn implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			displayQuestions();
			frame.Player2Next();
			
		}
		
	}
	
	
	public static class start implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frame.gameStarted();
			DropDownMenu.dropDownMenu();
			Request();
			displayQuestions();	
		}
		
	}
	
	
	public static class answered implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String btnString = e.getActionCommand();
			if (btnString.equals(correctAnswer)) {
				System.out.println("correcefjsdlgfjlkasdj");
				score+=1;
				frame.scoreLbl.setText(""+score+"");
			}else {
				System.out.println("false answer");
			}
			qNumDisp = qNumDisp + 1 ;
			qNum = qNum+1;
			displayQuestions();
		}

		
		
	}
	
}

