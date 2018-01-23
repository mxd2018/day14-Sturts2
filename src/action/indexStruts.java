package action;

import com.opensymphony.xwork2.ActionSupport;

public class indexStruts extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("indexStruts被访问。。。。。。。");
		return SUCCESS;
	}
	
	public String test2() throws Exception {
		System.out.println("test2被访问。。。。。。。");
		return "test2";
	}
	
	public String test3() throws Exception {
		System.out.println("test3被访问。。。。。。。");
		return "success";	
	}
	 
	
	
}
