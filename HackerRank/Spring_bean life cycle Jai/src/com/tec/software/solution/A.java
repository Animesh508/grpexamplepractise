package com.tec.software.solution;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class A implements ApplicationContextAware,InitializingBean,DisposableBean{
	Integer x;
	Integer y;
	
	public A() {
		System.out.println("Bean instance creation is done");
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("I am interface injection");
		
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("its afterpropertiesSet methord of zinitializingBean");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("I am");
		
	}
	

	
}
