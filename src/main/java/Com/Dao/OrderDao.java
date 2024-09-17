package Com.Dao;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;


import Com.Entity.Order1;

public class OrderDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Order1 order) {
		Integer save = (Integer) this.hibernateTemplate.save(order);
		return save;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
