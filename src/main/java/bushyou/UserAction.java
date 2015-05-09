package bushyou;

import bushyou.service.UserService;

public class UserAction {
	private String username;
	private String password;
	private UserService userService;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public  String execute(){
		System.out.println("useraction");
		System.out.println(this.userService.getName());
		return "SUCCESS";
	}

}
