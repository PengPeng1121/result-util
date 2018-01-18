package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 21月16天~22月15天
 */
public enum Scale_32 {

    score_1("1","0-37"),

    score_2("2","38-40"),

    score_3("3","41-43"),

    score_4("4","44-46"),

    score_5("5","47-48"),

    score_6("6","49-51"),

    score_7("7","52-53"),

    score_8("8","54-56"),

    score_9("9","57-58"),

    score_10("10","59-60"),

    score_11("11","61-62"),

    score_12("12","63-64"),

    score_13("13","65-65"),

    score_14("14","66-67"),

    score_15("15","68-68"),

    score_16("16","69-69"),

    score_17("17","-"),

    score_18("18","70-70"),

    score_19("19","71-91");

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

    Scale_32(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_32 o : Scale_32.values()) {
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
