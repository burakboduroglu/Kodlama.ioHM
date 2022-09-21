package business.concretes;

import java.util.ArrayList;

import java.util.List;

import business.abstracts.UserEmailService;
import business.abstracts.UserService;
import business.abstracts.VertificationService;
import core.abstracts.GoogleLoggerService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	
	private ArrayList<String> userMailList = new ArrayList<String>();
	
	private UserDao _userDao;
	private UserEmailService _userEmailService;
	private VertificationService _vertificationService;
	private GoogleLoggerService _gLoggerManagerAdapter;
	
    public UserManager(UserDao userDao, UserEmailService userEmailService, VertificationService vertificationService, GoogleLoggerService gLoggerManagerAdapter) {
    	this._userDao = userDao;
    	this._userEmailService = userEmailService;
    	this._vertificationService = vertificationService;
    	this._gLoggerManagerAdapter = gLoggerManagerAdapter;
    }
    
   

	@Override
	public void register(User user) {
		if ( _userEmailService.checkToEmail(user) && user.getPassword().length() > 6 
				&& user.getName().length() > 2 && user.getSurname().length() > 2 && !userMailList.contains(user.getEmail())) {
			
			_vertificationService.vertification(user);
			_userDao.add(user);
			userMailList.add(user.getEmail());
			
			System.out.println("Kayýt Baþarýlý.");	
		} else {
			System.out.println("Kayýt Baþarýsýz! Girdiðiniz Bilgileri Kontrol Ediniz.");	
		}
	}

	@Override
	public List<User> getAll() {
		return null;
	}

	@Override
	public void LogIn(String email, String password, User user) {
		if (userMailList.contains(email) && user.getPassword() == password ) {
			System.out.println("Kullanýcý Giriþi Baþarýlý.");
		} else {
			System.out.println("Giriþ Baþarýsýz! Girdiðiniz Bilgileri Kontrol Ediniz.");
		}
	}

	@Override
	public void deleteAccount(User user) {
		_userDao.delete(user);
	}

	@Override
	public void updateAccountData(User user) {
		_userDao.update(user);	
	}



	@Override
	public void registerWithGoogleAccount(User user) {
		_gLoggerManagerAdapter.logInWithGoogleAccount(user.getEmail());		
	}


}
