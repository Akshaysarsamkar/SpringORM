package Com.Dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import Com.Entity.Table1;

public class TableDao {

	public HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int InsertData(Table1 table) {

		Integer res = (Integer) this.hibernateTemplate.save(table);
		return res;
	}

	public Table1 getSingleTable1(int id) {

		Table1 res = hibernateTemplate.get(Table1.class, id);
		return res;
	}

	public List<Table1> getalldata() {

		List<Table1> res = this.hibernateTemplate.loadAll(Table1.class);
		return res;

	}

	@Transactional
	public void UpdateData(Table1 table1) {

		this.hibernateTemplate.update(table1);
		System.out.println("Data Updated Succesfully");
		System.out.println();

	}

	@Transactional
	public void DeleteData(int id) {
		Table1 table1 = this.hibernateTemplate.get(Table1.class, id);
		this.hibernateTemplate.update(table1);
		System.out.println("Data Deleted......................................");
		System.out.println();
	}

}
