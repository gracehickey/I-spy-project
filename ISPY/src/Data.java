import java.util.ArrayList;
public class Data
	{
	static ArrayList <HiddenItem> blue = new ArrayList<HiddenItem>();
	static ArrayList <HiddenItem> pink = new ArrayList<HiddenItem>();
	static ArrayList <HiddenItem> black = new ArrayList<HiddenItem>();
	static ArrayList <HiddenItem> yellow = new ArrayList<HiddenItem>();
	static ArrayList <HiddenItem> red = new ArrayList<HiddenItem>();
	
	public static void addData()
		{
		blue.add(new HiddenItem("marker", "blue")); 
		blue.add(new HiddenItem("blanket", "blue"));
		blue.add(new HiddenItem("cup", "blue"));
		pink.add(new HiddenItem("heart", "blue"));
		pink.add(new HiddenItem("bracelet", "blue"));
		pink.add(new HiddenItem("pencil", "blue"));
		black.add(new HiddenItem("dog", "black"));
		black.add(new HiddenItem("clock", "black"));
		black.add(new HiddenItem("shoes", "black"));
		yellow.add(new HiddenItem("lemon", "yellow"));
		yellow.add(new HiddenItem("door", "yellow"));
		yellow.add(new HiddenItem("crayon", "yellow"));
		red.add(new HiddenItem("apple", "red"));
		red.add(new HiddenItem("pen", "red"));
		red.add(new HiddenItem("jacket", "red"));

		}

	}
