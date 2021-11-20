package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class demoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/demo/list")
    public List<Demo> demoMapper() {
        return demoService.list();
    }
}
