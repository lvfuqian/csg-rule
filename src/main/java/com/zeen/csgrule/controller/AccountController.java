package com.zeen.csgrule.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.zeen.csgrule.common.utils.PageUtils;
import com.zeen.csgrule.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.zeen.csgrule.entity.AccountEntity;
import com.zeen.csgrule.service.AccountService;





/**
 * ${comments}
 *
 * @author taemin
 * @email 
 * @date 2019-06-13 11:38:09
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    private static Logger logger = LoggerFactory.getLogger(AccountController.class);


    @RequestMapping(value = "/allMsg",method = RequestMethod.GET)
    public R allMsg(@RequestParam Map<String,Object> params){
        logger.info("账号所有信息："+params.toString());
        List<Map<Object, Object>> page = accountService.showMsg(params);

        return R.ok().put("data","操作成功");
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions(":account:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accountService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{accountid}")
    @RequiresPermissions(":account:info")
    public R info(@PathVariable("accountid") String accountid){
		AccountEntity account = accountService.getById(accountid);

        return R.ok().put("account", account);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions(":account:save")
    public R save(@RequestBody AccountEntity account){
		accountService.save(account);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions(":account:update")
    public R update(@RequestBody AccountEntity account){
		accountService.updateById(account);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions(":account:delete")
    public R delete(@RequestBody String[] accountids){
		accountService.removeByIds(Arrays.asList(accountids));

        return R.ok();
    }

}
