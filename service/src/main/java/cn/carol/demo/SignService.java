package cn.carol.demo;

import cn.carol.demo.annotation.SqlLog;
import cn.carol.demo.entity.Sign;
import cn.carol.demo.enums.SqlOperateEnum;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
public interface SignService extends IService<Sign> {

    boolean updateById(Sign sign);
}
