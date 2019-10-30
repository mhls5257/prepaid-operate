package com.ciec.prepaid.web.controller;

import com.ciec.prepaid.biz.service.DemoService;
import com.ciec.prepaid.dao.entity.PrepaidUser;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "demo")
public class DemoController {

    @Autowired
    private DemoService demoService;



    @ApiOperation(value = "接口的功能介绍",notes = "提示接口使用者注意事项",httpMethod = "POST")
    @ApiImplicitParam(paramType = "form", name = "name", value = "", required = true, dataType = "string")
    @RequestMapping(method = RequestMethod.POST, value = "test")
    @ResponseBody
    public String test(@RequestParam(value = "name", defaultValue = "") String name) {
        PrepaidUser prepaidUser = new PrepaidUser();
        prepaidUser.setUserName(name);
        log.info("来了,老弟");
        return demoService.savePrepaidUser(prepaidUser);
    }
}
