package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void register(User user);
	
	void deleteAccount(User user);
	
	void updateAccountData(User user);

	List<User> getAll();

	void LogIn(String message, String password, User user);
	
	void registerWithGoogleAccount(User user);

}
