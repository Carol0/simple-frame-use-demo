package cn.carol.demo.impl;

import cn.carol.demo.AbstractAutowiredDemo;
import org.springframework.stereotype.Component;

/**
 * @author Carol
 * @date 2022/8/9
 * @since 1.0.0
 */
@Component
public class AutowiredDemo2 extends AbstractAutowiredDemo {
    @Override
    public String print() {
        return "AutowiredDemo2";
    }
}