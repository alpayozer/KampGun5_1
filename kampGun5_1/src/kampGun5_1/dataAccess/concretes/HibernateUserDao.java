package kampGun5_1.dataAccess.concretes;

import kampGun5_1.business.concretes.EmailVerificationManager;
import kampGun5_1.dataAccess.abstracts.UserDao;
import kampGun5_1.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	EmailVerificationManager emailVerificationManager = new EmailVerificationManager();
	
	public HibernateUserDao(EmailVerificationManager emailVerificationManager) {
		super();
		this.emailVerificationManager = emailVerificationManager;
	}
	public HibernateUserDao() {
		
	}

	@Override
	public void add(User user) {
		if(emailVerificationManager.emailVerification(user)) {
			System.out.println("Hibernate ile Database'e eklendi.");
		}else {
			System.out.println("Database'e eklenemedi.Lütfen emailinizi doðrulayýnýz.");
		}
		
		
	}

}
