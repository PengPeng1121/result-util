package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 19月16天~20月15天
 */
public enum Scale_30 {

    score_1("1","0-35"),

    score_2("2","36-38"),

    score_3("3","39-41"),

    score_4("4","42-43"),

    score_5("5","44-45"),

    score_6("6","46-48"),

    score_7("7","49-50"),

    score_8("8","51-52"),

    score_9("9","53-54"),

    score_10("10","55-56"),

    score_11("11","57-58"),

    score_12("12","59-60"),

    score_13("13","61-62"),

    score_14("14","63-63"),

    score_15("15","64-65"),

    score_16("16","66-66"),

    score_17("17","67-67"),

    score_18("18","68-68"),

    score_19("19","69-91");

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

    Scale_30(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_30 o : Scale_30.values()) {
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
