package action;

import com.opensymphony.xwork2.ActionSupport;

public class indexStruts extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("indexStruts�����ʡ�������������");
		return SUCCESS;
	}
	
	public String test2() throws Exception {
		System.out.println("test2�����ʡ�������������");
		return "test2";
	}
	
	public String test3() throws Exception {
		System.out.println("test3�����ʡ�������������");
		return "success";	
	}
	 
	
	
}
