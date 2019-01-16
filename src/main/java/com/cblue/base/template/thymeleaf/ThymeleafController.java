package com.cblue.base.template.thymeleaf;

import com.cblue.base.mybatis.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/listUser")
    public ModelAndView listUser(ModelAndView mv) {

        List<User> users = new ArrayList<User>();
        for (int i = 0; i < 3; i++) {
            users.add(new User(i + "", "zhang" + i, "san" + i));
        }
        mv.addObject("users", users);
        mv.setViewName("userlist");
        return mv;
    }

}
