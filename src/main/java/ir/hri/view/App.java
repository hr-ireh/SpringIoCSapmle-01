package ir.hri.view;

import ir.hri.business.MySpringBeanWithDependency;
import ir.hri.util.SpringUtil;

public class App {
    public static void main(String[] args) {

        MySpringBeanWithDependency test = (MySpringBeanWithDependency) SpringUtil.getApplicationContext().getBean("mySBWD1");
        test.run();

        MySpringBeanWithDependency test2 = (MySpringBeanWithDependency) SpringUtil.getApplicationContext().getBean("mySBWD2");
        test2.run();
    }
}
