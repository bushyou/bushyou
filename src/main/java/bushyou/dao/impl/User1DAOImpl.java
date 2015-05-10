package bushyou.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import bushyou.dao.User1DAO;
import bushyou.domain.User1;

public class User1DAOImpl extends SqlMapClientDaoSupport implements User1DAO {

	@Override
	public User1 getUser1(Long userId) {
		try{
			return (User1)getSqlMapClientTemplate().queryForObject("findUser1ById", userId);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void registerUser(User1 user) {
		getSqlMapClientTemplate().insert("registerUser1", user);
	}

}
