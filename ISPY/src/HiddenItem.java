import java.util.ArrayList;
import java.util.Scanner;
public class HiddenItem 
	{
		private String name;
		private String color;
		private String chosencolor;
		String guess; 
		
	public HiddenItem(String n, String c, String g, String cc)
			{
			name = n;
			color = c;
			chosencolor = cc;
			}
	public String getname()
		{
		return name;
		}
	public String getcolor()
		{
		return color;
		}
	public String getchosenColor()
		{
		return chosencolor;
		}
}
 
	