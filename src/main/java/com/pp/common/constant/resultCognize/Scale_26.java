package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 15月16天~16月15天
 */
public enum Scale_26 {

    score_1("1","0-31"),

    score_2("2","32-33"),

    score_3("3","34-35"),

    score_4("4","36-37"),

    score_5("5","38-39"),

    score_6("6","40-41"),

    score_7("7","42-43"),

    score_8("8","44-45"),

    score_9("9","46-47"),

    score_10("10","48-49"),

    score_11("11","50-51"),

    score_12("12","52-52"),

    score_13("13","53-54"),

    score_14("14","55-55"),

    score_15("15","56-57"),

    score_16("16","58-58"),

    score_17("17","59-59"),

    score_18("18","60-60"),

    score_19("19","61-91");

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

    Scale_26(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_26 o : Scale_26.values()) {
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
