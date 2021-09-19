package b_login;

import java.util.Arrays;

public class A_Accounts {

	public static void main(String[] args) {
		
		String [][] accounts = { 
				{"username", "password","email","phone number"} ,
				{"bugs","bunny","bugsbunny@wb.com"},
				{"mickey","mouse","mickeymouse@disney.com"},
				{"daffy","duck","daffyduck@wb.com"}
				};
		
		System.out.println(Arrays.toString(accounts[0]));
		System.out.println(Arrays.toString(accounts[1]));
		System.out.println("-------------------");
		for(int row=0; row <accounts.length; row++) {
			System.out.println(Arrays.toString(accounts[row]));
			
			for(int col=0 ; col <accounts[row].length; col++) {
				
				System.out.println("Row : " +row +" Col : "+ col + " data :> " +accounts[row][col]);
			}
			
		}
	}

}
