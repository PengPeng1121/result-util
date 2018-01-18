package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 10月16天~11月15天
 */
public enum Scale_21 {

    score_1("1","0-24"),

    score_2("2","25-26"),

    score_3("3","27-27"),

    score_4("4","28-29"),

    score_5("5","30-31"),

    score_6("6","32-32"),

    score_7("7","33-34"),

    score_8("8","35-35"),

    score_9("9","36-37"),

    score_10("10","38-39"),

    score_11("11","40-40"),

    score_12("12","41-42"),

    score_13("13","43-43"),

    score_14("14","44-45"),

    score_15("15","46-46"),

    score_16("16","47-48"),

    score_17("17","49-49"),

    score_18("18","50-51"),

    score_19("19","52-91");

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

    Scale_21(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_21 o : Scale_21.values()) {
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
