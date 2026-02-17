// User defined Runtime Annotation
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Bullet{
    String str();
    double dbl();
}
