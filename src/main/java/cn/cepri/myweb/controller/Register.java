package cn.cepri.myweb.controller;

import cn.cepri.myweb.model.NewUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Register {
    @RequestMapping(value = "/register.html", method = RequestMethod.POST)
    public String login(NewUser newUser) {
        System.out.println(newUser);
        boolean passwordStatus = newUser.getPassword1().equals(newUser.getPassword2());
        if (newUser.getCheckbox() != null) {
            if (passwordStatus) {
                return "Register Successfully!";
            } else {
                return "The code you enter must be the same as the former one.";
            }
        }
        return "Disagreed!";
    }
}
