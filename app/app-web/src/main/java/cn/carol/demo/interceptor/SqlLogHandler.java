package cn.carol.demo.interceptor;

import cn.carol.demo.SignOperatorLogService;
import cn.carol.demo.SignService;
import cn.carol.demo.annotation.SqlLog;
import cn.carol.demo.entity.Sign;
import cn.carol.demo.entity.SignOperatorLog;
import cn.carol.demo.utils.ApplicationContextGetBeanUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author gaoxiaolin
 * @date 2022/7/20
 * @since 1.0.0
 */
@Component
@Aspect
public class SqlLogHandler {
    @Around(value = "@annotation(cn.carol.demo.annotation.SqlLog)")
   public Object saveSqlLog(ProceedingJoinPoint joinPoint) throws Throwable {
        //获取方法参数
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Object result = null;
        //获取注解类信息
        SqlLog sqlLog = methodSignature.getMethod().getAnnotation(SqlLog.class);
        //目前直接转为SignService，优化可以通过多态
        SignService operatorService = (SignService) ApplicationContextGetBeanUtil.getBean(sqlLog.operateService());
        SignOperatorLogService signOperatorLogService = (SignOperatorLogService) ApplicationContextGetBeanUtil.getBean(sqlLog.logService());
        Object[] objects = joinPoint.getArgs();
        Sign updateSign = (Sign)objects[0];
        switch (sqlLog.operate()) {
            case UPDATE :
                Sign oldSign = operatorService.getById(updateSign.getId());
                result = joinPoint.proceed(objects);
                Sign newSign = operatorService.getById(updateSign.getId());
                SignOperatorLog signOperatorLog = new SignOperatorLog();
                signOperatorLog.setLastState(oldSign.getState());
                signOperatorLog.setState(newSign.getState());
                signOperatorLog.setRemark("系统保存");
                signOperatorLogService.save(signOperatorLog);
                break;
            case BATCH_UPDATE:
        }
        return result;
   }
}