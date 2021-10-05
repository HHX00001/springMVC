package cn.hhx.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author hhxStellar
 * @date 2021/9/17-18:40
 */
@Controller
public class ScopeController {
    @RequestMapping("/testScope1")
    public String testScope1(HttpServletRequest request) {
        request.setAttribute("scope", "servletAPI共享数据");
        return "success";
    }

    @RequestMapping("/testScope2")
    public ModelAndView testScope2() {
        ModelAndView modelAndView = new ModelAndView();
        //处理模型数据，即向request域中共享数据
        modelAndView.addObject("scope", "modelAndView共享数据");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testScope3")
    public String testScope3(Model model) {
        model.addAttribute("scope", "model共享数据");
        return "success";
    }

    @RequestMapping("/testScope4")
    public String testScope4(Map<String, String> map) {
        map.put("scope", "map共享数据");
        return "success";
    }

    @RequestMapping("/testScope5")
    public String testScope5(ModelMap modelMap) {
        modelMap.put("scope", "modelMap共享数据");
        return "success";
    }

    @RequestMapping("/testScope6")
    public String testScope6(HttpSession session) {
        session.setAttribute("scope", "session共享数据");
        return "success";
    }

    @RequestMapping("/testScope7")
    public String testScope7(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("scope", "application共享数据");
        return "success";
    }
}
