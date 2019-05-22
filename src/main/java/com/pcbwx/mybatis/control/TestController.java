package com.pcbwx.mybatis.control;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pcbwx.mybatis.bean.response.ResponseList;
import com.pcbwx.mybatis.dao.DictionaryMapper;
import com.pcbwx.mybatis.model.Dictionary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Resource
    private DictionaryMapper dictionaryMapper;

    @GetMapping("/page")
    public IPage<Dictionary> test(Page page){
        page.setSize(10);
        page.setCurrent(1);
        IPage<Dictionary> dictionaryIPage = dictionaryMapper.selectPage(page, null);
        return dictionaryIPage;
    }

    @GetMapping("/id")
    public Object getIds(){
        ResponseList responseList = dictionaryMapper.loadId();
        return responseList;
    }

}
