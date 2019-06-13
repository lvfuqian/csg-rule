package com.zeen.csgrule.common.constant;

/**
 * @Author chp
 * @Date 2019/5/7 8:07 PM
 * @Description 各种类型的枚举
 */
public enum TypeEnum {
    ZHUANYE("1"),//专业
    DANWEI("2"),//单位

    RENYUAN("1"),//人员
    ZUZE("2");//组织
    TypeEnum(String code){
        this.code=code;
    }
    private String code;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
