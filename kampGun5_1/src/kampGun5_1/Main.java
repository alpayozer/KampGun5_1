package kampGun5_1;


import kampGun5_1.business.concretes.EmailValidator;
import kampGun5_1.business.concretes.EmailVerificationManager;
import kampGun5_1.business.concretes.UserManager;
import kampGun5_1.business.concretes.UserValidator;
import kampGun5_1.core.GoogleAccountManagerAdapter;
import kampGun5_1.core.LoggerService;
import kampGun5_1.dataAccess.abstracts.UserDao;
import kampGun5_1.dataAccess.concretes.HibernateUserDao;
import kampGun5_1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Alpay");
		user1.setLastName("Ozer");
		user1.setEmail("alpayozer7@gmail.com");
		user1.setPassword("alpay123");
		
		User user2 = new User();
		user2.setFirstName("Murat");
		user2.setLastName("Seker");
		user2.setEmail("murat.seker@test.asd");
		user2.setPassword("murat");
		
		EmailValidator emailValidator = new EmailValidator();
		//emailValidator.emailTest(user1);
		//emailValidator.emailTest(user2);
		
		UserValidator userValidator = new UserValidator();
		//userValidator.controlTest(user1);
		//userValidator.controlTest(user2);

		
		
		UserManager userManager = new UserManager(userValidator,emailValidator);
		//userManager.signUpTest(user1);
		//userManager.signUpTest(user2);
		userManager.logIn(user1);
		userManager.logIn(user2);

		EmailVerificationManager emailVerificationManager = new EmailVerificationManager(userManager);
		//emailVerificationManager.emailVerificationTest(user1);
		//emailVerificationManager.emailVerificationTest(user2);
		
		
		UserDao userDao = new HibernateUserDao(emailVerificationManager);
		userDao.add(user1);
		userDao.add(user2);
		
		LoggerService loggerService = new GoogleAccountManagerAdapter();
		loggerService.logSystem(user1);
		
		
	}

}
