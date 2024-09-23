import config.AppConfig;
import model.Cat;
import model.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHelloWorldOne = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld one: " + beanHelloWorldOne.getMessage());
        HelloWorld beanHelloWorldTwo = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HelloWorld two: " + beanHelloWorldTwo.getMessage());
        System.out.println(beanHelloWorldOne == beanHelloWorldTwo);

        Cat beanCatOne = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat one: " + beanCatOne.getName());
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat two: " + beanCatTwo.getName());
        System.out.println(beanCatOne == beanCatTwo);
    }
}