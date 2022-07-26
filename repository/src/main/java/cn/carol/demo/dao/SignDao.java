package cn.carol.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.carol.demo.entity.Sign;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@Repository
public interface SignDao extends BaseMapper<Sign> {
}