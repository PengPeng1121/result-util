package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 34月16天~35月15天
 */
public enum Scale_45 {

    score_1("1","0-43"),

    score_2("2","44-48"),

    score_3("3","49-53"),

    score_4("4","54-57"),

    score_5("5","58-60"),

    score_6("6","61-64"),

    score_7("7","65-67"),

    score_8("8","68-70"),

    score_9("9","71-73"),

    score_10("10","74-76"),

    score_11("11","77-78"),

    score_12("12","79-79"),

    score_13("13","80-80"),

    score_14("14","81-81"),

    score_15("15","82-82"),

    score_16("16","83-83"),

    score_17("17","84-84"),

    score_18("18","85-85"),

    score_19("19","86-91");

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

    Scale_45(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_45 o : Scale_45.values()) {
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
