package ch.makery.address.model;

import base.RateDAL;
import domain.RateDomainModel;

public class Rate extends RateDomainModel {
	
	public double getPayment(int NumberOfPayments)
	{
		//FinalExam
		//	Normally this kind of method would be in a BLL, but alas...
		
		//	Figure out payment based on:
		//	Interest rate
		//	PV
		//	FV (make FV = 0, unless you want a balloon payment
		//	Compounding = True
		//	Number of Payments (passed in)
		double PV;
		double FV;
		double p;
		boolean t;
		
		p = 0;
		t = false;
	
				
		
		
		
		
		return 0;
	}
}
