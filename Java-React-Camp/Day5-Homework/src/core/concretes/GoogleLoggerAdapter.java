package core.concretes;

import GLogger.GLoggerManager;
import core.abstracts.GoogleLoggerService;

public class GoogleLoggerAdapter implements GoogleLoggerService{

	@Override
	public void logInWithGoogleAccount(String message) {
		
		GLoggerManager gLoggerManager = new GLoggerManager();
		gLoggerManager.logInWithGoogleAccount(message);
		
	}

}
