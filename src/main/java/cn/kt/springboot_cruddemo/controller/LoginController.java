package cn.kt.springboot_cruddemo.controller;/*
 *Created by tao on 2020-05-16.
 */

import cn.kt.springboot_cruddemo.domain.Admin;
import cn.kt.springboot_cruddemo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private AdminService adminService;

    /**
     * 登录
     * @param username
     * @param password
     * @param map
     * @param session
     * @return
     */
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {

        if(!StringUtils.isEmpty(username)){
            Admin byName = adminService.findByName(username);
            if (byName == null){
                //登录失败
                map.put("msg","该用户名未注册！");
                return "login";
            }
            else {
                if (byName.getPassword().equals(password)){
                    //登录成功
                    System.out.println("登录成功！！！！");
                    System.out.println("用户名："+username);
                    session.setAttribute("loginUser",username);
                    return "redirect:/main.html";
                }else {
                    //密码错误
                    map.put("msg","密码错误！");
                    return "login";
                }

            }

        }else {
            //登录失败
            map.put("msg","请输入用户名和密码！");
            return "login";
        }
    }

    /**
     * 退出登录
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/loginout")
    public String loginout(HttpServletRequest request, HttpSession session){
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

}
