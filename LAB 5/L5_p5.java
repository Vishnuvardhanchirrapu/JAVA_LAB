import java.lang.*;
import java.lang.reflect.Method;
public class AnnotationMain {
   
        @Bullet(str = "apple", dbl = 25.55)
        public static void MyAnnotation(){
            try{
            Method mt = AnnotationMain.class.getMethod("MyAnnotation");
            Bullet b = mt.getAnnotation(Bullet.class);
            System.out.println("String : "+b.str());
            System.out.println("Double : "+b.dbl());
            }
            catch(NoSuchMethodException ec){
              ec.printStackTrace();
            }
        }
        
        public static void main(String[] args) throws NoSuchMethodException {
            MyAnnotation();
        }
    
}
