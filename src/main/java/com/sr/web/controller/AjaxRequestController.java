package com.sr.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sr.batis.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/ajax")
public class AjaxRequestController {
    Logger logger = Logger.getLogger(AjaxRequestController.class);

    @RequestMapping(value = "/getdata/{did}.do",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public
    @ResponseBody
    String ajaxGetData(@PathVariable String did) {
        if (did == null) {
            return "默认数据";
        }
        if (logger.isDebugEnabled()) {
            logger.debug("com.sr.web.controller.AjaxRequestController.ajaxGetData->did:" + did);
        }
        User user1 = new User();
        User user2 = new User();
        user1.setUid(1L);
        user1.setLoginId("张三");
        user1.setPassword("123");
        user2.setUid(2L);
        user2.setLoginId("李四");
        user2.setPassword("456");
        Map<Long, User> tempData = new HashMap<>();
        tempData.put(user1.getUid(),user1);
        tempData.put(user2.getUid(),user2);
        User user = tempData.get(Long.valueOf(did));
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}