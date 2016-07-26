package namoo.nara.sample1.cp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import namoo.nara.sample1.logic.UserServiceLogic;
import namoo.nara.sample1.proxy.Sample1ProxyLycler;
import namoo.nara.sample1.store.Sample1StoreLycler;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserSpringService extends UserServiceLogic {
    //
	@Autowired
	public UserSpringService(Sample1StoreLycler sample1StoreLycler, Sample1ProxyLycler sample1ProxyLycler) {
		super(sample1StoreLycler, sample1ProxyLycler);
	}

}
