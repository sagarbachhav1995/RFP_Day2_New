package Practice_Problems;
import java.util.Scanner;
public class Spring_Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,  m;
	
		System.out.println("Enter Day");
		System.out.println("Enter Month");
		 Scanner sc1 = new Scanner(System.in);
		 Scanner sc2 = new Scanner(System.in);
		 d= sc1.nextInt();
		 m= sc2.nextInt();
		 
		 sc1.close();  sc1.close(); 
		 
		 if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30)
					|| (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
	}

}
