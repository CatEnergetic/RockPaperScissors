import java.util.Random;
import java.util.Scanner;

public class DeSantis_517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comChoice();
		
		
	}

	  Scanner keyboard = new Scanner(System.in);	
	  
	  public static String comChoice()
	    {
		  	String comChoice = "";
	        int conNumber;
	        Random rand = new Random();
	        int comNumber = rand.nextInt(3) + 1;
	        if (comNumber == 1)
	            comChoice = "Rock";
	        if (comNumber == 2)
	            comChoice = "Paper";
	        if (comNumber == 3)
	            comChoice = "Scissors";
	        return comChoice;
	    } 
	  
	  
	  public static String userChoice(String userChoice, int userNumber) {

		  System.out.println("Please enter a number. 1 - Rock, 2 - Paper, 3 - Scissors: ");
		  Scanner keyboard = new Scanner(System.in);	
		  userChoice = keyboard.nextLine(); 
		  keyboard.close();
		  
		  	if (userChoice == "Rock") {
	            userNumber = 1;}
	        if (userChoice == "Paper") {
	            userNumber = 2;}
	        if (userChoice == "Scissors"){
	            userNumber = 3;}
	        
	        return userChoice;
	        }
		 
		  
		 public static String roundResults(String userChoice, int comChoice){
		  if (userChoice == "Rock"); {
			  System.out.println("You chose Rock.");
			  if (comChoice == 1){
				  System.out.print("It's a tie! The computer chose rock!");
			  }
			  
			  else if (comChoice == 2){
				  System.out.print("Sorry, you lost! Paper covers rock.");
			  }
			  else {
				  System.out.print("You won! Rock beats scissors!");
			  }
		 }
		  if (userChoice == "Paper") {
			  System.out.println("You chose Paper.");
			  if (comChoice == 2){
				  System.out.print("It's a tie! The computer chose Paper!");
			  }
			  
			  else if (comChoice == 3){
				  System.out.print("Sorry you lost! Scissors cut Paper!");
			  }
			  else {
				  System.out.print("You won! Paper beats rock!");
			  }
		 }
		  else if (userChoice == "Scissors"); {
			  System.out.println("You chose Scissors.");
			  if (comChoice == 3){
				  System.out.print("It's a tie! The computer chose Scissors!");
			  }
			  
			  else if (comChoice == 1){
				  System.out.print("Sorry you lost! Rock beats Scissors!");
			  }
			  else {
				  System.out.print("You won! Scissors beats paper!");
				  System.exit(0);
			  }
		 }

		  return roundResults (userChoice, comChoice);
		  
	}
		 
}
	   
