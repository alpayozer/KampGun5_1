package kampGun5_1.business.abstracts;

import kampGun5_1.entities.concretes.User;

public interface UserService {

	boolean signUp(User user);
	void signUpTest(User user);
	void logIn(User user);
}
