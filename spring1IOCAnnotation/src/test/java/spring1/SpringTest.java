package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.pojo.Stu;
import com.dzkj.pojo.Teacher;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//按类型查找
//		Stu s = ac.getBean(Stu.class);
//		System.out.println(s);
//		System.out.println(ac.isSingleton("stu"));
		Teacher tea = ac.getBean(Teacher.class);
		tea.扫地();
	}
}
