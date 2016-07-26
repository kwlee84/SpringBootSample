package namoo.io.sample2.sp.springweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import namoo.io.entity.Account;


@RestController
@RequestMapping("/ws")
public class AccountResource {
    //
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Account findUser() {
        //
        return Account.getExample();
    }
}