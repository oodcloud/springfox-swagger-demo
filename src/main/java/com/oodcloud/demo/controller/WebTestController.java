package com.oodcloud.demo.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wangyujie on 2017/11/24.
 */
@RequestMapping(value = "/demo")
@Controller
@Api(value = "demo测试", description = "demo测试")
public class WebTestController {
    @ApiOperation(value = "test",httpMethod = "GET",  notes = "测试用例")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @ResponseBody
    @RequestMapping(value = "/test/{id}",method= RequestMethod.GET)
   public String login(@ApiParam(name = "id", required = true, value = "用户Id")@PathVariable("id") String id){
        return "欢迎各位学习swagger："+id;
   }

}
