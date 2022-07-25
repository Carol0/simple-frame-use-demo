package cn.carol.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author gaoxiaolin
 * @date 2022/7/25
 * @since 1.0.0
 */
@TableName(value = "sign")
@Data
public class Sign {
    @TableId
    private Long id;
    /**
     * 工单拥有人
     */
    private Long owner;
    /**
     * 工单状态
     */
    private Integer state;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private Long createUser;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 修改人
     */
    private Long updateUser;

    /**
     * 是否删除
     */
    private boolean deleted;

}