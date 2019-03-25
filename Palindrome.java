import java.util.Scanner;

public class Palindrome{

	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.
    static int i;
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String a = scan.nextLine();
		
		
		System.out.println("The entered string is = " + a + ", is it a palindrome? " + palin(a) );
	
		System.out.println(pal(a));
		
	}
		
	public static boolean palin(String a) {
		
		String c= " ";
		
		for(int i = a.length()-1; i>= 0; i--) {
			
		c = c + a.charAt(i);
			
		}
		if(c.equals(a)) {
			
			return true;		
		
		}else {
		
			return false;
		}
			
		}
		
	
		public static String pal(String a) {
		
	     a = a.toUpperCase(); // changing input to upper case
	      
	     a= a.replace(" ", ""); // Removing spaces
		
	     return a;
	      
	}
	}
	
	
	
	
	
	
