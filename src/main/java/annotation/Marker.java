package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MarkerAnnotation {
}

@MarkerAnnotation
public class Marker {
    public static void main(String[] args) {

        Marker m = new Marker();

            Class<?> c = Marker.class;
            if (c.isAnnotationPresent(MarkerAnnotation.class)) System.out.println("Annotation exists");
            else System.out.println("No annotation found");
    }
}
