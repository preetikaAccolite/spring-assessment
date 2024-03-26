package mappingQ2.mapQ2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mappingQ2/mapQ2/conf.xml");

        Drawing drawing = (Drawing) context.getBean("Drawing");
        drawing.draw();
}
}