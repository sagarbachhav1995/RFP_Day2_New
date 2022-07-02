package Practice_Problems;
import java.util.Scanner;
public class Switch_Statement_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch; 
		System.out.println("Enter any character ");
		Scanner sc = new Scanner(System.in);
		   ch = sc.next().charAt(0);
		   
		   switch (ch) {
		   case 'a' | 'A':
			   System.out.println(ch+ " is vowel");
			   break;
		  
		   case 'e' | 'E':
		   System.out.println(ch+ " is vowel");
		   break;
		
		   case 'i' | 'I':
		   System.out.println(ch+ " is vowel");
		   break;
		   
		   case 'o' | 'O':
		   System.out.println(ch+ " is vowel");
		   break;
		   
		   case 'u' | 'U':
		   System.out.println(ch+ " is vowel");
		   break;
		   
		   default:
			   System.out.println(ch+ " is consonant");
		   }
	}

}