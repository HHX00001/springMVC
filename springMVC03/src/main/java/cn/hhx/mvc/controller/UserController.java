package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hhxStellar
 * @date 2021/9/17-23:02
 */
@Controller
public class UserController {
    /**
     * 用RESTFul模拟用户资源的增删改查
     * /users  get   查询所有用户信息
     * /user/1  get   根据id查询用户信息
     * /user  post   添加用户信息
     * /user/1  delete  删除用户信息
     * /user  put   修改用户信息
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById() {
        System.out.println("根据ID查询用户信息");
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String insertUser(String username, String password) {
        System.out.println("添加用户:" + username + " " + password);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password) {
        System.out.println("修改信息" + username + "" + password);
        return "success";
    }

}
