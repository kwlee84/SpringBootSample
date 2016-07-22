package namoo.nara.sample.sp.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class UserController {
    //
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        //
        model.addAttribute("message", "Hello World~!");
        return "index";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        //
        return "login";
    }
    
    /*@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user) {
        //
        System.out.println("usid: " + user.getUsid());
        System.out.println("password: " + user.getPassword());
        System.out.println("name: " + user.getName());
        
        return "redirect:/";
    }*/
}
