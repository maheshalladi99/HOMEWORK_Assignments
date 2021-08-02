package Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		//normal way
		//Employee eClient = new Employee();
		//eClient.setEid(1);
		//eClient.setEname("anu");
		//eClient.setEaddress("Jodhpur");
		
		//System.out.println("employee Details using developer created object:"+eClient);
		//Spring Way
//		Resource resource= new ClassPathResource("Bean.xml");
//		BeanFactory Fact = new XmlBeanFactory(resource);
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		//Employee e1 = (Employee)Fact.getBean("emp1");
		//Employee e2 = Fact.getBean("emp2",Employee.class);
		
		Employee e1 = (Employee)context.getBean("emp1");
		//Employee e2 =context.getBean("emp2",Employee.class);
		
		System.out.println("employee1 Details" +e1);
//		System.out.println("employee2 Details" +e2);
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
