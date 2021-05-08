package kampGun5_1.business.abstracts;

import kampGun5_1.entities.concretes.User;

public interface UserValidatorService {

	boolean passwordControl(User user);
	boolean nameControl(User user);
	void controlTest(User user);
}
