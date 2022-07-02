package Practice_Problems;
import java.util.Scanner;
public class For_Loop_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		//
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		for (int i=0; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of n natural numbers = " +sum);

	}

}
