
public class DropDownMenu {
	public static void dropDownMenu() {
		if (frame.cateBox.getSelectedIndex() == 0) {
			Main.cate = "&category="+18+"";
		}else if (frame.typeBox.getSelectedIndex() == 1) {
			Main.cate = "&category="+19+"";
		}else if (frame.typeBox.getSelectedIndex() == 2) {
			Main.cate = "&category="+27+"";
		}else if (frame.typeBox.getSelectedIndex() == 3) {
			Main.cate = "&category="+15+"";
		}
		
		if (frame.numBox.getSelectedIndex() == 0) {
			Main.ApiNum = 5;
		}else if (frame.numBox.getSelectedIndex() == 1) {
			Main.ApiNum = 10;
		}else if (frame.numBox.getSelectedIndex() == 2) {
			Main.ApiNum = 15;
		}else if (frame.numBox.getSelectedIndex() == 3) {
			Main.ApiNum = 20;
		}else if (frame.numBox.getSelectedIndex() == 3) {
			Main.ApiNum = 25;
		}
		
		if (frame.typeBox.getSelectedIndex() == 0) {
			Main.type = "&type=multiple";
		}else if (frame.numBox.getSelectedIndex() == 1) {
			Main.type = "&type=boolean";
		}else if (frame.numBox.getSelectedIndex() == 2) {
			Main.type = "";
		}
	}
}
