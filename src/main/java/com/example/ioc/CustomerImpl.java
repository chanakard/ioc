package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerImpl implements Customer {

	
	private CreditCard cc;
	
	@Autowired
	public CustomerImpl(CreditCard cc) {
		this.cc = cc;
	}

	public CreditCard getCc() {
		return cc;
	}

	
	public void setCc(CreditCard cc) {
		this.cc = cc;
	}

	@Override
	public void pay() {
		cc.makePayment();
	}

}
