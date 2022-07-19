import org.json.JSONObject;

public class Json {
	public static String parse(String responseBody) {	
		JSONObject obj = new JSONObject(responseBody);
		Main.questionArr = obj.getJSONArray("results");
		Main.numOfQuestions = Main.questionArr.length();
		return null;
	}
	
}
