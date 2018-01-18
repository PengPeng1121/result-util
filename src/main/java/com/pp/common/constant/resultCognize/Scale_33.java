package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 22月16天~23月15天
 */
public enum Scale_33 {

    score_1("1","0-38"),

    score_2("2","39-41"),

    score_3("3","42-44"),

    score_4("4","45-47"),

    score_5("5","48-50"),

    score_6("6","51-52"),

    score_7("7","53-55"),

    score_8("8","56-57"),

    score_9("9","58-60"),

    score_10("10","61-62"),

    score_11("11","63-64"),

    score_12("12","65-65"),

    score_13("13","66-67"),

    score_14("14","68-68"),

    score_15("15","69-69"),

    score_16("16","70-70"),

    score_17("17","71-71"),

    score_18("18","72-72"),

    score_19("19","73-91");

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

    Scale_33(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_33 o : Scale_33.values()) {
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
