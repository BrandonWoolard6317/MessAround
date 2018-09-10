import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args){
		//Declaring variables
		String usersInput;
		int generatedNumber;
		int numberGuessing
		
		//Initializing Variables
		Scanner keyboard = new Scanner(System.in);
		numberGuessing = Integer.parseInt(usersInput);
		
		//Generating random number
		generatedNumber = (int) (Math.random()*100);
		
		//Prints out generated number 
		System.out.println(generatedNumber);
		//Temporary until project is fully tested and complete
		
		//Grabbing users input
		System.out.println("Lets play a guessing game! Pick a number between 0-100!");
		usersInput = keyboard.nextLine();
	       
		//If statements off number guessing
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You've guessed "+generatedNumber+" on your\n"+
					   "first try! Can you do it again?")
		}
		if else(numberGuessing > generatedNumber){
			System.out.println("You've guess over! Try again.")
		}
		if else(numberGuessing < generatedNumber){
			System.out.println("You've guess under! Try again.")
		}
		
		
		
	
  
        
    }   
}
			   
		
