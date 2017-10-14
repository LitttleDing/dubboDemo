package com.db.test;

import com.db.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping( "/test" )
public class Test {

    @Resource
    private DemoService demoService;

    @RequestMapping ( "/data" )
    @ResponseBody
    public String data(HttpServletRequest req)
    {
        return demoService.sayHello("baby !");
    }

    @RequestMapping ( "/page" )
    public String page(HttpServletRequest req)
    {
        return "test";
    }
}
