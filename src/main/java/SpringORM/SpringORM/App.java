package SpringORM.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Dao.OrderDao;

import Com.Entity.Order1;


public class App {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");

		OrderDao order = applicationContext.getBean("OrderDao", OrderDao.class);

		Order1 o = new Order1("Tandur",45);

		int insert = order.insert(o);
		System.out.println("Done " + insert);
	}
}
