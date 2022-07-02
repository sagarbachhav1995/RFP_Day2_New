package Practice_Problems;
import java.util.Scanner;
public class For_Loop_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev= 0, rem=0;
		
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);
				
		for ( int n = sc.nextInt(); n>0; n=n/10) {
			 rem= n%10;
			 rev= rev*10+ rem;
     }
				
		System.out.print(rev);
	}

}
