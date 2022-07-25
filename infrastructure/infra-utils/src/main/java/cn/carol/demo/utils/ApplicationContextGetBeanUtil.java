package cn.carol.demo.utils;

import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */

@Component
public class ApplicationContextGetBeanUtil implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 获取bean
     * @param beanName beanName
     * @return bean
     */
    public static Object getBean(String beanName) {
        if (ObjectUtils.isEmpty(beanName)) {
            throw new IllegalArgumentException("beanName不能为空");
        }
        return ObjectUtils.isNotEmpty(context) ? context.getBean(beanName) : null;
    }
}