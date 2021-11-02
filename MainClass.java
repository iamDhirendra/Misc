package javaAssingments;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class MainClass {

	public static void main (String args[])
	{
		Assingments assingments = new Assingments();
		
		/*
		 * //FIBONACCI SERIES int num[] = assingments.printFibonacciSeries(10);
		 * System.out.print("The fibanacco series is  : "); for(int i = 0 ; i <
		 * num.length ; i++) { System.out.print(" "+num[i]); }
		 */
		
		/*
		 * //FACTORIAL OF A GIVEN NUMBER int fact =
		 * assingments.printFactorialOfGivenNumber(5);
		 * System.out.println("The factorial of the given number is : "+fact);
		 */
		
		/*
		 * //SWAPPING OF TWO NUMBERS assingments.swapNumbers(2, -2);
		 */
		
		/*
		 * //LARGEST TERM USING TERNARY OPERATOR int maxNumber =
		 * assingments.printLargestNumber(5, 4, 16);
		 * System.out.println("The largest number is : " +maxNumber);
		 */
		
		/*
		 * // CHECKING WEATHER A YEAR IS LEAP YEAR OR NOT boolean IsLeap =
		 * assingments.checkLeapYear(1700); if (IsLeap)
		 * System.out.println("The given year is a Leap Year"); else
		 * System.out.println("The given year is not a Leap Year");
		 */		
		
		/*
		 * //REVERSE OF A GIVEN NUMBER int reverseNumber =
		 * assingments.printReverseNumber(15248);
		 * System.out.println("The reverse of the input given is : "+reverseNumber);
		 */
		
		/*
		 * //SUM OF ARRAY ELEMENTS int[] number = new int[] { 2, 6, 5, 89, 74 }; int
		 * result = assingments.sumOfArrayElements(number);
		 * System.out.println("The sum of given array elements is : " + result);
		 */
		
		/*
		 * //CHECKING IF A NUMBER IS PRIME OR NOT int number = 49; int result =
		 * assingments.primeNumber(number); if(result == 0)
		 * System.out.println("The given number "+number+" is PRIME!!!"); else if
		 * (result == -1) System.out.println("The given number "
		 * +number+" is neither Prime nor Composite"); else
		 * System.out.println("The given number "+number+" is Composite");
		 */
		
		/*
		 * //CHECKING ODD AND EVEN NUMBER int isEven = assingments.evenOddNumber(46);
		 * if(isEven == -1)
		 * System.out.println("The given number is neither odd nor even"); else
		 * if(isEven == 1) System.out.println("The given number is even."); else
		 * System.out.println("The given number is odd.");
		 */
		
		/*
		 * //GENERATING A RANDOM NUMBER OF GIVEN LENGHT String randomNumber =
		 * assingments.generateRandomNumber(6);
		 * System.out.println("The random number generated is : " + randomNumber);
		 */
		
		
		/*
		 * // CHECKING WEATHER A STRING IS PALINDROME OR NOT boolean ispalindrome =
		 * assingments.palindrome("aviva"); if (ispalindrome)
		 * System.out.println("The given string is panlindrome."); else
		 * System.out.println("The given string is not panlindrome.");
		 */
		 
		
		/*
		 * //PRINT THE LARGEST Nth ELEMENT IN AN ARRAY OF NUMBERS int arr[] = new int[]
		 * {5,6,8,21,32,1,55}; int position = 3;
		 * System.out.println("The "+position+"th largest element is :"+assingments.
		 * largestElement(arr, position));
		 */
		
		/*
		 * // SORTING AN ARRAY OF NUMBERS int arr[] = new int[] { 12, 1, 5, 8, 74, 2 };
		 * System.out.println("The sorted array is :"); for (int i = 0; i < arr.length;
		 * i++) System.out.print(" "+assingments.sortArray(arr, true)[i]);
		 */
		
		/*
		 * //OCCURANCE OF A GIVEN STRING WITHIN A STRING String arr[] = new
		 * String[]{"abhi","rekha","bot","shukla","mehta","rekha","bot","shukla"};
		 * String find = "dks"; int times = assingments.occuranceOfString(arr, find);
		 * System.out.println("The string "+find+" has occured "+times+" time(s)");
		 */

		/*
		 * //REVERSE OF STRING String str = "dks"; String rev =
		 * assingments.reverseString(str);
		 * System.out.println("The reverse string is : "+rev);
		 */
		
		/*
		 * // FINDING Nth NUMBER FROM A GIVEN STRING USING REGEX String str =
		 * "this is 123th 1247asd number 776 and what else 665"; Pattern pattern =
		 * Pattern.compile("[0-9]+"); String number = assingments.extractNumbers(str,
		 * pattern, 2); System.out.println("The number is : "+number);
		 */
	}
}
