package kampGun5_1.core;

import kampGun5_1.entities.concretes.User;
import kampGun5_1.googleAccount.GoogleAccountManager;

public class GoogleAccountManagerAdapter implements LoggerService{

	@Override
	public void logSystem(User user) {
		GoogleAccountManager googleAccountManager = new GoogleAccountManager();
		googleAccountManager.logIn("Google ile giriþ yapýldý. "+user.getFirstName());
		
	}
	

}
