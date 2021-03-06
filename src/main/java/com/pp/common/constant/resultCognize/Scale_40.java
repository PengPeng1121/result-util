package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 29月16天~30月15天
 */
public enum Scale_40 {

    score_1("1","0-42"),

    score_2("2","43-46"),

    score_3("3","47-51"),

    score_4("4","52-55"),

    score_5("5","56-58"),

    score_6("6","59-60"),

    score_7("7","61-63"),

    score_8("8","64-66"),

    score_9("9","67-69"),

    score_10("10","70-72"),

    score_11("11","73-74"),

    score_12("12","75-75"),

    score_13("13","76-76"),

    score_14("14","77-77"),

    score_15("15","78-78"),

    score_16("16","79-79"),

    score_17("17","80-80"),

    score_18("18","81-81"),

    score_19("19","82-91");

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

    Scale_40(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_40 o : Scale_40.values()) {
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
