package two.controller.pm.ctec;

import java.lang.reflect.Array;

public class TwoController
{

	int[][] intArray;
	String[][] stringArray;
	String[][] stoneCards;
	
	public TwoController()
	{
		intArray = new int[5][3];
		stringArray = new String[4][4];
		stoneCards = new String[6][4];

	}
	
	private void inputIntoIntArray()
	{
		intArray[0][0] = 0;
		intArray[0][1] = 0;
		intArray[0][2] = 0;
		intArray[1][0] = 0;
		intArray[1][1] = 1;
		intArray[1][2] = 2;
		intArray[2][0] = 0;
	}
	
	private void inputIntoStringArray()
	{
		for(int a = 0; a < stringArray.length; a++)
		{
			for(int b = 0; b < stringArray[0].length; b++)
			{
				stringArray[a][b] = "Hello";
			}
		}
		
		for(int x = 0; x < 2; x++)
		{
			for(int y = 0; y<2; y++)
			{
				stringArray[x][y] = "Hi";
			}
		}
	}
	
	public void start()
	{
		inputIntoStringArray();
		inputIntoIntArray();
		inputIntoStoneCards();
	}
	
	private void inputIntoStoneCardsArray()
	{
		for(int x = 0; x < stoneCards.length; x++)
		{
			for(int y = 0; y < stoneCards[0].length; y++)
			{
				stoneCards[x][y] = "Pyroblast";
			}
		}
	}
	


}
