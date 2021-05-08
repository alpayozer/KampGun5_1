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
			
			System.out.println("Hesabýnýz oluþturuldu ve doðrulama postasý gönderildi.");	
		}else {
			System.out.println("Hesabýnýz oluþturulamadý.");
		}
		
	}
	@Override
	public void logIn(User user) {
		if(userValidator.passwordControl(user) && EmailValidator.isEmailValid(user)) {
			
			System.out.println("Hesaba giriþ yapýldý.");	
		}else {
			System.out.println("Hatalý giriþ.");
		}
	}
	

}
