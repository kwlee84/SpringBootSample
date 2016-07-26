package namoo.nara.sample1.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import namoo.nara.sample1.logic.UserServiceLogic;
import namoo.nara.sample1.store.Sample1StoreLycler;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserSpringService extends UserServiceLogic {
    //
	@Autowired
	public UserSpringService(Sample1StoreLycler sampleStoreLycler) {
		super(sampleStoreLycler);
	}

}
