package week1.day2;

public class CharOccurance {

	public static void main(String[] args) 
	{
		String str = "Welcome to Chennai";
		char search = 'n';
		int count = 0;
		for(int i =0; i<str.length()-1; i++) {
			if(str.charAt(i)== search)
			{
				count++;
			}
		}
		System.out.println("Given character " +search+ " appears " +count+ " times");

	}

}
