package javaAssingments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assingments {
	
	//FIBONACCI SERIES
	public int[] printFibonacciSeries(int n)
	{
		int arr[] = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n ; i++)
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		return arr;		
	}
	
	//FACTORIAL OF A GIVEN NUMBER
	public int printFactorialOfGivenNumber(int n)
	{
		int i = 1;
		int res = n;
		for (i = 1; i < n; i++)
		{
			res = res * (n - i);
			
		}
		return res;
	}
	
	//SWAPPING OF TWO NUMBERS
	public void swapNumbers(int a, int b)
	{
		System.out.println("Numbers before swap are : " +a+ " and " +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swap are : " +a+ " and " +b);
	}
	
	//LARGENT TERM USING TERNARY OPERATOR	
	public int printLargestNumber(int a , int b , int c)
	{
		int largest = (a > b && a > c) ? a : (b > a && b > c) ? b : c ;
		return largest;
	}
	
	//LEAP YEAR
	public boolean checkLeapYear (int year)
	{
		boolean result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? true : false;
		return result;
	}	
	
	//REVERSE A GIVEN NUMBER
	public int printReverseNumber(int num)
	{
		int reverse = 0;
		int remainder;
		while(num!=0)
		{
			remainder = num % 10;
			reverse = reverse * 10 + remainder ;
			num = num / 10 ;
		}
		return reverse;
	}	
	
	//SUM OF ARRAY ELEMENTS
	public int sumOfArrayElements(int arr[])
	{
		int res = 0;
		for(int i = 0 ; i<= (arr.length - 1) ; i++)
		{
			res = res + arr[i];
		}
		return res;
	}
	
	//CHECK PRIME NUMBER OR NOT
	public int primeNumber(int number)
	{
		int flag = 0;
		
		if (number == 0 || number == 1)
		{
			flag = -1;
		}
		else
			for (int i = 2 ; i<(number/2) ; i++) 
			{
				if(number % i == 0)
				{
					flag = 1;
					break;
				}
			}
		return flag;
	}
	
	//CHECKING EVEN AND ODD
	public int evenOddNumber(int num)
	{
		int flag = 0;
		if (num == 0 || num == 1)
			return flag = -1;
		else if (num %2 == 0)
			return flag = 1;
		else
			return flag;
	}
	
	//GENERATING RANODM NUMBER OF GIVEN LENGHT
	public String generateRandomNumber(int length)
	{
		int num;
		String random = "";
		for(int i = 1 ; i<= length ; i++)
		{
			num = (int) ((Math.random()+1)*i);
			String str = Integer.toString(num);
			random = random.concat(str);
		}
		
		if(random.length() > length)
			random = random.substring(0, length);
		return random;
	}
	
	//CHECKING STRING IS PALINDROME OR NOT
	public boolean palindrome(String str)
	{		
		if(str.equals(reverseString(str)))
			return true;
		else
			return false;
	}
	
	//PRINT THE LARGEST Nth ELEMENT IN AN ARRAY OF NUMBERS
	public int largestElement(int arr[] , int position)
	{
		return sortArrayDescending(arr)[position-1];
	}
	
	
	public int[] sortArrayDescending(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public int[] sortArrayAscending(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	//SORTING AN ARRAY OF NUMBERS
	public int[] sortArray(int arr[], boolean ascending)
	{
		if(ascending)
			return sortArrayAscending(arr);
		else
			return sortArrayDescending(arr);
	}
	
	//OCCURANCE OF A GIVEN STRING WITHIN A STRING
	public int occuranceOfString(String arr[] ,String search)
	{
		try {
		int count=1;
		Map<String,Integer> hash = new HashMap<String,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(hash.containsKey(arr[i]))
				hash.put(arr[i], count++);
			else
				hash.put(arr[i], count);
		}
		
		int result = hash.get(search);
		return result;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	//REVERSE A STRING
	public String reverseString(String str)
	{
		String rev = "";
		for(int i = (str.length()-1) ; i >= 0 ; i--)
			rev = rev + str.charAt(i);
		return rev;
	}
	
	//FINDING Nth NUMBER FROM A GIVEN STRING USING REGEX
	public String extractNumbers(String str, Pattern pattern , int position) 
	{
		int count = 0;
		String value = "";
		Matcher match = pattern.matcher(str);
		while (match.find())
		{
			count++;
			if (position == count)
				value = match.group();
		}
		return value;
	}

}
