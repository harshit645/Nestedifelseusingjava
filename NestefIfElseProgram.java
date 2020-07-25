package conditionalStatments;
import java.util.Scanner;

public class NestefIfElseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("Enter the value of c");
		int c=sc.nextInt();
		
		//Greater of 3 numbers(a,b,c) program using nested if-else
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else {
			if(b>c) {
				
				System.out.println("b is greater");
		}
			else {
			System.out.println("c is greater");
		
		}
        
	}
		
 }

}
