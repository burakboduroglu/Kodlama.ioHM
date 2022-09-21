import business.concretes.UserEmailManager;
import business.concretes.UserManager;
import business.concretes.VertificationLink;

import core.concretes.GoogleLoggerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Burak", "Boduroðlu", "mail@gmail.com", "1234115685465");
		UserManager manager = new UserManager(new HibernateUserDao(), new UserEmailManager(), new VertificationLink(), new GoogleLoggerAdapter());
			
		System.out.println("\n*****Kayýt Aþamasý*****");
		manager.register(user);
		
		System.out.println("\n*****Giriþ Aþamasý*****");
		manager.LogIn("mail@gmail.com", "1234115685465", user);
		
		System.out.println("\n*****Hesap Silme Aþamasý*****");
		manager.deleteAccount(user);
		
		System.out.println("\n*****Güncelleme Aþamasý*****");
		manager.updateAccountData(user);
		
		System.out.println("\n*****Google ile Kayýt Aþamasý*****");
		manager.registerWithGoogleAccount(user);
	}

}
