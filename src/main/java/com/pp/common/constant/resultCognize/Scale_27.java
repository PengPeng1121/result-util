package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 16月16天~17月15天
 */
public enum Scale_27 {

    score_1("1","0-32"),

    score_2("2","33-34"),

    score_3("3","35-37"),

    score_4("4","38-39"),

    score_5("5","40-41"),

    score_6("6","42-43"),

    score_7("7","44-45"),

    score_8("8","46-47"),

    score_9("9","48-49"),

    score_10("10","50-51"),

    score_11("11","52-53"),

    score_12("12","54-54"),

    score_13("13","55-56"),

    score_14("14","57-57"),

    score_15("15","58-59"),

    score_16("16","60-60"),

    score_17("17","61-61"),

    score_18("18","62-62"),

    score_19("19","63-91");

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

    Scale_27(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_27 o : Scale_27.values()) {
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
