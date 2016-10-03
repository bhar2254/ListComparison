package com.totn.Main;

import java.util.Scanner;

public class Main 
{
	public static String[][] list = new String[2][64];
	public static boolean[] done = new boolean[2];
	public static boolean matches;
	public static int listLength;
	public static boolean debug = false;
	
	public static void main(String[] args) 
	{
		done[0] = false;
		done[1] = false;
		matches = false;
		
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Type 'Done' when you've finished creating your list");
		
		int i = 0;
		
		while(!done[0])
		{
			String input = user_input.nextLine();
			if(input.toLowerCase().startsWith("done"))
			{
				done[0]=true;
				break;
			} else
			{
				list[0][i] = input;
				i++;
			}
		}
		listLength = i;
		debug("" + listLength);
		i = 0;

		System.out.println("Your second list must fill " + listLength + " columns of datum.");
		while(!done[1])
		{
			String input = user_input.nextLine();
			
			list[1][i] = input;
			i++;
			
			if(i==listLength)
			{
				done[1]=true;
				break;
			}
		}
		debug("" + list[1][listLength]);
		matches = true;
		for(int j = 0; j<listLength; j++)
		{
			if(!matches)
			{
				break;
			}
			for(i = 0; i<listLength; i++)
			{
				debug(list[1][j] + " | " + list[0][i]);
				if(list[1][j].toLowerCase().startsWith(list[0][i].toLowerCase()))
				{
					matches = true;
					break;
				} else {
					matches = false;
					break;
				}
			}
		}
		System.out.println("System mathes: " + matches);
	}
	
	public static void debug(String string)
	{
		if(debug)
		{
			System.out.println(string);
		}
	}
}