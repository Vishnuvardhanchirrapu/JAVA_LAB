// Exception Handling Using main method
import java.util.Scanner;
class AgeException extends Exception{
    public AgeException(int age){
        if(age<18)
            System.out.println("Sorry u r not permitted for voting,since your age is below 18");
            
        else
            System.out.println("You can cast your vote"); }
    
}
class Main{
    public static void main(String...args) throws AgeException{
        Scanner sc = new Scanner(System.in);
            System.out.print("Please enter your age : ");
            int age = sc.nextInt();
            throw new AgeException(age);
    }
}
