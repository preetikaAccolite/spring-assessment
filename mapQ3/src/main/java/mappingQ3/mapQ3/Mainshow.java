package mappingQ3.mapQ3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainshow {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mappingQ3/mapQ3/config.xml");
        Triangle triangle = context.getBean(Triangle.class);
        String heightProperty = context.getEnvironment().getProperty("triangle.height");
        String widthProperty=context.getEnvironment().getProperty("triangle.width");
//        triangle.setHeight(Integer.parseInt(heightProperty));
        triangle.draw();
    }
}