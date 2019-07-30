package com.example.demo;

import com.example.demo.com.example.demo.YmlDemo.config.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IspringbootApplicationTests {

	@Autowired
	private Person person;

	@Test
	public void contextLoads() {
		//Person(name=zhangsan, age=50, boss=false, birthday=Sun Oct 01 00:00:00 CST 2017,
		// map={person1=JK, person2=Tom},
		// dog=Dog(name=wangcai, sex=fale), l
		// ist=[xiaoming, xiaohua, xiaoye])
		System.out.println(person);

	}

}
