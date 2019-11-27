package cn.cepri.myweb.controller;

import cn.cepri.myweb.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@RestController
public class Login {

    @RequestMapping(value = "/login.html", method = RequestMethod.POST)//接收来自前端的请求
    public ModelAndView login(User user) {
        System.out.println(user);
        boolean userNameStatus = user.getUserName().equals("479146353@qq.com");//比对用户名是否一致
        boolean passwordStatus = user.getPassword().equals("123456");//比对密码是否一致

        if (userNameStatus && passwordStatus) {
            //如果用户名&&密码都正确，重定向至首页
            ModelAndView mv = new ModelAndView(new RedirectView("http://115.25.205.11:8080/simulation/index.html"));
            return mv;
        }
        //如果用户名和密码有一个错误，重定向至hao123
        ModelAndView mv = new ModelAndView(new RedirectView("http://www.baidu.com"));
        return mv;
    }


//    @RequestMapping(value = {"/delete.html", "/del.html"})
//    public String delete(String[] ids) {
//        for (String str : ids) {
//            System.out.println(str);
//        }
//        return "Delete Successfully!" + ids;
//    }
//
//    //restful风格
//    @RequestMapping(value = "/user/{ids}", method = RequestMethod.GET)
//    public String searchUser(@PathVariable("ids") String[] ids) {
//        for (String str : ids) {
//            System.out.println(str);
//        }
//        return "Search User Successfully!" + ids;
//    }
}
