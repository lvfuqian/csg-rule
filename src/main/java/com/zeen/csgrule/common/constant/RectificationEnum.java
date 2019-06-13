package com.zeen.csgrule.common.constant;

/**
 * @Author chp
 * @Date 2019/5/22 8:28 PM
 * @Description
 */
public enum RectificationEnum {
    DISAGREE("0"),//不同意
    AGREE("1");//同意

    RectificationEnum(String code){
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
