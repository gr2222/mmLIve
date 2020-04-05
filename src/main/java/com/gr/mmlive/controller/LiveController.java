package com.gr.mmlive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020/4/3 7:47 下午
 */
@Controller
@RequestMapping("/live")
public class LiveController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String getpage(){
        return "/html/index.html";
    }





}
