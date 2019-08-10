package com.dzkj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	//自动装配 required=false 可以允许为空
	@Autowired(required=false)
	//当容器中出现多个相同类型组件时 指定名字查找
	@Qualifier("stu")
	private Stu stu;
	
	
	public void 扫地() {
		System.out.println(stu.getName()+"帮我扫地去");
	}
}
