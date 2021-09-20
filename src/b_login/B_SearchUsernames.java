package b_login;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class B_SearchUsernames {

	public static void main(String[] args) {
		
		Map<String, String> accounts = new HashMap<String, String>();
		
		//	enter key-value pair data
		accounts.put("mickey", "mouse");
		accounts.put("donald", "duck");
		accounts.put("daffy", "duck");
		accounts.put("tweety", "bird");
		accounts.put("silvester", "cat");
		accounts.put("yosemite", "sam");
		accounts.put("minnie", "mouse");
		
		
		String searchKey = "silvester";		//	this is a placeholder to capture the inputed username
		String proposedValue = "cat";		//	this is a placeholder to capture inputed password
		
		int attemptUsername = 0;			//	initializing counters for the attempts
		int attemptPassword = 0;
		
		boolean statusUsername = false;		//	initializing status for user
		boolean statusPassword = false;		//	initializing status for password
		
		boolean statusLogin = false;		//	initializing flag that indicates whether the user has successfully logged in.
		

		//	username section for login
		while ((statusUsername==false) && (attemptUsername < 3)){
		
			//	username successfully entered
			if (accounts.containsKey(searchKey)==true) {
				statusUsername = true;
				System.out.println("username found.");
				
			//	username incorrectly entered or not found (3x)
			} else if (attemptUsername < 3){

		        System.out.println("The username was not found. You have "+(2-attemptUsername)+" more attempt(s) remaining before the program exits." );
		        System.out.println("Please try again.");
				attemptUsername ++;

			}
			
		}

			//	shutting down the application after 3 attempts
			if (attemptUsername >= 3){
		    	System.out.println("You have exceeded the number of allowed attempts for username.  Goodbye.");
		    	System.exit(0);	// terminates JVM
		}


		//	password section for login
		while ((statusPassword==false) && (attemptPassword < 3)){
			
			String searchValue = getValues(accounts, searchKey);
			
			//	password successfully entered
			if (searchValue.equals("["+proposedValue+"]")) {	// had to include the brackets because for the method returns a set that can't be compared to a string directly
				statusPassword = true;
				System.out.println("password is valid.");
			
			//	incorrect password (3 attempts allowed)
			} else if (attemptPassword < 3){

		        System.out.println("The password is not valid. You have "+(2-attemptPassword)+" more attempt(s) remaining before the program exits." );
		        System.out.println("Please try again.");
				attemptPassword ++;

			} 
			
		}
		
			//	shutting down the application after 3 attempts
			if (attemptPassword >= 3){
		    	System.out.println("You have exceeded the number of allowed attempts for the password.  Goodbye.");
		    	System.exit(0);	// terminates JVM
			}


		//	correct username and password
		if ((statusUsername = true) && (statusPassword = true)) {
			statusLogin = true;
			System.out.println("Thank you.  You are now successfully logged in.");
		}

		}
					

//	defining the method to obtain the password (value) associated with a username (key) 
private static String getValues(Map<String, String> map, String key) {

      Set<String> result = new HashSet<>();
      if (map.containsKey(key)) {
          for (Map.Entry<String, String> entry : map.entrySet()) {
              if (Objects.equals(entry.getKey(), key)) {
                  result.add(entry.getValue());
              }

	      }
	     
	      
      }
	     
      return result.toString();	//	The original result is in the form of a Set, and contains "[]" around the string.

}

}
