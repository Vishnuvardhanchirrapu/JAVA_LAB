// Abstraction in java
abstract class WildAnimals{
	abstract public void sound();
	abstract public void behave();
}
 class Lion extends WildAnimals{

	@Override
	public void sound(){
	System.out.println("Tiger sound");
	}
	@Override
       public void behave(){
	System.out.println("aggressive");
	}
   
}
public class Main {
	public static void main(String[] args){
	System.out.println("Tiger class:");
	Lion t=new Lion();
	t.sound();
	t.behave();

	}
}
