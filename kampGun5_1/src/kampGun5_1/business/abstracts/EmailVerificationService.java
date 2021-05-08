package kampGun5_1.business.abstracts;

import kampGun5_1.entities.concretes.User;

public interface EmailVerificationService {

	void emailVerificationTest(User user);
	boolean emailVerification(User user);
}
