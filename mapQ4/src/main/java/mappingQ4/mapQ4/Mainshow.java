package mappingQ4.mapQ4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan(basePackages="mappingQ4.mapQ4")
@EnableAspectJAutoProxy
public class Mainshow{
	
	@Bean
	public Triangle tr() {
		return new Triangle("Equilateral", 5, 5, 5);
	}
	
	@Bean
	public Aspect1 al() {
		return new Aspect1();
	}
}