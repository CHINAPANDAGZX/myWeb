package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Title: EssiController.java
 * @Package com.xmrbi.segs.controller.essi
 * @Description: TODO(用一句话描述该文件做什么)
 * @author 郭智雄
 * @date 2018年7月10日14:06:00
 * @version V1.0
 */

@Controller
@RequestMapping("/essi")
public class EssiController {

    /**
     * 测试页面
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("显示测试页面");

        return "myHome";
    }




}
