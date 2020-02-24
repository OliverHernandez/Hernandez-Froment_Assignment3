import java.security.SecureRandom;
import java.util.Scanner;


public class CAI4 
{
	static Scanner scanner = new Scanner(System.in);
	static int randomValue1 = 0;
	static int randomValue2 = 0;
	
	public static void quiz()
	{
		
		String difficulty = readDifficulty();
	
		generateQuestionArgument(difficulty);
		
		int count = 0;
		for (int  i = 0; i < 10; i++) 
		{
			askQuestion(randomValue1, randomValue2);
			String input = readResponse();
			int solution = (randomValue1 * randomValue2);
			boolean isCorrect = isAnswerCorrect(input, solution);
			if (isCorrect)
			{
				displayCorrectResponse();
				count++;
			}
			else
			{
				displayIncorrectResponse();
			}
			generateQuestionArgument(difficulty);

		}
		displayCompletionMessage(count);

		scanner.close();
	}
	
	public static void askQuestion(int randomValue1, int randomValue2)
	{
		System.out.println("How much is "  + randomValue1 + " times " + randomValue2 + "?");

	}
	
	public static String readResponse()
	{
		return scanner.nextLine();
	}
	
	public static boolean isAnswerCorrect(String input, int solution)
	{
		return (Integer.parseInt(input) == solution);
	}
	
	public static void displayCorrectResponse()
	{
		SecureRandom random = new SecureRandom();
		int possibleCorrect = random.nextInt(3);
		switch (possibleCorrect) 
		{
			case 0: System.out.println("Very good!");
				break;
			case 1: System.out.println("Excellent!");
				break;
			case 2: System.out.println("Nice work!");
			break;
			case 3: System.out.println("Keep up the good work!");
			break;
		}

	}
	
	public static void displayIncorrectResponse()
	{
		SecureRandom random = new SecureRandom();
		int possibleCorrect = random.nextInt(3);
		switch (possibleCorrect) 
		{
			case 0: System.out.println("No. Please try again.");
				break;
			case 1: System.out.println("Wrong. Try once more.");
				break;
			case 2: System.out.println("Don’t give up!");
			break;
			case 3: System.out.println("No. Keep trying.");
			break;
		}
	}
	
	public static void displayCompletionMessage(int count)
	{
		if (count <= 7)
		{
			System.out.println("Please ask your teacher for extra help.");
		}
		else System.out.println("Congratulations, you are ready to go to the next level!");
		System.out.println("Your score:" + count * 10 + "%");
	}
	
	public static void generateQuestionArgument(String difficulty)
	{
		if (difficulty.equals("1"))
		{
			randomValue1 = generateHelper(10);
			randomValue2 = generateHelper(10);
		}
		
		if (difficulty.equals("2"))
		{
			randomValue1 = generateHelper(100);
			randomValue2 = generateHelper(100);
		}
		if (difficulty.equals("3"))
		{
			randomValue1 = generateHelper(1000);
			randomValue2 = generateHelper(1000);
		}
		if (difficulty.equals("4"))
		{
			randomValue1 = generateHelper(10000);
			randomValue2 = generateHelper(10000);
		}
	}
	
	public static int generateHelper(int num)
	{
		SecureRandom random = new SecureRandom();
		return random.nextInt(num);
	}
	
	public static String readDifficulty()
	{
		System.out.println("Enter a difficulty from 1 to 4");
		return scanner.nextLine();
	}
	
		
	public static void main(String[] args)
	{
		quiz();
	}
}