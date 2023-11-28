import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHWFirst = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHWSecond = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beaCatFirst = (Cat) applicationContext.getBean("cat");
        Cat beaCatSecond = (Cat) applicationContext.getBean("cat");

        System.out.println(beanHWFirst == beanHWSecond);
        System.out.println(beaCatFirst == beaCatSecond);
    }
}