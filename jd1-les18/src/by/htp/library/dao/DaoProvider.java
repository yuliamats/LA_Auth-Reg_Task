package by.htp.library.dao;

import by.htp.library.dao.impl.FileUserDao;

public class DaoProvider {
	private static final DaoProvider instance = new DaoProvider();

	private DaoProvider() {
	}

	private UserDao userDao = new FileUserDao();

	public static DaoProvider getInstance() {
		return instance;
	}

	public UserDao getUserDao() {
		return userDao;
	}

}
