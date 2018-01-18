package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 14月16天~15月15天
 */
public enum Scale_25 {

    score_1("1","0-29"),

    score_2("2","30-32"),

    score_3("3","33-34"),

    score_4("4","35-36"),

    score_5("5","37-38"),

    score_6("6","39-40"),

    score_7("7","41-41"),

    score_8("8","42-43"),

    score_9("9","44-45"),

    score_10("10","46-47"),

    score_11("11","48-49"),

    score_12("12","50-50"),

    score_13("13","51-52"),

    score_14("14","53-53"),

    score_15("15","54-55"),

    score_16("16","56-56"),

    score_17("17","57-57"),

    score_18("18","58-58"),

    score_19("19","59-91");

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

    Scale_25(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_25 o : Scale_25.values()) {
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
