package Practice_Problems;
import java.util.Scanner;
public class For_Loop_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0, rem, sum=0,c=0;
	
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
				 c=num;
		
		
		for (   ;  num>0 ;   ) {
			rem = num%10;
			sum = (sum*10) + rem;
			num = num/10;
		}
		 
		if ( c == sum ) {
			 System.out.println("Palindrome Number");
		}
		 else { 
			 System.out.println("Not a palindrome number");
		 }
	}

}
