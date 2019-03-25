import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the your string : ");
		
	    String a = scan.nextLine(); 

		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
	    
	    StringBuilder S = new StringBuilder();
	   
	    
	    int dis = 0;
	    
	    for (char c : a.toCharArray()) {
	    	
	        if (Character.isDigit(c)) {
	        	
	            dis = dis * 10 + Character.getNumericValue(c);
	        } 
	        else {
	            while (dis > 0) {
	            	
	                S.append(c);
	                
	                dis--;
	            }
	            
	            S.append(c);
	            
	        }
	    }
	    System.out.println( S.toString());
	}
	  
	}
	

