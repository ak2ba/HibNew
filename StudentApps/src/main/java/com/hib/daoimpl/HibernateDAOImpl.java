package com.hib.daoimpl;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib.dao.HibernateDAO;
import com.hib.entity.Project;
import com.hib.entity.StudentDemo;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class HibernateDAOImpl implements HibernateDAO
{
	Session session;
	private Transaction t;
	public HibernateDAOImpl() 
	{
		session = new Configuration()
				.configure("hibernate.xml")
				.addAnnotatedClass(StudentDemo.class)
				.addAnnotatedClass(StudentDetails.class)
				.addAnnotatedClass(Subject.class)
				.addAnnotatedClass(Project.class)
				.buildSessionFactory()
				.openSession();
	}
	
	@Override
	public void insertStudent(StudentDemo s) 
	{
		t = session.beginTransaction();
		session.persist(s);
		t.commit();
		System.out.println("Data Inserted");
	}

	@Override
	public ArrayList<StudentDemo> fetchAll() 
	{
		return (ArrayList<StudentDemo>) session.createQuery("from StudentDemo").list();
	}

	@Override
	public StudentDemo fetchOne(int sid) {
		return session.get(StudentDemo.class, sid);
	}

	public void delete(int sid) 
	{
		session.beginTransaction();
		session.delete(fetchOne(sid));
		session.getTransaction().commit();
		System.out.println("Data deleted");
	}

	public void updateStudent(String email, int sid) 
	{
		session.beginTransaction();
		StudentDemo s = session.get(StudentDemo.class,sid);
		if(s!=null)
		{
			s.setEmail(email);
			session.persist(s);
		}
		session.getTransaction().commit();
	}

	public void insertStudentDeatils(StudentDetails sds) {
		t = session.beginTransaction();
		session.persist(sds);
		t.commit();
		System.out.println("Data Inserted");
	}
	
	public void updateStudentWithSD(String email, String city, int sid) 
	{
		session.beginTransaction();
		StudentDemo s = session.get(StudentDemo.class,sid);
		if(s!=null)
		{
			s.setEmail(email);
			s.getStudentDetails().setCity(city);
			session.persist(s);
		}
		session.getTransaction().commit();
	}
}







