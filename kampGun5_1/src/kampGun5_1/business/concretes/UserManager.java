package kampGun5_1.business.concretes;

import kampGun5_1.business.abstracts.UserService;
import kampGun5_1.entities.concretes.User;

public class UserManager implements UserService{

	UserValidator userValidator;
	EmailValidator emailValidator;
	
	public UserManager() {
		
	}
	public UserManager(UserValidator userValidator, EmailValidator emailValidator) {
		super();
		this.userValidator = userValidator;
		this.emailValidator = emailValidator;
	}
	@Override
	public boolean signUp(User user) {		
		if(userValidator.nameControl(user) && userValidator.passwordControl(user) &&
				EmailValidator.isEmailValid(user)) {
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public void signUpTest(User user) {
		if(userValidator.nameControl(user) && userValidator.passwordControl(user) &&
				EmailValidator.isEmailValid(user)) {
			
			System.out.println("Hesab�n�z olu�turuldu ve do�rulama postas� g�nderildi.");	
		}else {
			System.out.println("Hesab�n�z olu�turulamad�.");
		}
		
	}
	@Override
	public void logIn(User user) {
		if(userValidator.passwordControl(user) && EmailValidator.isEmailValid(user)) {
			
			System.out.println("Hesaba giri� yap�ld�.");	
		}else {
			System.out.println("Hatal� giri�.");
		}
	}
	

}
