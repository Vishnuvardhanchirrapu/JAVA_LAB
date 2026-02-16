// exception handling
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArithmeticException;
class L4_p4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter the number");
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(x/y);
		}
		catch(InputMismatchException e){
			System.out.println(e.getMessage());
			}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			}
		finally{
			System.out.println("Exception handled");
		
		}
	
	}

}