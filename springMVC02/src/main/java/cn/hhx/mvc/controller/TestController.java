package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hhxStellar
 * @date 2021/9/16-13:56
 */
@Controller
public class TestController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/")
    public String testParam() {
        return "param_test";
    }
}
