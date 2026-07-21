package org.bluebridge.exception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringMVC 高级特性
 *
 * @author lingwh
 * @date 2019/7/25 9:20
 */
@Controller
public class ExceptionHanderController {

    /**
     * 处理异常，和业务相分离
     * 注意：
     *     1. 要把异常信息带到页面，不能在参数中传入 Map，将异常信息放在 Map 中，然后返回 String，要返回 ModelAndView
     *     2. ModelAndView 要写在方法体中，不能通过方法参数传入
     *
     * @param e
     * @return
     */
    // 使用 ModelAndView 正确写法
    // 异常处理在专门的 handler 中
    /*
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleArithmeticException(Exception e){
        System.out.println(e);
        System.out.println("出异常了......");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exceptionMessage",e);
        return mv;
    }*/

    // 使用 ModelAndView 错误写法
    /*
    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleArithmeticException(Exception e,ModelAndView mv){
        System.out.println(e);
        System.out.println("出异常了......");
        //ModelAndView mv = new ModelAndView();
        mv.setViewName("error");
        mv.addObject("exceptionMessage",e);
        return mv;
    }*/

    @RequestMapping("/testExceptionHander")
    public String testExceptionHander(){
        System.out.println(1/0);
        return "success";
    }
}