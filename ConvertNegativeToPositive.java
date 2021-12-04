package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int num = -40;
		if(num < 0)
		{
			num = num * -1;
			System.out.println("The given negative number " + num + " is converted to Positive Number");
		}
		else
		{
			System.out.println("The given number is already a Positive number");
		}
	}}