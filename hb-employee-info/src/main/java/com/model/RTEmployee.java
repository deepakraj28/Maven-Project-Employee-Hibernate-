package com.model;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RTEmployee
{
    public static void main(String[] args)
    {
    	Transaction tr=null;
    	try(Session ses=HBUtil.getSessionFactory().openSession())
    	{
    		tr=ses.beginTransaction();
    		Employee e1=new Employee("Ramesh");
    		RegEmployee e2=new RegEmployee(5500,"sales","Suresh");
    		Trainee e3=new Trainee(200,"6 months","Rajesh");
    		ses.persist(e1);
    		ses.persist(e2);
    		ses.persist(e3);
    		tr.commit();
    		ses.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
