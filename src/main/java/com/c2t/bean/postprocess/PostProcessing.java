package com.c2t.bean.postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessing implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("inside postProcessAfterInitialization...");
		
		System.out.println("arg1 = "+arg1);
		
		return arg1;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("inside postProcessBeforeInitialization");
		
		System.out.println("arg1 = "+arg1);
		
		return arg1;
	}
	
}