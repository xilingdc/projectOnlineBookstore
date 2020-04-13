package onlineBookstore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
	private static customer c;
	private static owner o;
	
	public static void main(String args[]) throws IOException {
		
		System.out.println("Which interface you would like to log in (customer or owner)");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readVal = null;
		// catch the possible IOException by the readLine() method
		try {
			// assign the return value of the readLine() method to a variable
			readVal = reader.readLine();	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(readVal.equals("customer")) {
			System.out.println("Please enter your id number.");
			
			BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
			String readVal1 = null;
			// catch the possible IOException by the readLine() method
			for(;;) {
			try {
				// assign the return value of the readLine() method to a variable
				readVal1 = reader.readLine();	

			} catch (IOException e) {
				e.printStackTrace();
			}
			int i = Integer.parseInt(readVal1);
			if(i>=10000000 && i<= 99999999) {
				c=new customer(i);
				break;
			}else {
				System.out.println("invalid ID, id length has to be 8.");
			}
			}
			
			
			
			System.out.println("type what you need (type 'end' to end session)");
			for(;;) {
				
				//BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
				
				
				String readVal2=null;
				readVal2=reader.readLine();
				
				
				
				if(readVal2.equals("end")){
					break;
				}
				c.inputController(readVal2);
			}
					
			
			
		}else if (readVal.equals("owner")) {
			o = new owner();

			System.out.println("type what you need (type 'end' to end session)");
			for(;;) {
				
				//BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
				
				
				String readVal2=null;
				readVal2=reader.readLine();
				
				
				
				if(readVal2.equals("end")){
					break;
				}
				o.inputController(readVal2);
			}
			
			
		}
		
		
		System.out.println("Thank you for using online book store.");
		
		
	}
}
