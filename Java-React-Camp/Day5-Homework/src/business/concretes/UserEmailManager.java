package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserEmailService;
import entities.concretes.User;

public class UserEmailManager implements UserEmailService {

	@Override
	public boolean checkToEmail(User user) {
		Pattern p = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(user.getEmail());
		if (m.find())
		    return true;
		else 
			return false;
	} 

}
