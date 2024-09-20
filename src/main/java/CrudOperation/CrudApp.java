package CrudOperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.Dao.TableDao;
import Com.Entity.Table1;

public class CrudApp {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("crudconfig.xml");

		TableDao res = applicationContext.getBean("tableDao", TableDao.class);

		Scanner scanner = new Scanner(System.in);

		boolean go = true;

		while (go) {
			System.out.println("select Which operation you want to perform");
			System.out.println("1] Insert data into the table");
			System.out.println("2] Get Single data Into the table");
			System.out.println("3] Get Multiple data into the table");
			System.out.println("4] Delete data from the table");
			System.out.println("5] Update data from the Table");
			System.out.println("6] Exit into Application");
			int ch = scanner.nextInt();
			System.out.println(
					"----------------------------------------------------------------------------------------");
			System.out.println();

			switch (ch) {

			case 1:
				Table1 table1 = new Table1();

				System.out.println("Enter the Table ID");
				int id = scanner.nextInt();

				System.out.println("Enter the Table Size");
				int size = scanner.nextInt();

				System.out.println("Enter the Table Name");
				String tname = scanner.next();

				table1.setTid(id);
				table1.setTable_Size(size);
				table1.setTable_Name(tname);

				int insertData = res.InsertData(table1);

				System.out.println("insert operation" + insertData);
				break;

			case 2:
				System.out.println("Enter Table id to get All info of that table");

				int id1 = scanner.nextInt();

				Table1 singleTable1 = res.getSingleTable1(id1);

				System.out.println();
				System.out.println("Table id" + singleTable1.getTid());
				System.out.println("Table Size is: " + singleTable1.getTable_Size());
				System.out.println("Table Name is:" + singleTable1.getTable_Name());
				System.out.println();
				break;

			case 3:

				List<Table1> li = res.getalldata();
				for (Table1 data : li) {
					System.out.println();
					System.out.println("Table id is: " + data.getTid());
					System.out.println("Table Name is: " + data.getTable_Name());
					System.out.println("Table size is: " + data.getTable_Size());
					System.out.println();
				}
				break;

			case 4:
				int id2;
				System.out.println("Enter the Table id to delete The data");
				id2 = scanner.nextInt();
				res.DeleteData(id2);
				break;

			case 5:

				System.out.println("Enter the Table ID");
				int id4 = scanner.nextInt();

				System.out.println("Enter the Table Size");
				int size1 = scanner.nextInt();

				System.out.println("Enter the Table Name");
				String name = scanner.next();

				Table1 data = new Table1();
				data.setTable_Name(name);
				data.setTable_Size(size1);
				data.setTid(id4);
				res.UpdateData(data);
				break;

			default:
				go = false;
			}

		}

//		Table1 table = new Table1(8, 9, "TableF3");
//
//		int i = res.InsertData(table);
//
//		System.out.println("Done " + i);
//
//		Table1 singleTable1 = res.getSingleTable1(1);

//		System.out.println(singleTable1);
//	
		System.out.println(
				"===================================================Application close=================================================");

	}

}
