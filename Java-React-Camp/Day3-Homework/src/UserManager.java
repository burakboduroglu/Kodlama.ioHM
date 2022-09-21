
public class UserManager {
	
	public void registerAccount(User user) {
		System.out.println(user.getName()+ " " +user.getLastName() + " sistem de kaydýnýz oluþtu.");
	}
	public void deleteAccount(User user) {
		System.out.println(user.getName()+ " " +user.getLastName() + " sistem de kaydýnýz silindi.");
	}

}
