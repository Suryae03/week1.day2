package week1.day2;

public class CheckNegativeOrPositive {

	public static void main(String[] args) {
		int num = 10;
		if(num > 0) {
			System.out.println("The given number " +num+ " is a positive number");
		}
		else if(num < 0)
		{
			System.out.println("The given number " +num+ " is a negative number");
		}
		else
		{
			System.out.println("The given number " +num+ " is neither positive nor negative number");
		}
	}

}
