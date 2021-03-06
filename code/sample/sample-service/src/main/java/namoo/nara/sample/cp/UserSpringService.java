package namoo.nara.sample.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import namoo.nara.logic.UserServiceLogic;
import namoo.nara.store.SampleStoreLycler;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserSpringService extends UserServiceLogic{
    //
	@Autowired
	public UserSpringService(SampleStoreLycler sampleStoreLycler) {
		super(sampleStoreLycler);
	}

}
