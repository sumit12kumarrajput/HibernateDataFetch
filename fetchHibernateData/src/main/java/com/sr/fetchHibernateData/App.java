package com.sr.fetchHibernateData;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    	Student student=null;
    	
        Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        student=(Student)session.get(Student.class, 101);
        System.out.println(student);
        transaction.commit();
        		
    }
}
