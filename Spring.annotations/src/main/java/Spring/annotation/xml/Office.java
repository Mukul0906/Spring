package Spring.annotation.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.annotation.xml.second.Contract;
import Spring.annotation.xml.second.Employee;
import Spring.annotation.xml.second.Permanent;

public class Office  {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e = (Employee) context.getBean(Contract.class);
		e.knowInfor();
		Employee e1 = (Employee) context.getBean(Permanent.class);
		e1.knowInfor();
	}

}
