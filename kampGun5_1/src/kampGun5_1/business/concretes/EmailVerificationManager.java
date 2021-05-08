package kampGun5_1.business.concretes;

import kampGun5_1.business.abstracts.EmailVerificationService;
import kampGun5_1.entities.concretes.User;

public class EmailVerificationManager implements EmailVerificationService{

	UserManager userManager = new UserManager();
	
	public EmailVerificationManager(UserManager userManager) {
		super();
		this.userManager = userManager;
	}
	public EmailVerificationManager() {
		
	}

	@Override
	public void emailVerificationTest(User user) {
		if(userManager.signUp(user)) {
			System.out.println("Emailiniz baþarýyla doðrulandý.");
		}else {
			System.out.println("Email doðrulanamadý.");
		}
	}

	@Override
	public boolean emailVerification(User user) {
		if(userManager.signUp(user)) {
			return true;
		}else {
			return false;
		}
		
	}


}
