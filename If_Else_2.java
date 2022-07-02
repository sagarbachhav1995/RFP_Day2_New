package Practice_Problems;
import java.util.Scanner;
public class If_Else_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner ref = new Scanner(System.in);
		int num = ref.nextInt();
		ref.close();
		
		if (num == 1) {
			System.out.println("Unit");
		}
		else if (num == 10) {
			System.out.println("Ten");
		}
		else if (num == 100) {
			System.out.println("Hundred");
		}
		else if (num == 1000) {
			System.out.println("Thousand");
		}
		else  {
			System.out.println("Invalid Input");
		}
	}

}
