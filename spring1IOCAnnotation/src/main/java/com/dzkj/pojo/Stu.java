package com.dzkj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//创建组件 组件名默认为类名
@Component 
//作用域 prototype多列
@Scope
public class Stu {
	@Value("111")
	private Integer id;
	@Value("兔崽子")
	private String name;
	@Value("男")
	private String sex;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stu(Integer id, String name, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	
	
}
