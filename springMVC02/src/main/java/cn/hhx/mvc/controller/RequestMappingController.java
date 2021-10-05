package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hhxStellar
 * @date 2021/9/16-14:23
 */
//@RequestMapping("/outer")
@Controller
public class RequestMappingController {
    @RequestMapping(value = {"test", "testRequest"}//可以多个请求路径映射一个控制器方法
            , method = {RequestMethod.GET, RequestMethod.POST}//可以通过哪些方式来请求控制器方法,不加的话任何请求方式都能请求
    )
    public String success() {
        return "success";
    }

    @RequestMapping(
            value = "/testParams",
            params = {"username=惠恒星", "password=123456"}
    )
    public String testParams() {
        return "success";
    }

    @RequestMapping(
            value = "/h?h/testAnt"
    )
    public String testParams1() {
        return "success";
    }

    @RequestMapping(
            value = "/testPath/{username}/{psw}"
    )
    public String testPath(@PathVariable("username") String username, @PathVariable("psw") int psw) {
        System.out.println("username = " + username + ",password = " + psw);
        return "success";
    }
}
