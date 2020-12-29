package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.AmAreaService;
import com.example.demo.service.AmOrgService;
import com.example.demo.service.AmUserOrgService;
import com.example.demo.service.AmUserService;
import com.example.demo.service.imp.UserServiceImp;
import com.example.demo.word.lujin;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@Controller
public class controller {


    @Autowired
    private UserServiceImp userService;
    @Autowired
    private AmAreaService amAreaService;
    @Autowired
    private AmOrgService amOrgService;
    @Autowired
    private AmUserOrgService amUserOrgService;
    @Autowired
    private AmUserService amUserService;
    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping("/getUsers")
    public String GetUser(Model model){
        List<User> users = userService.SelAll();
        return  "index";
    }
    @RequestMapping("/getYears")
    @ResponseBody
    public String GetYear() {
        //获取当前年份 及前10年的记录
        int newYear = Calendar.getInstance().get(Calendar.YEAR);
        int currentYear = newYear+50;
        String date = "[";
        for(int i=0; i<100; i++){
            String yearId = Integer.toString(currentYear);
            String yearName = Integer.toString(currentYear)+"年";
            date += "{\"yearId\":\"" + yearId + "\",\"yearName\":\"" + yearName + "\"}";
            if(i<99){
                date +=",";
            }
            currentYear--;
        }
        date += "]";
        return date;
    }
    @RequestMapping("/getMonDays")
    @ResponseBody
    public String getMonDays() {
        String  MonDays = "[{\"MDId\":\"3.31\",\"MDName\":\"03月31日\"}," +
                "{\"MDId\":\"6.30\",\"MDName\":\"06月30日\"}," +
                "{\"MDId\":\"9.30\",\"MDName\":\"09月30日\"}," +
                "{\"MDId\":\"12.31\",\"MDName\":\"12月31日\"}]";
        return MonDays;
    }
    @RequestMapping("/getAmArea")
    public String GetAmArea(Model model){
        List<AmArea> users = amAreaService.selectAll();

        //这里埋了个bug  当数据库空值的时候  就会报空指针
        //这里埋了个bug  当数据库空值的时候  就会报空指针
        System.out.println(users.get(0).toString());
        model.addAttribute("users", users);
        return  "AmArea";
    }
    @RequestMapping("/getAmOrg")
    public String GetAmOrg(Model model){
        List<AmOrg> users = amOrgService.selectAll();
        model.addAttribute("users", users);
        return  "AmOrg";
    }
    @RequestMapping("/getAmUserOrg")
    public String GetAmUserOrg(Model model){
        List<AmUserOrg> users = amUserOrgService.selectAll();
        model.addAttribute("users", users);
        return  "AmUserOrg";
    }
    @RequestMapping("/getAmUser")
    public String GetAmUser(Model model){
        List<AmUser> users = amUserService.selectAll();
        model.addAttribute("users", users);
        return  "AmUser";
    }

    @RequestMapping("/outPut")
    public String outPut(){

        Configuration con=new Configuration();
        try {
            con.setClassForTemplateLoading(lujin.class, "/static/htm/");

            con.setObjectWrapper(new DefaultObjectWrapper());

            con.setDefaultEncoding("utf-8");

            Template template = con.getTemplate("wolf.htm");
            template.setEncoding("utf-8");
            List<AmUserOrg> users = amUserOrgService.selectAll();
            Map root=new HashMap();
            root.put("test11", users.get(0).getUserStateId());
            root.put("test21", users.get(0).getUserInsuredId());
            root.put("test31", users.get(0).getUserCreateTime());
            root.put("test12", users.get(1).getUserStateId());
            root.put("test22", users.get(1).getUserInsuredId());
            root.put("test32", users.get(1).getUserCreateTime());
            root.put("test13", users.get(2).getUserStateId());
            root.put("test23", users.get(2).getUserInsuredId());
            root.put("test33", users.get(2).getUserCreateTime());
            root.put("test14", users.get(3).getUserStateId());
            root.put("test24", users.get(3).getUserInsuredId());
            root.put("test34", users.get(3).getUserCreateTime());

            Writer out = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(new File("E://test.xls")),"utf-8"));
            template.process(root, out);
            out.flush();
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (TemplateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return  "index";
    }



}
