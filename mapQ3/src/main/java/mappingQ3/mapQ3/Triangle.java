package mappingQ3.mapQ3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Triangle {
    private int height;
    private int width;
    public Triangle(@Value("${triangle.height}") int height,@Value("${triangle.width}") int width) {
        this.height = height;
        this.width=width;
    }
    public void draw() {
        System.out.println("Triangle drawn with height " + height+" the width is "+width+" together their area is  "+(height*width)/2);
    }
}