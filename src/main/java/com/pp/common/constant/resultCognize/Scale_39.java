package com.pp.common.constant.resultCognize;

/**
 * Created by asus on 2018/1/15.
 * 28月16天~29月15天
 */
public enum Scale_39 {

    score_1("1","0-42"),

    score_2("2","43-46"),

    score_3("3","47-50"),

    score_4("4","51-54"),

    score_5("5","55-57"),

    score_6("6","58-59"),

    score_7("7","60-62"),

    score_8("8","63-65"),

    score_9("9","66-68"),

    score_10("10","69-70"),

    score_11("11","71-72"),

    score_12("12","73-74"),

    score_13("13","75-75"),

    score_14("14","76-76"),

    score_15("15","77-77"),

    score_16("16","78-78"),

    score_17("17","79-79"),

    score_18("18","80-80"),

    score_19("19","81-91");

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

    Scale_39(String name, String index){
        this.name = name;
        this.index = index;
    }

    //根据索引获取名称
    public static String getScaleScore(Integer index) {
        String name = "-1";
        for (Scale_39 o : Scale_39.values()) {
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
