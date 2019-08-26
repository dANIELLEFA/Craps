package craps;
import java.util.Scanner;
public class crapsGame
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner (System.in);
				Scanner userInput1 = new Scanner (System.in);
				Scanner userInput2 = new Scanner (System.in);
				System.out.println("Hello, What's your name?");
				String name = userInput.nextLine();
				
				System.out.println("Hello " + name + " let's play Craps!");
				System.out.println("You will start off with $100. If you don't have any more money, the game will stop. ");
				int account = 100;
				boolean playing = true;
				while(playing )
				{
				
					System.out.println("How much will you be betting? You can't bet more than 100 a round.");
					int bet = userInput1.nextInt();
					if(account == 0) 
					{
						System.out.println("You have no more money and can't play anymore.");
						playing = false;
					}
				
				boolean inRound = true;
				while (inRound)
				{
				int dice1 = (int)(Math.random()*6+1);
				int dice2 = (int)(Math.random()*6+1);
				int totalDice = dice1 + dice2;
				System.out.println("you rolled a "+ dice1+ " and " + dice2 + " equaling " + totalDice);
				if (totalDice == 7 || totalDice==11)
					{
					 account = account + bet;
						System.out.println("You rolled a "+ dice1+ " and a " + dice2+ " for a total of " + totalDice + ". You win, " + name + ". Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
						
						int answer0 = userInput2.nextInt();
						if(answer0 == 1)
						{
							System.out.println("Ok. Have Fun!");
							inRound = false;
						
							
						}
						else if (answer0 == 2)
						{
							System.out.println("Goodbye!");
							playing = false;
							inRound = false;
							
						}
					}
				else if( totalDice == 2 || totalDice == 12)
					{
					account = account - bet;
					
					System.out.println("You rolled a "+ dice1+ " and a " + dice2+ " for a total of " + totalDice + ". Sorry, but you lose, " + name + ". Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
					int answer = userInput2.nextInt();
					if(answer == 1)
					{
						System.out.println("Ok. Have Fun!");
						inRound = false;
						
					}
					else if (answer == 2)
					{
						System.out.println("Goodbye!");
						playing = false;
						inRound = false;
						
						
					}
					}
				else 
				{
					boolean rolling = true;
					while (rolling)
					{
					System.out.println("You rolled a "+ dice1+ " and a " + dice2+ " for a total of " + totalDice + ". ");
					int dice3 = (int)(Math.random()*6+1);
					int dice4 = (int)(Math.random()*6+1);
					int totalDice2 = dice3 + dice4;
					System.out.println("You rolled a " + dice3 + " and " + dice4 + " for a total of " + totalDice2 + ".");
					if(totalDice2 ==7)
					{
						account = account - bet;
						System.out.println("Sorry, but you lose" +name + ". Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
						int answer1 = userInput2.nextInt();
						if(answer1 == 1)
						{
							System.out.println("Ok. Have Fun!");
							rolling = false;
							inRound = false;
							
						}
						else if (answer1 == 2)
						{
							System.out.println("Goodbye!");
							playing = false;
							rolling = false;
							
							
							inRound = false;
							
						}
						
					}
					else if (totalDice == totalDice2)
					{
						account = account + bet;
						System.out.println("You win" + name+ "!");
						System.out.println(" Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
						int answer2 = userInput2.nextInt();
						if(answer2 == 1)
						{
							System.out.println("Ok. Have Fun!");
							rolling = false;
							inRound = false;
							
						}
						else if (answer2 == 2)
						{
							System.out.println("Goodbye!");
							playing = false;
							rolling = false;
							
							inRound = false;
							
						}
					}
					else
					{
						System.out.println("Continue rolling. ");
					}
					
					}
				}
				}
				
				}

			}

	}
