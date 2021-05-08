package kampGun5_1.business.concretes;

import java.util.regex.Pattern;

import kampGun5_1.business.abstracts.EmailValidatorService;
import kampGun5_1.entities.concretes.User;

public class EmailValidator implements EmailValidatorService{
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	public static boolean isEmailValid(User user) {
		Pattern pattern = Pattern.compile(EMAIL_PATTERN,
				Pattern.CASE_INSENSITIVE);
		return pattern.matcher(user.getEmail()).find();
	}

	@Override
	public void emailTest(User user) {
		if(EmailValidator.isEmailValid(user)) {
			System.out.println("Geçerli email");
		}else {
			System.out.println("Geçersiz email");
		
		
	}
	
}
}
	

