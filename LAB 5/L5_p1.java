import java.util.Scanner;
class AgeException extends Exception{
    public AgeException(String msg){
        // super(msg);
        System.out.println(msg);
    }
}
class Demo_30{
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        String str = "Sorry u r not permitted for voting,since your age is below 18";
        try{
            System.out.print("Please enter your age : ");
            int age = sc.nextInt();
            if(age<18){
                throw new AgeException(str);
            }
            else{
                System.out.println("You can cast your vote");
            }
        }
        catch(AgeException ec){
            System.out.println(ec.getMessage());
        }
        finally{
            System.out.println("Exception Handled!!!");
        }
    }
}
