package org.springframework.beans.fireTest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimple(){
		//先构建resource，后面会用到它的inputStream
		ClassPathResource resource = new ClassPathResource("org/springframework/beans/fireTest/MyTestBean.xml");
		//利用resource构建BeanFactory
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		//从beanFactory获取实例
		MyTestBean myTestBean = (MyTestBean)beanFactory.getBean("myTestBean");

		System.out.println(myTestBean);
	}
}
