package net.javaonline.spring.product.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.javaonline.spring.product.dto.Countries;

public class CountriesDAOImpl implements CountriesDAO{

	private SessionFactory sessionFactory;
	
	public CountriesDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	@Override
	public List<Countries> list(String name){
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		List<Countries> items = null;
		try {
			System.out.println("IN LIST");
			String query = "from countries u where u.name like :name";
			items = (List<Countries>)session.createQuery(query+"%"+name+"%").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return items;
	}

}
