package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 13月16天~14月15天
 */
public enum Scale_24 {

    score_1("1","0-28"),

    score_2("2","29-30"),

    score_3("3","31-32"),

    score_4("4","33-34"),

    score_5("5","35-36"),

    score_6("6","37-38"),

    score_7("7","39-40"),

    score_8("8","41-41"),

    score_9("9","42-43"),

    score_10("10","44-45"),

    score_11("11","46-44"),

    score_12("12","47-48"),

    score_13("13","49-50"),

    score_14("14","51-51"),

    score_15("15","52-53"),

    score_16("16","54-54"),

    score_17("17","55-55"),

    score_18("18","56-57"),

    score_19("19","58-91");

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

    Scale_24(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_24 o : Scale_24.values()) {
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
