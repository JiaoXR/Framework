package com.jaxer.example.service.impl;

import com.jaxer.example.service.GreetingService;

import java.util.Date;

/**
 * GreetingService接口实现类
 * <p>
 * Created by jaxer on 2018/12/8
 */
public class GreetingServiceImpl implements GreetingService {
	public String sayHello(String name) {
		String msg = "com.jaxer.example.service.impl.GreetingServiceImpl.sayHello is called!"
				+ " time-->" + new Date()
				+ ", name-->" + name;
		System.out.println(msg);
		return msg;
	}
}
