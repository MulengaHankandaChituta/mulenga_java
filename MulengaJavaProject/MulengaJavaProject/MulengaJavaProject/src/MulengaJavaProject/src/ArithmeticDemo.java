import java.util.Scanner;
public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		// prompt user for and accept two integers
		System.out.print("Please enter an integer >> ");
		firstNumber = input.nextInt();
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();
		
		// add statements to perform the necessary arithmetic operations
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum / 2;
		
		// display the three calculated values
		System.out.println(firstNumber + " + " +
		   secondNumber + " is " + sum);
		System.out.println(firstNumber + " - " +
		   secondNumber + " is " + difference);
		System.out.println("The average of " + firstNumber +
			 " and " + secondNumber + " is " + average);

	}

}
