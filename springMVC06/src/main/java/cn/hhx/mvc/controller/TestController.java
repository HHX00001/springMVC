package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * @author hhxStellar
 * @date 2021/9/18-21:48
 */
@Controller
public class TestController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor() {
        return "success";
    }

    @RequestMapping("/testException")
    public String testException() {
        HashMap<String, String> map = null;
        map.put("hhh", "111");
        return "success";
    }
}
