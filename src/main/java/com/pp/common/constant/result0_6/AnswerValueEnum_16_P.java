package com.pp.common.constant.result0_6;

/**
 * Created by asus on 2017/6/20.
 */
public enum AnswerValueEnum_16_P {

    SCORE_3(3,"0~50"),

    SCORE_4(4,"0~50"),

    SCORE_5(5,"0~50"),

    SCORE_6(6,"0~50"),

    SCORE_7(7,"0~50"),

    SCORE_8(8,"50~75"),

    SCORE_9(9,"75~90"),

    SCORE_10(10,"90~100");


    private Integer name;

    private String index;

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    AnswerValueEnum_16_P(Integer name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static Integer getName(String index) {
        Integer name = 0;
        for (AnswerValueEnum_16_P o : AnswerValueEnum_16_P.values()) {
            if (index .equals( o.getIndex())) {
                name = o.getName();
                break;
            }
        }
        return name;
    }

    //根据索引获取名称
    public static String getIndex(Integer name) {
        String index = "0~50";
        for (AnswerValueEnum_16_P o : AnswerValueEnum_16_P.values()) {
            if (name .equals( o.getName())) {
                index = o.getIndex();
                break;
            }
        }
        return index;
    }
}
