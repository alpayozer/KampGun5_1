package kampGun5_1.business.concretes;

import kampGun5_1.business.abstracts.UserValidatorService;
import kampGun5_1.entities.concretes.User;

public class UserValidator implements UserValidatorService{

	@Override
	public boolean passwordControl(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}else {
			return false;
		}

	}

	@Override
	public boolean nameControl(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public void controlTest(User user) {
		if(UserValidator.this.nameControl(user)) {
			if(UserValidator.this.passwordControl(user)) {
				System.out.println("�sim soyisim ve parola ge�erli.");
			}else {
				System.out.println("�sim soyisim ge�erli ama parola ge�ersiz.");
			}
		}else {
			System.out.println("�sim soyisim ge�ersiz");
		}
		
		
	}

}
