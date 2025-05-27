import java.lang.reflect.Method;

public class ReflectionDemo {
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("ReflectionDemo");
            Object obj = clazz.getDeclaredConstructor().newInstance();

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
            }

            Method sayHelloMethod = clazz.getDeclaredMethod("sayHello", String.class);
            sayHelloMethod.invoke(obj, "World");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}