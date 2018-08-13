package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 威猛的小老虎
 * @date 2018\8\13 0013
 * @description 描述
 * @package com.pinyougou.manager.controller
 */
@RestController   // @controller +@responsebody  该类的所有的方法自动加上@responsebody注解
@RequestMapping("/brand")  //窄化请求路径
public class BrandController {

    @Reference   //一定是阿里巴巴的jar包
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        //1.引入服务
        //2.调用服务的方法
        //3.返回
        List<TbBrand> all = brandService.findAll();
        return all;
    }
}
