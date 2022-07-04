package Practice_Problems;
import java.util.Scanner;

public class Arethmatic_Oprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0, sum2=0, sum3=0, sum4=0;
	
		System.out.println("Enter first number ");
		System.out.println("Enter second number ");
		System.out.println("Enter third number ");
		
		Scanner one = new Scanner(System.in);
		Scanner two = new Scanner(System.in);
		Scanner three = new Scanner(System.in);
		
		int a =  one.nextInt();
		int b =  two.nextInt();
		int c =  three.nextInt();
		one.close(); two.close(); three.close();
		
		sum1= a+b*c;
		sum2= c+a/b;
		sum3= a%b+c;
		sum4= a*b+c;
		
		System.out.println("Sum1= " +sum1);
		System.out.println("Sum2= " +sum2);
		System.out.println("Sum3= " +sum3);
		System.out.println("Sum4= " +sum4);
		
		if (sum1 > sum2 && sum1 > sum3 && sum1 > sum4) {
			System.out.println("Maximum = " +sum1);
			
		}
		else if (sum2 > sum1 && sum2 > sum3 && sum2 > sum4 ) {
			System.out.println("Maximum = " +sum4);
		}
		else if (sum3 > sum1 && sum3 > sum2 && sum3 > sum4 ) {
			System.out.println("Maximum = " +sum3);
		}
		else {
			System.out.println("Maximum = " +sum4);
		}
		if (sum1 < sum2 && sum1 < sum3 && sum1 < sum4) {
			System.out.println("Minimum = " +sum1);
		}
		else if (sum2 < sum1 && sum2 < sum3 && sum2 < sum4) {
			System.out.println("Minimum = " +sum2);
		}
		else if (sum3 < sum1 && sum3 < sum2 && sum3 < sum4) {
			System.out.println("Minimum = " +sum3);
		}
		else {
			System.out.println("Minimum = " +sum4);
		}
	}

}
