package cn.hhx.mvc.controller;

import cn.hhx.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hhxStellar
 * @date 2021/9/16-16:44
 */
@Controller
public class ParamController {

    @RequestMapping("/testServletAPI")
    //request表示当前请求
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username =" + username + " password = " + password);
        return "success";
    }

    @RequestMapping(value = "/testParam")
    public String testParam(
            @RequestParam(value = "user_name") String username,
            int password
    ) {
        System.out.println("username =" + username + " password = " + password);
        return "success";
    }

    @RequestMapping("/testBean")
    public String testBean(User user) {//接收传来的数据，将name相同的值赋给bean的属性
        System.out.println(user);
        return "success";
    }
}
