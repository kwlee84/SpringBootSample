package namoo.nara.town.sp.springweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import namoo.nara.town.entity.User;

@RestController
@RequestMapping("/ws")
public class UserResource {
    //
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findUser() {
        //
        return User.getExample();
    }
}
