package base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domain.RateDomainModel;
import domain.StudentDomainModel;
import util.HibernateUtil;

public class RateDAL {
	
	public static ArrayList<RateDomainModel> getRate() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		RateDomainModel rateGet = null;		
		ArrayList<RateDomainModel> rate = new ArrayList<RateDomainModel>();
		
		try {
			tx = session.beginTransaction();	
			
			List students = session.createQuery("FROM RateDomainModel").list();
			for (Iterator iterator = students.iterator(); iterator.hasNext();) {
				RateDomainModel rat = (RateDomainModel) iterator.next();
				rate.add(rat);

			}
			
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return rate;
	}


	public static double getRate(int GivenCreditScore) {
		//FinalExam - please implement		
		// Figure out which row makes sense- return back the 
		// right interest rate from the table based on the given credit score
		
		double interestRate;
		
		if (GivenCreditScore <= 600){
			interestRate = 5;
		}
		else if (GivenCreditScore <= 650){
			interestRate = 4.5;
			
		}
		else if (GivenCreditScore <= 700){
			interestRate = 4;
		}
		else if (GivenCreditScore <= 750){
			interestRate = 3.75;
		}
		else{
			interestRate = 3.5;
		}
		
		//FinalExam - obviously change the return value
		return interestRate;
	}

}