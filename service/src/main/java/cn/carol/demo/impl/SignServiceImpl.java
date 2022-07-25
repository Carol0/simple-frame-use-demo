package cn.carol.demo.impl;

import cn.carol.demo.SignService;
import cn.carol.demo.dao.SignDao;
import cn.carol.demo.entity.Sign;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@Service
public class SignServiceImpl extends ServiceImpl<SignDao, Sign> implements SignService {
    @Override
    public boolean updateById(Sign sign) {
        return super.updateById(sign);
    }
}