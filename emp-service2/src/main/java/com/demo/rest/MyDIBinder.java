package com.demo.rest;

import org.glassfish.hk2.utilities.binding.AbstractBinder;

public class MyDIBinder extends AbstractBinder{

	@Override
	protected void configure() {
		bind(EmpDaoJpaImpl.class).to(EmpDao.class);
		
	}

}
