package cn.carol.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@TableName(value = "sign_operator_log")
@Data
public class SignOperatorLog {
    @TableId
    private Long id;
    /**
     * 上一个状态
     */
    private Integer lastState;
    /**
     * 当前状态
     */
    private Integer state;
    /**
     * 备注
     */
    private String remark;
    /**
     * 是否删除
     */
    private boolean deleted;
}