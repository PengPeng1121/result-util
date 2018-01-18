package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 11月16天~12月15天
 */
public enum Scale_22 {

    score_1("1","0-25"),

    score_2("2","26-27"),

    score_3("3","28-29"),

    score_4("4","30-31"),

    score_5("5","32-32"),

    score_6("6","33-34"),

    score_7("7","35-36"),

    score_8("8","37-37"),

    score_9("9","38-39"),

    score_10("10","40-41"),

    score_11("11","42-42"),

    score_12("12","43-44"),

    score_13("13","45-45"),

    score_14("14","46-47"),

    score_15("15","48-48"),

    score_16("16","49-50"),

    score_17("17","51-51"),

    score_18("18","52-53"),

    score_19("19","54-91");

    private String name;

    private String index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    Scale_22(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_22 o : Scale_22.values()) {
            String arr[] = o.getIndex().split("-");
            if(arr.length!=0) {
                Integer begin = Integer.parseInt(arr[0]);
                Integer end = Integer.parseInt(arr[1]);
                if (begin <= index && index <= end) {
                    name = o.getName();
                    break;
                }
            }
        }
        return name;
    }
}
