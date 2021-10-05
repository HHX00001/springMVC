package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author hhxStellar
 * @date 2021/9/17-18:14
 */
@Controller
public class IndexController {
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/testView")
    public String testView() {
        return "testView";
    }

    @RequestMapping("/testRESTFul")
    public String testRESETFul() {
        return "testRESTFul";
    }
}
