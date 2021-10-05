package cn.hhx.mvc.controller;

import cn.hhx.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hhxStellar
 * @date 2021/9/18-15:18
 */
@Controller
public class HttpController {
    @PostMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println("requestBody:" + requestBody);
        return "success";
    }

    @PostMapping("/testRequestEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity) {
        System.out.println("请求头：" + requestEntity.getHeaders());
        System.out.println("请求体：" + requestEntity.getBody());
        return "success";
    }

    @GetMapping("/testResponse")//原生API
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().print("hello response");
    }

    @GetMapping("testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }

    @GetMapping("testResponseUser")
    @ResponseBody
    public User testResponseUser() {
        return new User(10001, "hhx", "123456", 22, "male");
    }

    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username, String password) {
        System.out.println(username + "," + password);
        return "hello,axios";
    }
}
