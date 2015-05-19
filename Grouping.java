package mathgrouping;

import java.util.Random;

public class Grouping {
	
	String numberString;
	String [] numbers = 
		{"0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
	String [] words = 
		{"zero","one","two","three","four","five","six","seven","eight","nine",
		"ten","eleven","twelve","thirteen","fourteen","fifteen"};
	public static int numRight = 0;
	public static int numWrong = 0;
	
	public Grouping()
	{
		
	}
	
	public String getNumberString(int choice)
	{
		if (choice == 1)
		{
			int r = new Random().nextInt(10);
			numberString = words[r];
			return numberString;
		}
		else if (choice == 2)
		{
			int r = new Random().nextInt(16);
			numberString = words[r];
			return numberString;
		}
		else
		{
			int r = new Random().nextInt(numbers.length);
			numberString = words[r];
			return numberString;
		}
	}	
	
	public static int getNumRight()
	{
		return numRight;
	}

	public static int getNumWrong()
	{
		return numWrong;
	}

	public static void incrementNumRight() 
	{
		numRight++;
	}

	public static void incrementNumWrong() 
	{
		numWrong++;
	}
	
	public static void resetNumRight() 
	{
		numRight = 0;
	}

	public static void resetNumWrong() 
	{
		numWrong = 0;
	}

	public static void main(String[] args) 
	{
		
		MathGUI gGui = new MathGUI();
		MathHelpGUI hGui = new MathHelpGUI();
		
	}

}
