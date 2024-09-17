//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = config.AppConfig.class)
//public class AppTest {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Test
//    public void mainTest() {
//        model.HelloWorld tree =
//                applicationContext.getBean(model.HelloWorld.class);
//        model.HelloWorld leaf =
//                applicationContext.getBean(model.HelloWorld.class);
//
//        Cat one = applicationContext.getBean(Cat.class);
//        Cat two = applicationContext.getBean(Cat.class);
//
//        Assert.assertSame("Тест провален, не корректная настройка бина model.HelloWorld", tree, leaf);
//        Assert.assertNotSame("Тест провален, не корректная настройка бина Cat", one, two);
//    }
//}
