package cn.hhx.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author hhxStellar
 * @date 2021/9/19-10:28
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
    public String testException1(Exception e, Model model) {
        model.addAttribute("ex", e);
        return "error";
    }
}
