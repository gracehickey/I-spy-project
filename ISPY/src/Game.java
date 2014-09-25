import java.util.ArrayList;
import java.util.Scanner;


public class Game
	{
	private static String chosencolor;
	static String [] chosenArray = new String [3];

	public static void main(String[] args) 
	 	{
		 String[]colorsInTheRoomArray={"blue", "pink", "black", "yellow", "red"};	
		 int randomWord = (int)(Math.random()*5);
		 int randomNumber = (int)(Math.random()*3);
		 System.out.println(randomNumber);
		 switch(colorsInTheRoomArray[randomWord])
			{
				case "blue": 
					{
					chosenArray = Data.blue;
					}
				case "pink":
				case "black":
				case "yellow":
				case "red":
				{
					String chosencolor = colorsInTheRoomArray[randomWord];
				}
			
			
			
			
		 
		 
			 
		
		 
		 
		 
		}
	}
}
	
