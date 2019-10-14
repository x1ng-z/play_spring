package hs.ss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

public class test_1 {
    //ServletContext servletContext;
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        AtomicBoolean d=new AtomicBoolean(false);
        d.lazySet(true);
        d.getAndSet(true);
    }

}
