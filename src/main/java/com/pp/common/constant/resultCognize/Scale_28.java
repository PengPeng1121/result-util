package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 17月16天~18月15天
 */
public enum Scale_28 {

    score_1("1","0-33"),

    score_2("2","34-36"),

    score_3("3","37-38"),

    score_4("4","39-40"),

    score_5("5","41-42"),

    score_6("6","43-45"),

    score_7("7","46-47"),

    score_8("8","48-49"),

    score_9("9","50-51"),

    score_10("10","52-53"),

    score_11("11","54-55"),

    score_12("12","56-56"),

    score_13("13","57-58"),

    score_14("14","59-59"),

    score_15("15","60-61"),

    score_16("16","62-62"),

    score_17("17","63-63"),

    score_18("18","64-64"),

    score_19("19","65-91");

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

    Scale_28(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_28 o : Scale_28.values()) {
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
