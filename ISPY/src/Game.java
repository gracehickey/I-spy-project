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
		 System.out.println("I spy with my silicon eye something " + colorsInTheRoomArray[randomWord] + ".");
		 System.out.println("What do you think I am thinking of?");
		 switch(colorsInTheRoomArray[randomWord])
			{
				case "blue": 
					{
					chosenArray = Data.blue;
					}
				case "pink":
					{
					chosenArray = Data.pink; 
					}
				case "black":
					{
					chosenArray = Data.black;
					}
				case "yellow":
					{
					chosenArray = Data.yellow;	
					}
				case "red":
					{
					chosenArray = Data.red;	
					}
					break;
				}
		 		
		 for(int i = 0; i < 3; i++)
		 	{
			System.out.print(i + 1);
			System.out.println(". " + chosenArray[i]);
		 	}
		
		 boolean userStillGuessing = true;
		 while(userStillGuessing)
		 	{
			 Scanner inputUser = new Scanner(System.in);
			 
			 
		 	}
		}

	
	}

	
