package cn.carol.demo.enums;

/**
 * @author gaoxiaolin
 * @date 2022/7/20
 * @since 1.0.0
 */
public enum SqlOperateEnum {
    UPDATE("UPDATE", "修改"),
    BATCH_UPDATE("BATCH_UPDATE", "批量修改");
    private String code;
    private String remark;

    SqlOperateEnum(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    /**
     * 获取 code 的值
     *
     * @return code 的值
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取 remark 的值
     *
     * @return remark 的值
     */
    public String getRemark() {
        return remark;
    }
}