package com.demo.hibernate.HiberOne;

import org.hibernate.cfg.Configuration;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
    	//from student
//        System.out.println( "Hello World!" );
//        Configuration cfg=new Configuration();
//    	cfg.configure("hibernate.cfg.xml");
//    	SessionFactory factory=cfg.buildSessionFactory();
//    	Student st=new Student();
//    	//st.setId(new Random().nextInt());
//    	st.setName("Mahesh Alladi now");
//    	st.setCity("Kakinada");
//    
//    	Session session = factory.openSession();
//    	//Transaction tx=session.beginTransaction();
//    	session.save(st);
    	//tx.commit();
    	
    	//for regularstudent it will extends to the students..means come 
    	//with student table also
//	    Configuration cfg=new Configuration();
//	  	cfg.configure("hibernate.cfg.xml");
//	  	SessionFactory factory=cfg.buildSessionFactory(); 	
//	  	RegularStudent rs=new RegularStudent();
	  	//rs.setId(new Random().nextInt());
//	  	rs.setName("Arjunuduwe now");
//	  	rs.setCity("Samalkotwedsc  swdef");
//	  	rs.setAddress("Water tankcx56765 ");
//	  	rs.setFee(10230);
    	//Session session = factory.openSession();
    	//Transaction tx=session.beginTransaction();
//    	session.save(rs);
    	//tx.commit();
    	
    	
    	//for privatestudent it will extends to the students..means come 
    	//with student table also
    	Configuration cfg=new Configuration();
  		cfg.configure("hibernate.cfg.xml");
  		SessionFactory factory=cfg.buildSessionFactory(); 	
  		PrivateStudent ps=new PrivateStudent();
  		//ps.setId(new Random().nextInt());
  		ps.setName("Arjunudu");
  		ps.setCity("Samalkot");
  		ps.setMobilenumber("9966591633");
  		ps.setScholership(15000);
    	Session session = factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(ps);
    	tx.commit();
    	
    	//mam code
//        Configuration cfg = new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory factory = cfg.buildSessionFactory();
//        //SessionFactory factory = new Configuration().configure().buildSessionFactory();
//        Student st = new Student();
//        st.setId(new Random().nextInt());
//        st.setName("Sushmitha");
//        st.setCity("Chennai");
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        session.save(st);
//        tx.commit();
//    	
        
    }
}
