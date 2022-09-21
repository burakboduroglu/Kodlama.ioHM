package business.abstracts;



import entities.concretes.User;

public interface UserEmailService {
		
	boolean checkToEmail(User user);

}
