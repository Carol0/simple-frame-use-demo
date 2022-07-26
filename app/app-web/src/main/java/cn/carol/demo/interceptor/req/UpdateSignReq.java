package cn.carol.demo.interceptor.req;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

/**
 * @author gaoxiaolin
 * @date 2022/7/26
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
public class UpdateSignReq {
    @NotNull(value = "id不能为空")
    private Long id;

    @NotNull(value = "sate不能为空")
    private Integer sate;
}