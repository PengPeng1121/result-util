package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 12月16天~13月15天
 */
public enum Scale_23 {

    score_1("1","0-27"),

    score_2("2","28-29"),

    score_3("3","30-31"),

    score_4("4","32-32"),

    score_5("5","33-34"),

    score_6("6","35-36"),

    score_7("7","37-38"),

    score_8("8","39-39"),

    score_9("9","40-41"),

    score_10("10","42-43"),

    score_11("11","44-44"),

    score_12("12","45-46"),

    score_13("13","47-48"),

    score_14("14","49-49"),

    score_15("15","50-51"),

    score_16("16","52-52"),

    score_17("17","53-53"),

    score_18("18","54-55"),

    score_19("19","56-91");

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

    Scale_23(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_23 o : Scale_23.values()) {
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
