package annotation;

import enums.SqlOperateEnum;

import java.lang.annotation.*;

/**
 *
 * @author gaoxiaolin
 * @date 2022/7/20
 * @since 1.0.0
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
public @interface SqlLog {
    /**
     * @return 操作类型
     */
    SqlOperateEnum operate();

    /**
     * @return 操作类bean name
     */
    String operateService();

}