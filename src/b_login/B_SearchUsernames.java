package b_login;

import java.util.HashMap;
import java.util.Map;

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
		
		
		String username = "tweety";
		
		if  (accounts.get(username) != null) {
			
			System.out.println(username+" password is: "+accounts.get(username));
		} 
		else {
			System.out.println("The username is not found.");
		} 
			
		/*	iterate map - did not preserve order
		for(Map.Entry<String, String> entry : accounts.entrySet()) {
			System.out.println("Key : "+entry.getKey());
			System.out.println("Value : "+entry.getValue());
			System.out.println("------");
			
			
		
		}
		*/
		
		
		
		
	}

}