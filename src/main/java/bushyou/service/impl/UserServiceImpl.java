package bushyou.service.impl;

import java.util.Random;

import bushyou.dao.User1DAO;
import bushyou.domain.User1;
import bushyou.service.UserService;

public class UserServiceImpl implements UserService {

	private User1DAO user1dao;

	@Override
	public String getName() {
		return this.user1dao.getUser1(1L).getUserName();
	}

	@Override
	public void doDbMethod() {

		User1 user = new User1();
		user.setUserName("bush" + (new Random().nextInt(10) + 1));
		this.user1dao.registerUser(user);

	}

	public User1DAO getUser1dao() {
		return user1dao;
	}

	public void setUser1dao(User1DAO user1dao) {
		this.user1dao = user1dao;
	}

}
