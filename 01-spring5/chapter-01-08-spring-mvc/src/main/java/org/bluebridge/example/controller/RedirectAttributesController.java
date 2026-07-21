package org.bluebridge.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * SpringMVC 重定向时参数传递
 *
 * 1. 把参数拼接到 URL 中
 * 2. 把参数放在 Session 中，重定向到一个页面或者 Controlelr
 * 3. 使用 RedirectAttributes 实现重定向
 *
 * 使用 RedirectAttributes 实现重定向
 * 1. 使用 RedirectAttributes 需要在配置文件中配置<mvc:annotation-driven />
 * 2. 常用方法
 *    addFlashAttribute()：把参数拼接存放到Seesion中
 *    - 如果跳转到页面，则 Session 中存放的数据瞬间一处
 *    - 如果跳转到 Controller，使用 @ModelAttribute 注解可获取该数据，因为该数据是存储在 Session 中的，可以直接使用 @ModelAttribute 获取
 *    addAttribute():把参数拼接到URL中
 *    - 可以直接跳转到页面
 *    - 如果跳转到 Controller，使用 @RequestParam 获取传递过去的参数值
 *      如:http://localhost:8080/test/views/redirectAttribuate.jsp?name=zhangsan&age=18&school=ufe
 *
 * @author lingwh
 * @date 2019/6/20 15:09
 */
@Controller
public class RedirectAttributesController {

    /**
     * 重定向到一个目标页面，把参数拼接到 URL 中，重定向到页面，请注意查看浏览器地址栏中地址已经拼接了参数进去
     *
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value="testRedirectAttributesToPageParamInURL")
    public String testRedirectAttributesToPageParamInURL(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("name","zhangsan");
        redirectAttributes.addAttribute("age",18);
        redirectAttributes.addAttribute("school","ufe");
        return "redirect:/views/redirectAttribuate.jsp";
    }

    /**
     * 重定向到一个目标 Controller，把参数拼接到 URL 中，重定向到 Controller 中，请注意查看浏览器地址栏中地址已经拼接了参数进去
     *
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value="testRedirectAttributesToControllerParamInURL")
    public String testRedirectAttributesToControllerParamInURL(RedirectAttributes redirectAttributes){
        redirectAttributes.addAttribute("name","zhangsan");
        redirectAttributes.addAttribute("age",18);
        redirectAttributes.addAttribute("school","ufe");
        return "redirect:/targetControllerParamInURL";
    }

    /**
     * 重定向到目标 Controller，通过 @RequestParam 注解获取重定向后传递过来的值
     *
     * @param name
     * @return
     */
    @RequestMapping(value="targetControllerParamInURL")
    public String targetControllerForRequestParam(@RequestParam("name") String name,
            @RequestParam("age") String age,@RequestParam("school")  String school){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("school:"+school);
        return "redirectAttribuate";
    }

    /**
     * 重定向到一个目标页面，把参数放在 Session 中，重定向到页面，并在页面获取该值
     *
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value="testRedirectAttributesToPageParamInSession")
    public String testRedirectAttributesToPageParamInSession(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("name","zhangsan");
        return "redirect:/views/redirectAttribuate.jsp";
    }

    /**
     * 重定向到一个目标Controller，把参数放在Session中，重定向到另一个方法，并在该方法中接收(存放在session中的)参数
     *
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value="testRedirectAttributesToControllerParamInSession")
    public String testRedirectAttributesToControllerParamInSession(RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("name","zhangsan");
        return "redirect:/targetControllerParamInSession";
    }

    /**
     * 目标 Controller 通过 @ModelAttribute 注解获取重定向后传递过来的值
     *
     * @param name
     * @return
     */
    @RequestMapping(value="targetControllerParamInSession")
    public String targetController(@ModelAttribute("name") String name){
        System.out.println(name);
         return "redirectAttribuate";
    }
}
