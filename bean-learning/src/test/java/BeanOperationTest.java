import com.spring3.demo.service.BeanOperationDemon;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by taoyong on 2017/3/26.
 */

public class BeanOperationTest {



    @Test
    public  void testGetBeanFromContext() throws Exception{
        //1、读取配置文件实例化一个IoC容器
        ApplicationContext context = new ClassPathXmlApplicationContext("mybeans.xml");
        BeanOperationDemon bean = context.getBean("hello", BeanOperationDemon.class);
        bean.sayHi();
     /*   Resource resource = new ClassPathResource("mybeans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        beanFactory.getBean("hello", BeanOperationDemon.class).sayHi();*/
        BeanOperationDemon secondBean = context.getBean("byebye",BeanOperationDemon.class);
        secondBean.sayHi();

      /*  PropertiesFactoryBean factoryBean = context.getBean("configSetting", PropertiesFactoryBean.class);
        factoryBean.getObject();
        String name = (String)factoryBean.getObject().get("name");
        System.out.println("name====="+name);*/

    }
}
