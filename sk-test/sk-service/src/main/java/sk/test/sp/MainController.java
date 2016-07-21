package sk.test.sp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sk.test.domain.entity.User;
import sk.test.domain.service.UserService;

@Controller
@RequestMapping("/")
public class MainController {
	@Autowired
	private UserService userService;
	
	@RequestMapping
    public @ResponseBody String index() {
        return "Hello Woniper Spring Boot~";
    }
 
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getUserList() {
        return userService.findAll();
    }
}
