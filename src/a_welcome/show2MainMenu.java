package a_welcome;

import java.util.Scanner;  // Import the Scanner class
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class show2MainMenu {
	
	public static void display() {
	
	int attemptMain = 1;
	String choiceFirst = null;
	boolean matchFlag = false;
	 
    Scanner mainMenu = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter choice (1-4)");

    choiceFirst = mainMenu.nextLine();  // Read user input
    String regex1 = "[1-4]";
	//System.out.println(Pattern.matches(regex1, choiceFirst));	
    matchFlag = Pattern.matches(regex1, choiceFirst);
    
    attemptMain ++;
   
    while ((attemptMain < 4) && (matchFlag == false)) {
    	
        System.out.println("That was not a valid entry. You have "+(4-attemptMain)+" more attempt(s) remaining before the program exits." );
        System.out.println("Please try again.");
    	
       // Scanner mainMenu = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter choice (1-4)");

        choiceFirst = mainMenu.nextLine();  // Read user input
    	//System.out.println(Pattern.matches(regex1, choiceFirst));	
        matchFlag = Pattern.matches(regex1, choiceFirst);
        

    	
        attemptMain ++;
        
        System.out.println(attemptMain);
    }
    
    if (matchFlag == false) {
    	
    	System.out.println("You have exceeded the number of allowed attempts.  Goodbye.");
 
    	System.exit(0);	// terminates JVM

	
	    } 
	
	int choiceMenu1 = Integer.parseInt(choiceFirst);
	    
	    switch (choiceMenu1) {
	        case 1:  if (choiceMenu1==1) {
	        	System.out.println("Choice 1 entered.");
	        	}
	        case 2:  if (choiceMenu1==2) {
	        	System.out.println("Choice 2 entered.");
	        	}
	        case 3:  if (choiceMenu1==3) {
	        	System.out.println("Choice 3 entered.");
	        	}
	        case 4:  if (choiceMenu1==4) {
	        	System.out.println("Choice 4 entered.");
	        	}
		
		
	}

	}
	
	}