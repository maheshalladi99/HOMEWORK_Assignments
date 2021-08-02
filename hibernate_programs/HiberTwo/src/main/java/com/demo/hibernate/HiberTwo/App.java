package com.demo.hibernate.HiberTwo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaQuery;
/**
 * Hello world!
 *
 */
public class App 
{
    

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //hcql
   	 Session S=new Configuration().configure().buildSessionFactory().openSession();
   	
   	 //PENDING FROM MAM
        //Criteria C=S.createCriteria(Student.class).add(Restrictions.eq("id",new Long()));
   	 
   	 
   	 // ITS IS EXECUTED FOR hcql to get data accordingly
//        Criteria C=S.createCriteria(Student.class).addOrder(Order.desc("age")).setMaxResults(4);
//        List<Student> studet=C.list();
//        for(Student student:studet) {
//        	System.out.print("this is "+student.getId()+" city belongs to ");
//    		System.out.print(student.getCity()+" name is ");
//    		System.out.print(student.getName()+" and age is ");
//    		System.out.println(student.getAge()+" ");
//    		System.out.println("\n");
//        }
        
   	 
   	 
        //multiple projections 
        Criteria C=S.createCriteria(Student.class);
        
        ProjectionList prolist=Projections.projectionList();
        prolist.add(Projections.rowCount());
        
        prolist.add(Projections.max("age"));
        prolist.add(Projections.min("age"));
        prolist.add(Projections.max("id"));
        prolist.add(Projections.min("id"));
        C.setProjection(prolist);
        System.out.println(prolist);
      List results = C.list();
      Iterator iterator = results.iterator();
        while (iterator.hasNext()) {
            Object[] obj = (Object[]) iterator.next();
            System.out.println("ROW COUNT :-" + obj[0] + " max age :-" + obj[1] + " min Age :-" + obj[2]+ " mxn id :-" + obj[3]+ " min id :-" + obj[4]);
        }
        
        
        
      //for single projection
//       C.setProjection(Projections.rowCount());
//       List result=C.list();
//        System.out.println(result);
        
      
        
      
        
        //THE LAST PART runtime values
//        		String qu="from Student S where S.id=:ID";
//        		Query q=S.createQuery(qu);
//        		q.setParameter("ID", 564641212);
//        		List result=q.list();
//            System.out.println(result);
        
        
        
        
//        List<Student> studet=C.list();
//        for(Student student:studet) {
//        	System.out.print("this is "+student.getId()+" city belongs to ");
//    		System.out.print(student.getCity()+" name is ");
//    		System.out.print(student.getName()+" and age is ");
//    		System.out.println(student.getAge()+" ");
//    		System.out.println("\n");
//        }
//    		}
        
        
        
//        Configuration cfg=new Configuration();
//    	cfg.configure("hibernate.cfg.xml");
//    	SessionFactory factory=cfg.buildSessionFactory();
//    	Session session = factory.openSession();
    	
    	// from
//    	String q="from Student";
//    	Query qone=session.createQuery(q);
//    	List<Student> list=qone.list();
//    	for(Student student:list) {
//    		System.out.print("this is "+student.getId()+" city belongs to ");
//    		System.out.print(student.getCity()+" name is ");
//    		System.out.print(student.getName()+" and age is ");
//    		System.out.println(student.getAge()+" ");
//    		System.out.println("\n");
//    	}
    	
//    	/*Use As Clause*/
//        String QueOne = "from Student as S";
//        Query querytwo = session.createQuery(QueOne);
//        List<Student> result = querytwo.list();
//       
//        String QueTwo = "from Student S where S.id=564641212";
//        Query querytwoo = session.createQuery(QueTwo);
//        List<Student> results = querytwoo.list();
//        for(Student student:results) {
//        	System.out.print("this is "+student.getId()+" city belongs to ");
//    		System.out.print(student.getCity()+" name is ");
//    		System.out.print(student.getName()+" and age is ");
//    		System.out.println(student.getAge()+" ");
//        }
//       
//       
        /*Update Query*/
//        Transaction tx = session.beginTransaction();
//        String QueThree = "Update Student as S set S.age=18 where S.id=564641212";
//        Query queryThree = session.createQuery(QueThree);
//        int resultThree = queryThree.executeUpdate();
//        System.out.println("Rows updated "+resultThree);
//        tx.commit();
    	}
    	
    }

