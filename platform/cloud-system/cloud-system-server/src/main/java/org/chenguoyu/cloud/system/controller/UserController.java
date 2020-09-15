package org.chenguoyu.cloud.system.controller;

import org.chenguoyu.cloud.common.core.entity.vo.Result;
import org.chenguoyu.cloud.system.feign.UserServiceClient;
import org.chenguoyu.cloud.system.service.UserService;
import org.chenguoyu.cloud.system.model.po.User;
import org.chenguoyu.cloud.system.model.form.UserForm;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *
 * @author 陈国钰 on 2020-7-9.
 * @version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController implements UserServiceClient {
    private final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @ApiOperation(value = "新增用户", notes = "新增一个用户")
    @ApiImplicitParam(name = "userForm", value = "新增用户form表单", required = true, dataType = "UserForm")
    @PostMapping("/add")
    public Result<Void> add(@Valid @RequestBody UserForm userForm) {
        log.debug("user:{}", userForm);
        User user = userForm.toPo(User.class);
        userService.add(user);
        return Result.success();
    }

    @ApiOperation(value = "获取用户", notes = "根据用户唯一标识（username or mobile）获取用户信息")
    @ApiImplicitParam(paramType = "query", name = "uniqueId", value = "用户唯一标识", required = true, dataType = "string")
    @ApiResponses(@ApiResponse(code = 200, message = "处理成功", response = Result.class))
    @GetMapping("/queryByUniqueId")
    @Override
    public Result<User> queryByUniqueId(@RequestParam String uniqueId) {
        log.debug("query with username or mobile:{}", uniqueId);
        User user = userService.getByUniqueId(uniqueId);
        return Result.success(user);
    }

    @GetMapping("/queryById")
    public Result<User> queryById(@RequestParam Long id){
        return Result.success(userService.getById(id));
    }

    @PostMapping("/edit")
    public Result<Void> edit(@Valid @RequestBody UserForm userForm){

        return Result.success();
    }
}
