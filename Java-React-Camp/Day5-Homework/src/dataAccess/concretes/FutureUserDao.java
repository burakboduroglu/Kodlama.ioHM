package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class FutureUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("FutureUserDao ile kullanýcý eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("FutureUserDao ile kullanýcý silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("FutureUserDao ile kullanýcý bilgileri güncellendi.");
		
	}

}
