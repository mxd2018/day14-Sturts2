package action;

import com.opensymphony.xwork2.ActionSupport;

import model.User;

public class login2 extends ActionSupport{
	User user;
	
	@Override
	public String execute() throws Exception {
		System.out.println(user.getUsername()+"*****"+user.getPassword()+"*****"+user.getAge());
		System.out.println("’‚ «login2.action");
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
		
	

	

	
	
}
