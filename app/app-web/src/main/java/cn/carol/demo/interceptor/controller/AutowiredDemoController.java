package cn.carol.demo.interceptor.controller;

import cn.carol.demo.AbstractAutowiredDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carol
 * @date 2022/8/9
 * @since 1.0.0
 */
@RestController
public class AutowiredDemoController {

    @Autowired
    private AbstractAutowiredDemo abstractAutowiredDemo;
}