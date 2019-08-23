package craps;
import java.util.Scanner;
public class crapsGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("Hello, What's your name?");
				String name = userInput.nextLine();
				System.out.println("Hello " + name + " let's play Craps!");
				int dice1 = (int)(Math.random()*12+1);
				int dice2 = (int)(Math.random()*12+1);
				boolean Rolling = true;
				int totalDice = dice1 + dice2;
				System.out.println("you rolled a "+ dice1+ " and " + dice2 + " equaling " + totalDice);
				if (totalDice == 7 || totalDice==11)
					{
						
					}
				else if( totalDice == 2 || totalDice == 12)
					{
						
					}
// sddfh
			}

	}
