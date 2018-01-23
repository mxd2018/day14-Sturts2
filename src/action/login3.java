package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class login3 extends ActionSupport implements ModelDriven{
	//记住，此方式要手动new一个对象
	User user= new User();
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername()+"*****"+user.getPassword()+"*****"+user.getAge());
		System.out.println("这是login3.action");
		return SUCCESS;
	}
	
	public String addUser(){
		System.out.println("采用动态方法调用的方式，添加一个对象");
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		System.out.println("采用getModel的方式生成user对象");
		return user;
	}

	
	
	
	
	
		
	

	

	
	
}
