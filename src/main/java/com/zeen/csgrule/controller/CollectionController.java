package com.zeen.csgrule.controller;

import java.util.Arrays;
import java.util.Map;

import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zeen.csgrule.entity.CollectionEntity;
import com.zeen.csgrule.service.CollectionService;




/**
 * ${comments}
 *
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
@RestController
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions(":collection:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = collectionService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{collectionid}")
    @RequiresPermissions(":collection:info")
    public R info(@PathVariable("collectionid") String collectionid){
		CollectionEntity collection = collectionService.getById(collectionid);

        return R.ok().put("collection", collection);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions(":collection:save")
    public R save(@RequestBody CollectionEntity collection){
		collectionService.save(collection);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions(":collection:update")
    public R update(@RequestBody CollectionEntity collection){
		collectionService.updateById(collection);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions(":collection:delete")
    public R delete(@RequestBody String[] collectionids){
		collectionService.removeByIds(Arrays.asList(collectionids));

        return R.ok();
    }

}
