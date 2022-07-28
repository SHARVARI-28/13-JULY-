import java.util.Scanner;

public class Fifthhandson {

	public static void main(String[] args) {  
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Gender");
		String gender=sc.nextLine();
		
		System.out.println("Enter the Age");
		int 
		age=sc.nextInt();
		if(gender.equals("Female")) {
	
	if(age >= 1 && age <= 58) {  
		System.out.println("the percentage of interest is 8.2%");  
	}  
	else {  
		System.out.println("the percentage of interest is 9.2%");  
	}  
	}  
	else {  
	if(age >= 1 && age <= 58) {  
		System.out.println("the percentage of interest is 8.4%");  
	}  
	else {  
		System.out.println("the percentage of interest is 10.5%");  
	}  
	} 
	}
}
	
