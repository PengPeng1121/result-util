package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 18月16天~19月15天
 */
public enum Scale_29 {

    score_1("1","0-34"),

    score_2("2","35-37"),

    score_3("3","38-39"),

    score_4("4","40-42"),

    score_5("5","43-44"),

    score_6("6","45-46"),

    score_7("7","47-48"),

    score_8("8","49-51"),

    score_9("9","52-53"),

    score_10("10","54-55"),

    score_11("11","56-56"),

    score_12("12","57-58"),

    score_13("13","59-60"),

    score_14("14","61-61"),

    score_15("15","62-63"),

    score_16("16","64-64"),

    score_17("17","65-65"),

    score_18("18","66-66"),

    score_19("19","67-91");

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

    Scale_29(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_29 o : Scale_29.values()) {
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
