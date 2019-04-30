package com.c2t.aop1;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

//http://www.javadoc.io/doc/org.aspectj/aspectjrt/1.9.3.RC1
@Aspect
@Component
public class LoggingAspect {
	@Before("execution(* com.c2t.aop1.CustomerBo.addCustomer(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("----------------logBefore--------------------");

		String args = Arrays.toString(joinPoint.getArgs());
		System.out.println("args=" + args);

		String kind = joinPoint.getKind();
		System.out.println("kind=" + kind);

		String signature = joinPoint.getSignature().toString();
		System.out.println("signature=" + signature);

		String source = joinPoint.getSourceLocation().toString();
		System.out.println("source=" + source);

		String sThis = joinPoint.getThis().toString();
		System.out.println("sThis=" + sThis);
	}

	@After("execution(* com.mkyong.customer.bo.CustomerBo.addCustomer(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("----------------logAfter--------------------");

		String args = Arrays.toString(joinPoint.getArgs());
		System.out.println("args=" + args);

		String kind = joinPoint.getKind();
		System.out.println("kind=" + kind);

		String signature = joinPoint.getSignature().toString();
		System.out.println("signature=" + signature);

		String source = joinPoint.getSourceLocation().toString();
		System.out.println("source=" + source);

		String sThis = joinPoint.getThis().toString();
		System.out.println("sThis=" + sThis);

	}

}