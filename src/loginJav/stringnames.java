package loginJav;

import java.util.Scanner;

public class stringnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first_name;
		String last_name;
		
	Scanner user_output	= new Scanner (System.in);
	System.out.print("ENTER YOUR FIRSTNAME");
	first_name = user_output.nextLine();

		System.out.println("enter your last name");
		last_name = user_output.nextLine();
		
		String full_name;
		full_name = (first_name+last_name);
		System.out.println("your fullname" +full_name);

	}

}
