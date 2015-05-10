package bushyou.domain;

import java.io.Serializable;

public class User1 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5198400148304064821L;
	
	private Long userId;
	
	private String userName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
