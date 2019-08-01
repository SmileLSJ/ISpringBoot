package com.example.demo;

import com.example.demo.YmlDemo.dto.Config;
import com.example.demo.ZhanWeiFu.ZhanWeiFuDemo;
import com.example.demo.propetiesDemo.Student;
import com.example.demo.config.ConfigurationPropertiesAndValueCompare;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IspringbootApplicationTests {

	@Autowired
	private ConfigurationPropertiesAndValueCompare person;

	@Autowired
	private Student student;

	@Autowired
	private ApplicationContext ac;

	@Autowired
	private ZhanWeiFuDemo zanwei;

	@Autowired
	private Config config;

	@Test
	public void contextLoads() {
		//Person(name=zhangsan, age=50, boss=false, birthday=Sun Oct 01 00:00:00 CST 2017,
		// map={person1=JK, person2=Tom},
		// dog=Dog(name=wangcai, sex=fale), l
		// ist=[xiaoming, xiaohua, xiaoye])
		System.out.println(person);

	}


	//测试@Properties标签
	@Test
	public void testPropertiesSource(){
		System.out.println(student);
	}

	//测试@Bean  spring boot注入单例对象的方法
	@Test
	public void testBean(){
		Object helloservice = ac.getBean("helloService");
		System.out.println(helloservice);
	}


	/**
	 * 测试占位符
	 */
	@Test
	public void testZhanWei(){
		System.out.println(zanwei.toString());
	}

	@Test
	public void testConfig(){
		System.out.println(config);
	}
}
