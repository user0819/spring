package org.springframework.beans.fireTest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimple(){
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/fireTest/MyTestBean.xml"));
		MyTestBean myTestBean = (MyTestBean)beanFactory.getBean("myTestBean");
		System.out.println(myTestBean);
	}
}
