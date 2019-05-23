package com.pcbwx.mybatis.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pcbwx.mybatis.dao.ActionLogMapper;
import com.pcbwx.mybatis.model.ActionLog;

/**
 * @author heyu
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ActionLogMapper actionLogMapper;

    @PostMapping
    public Object addLog(@RequestBody ActionLog actionLog){
        actionLogMapper.insert(actionLog);
        return actionLog;
    }

    @GetMapping
    public ActionLog getLog(@RequestParam Integer id){
        return actionLogMapper.selectById(id);
    }

}
