package annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "I am ";
    int val() default 23;
}

@MyAnno()
public class MyClass {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Class<?> c = mc.getClass();
        MyAnno anno = c.getAnnotation(MyAnno.class);

        System.out.printf("%s%d years old", anno.str(), anno.val());
    }
}
