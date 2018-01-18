package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 36月16天~39月15天
 */
public enum Scale_47 {

    score_1("1","0-45"),

    score_2("2","46-49"),

    score_3("3","50-53"),

    score_4("4","54-57"),

    score_5("5","58-61"),

    score_6("6","62-65"),

    score_7("7","66-68"),

    score_8("8","69-72"),

    score_9("9","73-75"),

    score_10("10","76-78"),

    score_11("11","79-80"),

    score_12("12","81-81"),

    score_13("13","-"),

    score_14("14","82-82"),

    score_15("15","83-83"),

    score_16("16","84-84"),

    score_17("17","85-85"),

    score_18("18","86-86"),

    score_19("19","87-91");

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

    Scale_47(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_47 o : Scale_47.values()) {
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
