package cn.kt.springboot_cruddemo.controller;/*
 *Created by tao on 2020-05-17.
 */

import cn.kt.springboot_cruddemo.domain.User;
import cn.kt.springboot_cruddemo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有
     * @param model
     * @return
     */
    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "userList";
    }

    /**
     * 分页查询
     * @param model
     * @param pageSize
     * @param pageNum
     * @return
     */
    @RequestMapping("/findByPage")
    public String findByPage(Model model,
                             @RequestParam(value = ("pageSize"), defaultValue = "10")Integer pageSize,
                             @RequestParam(value = ("pageNum"), defaultValue = "1")Integer pageNum) {
        //分页查找
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userService.findAll();
        PageInfo<User> userPageInfo = new PageInfo<User>(users);
        model.addAttribute("userPageInfo", userPageInfo);
//        System.out.println(userPageInfo);
        return "userListLayui";
    }

    /**
     * 添加用户信息
     * @param request
     * @param response
     */
    @RequestMapping("/addUser")
    public void addUser(HttpServletRequest request, HttpServletResponse response){
        String result="0";
        String name=request.getParameter("name");
        System.out.println("name="+name);
        String gender=request.getParameter("gender");
        System.out.println("gender="+gender);
        int age=Integer.parseInt(request.getParameter("age"));
        System.out.println("age="+age);
        String address=request.getParameter("address");
        System.out.println("address="+address);
        String qq=request.getParameter("qq");
        System.out.println("qq="+qq);
        String email=request.getParameter("email");
        System.out.println("email="+email);
        User user=new User();
        user.setName(name);
        user.setGender(gender);
        user.setAge(age);
        user.setAddress(address);
        user.setQq(qq);
        user.setEmail(email);
        boolean flag=false;
        flag=userService.saveUser(user);
        if(flag){
            result="1";
        }else{
            result="0";
        }
        System.out.println("result="+result);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"msg\":\""+result+"\"}");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据id删除用户
     * @param request
     * @param response
     */
    @RequestMapping("/delUser")
    public void delUser(HttpServletRequest request, HttpServletResponse response){
        String result="0";
        int id=Integer.parseInt(request.getParameter("id"));
        boolean flag=false;
        flag=userService.delUser(id);
        if(flag){
            result="1";
        }else{
            result="0";
        }
        //System.out.println("result="+result);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"msg\":\""+result+"\"}");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 根据id查询用户
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/findUserById")
    public User findUserById(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        User user=userService.findById(id);
        return user;
    }

    /**
     * 修改用户信息
     * @param request
     * @param response
     */
    @RequestMapping("/updateUser")
    public void updateUser(HttpServletRequest request, HttpServletResponse response){
        String result="0";
        int id=Integer.parseInt(request.getParameter("id"));
        System.out.println("id="+id);
        String name=request.getParameter("name");
        System.out.println("name="+name);
        String gender=request.getParameter("gender");
        System.out.println("gender="+gender);
        int age=Integer.parseInt(request.getParameter("age"));
        System.out.println("age="+age);
        String address=request.getParameter("address");
        System.out.println("address="+address);
        String qq=request.getParameter("qq");
        System.out.println("qq="+qq);
        String email=request.getParameter("email");
        System.out.println("email="+email);
        User user=new User();
        user.setId(id);
        user.setName(name);
        user.setGender(gender);
        user.setAge(age);
        user.setAddress(address);
        user.setQq(qq);
        user.setEmail(email);
        boolean flag=false;
        flag=userService.updateUser(user);
        if(flag){
            result="1";
        }else{
            result="0";
        }
        System.out.println("result="+result);
        try{
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write("{\"msg\":\""+result+"\"}");
        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
