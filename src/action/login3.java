package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class login3 extends ActionSupport implements ModelDriven{
	//��ס���˷�ʽҪ�ֶ�newһ������
	User user= new User();
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername()+"*****"+user.getPassword()+"*****"+user.getAge());
		System.out.println("����login3.action");
		return SUCCESS;
	}
	
	public String addUser(){
		System.out.println("���ö�̬�������õķ�ʽ�����һ������");
		return SUCCESS;
	}

	@Override
	public Object getModel() {
		System.out.println("����getModel�ķ�ʽ����user����");
		return user;
	}

	
	
	
	
	
		
	

	

	
	
}
