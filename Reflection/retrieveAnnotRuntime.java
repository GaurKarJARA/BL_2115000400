import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "gauravvv")
class MyClass {}

public class retrieveAnnotRuntime {
    public static void main(String[] args) {
        Class<MyClass> clazz = MyClass.class;
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}