package cn.carol.demo.impl;

import cn.carol.demo.SignOperatorLogService;
import cn.carol.demo.dao.SignOperatorLogDao;
import cn.carol.demo.entity.SignOperatorLog;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@Service
public class SignOperatorLogServiceImpl extends ServiceImpl<SignOperatorLogDao, SignOperatorLog> implements SignOperatorLogService {
}