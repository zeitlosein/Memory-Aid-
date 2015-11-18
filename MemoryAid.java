import java.util.Scanner;

public class MemoryAid {
	public static void main(String[] args){
		
		Scanner user_input = new Scanner (System.in);
		
		
		String nick_name;
			System.out.print("Please enter your girlfriends nickname: ");
			nick_name = user_input.next();
		
		String favourite_colour;
			System.out.print("List her favourite colour: ");
			favourite_colour = user_input.next();
		
		String hobby;
			System.out.print("What is " + nick_name + "'s preffered hobby: ");
			hobby = user_input.next();
			
		String food;
			System.out.print("When she is hungry she craves: ");
			food = user_input.next();	
		
		System.out.println("\n\n" + "calculating . . .");
		System.out.println(" . . . ");
		System.out.println(" . . . ");
		
		System.out.println("\n\n" + "Your special gal's nickname is " + nick_name 
				+ ", her favourite colour is " 
				+ favourite_colour + ". "
				+ "She is passionate about " 
				+ hobby
				+ " and loves to eat "
				+ food 
				+ "!");

		
		System.out.println("Don't forget next time dummy!");
		System.out.println("End Program_");
	}
	
	
}
