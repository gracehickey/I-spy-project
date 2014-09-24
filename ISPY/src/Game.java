import java.util.ArrayList;
import java.util.Scanner;


public class Game
	{
	private static String chosencolor;

	public static void main(String[] args) 
	 	{
		 String[]colorsInTheRoomArray={"blue", "pink", "black", "yellow", "red"};	
		 int randomWord = (int)(Math.random()*5);
		 switch(colorsInTheRoomArray[randomWord])
			{
				case "blue":
				case "pink":
				case "black":
				case "yellow":
				case "red":
				{
					String chosencolor = colorsInTheRoomArray[randomWord];
				}
			ArrayList <String> blue = new ArrayList <String>();
			ArrayList <String> pink = new ArrayList <String>();
			ArrayList <String> black = new ArrayList <String>();
			ArrayList <String> yellow = new ArrayList <String>();
			ArrayList <String> red = new ArrayList <String>();
			System.out.println("I spy something" + chosencolor);
			Scanner userinput = new Scanner(System.in);
			String guess = userinput.nextLine();
			
			
			
			
		 
		 
			 
		
		 
		 
		 
		}
	}
}
	
