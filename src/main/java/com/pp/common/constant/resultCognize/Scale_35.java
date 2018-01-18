package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 24月16天~25月15天
 */
public enum Scale_35 {

    score_1("1","0-40"),

    score_2("2","41-43"),

    score_3("3","44-47"),

    score_4("4","48-50"),

    score_5("5","51-52"),

    score_6("6","53-55"),

    score_7("7","56-57"),

    score_8("8","58-60"),

    score_9("9","61-63"),

    score_10("10","64-65"),

    score_11("11","66-67"),

    score_12("12","68-69"),

    score_13("13","70-70"),

    score_14("14","71-71"),

    score_15("15","72-72"),

    score_16("16","73-73"),

    score_17("17","74-74"),

    score_18("18","75-75"),

    score_19("19","74-91");

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

    Scale_35(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_35 o : Scale_35.values()) {
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
