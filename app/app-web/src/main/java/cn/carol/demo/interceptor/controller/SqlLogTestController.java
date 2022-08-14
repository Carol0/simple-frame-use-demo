package cn.carol.demo.interceptor.controller;

import cn.carol.demo.SignService;
import cn.carol.demo.entity.Sign;
import cn.carol.demo.interceptor.req.UpdateSignReq;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@RestController
@RequestMapping("/sqlLogTest")
public class SqlLogTestController {
    @Resource
    SignService service;

    @PostMapping("/saveSign")
    private void saveSign() {
        Sign sign = new Sign();
        sign.setOwner(1L);
        sign.setState(10);
        sign.setCreateTime(new Date());
        sign.setCreateUser(1L);
        sign.setUpdateTime(new Date());
        sign.setUpdateUser(1L);
        service.save(sign);
    }

    @PostMapping("/updateSign")
    private void updateSign(@RequestBody @NotNull @Validated UpdateSignReq req) {
        Sign oldSign = service.getById(req.getId());
        if (ObjectUtils.isEmpty(oldSign)) {
            return;
        }
        oldSign.setState(req.getSate());
        service.updateById(oldSign);
    }


}