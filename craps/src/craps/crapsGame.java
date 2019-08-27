package craps;
import java.util.Scanner;
public class crapsGame
	{
		static String name;
		static int account;
		static boolean playing;
		static Scanner userInput = new Scanner (System.in);
		static Scanner userInput1 = new Scanner (System.in);
		static Scanner userInput2 = new Scanner (System.in);
		static int bet;
		static boolean inRound;
		static int dice1;
		static int dice2;
		static int dice3;
		static int dice4;
		static int totalDice;
		static int totalDice2;
		static boolean rolling;
		static int answer;
		public static void main(String[] args)
			{
			greetPlayer();
			information();
			whilePlaying();
			
			
		
			}
		public static void greetPlayer()
		{
			
			System.out.println("Hello, What's your name?");
			 name = userInput.nextLine();
			 System.out.println("Hello " + name + " let's play Craps!");
		}
		public static void information()
			{
				System.out.println("You will start off with $100. If you don't have any more money, the game will stop. ");
				 account = 100;
		}
		public static void whilePlaying()
		{
			playing = true;
			while(playing)
				{
					askBet();
					noMoney();
					inTheRoundOfCraps();
				}
			
		}
		public static void askBet()
		{
			System.out.println("How much will you be betting? You can't bet more than 100 a round.");
			 bet = userInput1.nextInt();
		}
		public static void noMoney()
		{
			if(account == 0) 
				{
					System.out.println("You have no more money and can't play anymore.");
					playing = false;
				}
		}
		public static void inTheRoundOfCraps()
		{
			 inRound = true;
			 while (inRound)
				 {
					dice(); 
					whatRolled();
					ifWonImmediately();
					ifLostImmediately();
					
					rolling();
				 }
				
		}
		public static void dice()
		{
			 dice1 = (int)(Math.random()*6+1);
			 dice2 = (int)(Math.random()*6+1);
			 totalDice = dice1 + dice2;
		}
		public static void whatRolled()
		{
			System.out.println("you rolled a "+ dice1+ " and " + dice2 + " for a total of " + totalDice);
		}
		public static void ifWonImmediately()
		{
			if (totalDice == 7 || totalDice==11)
				{
				 account = account + bet;
					System.out.println("You win, " + name + ". Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
					answer();
					rolling = false;
		}
		}
		public static void ifLostImmediately()
		{
			 if( totalDice == 2 || totalDice == 12)
					{
					account = account - bet;
					
					System.out.println(" Sorry, but you lose, " + name + ".");
					answer();
					rolling = false;
		}
		}
		public static void answer()
		{
			System.out.println(" Do you want to play again? 1) yes 2) no. You have " + account + " in your account.");
			 answer = userInput2.nextInt();
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
		public static void info()
		{
			System.out.println("You rolled a "+ dice1+ " and a " + dice2+ " for a total of " + totalDice + ". ");
		}
		public static void rolling()
		{
			info();
			rolling = true;
			while (rolling)
			{
				
				rollingDice();
				lost();
				won();
			}
		}
		public static void rollingDice()
		{
			 dice3 = (int)(Math.random()*6+1);
			 dice4 = (int)(Math.random()*6+1);
			 totalDice2 = dice3 + dice4;
			 System.out.println("You rolled a " + dice3 + " and " + dice4 + " for a total of " + totalDice2 + ".");
			
		}
		public static void lost()
		{
			if(totalDice2 ==7)
			{
				account = account - bet;
				System.out.println("Sorry, but you lose " +name + ". ");
				
					rolling = false;
					inRound = false;
					 answer();
				
			}
		}
		public static void won()
		{
			
				 if (totalDice == totalDice2)
					{
						account = account + bet;
						System.out.println("You win " + name+ "!");
						rolling = false;
						inRound = false;
						 answer();
					}
			
		}
		
		
	}
				
				
			

	
