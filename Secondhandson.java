import java.util.Scanner;


public class Secondhandson {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");  
		int i = scan.nextInt();  
		if(i%2 == 0)
		System.out.println("Number is even");
		else 
		System.out.println("Number is odd");
	}

}
