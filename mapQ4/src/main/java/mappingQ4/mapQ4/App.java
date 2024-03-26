package mappingQ4.mapQ4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext context= new  AnnotationConfigApplicationContext(Mainshow.class);
	    	Triangle t=(Triangle) context.getBean("tr");
	    	
	        System.out.println(t);
	    }
}
