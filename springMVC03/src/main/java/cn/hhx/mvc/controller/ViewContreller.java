package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hhxStellar
 * @date 2021/9/17-20:10
 */
@Controller
public class ViewContreller {
    @RequestMapping("/testThymeleaf")
    public String testThymeleaf() {
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward() {
        return "forward:/testThymeleaf";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect() {
        return "redirect:/testThymeleaf";
    }
}